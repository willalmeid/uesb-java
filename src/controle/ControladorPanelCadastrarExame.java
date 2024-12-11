package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Exame;
import modelo.Material;
import modelo.Medico;
import visual.PanelCadastrarExame;

public class ControladorPanelCadastrarExame implements ActionListener {

    PanelCadastrarExame panelCadastrarExame;
    ArrayList<Exame> examesCadastrados;
    ArrayList<Medico> medicosCadastrados;

    public ControladorPanelCadastrarExame(PanelCadastrarExame panelCadastrarExame) {
        this.panelCadastrarExame = panelCadastrarExame;
        examesCadastrados = new ArrayList<>();
        medicosCadastrados = new ArrayList<>();
        carregarMedicos();
        preencherComboBoxMedicos();
        addEventos();
    }

    public void addEventos() {
        panelCadastrarExame.getButtonCadastrar().addActionListener(this);
        panelCadastrarExame.getButtonLimpar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
            cadastrarExame();
        } else if (e.getSource() == panelCadastrarExame.getButtonLimpar()) {
            limparPanel();
        }
    }

    public void cadastrarExame() {
        try {
            String nome = panelCadastrarExame.getTextFieldNomeExame().getText();
            String descricao = panelCadastrarExame.getTextAreaDescricao().getText();
            Material materiaisUtilizados = new Material();
            materiaisUtilizados.setNomeDoMaterial(panelCadastrarExame.getTextAreaMateriaisUtilizados().getText());
            float valorParticular = Float.parseFloat(panelCadastrarExame.getTextFieldValorParticular().getText());

            Medico medico = (Medico) panelCadastrarExame.getComboBoxMedico().getSelectedItem();
            if (medico == null) {
                throw new IllegalArgumentException("Nenhum médico selecionado.");
            }
            String tipoExame = (String) panelCadastrarExame.getComboBoxTipoExame().getSelectedItem();

            Exame e = new Exame(nome, descricao, valorParticular, materiaisUtilizados, medico, tipoExame);

            examesCadastrados.add(e);
            salvarExameNoArquivo(e);
            JOptionPane.showMessageDialog(panelCadastrarExame, "Exame " + nome + " cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite números válidos: " + e.getMessage(), "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limparPanel() {
        panelCadastrarExame.getTextFieldNomeExame().setText("");
        panelCadastrarExame.getTextAreaDescricao().setText("");
        panelCadastrarExame.getTextAreaMateriaisUtilizados().setText("");
        panelCadastrarExame.getTextFieldValorParticular().setText("");

        panelCadastrarExame.getComboBoxMedico().setSelectedIndex(-1);
        panelCadastrarExame.getComboBoxTipoExame().setSelectedIndex(-1);
    }

    private void carregarMedicos() {
        try (BufferedReader reader = new BufferedReader(new FileReader("medicos.txt"))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                if (linha.startsWith("Nome: ")) {
                    String nome = linha.substring(6);
                    String especialidade = reader.readLine().substring(14);
                    String crm = reader.readLine().substring(5);
                    reader.readLine(); // Ignorar linha de contato
                    reader.readLine(); // Ignorar linha de valor consulta
                    reader.readLine(); // Ignorar linha de histórico de atendimento
                    reader.readLine(); // Ignorar linha de separador

                    Medico medico = new Medico(nome, especialidade, crm, "", 0.0f, "");
                    medicosCadastrados.add(medico);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelCadastrarExame, "Erro ao carregar médicos do arquivo: " + e.getMessage(), "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherComboBoxMedicos() {
        panelCadastrarExame.getComboBoxMedico().removeAllItems();
        for (Medico medico : medicosCadastrados) {
            panelCadastrarExame.getComboBoxMedico().addItem(medico);
        }
    }

    private void salvarExameNoArquivo(Exame exame) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("exames.txt", true))) {
            writer.write("Nome: " + exame.getNomeExame() + "\n");
            writer.write("Descrição: " + exame.getDescricao() + "\n");
            writer.write("Valor Particular: " + exame.getValorParticular() + "\n");
            writer.write("Materiais Utilizados: " + exame.getMateriasUtilizado().getNomeDoMaterial() + "\n");
            writer.write("Médico: " + exame.getMedico().getNome() + "\n");
            writer.write("Tipo de Exame: " + exame.getTipo() + "\n");
            writer.write("====================================\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelCadastrarExame, "Erro ao salvar exame: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

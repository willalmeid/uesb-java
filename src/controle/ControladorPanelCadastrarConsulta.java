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

import modelo.Consulta;
import modelo.Material;
import modelo.Medico;
import modelo.Paciente;
import visual.PanelCadastrarConsulta;

public class ControladorPanelCadastrarConsulta implements ActionListener {

    PanelCadastrarConsulta panelCadastrarConsulta;
    ArrayList<Consulta> consultasAgendadas;
    ArrayList<Medico> medicosCadastrados;

    public ControladorPanelCadastrarConsulta(PanelCadastrarConsulta panelCadastrarConsulta) {
        this.panelCadastrarConsulta = panelCadastrarConsulta;
        consultasAgendadas = new ArrayList<>();
        medicosCadastrados = new ArrayList<>();
        carregarMedicos();
        preencherComboBoxMedicos();
        addEventos();
    }

    public void addEventos() {
        panelCadastrarConsulta.getButtonCadastrar().addActionListener(this);
        panelCadastrarConsulta.getButtonLimpar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCadastrarConsulta.getButtonCadastrar()) {
            cadastrarConsulta();
        } else if (e.getSource() == panelCadastrarConsulta.getButtonLimpar()) {
            limparPanel();
        }
    }

    public void cadastrarConsulta() {
        try {
            String data = panelCadastrarConsulta.getTextFieldData().getText();
            String hora = panelCadastrarConsulta.getTextFieldHora().getText();
            String queixaPaciente = panelCadastrarConsulta.getTextAreaQueixaPaciente().getText();
            String tipoDeConsulta = (String) panelCadastrarConsulta.getComboBoxTipoDeConsulta().getSelectedItem();
            String convenio = (String) panelCadastrarConsulta.getComboBoxConvenio().getSelectedItem();
            String observacoes = panelCadastrarConsulta.getTextAreaObservacoes().getText();

            Medico medico = (Medico) panelCadastrarConsulta.getComboBoxMedico().getSelectedItem();
            if (medico == null) {
                throw new IllegalArgumentException("Nenhum médico selecionado.");
            }

            Paciente paciente = new Paciente();
            paciente.setNome(panelCadastrarConsulta.getTextFieldPaciente().getText());

            Material material = new Material();
            material.setNomeDoMaterial(panelCadastrarConsulta.getTextAreaMaterial().getText());

            Consulta c = new Consulta(data, hora, queixaPaciente, tipoDeConsulta, convenio, observacoes, medico, paciente, material);

            consultasAgendadas.add(c);
            salvarConsultaNoArquivo(c);
            JOptionPane.showMessageDialog(panelCadastrarConsulta, "Consulta cadastrada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelCadastrarConsulta, "Erro ao cadastrar consulta: " + e.getMessage(), "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limparPanel() {
        panelCadastrarConsulta.getTextFieldData().setText("");
        panelCadastrarConsulta.getTextFieldHora().setText("");
        panelCadastrarConsulta.getTextAreaQueixaPaciente().setText("");
        panelCadastrarConsulta.getTextAreaObservacoes().setText("");
        panelCadastrarConsulta.getTextAreaMaterial().setText("");

        panelCadastrarConsulta.getComboBoxMedico().setSelectedIndex(-1);
        panelCadastrarConsulta.getComboBoxTipoDeConsulta().setSelectedIndex(-1);
        panelCadastrarConsulta.getComboBoxConvenio().setSelectedIndex(-1);
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
            JOptionPane.showMessageDialog(panelCadastrarConsulta, "Erro ao carregar médicos do arquivo: " + e.getMessage(), "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void preencherComboBoxMedicos() {
        panelCadastrarConsulta.getComboBoxMedico().removeAllItems();
        for (Medico medico : medicosCadastrados) {
            panelCadastrarConsulta.getComboBoxMedico().addItem(medico);
        }
    }

    private void salvarConsultaNoArquivo(Consulta consulta) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("consultas.txt", true))) {
            writer.write("Data: " + consulta.getData() + "\n");
            writer.write("Hora: " + consulta.getHora() + "\n");
            writer.write("Médico: " + consulta.getMedico().getNome() + "\n");
            writer.write("Paciente: " + consulta.getPaciente().getNome() + "\n");
            writer.write("Queixa: " + consulta.getQueixaPaciente() + "\n");
            writer.write("====================================\n");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelCadastrarConsulta, "Erro ao salvar consulta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

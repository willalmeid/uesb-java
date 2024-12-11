package controle;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Medico;
import visual.PanelCadastrarMedico;

public class ControladorPanelCadastrarMedico implements ActionListener {

    PanelCadastrarMedico panelCadastrarMedico;
    ArrayList<Medico> medicosCadastrados;

    public ControladorPanelCadastrarMedico(PanelCadastrarMedico panelCadastrarMedico) {
        this.panelCadastrarMedico = panelCadastrarMedico;
        medicosCadastrados = new ArrayList<Medico>();
        addEventos();
    }

    public void addEventos() {
        panelCadastrarMedico.getButtonCadastrar().addActionListener(this);
        panelCadastrarMedico.getButtonLimpar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCadastrarMedico.getButtonCadastrar()) {
            cadastrarConsulta();

        } else if (e.getSource() == panelCadastrarMedico.getButtonLimpar()) {
            limparPanel();

        }
    }

    public void cadastrarConsulta() {
        try {
            String nome = panelCadastrarMedico.getTextFieldNome().getText();
            String especialidade = panelCadastrarMedico.getTextFieldEspecialidade().getText();
            String crm = panelCadastrarMedico.getTextFieldCrm().getText();
            String contato = panelCadastrarMedico.getTextFieldContato().getText();
            float valorConsultaParticular = Float.parseFloat(panelCadastrarMedico.getTextFieldValorConsultaParticular().getText());
            String historicoDeAtendimento = panelCadastrarMedico.getTextAreaHistoricoDeAtendimento().getText();

            Medico m = new Medico(nome, especialidade, crm, contato, valorConsultaParticular, historicoDeAtendimento);

            medicosCadastrados.add(m);
            salvarMedicosEmArquivo();
            JOptionPane.showMessageDialog(panelCadastrarMedico, "Médico " + nome + " cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelCadastrarMedico, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limparPanel() {
        panelCadastrarMedico.getTextFieldNome().setText("");
        panelCadastrarMedico.getTextFieldEspecialidade().setText("");
        panelCadastrarMedico.getTextFieldCrm().setText("");
        panelCadastrarMedico.getTextFieldContato().setText("");
        panelCadastrarMedico.getTextFieldValorConsultaParticular().setText("");
        panelCadastrarMedico.getTextAreaHistoricoDeAtendimento().setText("");
    }

    private void salvarMedicosEmArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("medicos.txt", true))) {
            for (Medico medico : medicosCadastrados) {
                writer.write("Nome: " + medico.getNome() + "\n");
                writer.write("Especialidade: " + medico.getEspecialidade() + "\n");
                writer.write("CRM: " + medico.getCrm() + "\n");
                writer.write("Contato: " + medico.getContato() + "\n");
                writer.write("Valor Consulta Particular: " + medico.getValorConsultaParticular() + "\n");
                writer.write("Histórico de Atendimento: " + medico.getHistoricoDeAtendimento() + "\n");
                writer.write("====================================\n");
            }
            writer.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelCadastrarMedico, "Erro ao salvar os dados no arquivo.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

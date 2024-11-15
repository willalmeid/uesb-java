package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Paciente;
import visual.PanelCadastrarPaciente;

public class ControladorPanelCadastrarPaciente implements ActionListener {

	PanelCadastrarPaciente panelCadastrarPaciente;
	ArrayList<Paciente> pacientesCadastrados;
	
	public ControladorPanelCadastrarPaciente(PanelCadastrarPaciente panelCadastrarPaciente) {
		this.panelCadastrarPaciente = panelCadastrarPaciente;
		pacientesCadastrados = new ArrayList<Paciente>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarPaciente.getButtonCadastrar().addActionListener(this);
		panelCadastrarPaciente.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarPaciente.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarPaciente.getButtonLimpar()) {
			limparPanel();

		}
	}

	public void cadastrarConsulta() {
		try {
			String nome = panelCadastrarPaciente.getTextFieldNome().getText();
			String dataNasc = panelCadastrarPaciente.getTextFieldDataNascimento().getText();
			String telefone = panelCadastrarPaciente.getTextFieldTelefone().getText();
			String historicoMedico = panelCadastrarPaciente.getTextAreaHistoricoMedico().getText();
			float peso = Float.parseFloat(panelCadastrarPaciente.getTextFieldPeso().getText());
			float altura = Float.parseFloat(panelCadastrarPaciente.getTextFieldAltura().getText());
			String tipoSanguineo = (String) panelCadastrarPaciente.getComboBoxTipoSanguineo().getSelectedItem();
			String covenio = (String) panelCadastrarPaciente.getComboBoxCovenio().getSelectedItem();

			String cep = panelCadastrarPaciente.getTextFieldCEP().getText();
			String estado = panelCadastrarPaciente.getTextFieldEstado().getText();
			String cidade = panelCadastrarPaciente.getTextFieldCidade().getText();
			String bairro = panelCadastrarPaciente.getTextFieldBairro().getText();
			String numero = panelCadastrarPaciente.getTextFieldNumero().getText();
			String logradouro = panelCadastrarPaciente.getTextFieldLogradouro().getText();
			String complemento = panelCadastrarPaciente.getTextFieldComplemento().getText();
			
			Endereco e = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
			Paciente p = new Paciente(nome, dataNasc, telefone, tipoSanguineo, historicoMedico, covenio, peso, altura, e);

			pacientesCadastrados.add(p);
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "Paciente "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarPaciente.getTextFieldNome().setText("");
		panelCadastrarPaciente.getTextFieldDataNascimento().setText("");
		panelCadastrarPaciente.getTextFieldTelefone().setText("");
		panelCadastrarPaciente.getTextAreaHistoricoMedico().setText("");
		panelCadastrarPaciente.getTextFieldPeso().setText("");
		panelCadastrarPaciente.getTextFieldAltura().setText("");

		panelCadastrarPaciente.getTextFieldCEP().setText("");
		panelCadastrarPaciente.getTextFieldEstado().setText("");
		panelCadastrarPaciente.getTextFieldCidade().setText("");
		panelCadastrarPaciente.getTextFieldBairro().setText("");
		panelCadastrarPaciente.getTextFieldNumero().setText("");
		panelCadastrarPaciente.getTextFieldLogradouro().setText("");
		panelCadastrarPaciente.getTextFieldComplemento().setText("");
		
    	panelCadastrarPaciente.getComboBoxTipoSanguineo().setSelectedIndex(-1);
    	panelCadastrarPaciente.getComboBoxCovenio().setSelectedIndex(-1);
	}
}
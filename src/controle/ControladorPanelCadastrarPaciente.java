package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarPaciente;

public class ControladorPanelCadastrarPaciente implements ActionListener {

	PanelCadastrarPaciente panelCadastrarPaciente;
	
	public ControladorPanelCadastrarPaciente(PanelCadastrarPaciente panelCadastrarPaciente) {
		this.panelCadastrarPaciente = panelCadastrarPaciente;
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
	}
}

package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarProfessor;

public class ControladorCadastrarProfessor implements ActionListener {

	PanelCadastrarProfessor panelCadastrarProfessor;
	
	public ControladorCadastrarProfessor(PanelCadastrarProfessor panelCadastrarProfessor) {
		this.panelCadastrarProfessor = panelCadastrarProfessor;
		addEventos();
	}
	
	private void addEventos(){
		panelCadastrarProfessor.getButtonCadastrar().addActionListener(this);
		panelCadastrarProfessor.getButtonLimpar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarProfessor.getButtonCadastrar()) {
			cadastrarProfessor();
		} else if(e.getSource() == panelCadastrarProfessor.getButtonLimpar()) {
			limparCampos();
		}
		
	}
	
	public void cadastrarProfessor() {
		panelCadastrarProfessor.getTextFieldNome().setText("");
		panelCadastrarProfessor.getTextFieldEmail().setText("");
		panelCadastrarProfessor.getTextFieldRG().setText("");
		panelCadastrarProfessor.getTextFieldDataNascimento().setText("");
		panelCadastrarProfessor.getTextFieldTelefone().setText("");
		panelCadastrarProfessor.getTextFieldCPF().setText("");
		panelCadastrarProfessor.getTextFieldReservista().setText("");
		panelCadastrarProfessor.getTextFieldTitulo().setText("");

		panelCadastrarProfessor.getTextFieldCEP().setText("");
		panelCadastrarProfessor.getTextFieldEstado().setText("");
		panelCadastrarProfessor.getTextFieldCidade().setText("");
		panelCadastrarProfessor.getTextFieldBairro().setText("");
		panelCadastrarProfessor.getTextFieldNumero().setText("");
		panelCadastrarProfessor.getTextFieldLogradouro().setText("");
		panelCadastrarProfessor.getTextFieldComplemento().setText("");

		panelCadastrarProfessor.getTextFieldTitulacao().setText("");
		panelCadastrarProfessor.getTextFieldArea().setText("");
		panelCadastrarProfessor.getTextFieldClasse().setText("");
	}
	
	public void limparCampos() {
		
	}
}

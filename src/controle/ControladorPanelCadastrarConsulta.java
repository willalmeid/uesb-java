package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarConsulta;

public class ControladorPanelCadastrarConsulta implements ActionListener {

	PanelCadastrarConsulta panelCadastrarConsulta;
	
	public ControladorPanelCadastrarConsulta(PanelCadastrarConsulta panelCadastarConsulta) {
		this.panelCadastrarConsulta = panelCadastarConsulta;
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarConsulta.getButtonCadastrar().addActionListener(this);
		panelCadastrarConsulta.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarConsulta.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarConsulta.getButtonLimpar()) {
			limparPanel();

		}
	}
	
	public void cadastrarConsulta() {
		
	}
	
	public void limparPanel() {
		panelCadastrarConsulta.getTextFieldData().setText("");
		panelCadastrarConsulta.getTextFieldHora().setText("");
		panelCadastrarConsulta.getTextAreaQueixaPaciente().setText("");
		panelCadastrarConsulta.getTextAreaObservacoes().setText("");
		panelCadastrarConsulta.getTextAreaMaterial().setText("");
	}

}

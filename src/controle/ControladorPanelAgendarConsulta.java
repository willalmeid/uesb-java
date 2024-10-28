package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendarConsulta;

public class ControladorPanelAgendarConsulta implements ActionListener {

	PanelAgendarConsulta panelAgendarConsulta;
	
	public ControladorPanelAgendarConsulta(PanelAgendarConsulta panelAgendarConsulta) {
		this.panelAgendarConsulta = panelAgendarConsulta;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarConsulta.getButtonAgendar();
		panelAgendarConsulta.getButtonLimpar();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarConsulta.getButtonAgendar()) {
			cadastrarConsulta();
			System.out.println("Cadastrado!");
		} else if(e.getSource() == panelAgendarConsulta.getButtonLimpar()) {
			limparPanel();
			System.out.println("Limpo!");
		}	
	}
	
	public void cadastrarConsulta() {
		
	}
	
	public void limparPanel() {
		panelAgendarConsulta.getTextFieldData().setText("");
		panelAgendarConsulta.getTextFieldHora().setText("");
		panelAgendarConsulta.getTextFieldPaciente().setText("");
		panelAgendarConsulta.getTextFieldMedico().setText("");
	}

}

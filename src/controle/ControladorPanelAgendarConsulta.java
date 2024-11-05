package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Consulta;
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

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarConsulta.getButtonAgendar()) {
			cadastrarConsulta();
			
		} else if(e.getSource() == panelAgendarConsulta.getButtonLimpar()) {
			limparPanel();
			
		}	
	}
	
	public void cadastrarConsulta() {
		
	}
	
	public void limparPanel() {
		panelAgendarConsulta.getTextFieldData().setText("");
		panelAgendarConsulta.getTextFieldHora().setText("");
		panelAgendarConsulta.getTextFieldPaciente().setText("");
		panelAgendarConsulta.getComboBoxMedico().setSelectedIndex(0);
	}

}

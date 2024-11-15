package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.PanelCadastrar;
import visual.PanelCadastrarExame;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;

public class ControladorPanelCadastrar implements ActionListener {

	PanelCadastrar panelCadastrar;
	
	public ControladorPanelCadastrar(PanelCadastrar panelCadastrar) {
		this.panelCadastrar = panelCadastrar;
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrar.getButtonCadastrarPaciente().addActionListener(this);
		panelCadastrar.getButtonCadastrarMedico().addActionListener(this);
		panelCadastrar.getButtonCadastrarExame().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrar.getButtonCadastrarPaciente()) {
			PanelCadastrarPaciente panelCadastrarPaciente = new PanelCadastrarPaciente();
			Dialog dialog = new Dialog(panelCadastrarPaciente);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarMedico()) {
			PanelCadastrarMedico panelCadastrarMedico = new PanelCadastrarMedico();
			Dialog dialog = new Dialog(panelCadastrarMedico);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarExame()) {
			PanelCadastrarExame panelCadastrarExame = new PanelCadastrarExame();
			Dialog dialog = new Dialog(panelCadastrarExame);
			
		}
	}

}

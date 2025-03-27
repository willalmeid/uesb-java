package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.Frame;
import visual.PanelCadastrar;
import visual.PanelCadastrarConsulta;
import visual.PanelCadastrarExame;
import visual.PanelCadastrarMaterial;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;
import visual.PanelHome;

public class ControladorPanelCadastrar implements ActionListener {

	Frame frame;
	PanelCadastrar panelCadastrar;
	PanelHome panelHome;
	
	public ControladorPanelCadastrar(PanelCadastrar panelCadastrar, Frame frame, PanelHome panelHome) {
		this.panelCadastrar = panelCadastrar;
		this.frame = frame;
		this.panelHome = panelHome;
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrar.getButtonHome().addActionListener(this);
		panelCadastrar.getButtonVoltar().addActionListener(this);

		panelCadastrar.getButtonCadastrarPaciente().addActionListener(this);
		panelCadastrar.getButtonCadastrarMedico().addActionListener(this);
		panelCadastrar.getButtonCadastrarExame().addActionListener(this);
		panelCadastrar.getButtonCadastrarConsulta().addActionListener(this);
		panelCadastrar.getButtonCadastrarMaterial().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrar.getButtonHome() || e.getSource() == panelCadastrar.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		} else 
			if(e.getSource() == panelCadastrar.getButtonCadastrarPaciente()) {
			PanelCadastrarPaciente panelCadastrarPaciente = new PanelCadastrarPaciente();
			new ControladorPanelCadastrarPaciente(panelCadastrarPaciente);
			Dialog dialog = new Dialog(frame, panelCadastrarPaciente);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarMedico()) {
			PanelCadastrarMedico panelCadastrarMedico = new PanelCadastrarMedico();
			new ControladorPanelCadastrarMedico(panelCadastrarMedico);
			Dialog dialog = new Dialog(frame, panelCadastrarMedico);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarExame()) {
			PanelCadastrarExame panelCadastrarExame = new PanelCadastrarExame();
			new ControladorPanelCadastrarExame(panelCadastrarExame);
			Dialog dialog = new Dialog(frame, panelCadastrarExame);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarConsulta()) {
			PanelCadastrarConsulta panelCadastrarConsulta = new PanelCadastrarConsulta();
			new ControladorPanelCadastrarConsulta(panelCadastrarConsulta);
			Dialog dialog = new Dialog(frame, panelCadastrarConsulta);
			
		} else if(e.getSource() == panelCadastrar.getButtonCadastrarMaterial()) {
			PanelCadastrarMaterial panelCadastrarMaterial = new PanelCadastrarMaterial();
			new ControladorPanelCadastrarMaterial(panelCadastrarMaterial);
			Dialog dialog = new Dialog(frame, panelCadastrarMaterial);
			
		}
	}

}

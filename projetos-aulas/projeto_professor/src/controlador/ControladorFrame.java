package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelCadastrarAluno;
import visual.PanelCadastrarProfessor;
import visual.PanelConsultarAluno;
import visual.PanelConsultarProfessor;
import visual.PanelHome;

public class ControladorFrame implements ActionListener {
	
	// Declaração
	Frame frame;

	PanelHome panelHome;
	PanelCadastrarAluno panelCadastrarAluno;
	PanelCadastrarProfessor panelCadastrarProfessor;
	PanelConsultarAluno panelConsultarAluno;
	PanelConsultarProfessor panelConsultarProfessor;
	
	ControladorCadastrarAluno controladorCadastrarAluno;
	ControladorCadastrarProfessor controladorCadastrarProfessor;
	ControladorConsultarAluno controladorConsultarAluno;
	ControladorConsultarProfessor controladorConsultarProfessor;
	

	public ControladorFrame() {
		frame = new Frame();
		frame.revalidate();
		frame.repaint();
		addEventos();
	}
	
	private void addEventos() {
		frame.getMenuHome().addActionListener(this);
		frame.getCadastrarAluno().addActionListener(this);
		frame.getCadastrarProfessor().addActionListener(this);
		frame.getConsultarAluno().addActionListener(this);
		frame.getConsultarProfessor().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getMenuHome()) {
			panelHome = new PanelHome();
			frame.setContentPane(panelHome);
		}else if(e.getSource() == frame.getCadastrarAluno()) {
			panelCadastrarAluno = new PanelCadastrarAluno();
			controladorCadastrarAluno = new ControladorCadastrarAluno(panelCadastrarAluno);
			frame.setContentPane(panelCadastrarAluno);
		} else if(e.getSource() == frame.getCadastrarProfessor()) {
			panelCadastrarProfessor = new PanelCadastrarProfessor();
			controladorCadastrarProfessor = new ControladorCadastrarProfessor(panelCadastrarProfessor);
			frame.setContentPane(panelCadastrarProfessor);
		}else if(e.getSource() == frame.getConsultarAluno()) {
			panelConsultarAluno = new PanelConsultarAluno();
			controladorConsultarAluno = new ControladorConsultarAluno(panelConsultarAluno);
			frame.setContentPane(panelConsultarAluno);
		} else if(e.getSource() == frame.getConsultarProfessor()) {
			panelConsultarProfessor = new PanelConsultarProfessor();
			controladorConsultarProfessor = new ControladorConsultarProfessor(panelConsultarProfessor);
			frame.setContentPane(panelConsultarProfessor);
		}
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}

}

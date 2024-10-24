package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelCadastrarConsulta;
import visual.PanelCadastrarExame;
import visual.PanelCadastrarMedico;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	PanelCadastrarConsulta panelCadastarConsulta;
	PanelCadastrarExame panelCadastrarExame;
	PanelCadastrarMedico panelCadastrarMedico;
	
	ControladorPanelCadastrarConsulta controladorPanelCadastrarConsulta;
	ControladorPanelCadastrarExame controladorPanelCadastrarExame;
	ControladorPanelCadastrarMedico controladorPanelCadastrarMedico;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
		renderizarFrame();
	}
	
	public void addEventos() {
		frame.getMenuItemCadastrarConsulta().addActionListener(this);
		frame.getMenuItemCadastrarExame().addActionListener(this);
		frame.getMenuItemCadastrarMedico().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getMenuItemCadastrarConsulta()) {
			panelCadastarConsulta = new PanelCadastrarConsulta();
			controladorPanelCadastrarConsulta = new ControladorPanelCadastrarConsulta(panelCadastarConsulta);
			frame.setContentPane(panelCadastarConsulta);
		} else if(e.getSource() == frame.getMenuItemCadastrarExame()) {
			panelCadastrarExame = new PanelCadastrarExame();
			controladorPanelCadastrarExame = new ControladorPanelCadastrarExame(panelCadastrarExame);
			frame.setContentPane(panelCadastrarExame);
		} else if(e.getSource() == frame.getMenuItemCadastrarMedico()) {
			panelCadastrarMedico = new PanelCadastrarMedico();
			controladorPanelCadastrarMedico = new ControladorPanelCadastrarMedico(panelCadastrarMedico);
			frame.setContentPane(panelCadastrarMedico);
		}
		
		renderizarFrame();
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		new ControladorFrame(frame);
	}
	
	public void renderizarFrame() {
		frame.revalidate();
		frame.repaint();
	}
	
	

}

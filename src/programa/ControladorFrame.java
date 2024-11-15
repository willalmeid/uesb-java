package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.DialogCadastrarPaciente;
import visual.Frame;
import visual.PanelCadastrar;
import visual.PanelCadastrarPaciente;
import visual.PanelHome;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
//		PanelHome panelHome = new PanelHome();
//		frame.setContentPane(panelHome);
		
		PanelCadastrar panelCadastrar = new PanelCadastrar();
		frame.setContentPane(panelCadastrar);
		
		new ControladorFrame(frame);
		
//		PanelCadastrarPaciente paciente = new PanelCadastrarPaciente();
//		new DialogCadastrarPaciente(paciente, frame);
	}
}

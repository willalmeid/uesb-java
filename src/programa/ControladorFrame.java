package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.Frame;
import visual.PanelCadastrar;
import visual.PanelCadastrarPaciente;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		// Para testar a pagina Home
//		PanelHome panelHome = new PanelHome();
//		frame.setContentPane(panelHome);
		
		// Para testar a página Cadastrar
		PanelCadastrar panelCadastrar = new PanelCadastrar();
		frame.setContentPane(panelCadastrar);
		
		// Para testar a página Cadastrar paciente
		PanelCadastrarPaciente paciente = new PanelCadastrarPaciente();
		new Dialog(paciente, frame);

		new ControladorFrame(frame);
	}
}

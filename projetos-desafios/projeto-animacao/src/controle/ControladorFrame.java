package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;

public class ControladorFrame implements ActionListener {

	Frame frame;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
	}

	public void addEventos() {
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		new ControladorFrame(frame);
	}

}

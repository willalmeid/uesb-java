package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;

public class ControladorFrame implements ActionListener {

	private Frame frame;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
	}
	
	public void addEventos() {
		frame.getButtonStart().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getButtonStart()) {
			System.out.println("TESTE");
		}
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame(new Frame());
	}

}

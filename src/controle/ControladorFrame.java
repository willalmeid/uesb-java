package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	public ControladorFrame() {
		this.frame = new Frame();
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}

}

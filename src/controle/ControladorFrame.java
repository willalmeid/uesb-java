package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;

public class ControladorFrame implements ActionListener {

	Frame frame;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame(new Frame());
	}

}

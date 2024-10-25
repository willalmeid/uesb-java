package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelInicial;

public class ControladorFrame implements ActionListener{

	Frame frame;
	PanelInicial panelInicial;
	ControladorPanelInicial controladorPanelInicial;
	
	public ControladorFrame() {
		frame = new Frame();
		panelInicial = new PanelInicial();
		controladorPanelInicial = new ControladorPanelInicial(panelInicial);
		frame.setContentPane(panelInicial);
		frame.revalidate();
		frame.repaint();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new ControladorFrame();
	}

}

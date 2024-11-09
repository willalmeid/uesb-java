package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelUniverso;

public class controladorFrame implements ActionListener {

	private Frame frame;
	private PanelUniverso panelUniverso;
	
	
	public controladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
	}
	
	public void addEventos() {
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("TESTE");
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		PanelUniverso panelUniverso = new PanelUniverso();
		ControladorPanelUniverso controladorPanelUniverso = new ControladorPanelUniverso(panelUniverso);
		frame.setContentPane(panelUniverso);
		new controladorFrame(frame);
	}
}

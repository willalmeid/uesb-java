package controle;

import visual.Frame;
import visual.PanelUniverso;

public class controladorFrame {

	private Frame frame;
	private PanelUniverso panelUniverso;
	
	public controladorFrame(Frame frame) {
		this.frame = frame;
	}

	public static void main(String[] args) {
		Frame frame = new Frame();
		PanelUniverso panelUniverso = new PanelUniverso();
		ControladorPanelUniverso controladorPanelUniverso = new ControladorPanelUniverso(panelUniverso);
		frame.setContentPane(panelUniverso);
		new controladorFrame(frame);
	}
}

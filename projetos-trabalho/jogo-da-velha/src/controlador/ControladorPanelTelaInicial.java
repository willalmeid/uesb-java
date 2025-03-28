package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelJogo;
import visual.PanelTelaInicial;

public class ControladorPanelTelaInicial implements ActionListener {

	PanelTelaInicial panelTelaInicial;
	
	PanelJogo panelJogo;
	ControladorPanelJogo controladorPanelJogo;
	
	Frame frame;
	
	public ControladorPanelTelaInicial(PanelTelaInicial panelTelaInicial, Frame frame) {
		this.panelTelaInicial = panelTelaInicial;
		this.frame = frame;
		addEventos();
	}
	
	private void addEventos() {
		panelTelaInicial.getButtonJogar().addActionListener(this);
		
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelTelaInicial.getButtonJogar()) {
			jogar();
		}
		
	}

	private void jogar() {
		panelJogo = new PanelJogo();
		controladorPanelJogo = new ControladorPanelJogo(panelJogo);
		frame.setContentPane(panelJogo);
		frame.revalidate();
		frame.repaint();
	}

}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendarExame;

public class ControladorPanelAgendarExame implements ActionListener {

	PanelAgendarExame panelAgendarExame;
	
	public ControladorPanelAgendarExame(PanelAgendarExame panelAgendarExame) {
		this.panelAgendarExame = panelAgendarExame;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarExame.getButtonAgendar().addActionListener(this);
		panelAgendarExame.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarExame.getButtonAgendar()) {
			System.out.println("AGENDAR");
			
		} else if(e.getSource() == panelAgendarExame.getButtonLimpar()){
			System.out.println("LIMPAR");
		}
	}
	
}

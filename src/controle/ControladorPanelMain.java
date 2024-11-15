package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelHomeMain;

public class ControladorPanelMain implements ActionListener {
	
	PanelHomeMain panelMain;

	// Construtor para passar o painel e o JFrame
	public ControladorPanelMain(PanelHomeMain panelMain) {
		 this.panelMain = panelMain;
		 addEventos();
	}
	 
	public void addEventos() {
		 panelMain.getButtonCadastar().addActionListener(this);  // Adiciona o ouvinte de evento ao botão
	}

	public void actionPerformed(ActionEvent e) {
		
	}
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelHome;
import visual.PanelRelatorios;

public class ControladorPanelRelatorios implements ActionListener {

	Frame frame;
	PanelRelatorios panelRelatorios;
	PanelHome panelHome;
	
	public ControladorPanelRelatorios(PanelRelatorios panelRelatorios, Frame frame, PanelHome panelHome) {
		this.panelRelatorios = panelRelatorios;
		this.frame = frame;
		this.panelHome = panelHome;
		addEventos();
	}
	
	public void addEventos() {
		panelRelatorios.getButtonHome().addActionListener(this);
		panelRelatorios.getButtonVoltar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelRelatorios.getButtonHome() || e.getSource() == panelRelatorios.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		}
	}

}

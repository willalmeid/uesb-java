package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelAgendar;
import visual.PanelHome;

public class ControladorPanelAgendar implements ActionListener {
	
	Frame frame;
	PanelAgendar panelAgendar;
	PanelHome panelHome;
	
	public ControladorPanelAgendar(PanelAgendar panelAgendar, Frame frame, PanelHome panelHome) {
		this.panelAgendar = panelAgendar;
		this.frame = frame;
		this.panelHome = panelHome;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendar.getButtonHome().addActionListener(this);
		panelAgendar.getButtonVoltar().addActionListener(this);
		
		panelAgendar.getButtonCardAgendarConsulta().addActionListener(this);
		panelAgendar.getButtonCardAgendarExames().addActionListener(this);
		panelAgendar.getButtonCardVisualizarAgenda().addActionListener(this);
		panelAgendar.getButtonCardPesquisarHorarios().addActionListener(this);
		panelAgendar.getButtonCardCancelarEReagendar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendar.getButtonHome() || e.getSource() == panelAgendar.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		}
	}
}

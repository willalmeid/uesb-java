package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.Frame;
import visual.PanelAgendar;
import visual.PanelAgendarConsulta;
import visual.PanelAgendarExame;
import visual.PanelAgendarVisualizarAgenda;
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
		panelAgendar.getButtonCardAgendarExame().addActionListener(this);
		panelAgendar.getButtonCardVisualizarAgenda().addActionListener(this);
		panelAgendar.getButtonCardPesquisarHorarios().addActionListener(this);
		panelAgendar.getButtonCardCancelarEReagendar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendar.getButtonHome() || e.getSource() == panelAgendar.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		} else if(e.getSource() == panelAgendar.getButtonCardAgendarConsulta()) {
			PanelAgendarConsulta panelAgendarConsulta = new PanelAgendarConsulta();
//			new ControladorPanelAgendarConsulta(panelAgendarConsulta);
			Dialog dialog = new Dialog(panelAgendarConsulta);
			
		} else if(e.getSource() == panelAgendar.getButtonCardAgendarExame()) {
			PanelAgendarExame panelAgendarExame = new PanelAgendarExame();
//			new ControladorPanelAgendarConsulta(panelAgendarExame);
			Dialog dialog = new Dialog(panelAgendarExame);
			
		} else if(e.getSource() == panelAgendar.getButtonCardVisualizarAgenda()) {
			PanelAgendarVisualizarAgenda panelAgendarVisualizarAgenda = new PanelAgendarVisualizarAgenda();
//			new ControladorPanelAgendarConsulta(panelAgendarVisualizarAgenda);
			Dialog dialog = new Dialog(panelAgendarVisualizarAgenda);
			
		}
	}
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.Frame;
import visual.PanelAgendamento;
import visual.PanelAgendamentoCancelarEReagendar;
import visual.PanelAgendamentoPesquisarHorarios;
import visual.PanelAgendamentoVisualizarAgenda;
import visual.PanelHome;

public class ControladorPanelAgendamento implements ActionListener {
	
	Frame frame;
	PanelAgendamento panelAgendar;
	PanelHome panelHome;
	
	public ControladorPanelAgendamento(PanelAgendamento panelAgendar, Frame frame, PanelHome panelHome) {
		this.panelAgendar = panelAgendar;
		this.frame = frame;
		this.panelHome = panelHome;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendar.getButtonHome().addActionListener(this);
		panelAgendar.getButtonVoltar().addActionListener(this);
		
		panelAgendar.getButtonCardVisualizarAgenda().addActionListener(this);
		panelAgendar.getButtonCardPesquisarHorarios().addActionListener(this);
		panelAgendar.getButtonCardCancelarEReagendar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendar.getButtonHome() || e.getSource() == panelAgendar.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		} else if(e.getSource() == panelAgendar.getButtonCardVisualizarAgenda()) {
			PanelAgendamentoVisualizarAgenda panelAgendamentoVisualizarAgenda = new PanelAgendamentoVisualizarAgenda();		
			new ControladorPanelAgendamentoVisualizarAgenda(panelAgendamentoVisualizarAgenda);
			Dialog dialog = new Dialog(frame, panelAgendamentoVisualizarAgenda);
			
		} else if(e.getSource() == panelAgendar.getButtonCardPesquisarHorarios()) {
			PanelAgendamentoPesquisarHorarios panelAgendamentoPesquisarHorarios = new PanelAgendamentoPesquisarHorarios();
//			new ControladorPanelAgendamentoPesquisarHorarios(panelAgendamentoPesquisarHorarios);
			Dialog dialog = new Dialog(frame, panelAgendamentoPesquisarHorarios);
			
		} else if(e.getSource() == panelAgendar.getButtonCardCancelarEReagendar()) {
			PanelAgendamentoCancelarEReagendar panelAgendamentoCancelarEReagendar = new PanelAgendamentoCancelarEReagendar();
			new ControladorPanelAgendamentoCancelarEReagendar(frame, panelAgendamentoCancelarEReagendar);
			Dialog dialog = new Dialog(frame, panelAgendamentoCancelarEReagendar);
			
		}
	}
}

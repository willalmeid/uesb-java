package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Dialog;
import visual.Frame;
import visual.PanelHome;
import visual.PanelRelatorios;
import visual.PanelRelatoriosConsultas;
import visual.PanelRelatoriosExames;
import visual.PanelRelatoriosFinanceiros;
import visual.PanelRelatoriosMateriais;

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
		panelRelatorios.getButtonCardRelatorioConsulta().addActionListener(this);
		panelRelatorios.getButtonCardRelatorioExame().addActionListener(this);
		panelRelatorios.getButtonCardRelatorioFinanceiro().addActionListener(this);
		panelRelatorios.getButtonCardRelatorioMaterial().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelRelatorios.getButtonHome() || e.getSource() == panelRelatorios.getButtonVoltar()) {
			frame.setContentPane(panelHome);
			
		} else if(e.getSource() == panelRelatorios.getButtonCardRelatorioConsulta()) {
			PanelRelatoriosConsultas panelRelatoriosConsultas = new PanelRelatoriosConsultas();
			new ControladorPanelRelatoriosConsultas(panelRelatoriosConsultas);
			Dialog dialog = new Dialog(frame, panelRelatoriosConsultas);
			
		} else if(e.getSource() == panelRelatorios.getButtonCardRelatorioExame()) {
			PanelRelatoriosExames panelRelatoriosExames = new PanelRelatoriosExames();
			new ControladorPanelRelatoriosExames(panelRelatoriosExames);
			Dialog dialog = new Dialog(frame, panelRelatoriosExames);
			
		} else if(e.getSource() == panelRelatorios.getButtonCardRelatorioFinanceiro()) {
			PanelRelatoriosFinanceiros panelRelatoriosFinanceiros = new PanelRelatoriosFinanceiros();
			new ControladorPanelRelatoriosFinanceiros(panelRelatoriosFinanceiros);
			Dialog dialog = new Dialog(frame, panelRelatoriosFinanceiros);
			
		} else if(e.getSource() == panelRelatorios.getButtonCardRelatorioMaterial()) {
			PanelRelatoriosMateriais panelRelatoriosMateriais = new PanelRelatoriosMateriais();
			new ControladorPanelRelatoriosMateriais(panelRelatoriosMateriais);
			Dialog dialog = new Dialog(frame, panelRelatoriosMateriais);
			
		}
	}

}

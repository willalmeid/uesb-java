package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.Frame;
import visual.PanelAgendarConsulta;
import visual.PanelAgendarExame;
import visual.PanelCadastrarConsulta;
import visual.PanelCadastrarExame;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;
import visual.PanelPesquisarHorarios;
import visual.PanelRelatoriosDeConsulta;
import visual.PanelRelatoriosDeExames;
import visual.PanelRelatoriosDeMateriais;
import visual.PanelRelatoriosFinanceiros;
import visual.PanelVisualizarAgenda;
import visual.PanelCadastrarMaterial;

public class ControladorFrame implements ActionListener{

	Frame frame;
	
	PanelCadastrarConsulta panelCadastarConsulta;
	PanelCadastrarExame panelCadastrarExame;
	PanelCadastrarMedico panelCadastrarMedico;
	PanelCadastrarMaterial panelCadastrarMaterial;
	PanelCadastrarPaciente panelCadastrarPaciente;
	PanelAgendarConsulta panelAgendarConsulta;
	
	PanelAgendarExame panelAgendarExame;
	PanelVisualizarAgenda panelVisualizarAgenda;
	PanelPesquisarHorarios panelPesquisarHorarios;
	// Verificar Depois
//	PanelAgendarConsulta panelCacelarEReagendar;
	PanelRelatoriosDeConsulta panelRelatoriosDeConsulta;
	PanelRelatoriosDeExames panelRelatoriosDeExames;
	PanelRelatoriosFinanceiros panelRelatoriosFinanceiros;
	PanelRelatoriosDeMateriais panelRelatoriosDeMateriais;
	
	
	ControladorPanelCadastrarConsulta controladorPanelCadastrarConsulta;
	ControladorPanelCadastrarExame controladorPanelCadastrarExame;
	ControladorPanelCadastrarMedico controladorPanelCadastrarMedico;
	ControladorPanelCadastrarMaterial controladorPanelCadastrarMaterial;
	ControladorPanelCadastrarPaciente controladorPanelCadastrarPaciente;
	ControladorPanelAgendarConsulta controladorPanelAgendarConsulta;
	
	ControladorPanelAgendarExame controladorPanelAgendarExame;
	ControladorPanelVisualizarAgenda controladorPanelVisualizarAgenda;
	ControladorPanelPesquisarHorarios controladorPanelPesquisarHorarios;
//	ControladorPanelCancelarEReagendar controladorPanelCancelarEReagendar;
	ControladorPanelRelatoriosDeConsulta controladorPanelRelatoriosDeConsulta;
	ControladorPanelRelatoriosDeExames controladorPanelRelatoriosDeExames;
	ControladorPanelRelatoriosFinanceiros controladorPanelRelatoriosFinanceiros;
	ControladorPanelRelatoriosDeMateriais controladorPanelRelatoriosDeMateriais;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
		renderizarFrame();
	}
	
	public void addEventos() {
		frame.getMenuItemCadastrarConsulta().addActionListener(this);
		frame.getMenuItemCadastrarExame().addActionListener(this);
		frame.getMenuItemCadastrarMedico().addActionListener(this);
		frame.getMenuItemCadastrarMaterial().addActionListener(this);
		frame.getMenuItemCadastrarPaciente().addActionListener(this);
		frame.getMenuItemAgendarConsulta().addActionListener(this);

		frame.getMenuItemAgendarExame().addActionListener(this);
		frame.getMenuItemVisualizarAgenda().addActionListener(this);
		frame.getMenuItemPesquisarHorarios().addActionListener(this);
		frame.getMenuItemRelatoriosDeConsulta().addActionListener(this);
		frame.getMenuItemRelatoriosDeExames().addActionListener(this);
		frame.getMenuItemRelatoriosFinanceiros().addActionListener(this);
		frame.getMenuItemRelatoriosDeMateriais().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getMenuItemCadastrarConsulta()) {
			panelCadastarConsulta = new PanelCadastrarConsulta();
			controladorPanelCadastrarConsulta = new ControladorPanelCadastrarConsulta(panelCadastarConsulta);
			frame.setContentPane(panelCadastarConsulta);
		} else if(e.getSource() == frame.getMenuItemCadastrarExame()) {
			panelCadastrarExame = new PanelCadastrarExame();
			controladorPanelCadastrarExame = new ControladorPanelCadastrarExame(panelCadastrarExame);
			frame.setContentPane(panelCadastrarExame);
		} else if(e.getSource() == frame.getMenuItemCadastrarMedico()) {
			panelCadastrarMedico = new PanelCadastrarMedico();
			controladorPanelCadastrarMedico = new ControladorPanelCadastrarMedico(panelCadastrarMedico);
			frame.setContentPane(panelCadastrarMedico);
		} else if(e.getSource() == frame.getMenuItemCadastrarMaterial()) {
			panelCadastrarMaterial = new PanelCadastrarMaterial();
			controladorPanelCadastrarMaterial = new ControladorPanelCadastrarMaterial(panelCadastrarMaterial);
			frame.setContentPane(panelCadastrarMaterial);
		} else if(e.getSource() == frame.getMenuItemCadastrarPaciente()) {
			panelCadastrarPaciente = new PanelCadastrarPaciente();
			controladorPanelCadastrarPaciente = new ControladorPanelCadastrarPaciente(panelCadastrarPaciente);
			frame.setContentPane(panelCadastrarPaciente);
		} else if(e.getSource() == frame.getMenuItemAgendarConsulta()) {
			panelAgendarConsulta = new PanelAgendarConsulta();
			controladorPanelAgendarConsulta = new ControladorPanelAgendarConsulta(panelAgendarConsulta);
			frame.setContentPane(panelAgendarConsulta);
		} else if (e.getSource() == frame.getMenuItemAgendarExame()) {
		    panelAgendarExame = new PanelAgendarExame();
		    controladorPanelAgendarExame = new ControladorPanelAgendarExame(panelAgendarExame);
		    frame.setContentPane(panelAgendarExame);
		} else if (e.getSource() == frame.getMenuItemVisualizarAgenda()) {
		    panelVisualizarAgenda = new PanelVisualizarAgenda();
		    controladorPanelVisualizarAgenda = new ControladorPanelVisualizarAgenda(panelVisualizarAgenda);
		    frame.setContentPane(panelVisualizarAgenda);
		} else if (e.getSource() == frame.getMenuItemPesquisarHorarios()) {
		    panelPesquisarHorarios = new PanelPesquisarHorarios();
		    controladorPanelPesquisarHorarios = new ControladorPanelPesquisarHorarios(panelPesquisarHorarios);
		    frame.setContentPane(panelPesquisarHorarios);
		} else if (e.getSource() == frame.getMenuItemRelatoriosDeConsulta()) {
		    panelRelatoriosDeConsulta = new PanelRelatoriosDeConsulta();
		    controladorPanelRelatoriosDeConsulta = new ControladorPanelRelatoriosDeConsulta(panelRelatoriosDeConsulta);
		    frame.setContentPane(panelRelatoriosDeConsulta);
		} else if (e.getSource() == frame.getMenuItemRelatoriosDeExames()) {
		    panelRelatoriosDeExames = new PanelRelatoriosDeExames();
		    controladorPanelRelatoriosDeExames = new ControladorPanelRelatoriosDeExames(panelRelatoriosDeExames);
		    frame.setContentPane(panelRelatoriosDeExames);
		} else if (e.getSource() == frame.getMenuItemRelatoriosFinanceiros()) {
		    panelRelatoriosFinanceiros = new PanelRelatoriosFinanceiros();
		    controladorPanelRelatoriosFinanceiros = new ControladorPanelRelatoriosFinanceiros(panelRelatoriosFinanceiros);
		    frame.setContentPane(panelRelatoriosFinanceiros);
		} else if (e.getSource() == frame.getMenuItemRelatoriosDeMateriais()) {
		    panelRelatoriosDeMateriais = new PanelRelatoriosDeMateriais();
		    controladorPanelRelatoriosDeMateriais = new ControladorPanelRelatoriosDeMateriais(panelRelatoriosDeMateriais);
		    frame.setContentPane(panelRelatoriosDeMateriais);
		}
		
		renderizarFrame();
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		new ControladorFrame(frame);
	}
	
	public void renderizarFrame() {
		frame.revalidate();
		frame.repaint();
	}
	
	

}

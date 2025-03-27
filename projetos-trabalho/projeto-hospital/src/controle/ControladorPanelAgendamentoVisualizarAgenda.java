package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendamentoVisualizarAgenda;

public class ControladorPanelAgendamentoVisualizarAgenda implements ActionListener {

	PanelAgendamentoVisualizarAgenda panelAgendarVisualizarAgenda;
	
	public ControladorPanelAgendamentoVisualizarAgenda(PanelAgendamentoVisualizarAgenda panelAgendarVisualizarAgenda) {
		this.panelAgendarVisualizarAgenda = panelAgendarVisualizarAgenda;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarVisualizarAgenda.getButtonAtualizar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarVisualizarAgenda.getButtonAtualizar()) {
			System.out.println("TESTE");
		}
	}
}

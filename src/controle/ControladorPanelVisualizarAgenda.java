package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendarVisualizarAgenda;

public class ControladorPanelVisualizarAgenda implements ActionListener {

	PanelAgendarVisualizarAgenda panelAgendarVisualizarAgenda;
	
	public ControladorPanelVisualizarAgenda(PanelAgendarVisualizarAgenda panelAgendarVisualizarAgenda) {
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

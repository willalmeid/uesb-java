package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendamentoCancelarEReagendar;

public class ControladorPanelAgendamentoCancelarEReagendar implements ActionListener{

	PanelAgendamentoCancelarEReagendar panelAgendamentoCancelarEReagendar;
	
	public ControladorPanelAgendamentoCancelarEReagendar(PanelAgendamentoCancelarEReagendar panelAgendamentoCancelarEReagendar) {
		this.panelAgendamentoCancelarEReagendar = panelAgendamentoCancelarEReagendar;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendamentoCancelarEReagendar.getButtonEditarConsulta().addActionListener(this);
		panelAgendamentoCancelarEReagendar.getButtonEditarExames().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonEditarConsulta()) {
			System.out.println("CONSULTA");
		} else if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonEditarExames()) {
			System.out.println("Exames");
		}
	}
	
	
}

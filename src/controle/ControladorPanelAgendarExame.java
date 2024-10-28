package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelAgendarExame;

public class ControladorPanelAgendarExame implements ActionListener {

	PanelAgendarExame panelAgendarExames;
	
	public ControladorPanelAgendarExame(PanelAgendarExame panelAgendarExame) {
		this.panelAgendarExames = panelAgendarExame;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarExames.getButtonAgendar().addActionListener(this);
		panelAgendarExames.getButtonLimpar().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarExames.getButtonAgendar()) {
			cadastrarConsulta();
			System.out.println("Cadastrado!");
		} else if(e.getSource() == panelAgendarExames.getButtonLimpar()) {
			limparPanel();
			System.out.println("Limpo!");
		}
	}

	public void cadastrarConsulta() {
		
	}
	
	public void limparPanel() {
		panelAgendarExames.getTextFieldData().setText("");
		panelAgendarExames.getTextFieldHora().setText("");
		panelAgendarExames.getTextFieldPaciente().setText("");
	}
}

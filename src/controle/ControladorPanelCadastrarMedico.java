package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarMedico;

public class ControladorPanelCadastrarMedico implements ActionListener{

	PanelCadastrarMedico panelCadastrarMedico;
	
	public ControladorPanelCadastrarMedico(PanelCadastrarMedico panelCadastrarMedico) {
		this.panelCadastrarMedico = panelCadastrarMedico;
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarMedico.getButtonCadastrar().addActionListener(this);
		panelCadastrarMedico.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarMedico.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarMedico.getButtonLimpar()) {
			limparPanel();

		}
	}

	public void cadastrarConsulta() {
		
	}
	
	public void limparPanel() {
		panelCadastrarMedico.getTextFieldNome().setText("");
		panelCadastrarMedico.getTextFieldEspecialidade().setText("");
		panelCadastrarMedico.getTextFieldCrm().setText("");
		panelCadastrarMedico.getTextFieldContato().setText("");
		panelCadastrarMedico.getTextFieldValorConsultaParticular().setText("");
		panelCadastrarMedico.getTextAreaHistoricoDeAtendimento().setText("");
	}
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Consulta;
import modelo.Material;
import modelo.Medico;
import modelo.Paciente;
import visual.PanelCadastrarConsulta;

public class ControladorPanelCadastrarConsulta implements ActionListener {

	PanelCadastrarConsulta panelCadastrarConsulta;
	ArrayList<Consulta> consultasAgendadas;
	
	public ControladorPanelCadastrarConsulta(PanelCadastrarConsulta panelCadastarConsulta) {
		this.panelCadastrarConsulta = panelCadastarConsulta;
		consultasAgendadas = new ArrayList<Consulta>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarConsulta.getButtonCadastrar().addActionListener(this);
		panelCadastrarConsulta.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarConsulta.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarConsulta.getButtonLimpar()) {
			limparPanel();

		}
	}
	
	public void cadastrarConsulta() {
		String data = panelCadastrarConsulta.getTextFieldData().getText();
		String hora = panelCadastrarConsulta.getTextFieldHora().getText();
		String queixaPaciente = panelCadastrarConsulta.getTextAreaQueixaPaciente().getText();
		String tipoDeConsulta  = (String) panelCadastrarConsulta.getComboBoxTipoDeConsulta().getSelectedItem();
		String convenio = (String) panelCadastrarConsulta.getComboBoxConvenio().getSelectedItem();
		String observacoes = panelCadastrarConsulta.getTextAreaObservacoes().getText();
		
		Medico medico = (Medico) panelCadastrarConsulta.getComboBoxMedico().getSelectedItem();
		
		String nomePaciente = panelCadastrarConsulta.getTextFieldPaciente().getText();	
		String nomeMaterial = panelCadastrarConsulta.getTextAreaMaterial().getText();
	}
	
	public void limparPanel() {
		panelCadastrarConsulta.getTextFieldData().setText("");
		panelCadastrarConsulta.getTextFieldHora().setText("");
		panelCadastrarConsulta.getTextAreaQueixaPaciente().setText("");
		panelCadastrarConsulta.getTextAreaObservacoes().setText("");
		panelCadastrarConsulta.getTextAreaMaterial().setText("");
	}

}

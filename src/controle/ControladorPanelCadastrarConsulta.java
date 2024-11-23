package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
		
		Medico medico = new Medico();
		medico.setNome(""+panelCadastrarConsulta.getComboBoxMedico().getSelectedItem());
		
		Paciente paciente = new Paciente();
		paciente.setNome(panelCadastrarConsulta.getTextFieldPaciente().getText());	
		
		Material material = new Material(); 
		material.setNomeDoMaterial(panelCadastrarConsulta.getTextAreaMaterial().getText());
		
		Consulta c = new Consulta(data, hora, queixaPaciente, tipoDeConsulta, convenio, observacoes, medico, paciente, material);
	
		consultasAgendadas.add(c);
		JOptionPane.showMessageDialog(panelCadastrarConsulta, "Consulta cadastrada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void limparPanel() {
		panelCadastrarConsulta.getTextFieldData().setText("");
		panelCadastrarConsulta.getTextFieldHora().setText("");
		panelCadastrarConsulta.getTextAreaQueixaPaciente().setText("");
		panelCadastrarConsulta.getTextAreaObservacoes().setText("");
		panelCadastrarConsulta.getTextAreaMaterial().setText("");
		
		// Definir seu padrão como nenhum dos itens acima
		panelCadastrarConsulta.getComboBoxMedico().setSelectedIndex(-1);
    	panelCadastrarConsulta.getComboBoxTipoDeConsulta().setSelectedIndex(-1);
    	panelCadastrarConsulta.getComboBoxConvenio().setSelectedIndex(-1);
	}

}
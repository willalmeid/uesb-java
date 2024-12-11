package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visual.PanelAgendarConsulta;

public class ControladorPanelAgendarConsulta implements ActionListener {

	PanelAgendarConsulta panelAgendarConsulta;
	
	public ControladorPanelAgendarConsulta(PanelAgendarConsulta panelAgendarConsulta) {
		this.panelAgendarConsulta = panelAgendarConsulta;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarConsulta.getButtonAgendar().addActionListener(this);
		panelAgendarConsulta.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarConsulta.getButtonAgendar()) {
			agendarConsulta();
			
		} else if(e.getSource() == panelAgendarConsulta.getButtonLimpar()) {
			limparPanel();
			
		}
	}
	
	public void agendarConsulta() {
		String data = panelAgendarConsulta.getTextFieldData().getText();
		String hora = panelAgendarConsulta.getTextFieldHora().getText();
		
		String medico = (String) panelAgendarConsulta.getComboBoxMedico().getSelectedItem();
		String paciente = (String) panelAgendarConsulta.getComboBoxPaciente().getSelectedItem();	
		
		if(Verificacao.verificaCamposVazios(data, hora, paciente, medico)) {
			JOptionPane.showMessageDialog(panelAgendarConsulta, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
		} else if(Verificacao.verificaDatas(data)) {
			JOptionPane.showMessageDialog(panelAgendarConsulta, "Digite uma data válida no formato dd/mm/aaaa", "Erro - Data inválida", JOptionPane.WARNING_MESSAGE);
		} else {
//			Consulta c = new Consulta(data, hora, paciente, medico);
//			c.salvarDados();
			
//			consultasAgendadas.add(c);
			JOptionPane.showMessageDialog(panelAgendarConsulta, "Consulta cadastrada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelAgendarConsulta.getTextFieldData().setText("");
		panelAgendarConsulta.getTextFieldHora().setText("");
		
		// Definir seu padrão como nenhum dos itens acima
		panelAgendarConsulta.getComboBoxPaciente().setSelectedIndex(-1);
		panelAgendarConsulta.getComboBoxMedico().setSelectedIndex(-1);
	}
}

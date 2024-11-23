package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Medico;
import visual.PanelCadastrarMedico;

public class ControladorPanelCadastrarMedico implements ActionListener{

	PanelCadastrarMedico panelCadastrarMedico;
	ArrayList<Medico> medicosCadastrados;
	
	public ControladorPanelCadastrarMedico(PanelCadastrarMedico panelCadastrarMedico) {
		this.panelCadastrarMedico = panelCadastrarMedico;
		medicosCadastrados = new ArrayList<Medico>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarMedico.getButtonCadastrar().addActionListener(this);
		panelCadastrarMedico.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarMedico.getButtonCadastrar()) {
			cadastrarMedico();

		} else if(e.getSource() == panelCadastrarMedico.getButtonLimpar()) {
			limparPanel();

		}
	}

	public void cadastrarMedico() {
		try {
			String nome = panelCadastrarMedico.getTextFieldNome().getText();
			String especialidade = panelCadastrarMedico.getTextFieldEspecialidade().getText(); 
			String crm = panelCadastrarMedico.getTextFieldCrm().getText();
			String contato = panelCadastrarMedico.getTextFieldContato().getText(); 
			float valorConsultaParticular = Float.parseFloat(panelCadastrarMedico.getTextFieldValorConsultaParticular().getText());
			String históricoDeAtendimento = panelCadastrarMedico.getTextAreaHistoricoDeAtendimento().getText();
			
			Medico m = new Medico(nome, especialidade, crm, contato, valorConsultaParticular, históricoDeAtendimento);
			
			medicosCadastrados.add(m);
			
			JOptionPane.showMessageDialog(panelCadastrarMedico, "Medico "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panelCadastrarMedico, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
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
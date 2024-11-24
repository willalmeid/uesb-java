package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Exame;
import modelo.Material;
import modelo.Medico;
import visual.PanelCadastrarExame;

public class ControladorPanelCadastrarExame implements ActionListener {

	PanelCadastrarExame panelCadastrarExame;
	ArrayList<Exame> examesCadastrados;
	
	public ControladorPanelCadastrarExame(PanelCadastrarExame panelCadastrarExame) {
		this.panelCadastrarExame = panelCadastrarExame;
		examesCadastrados = new ArrayList<Exame>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarExame.getButtonCadastrar().addActionListener(this);
		panelCadastrarExame.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarExame.getButtonLimpar()) {
			limparPanel();

		}
	}

	public void cadastrarConsulta() {
		try {
			String nomeExame = panelCadastrarExame.getTextFieldNomeExame().getText();
			String descricao = panelCadastrarExame.getTextAreaDescricao().getText();

			float valorParticular = Float.parseFloat(panelCadastrarExame.getTextFieldValorParticular().getText());
			
			Material materiaisUtilizados = new Material();
			materiaisUtilizados.setNomeDoMaterial(panelCadastrarExame.getTextAreaMateriaisUtilizados().getText());
			

			Medico medico = new Medico();
			medico.setNome((String) panelCadastrarExame.getComboBoxMedico().getSelectedItem());
			
			String tipoExame = (String) panelCadastrarExame.getComboBoxTipoExame().getSelectedItem();
			
			if(Verificacao.verificaCamposVazios(nomeExame, descricao, materiaisUtilizados.getNomeDoMaterial())) {
				JOptionPane.showMessageDialog(panelCadastrarExame, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
			} else {
				Exame e = new Exame(nomeExame, descricao, valorParticular, materiaisUtilizados, medico, tipoExame);
				
				examesCadastrados.add(e);
				
				JOptionPane.showMessageDialog(panelCadastrarExame, "Exame "+nomeExame+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarExame.getTextFieldNomeExame().setText("");
		panelCadastrarExame.getTextFieldValorParticular().setText("");
		panelCadastrarExame.getTextAreaMateriaisUtilizados().setText("");
		panelCadastrarExame.getTextAreaDescricao().setText("");
		
		panelCadastrarExame.getComboBoxMedico().setSelectedIndex(-1);
		panelCadastrarExame.getComboBoxTipoExame().setSelectedIndex(-1);
	}
}
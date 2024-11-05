package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Exame;
import modelo.Material;
import modelo.Medico;
import visual.PanelCadastrarExame;

public class ControladorPanelCadastrarExame implements ActionListener{

	PanelCadastrarExame panelCadastrarExame;
	ArrayList<Exame> examesCadastrados;
	
	public ControladorPanelCadastrarExame(PanelCadastrarExame panelCadastrarExame) {
		this.panelCadastrarExame = panelCadastrarExame;
		examesCadastrados = new ArrayList<Exame>();
		addEventos();
	}
	
	public void addEventos(){
		panelCadastrarExame.getButtonCadastrar().addActionListener(this);
		panelCadastrarExame.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
			cadastrarExame();

		} else if(e.getSource() == panelCadastrarExame.getButtonLimpar()) {
			limparPanel();

		}
	}


	public void cadastrarExame() {
		try {
			String nome = panelCadastrarExame.getTextFieldNomeExame().getText();
			String descricao = panelCadastrarExame.getTextAreaDescricao().getText();
			Material materiaisUtilizados = new Material();
			materiaisUtilizados.setNomeDoMaterial(panelCadastrarExame.getTextAreaMateriaisUtilizados().getText());
			float valorParticular = Float.parseFloat(panelCadastrarExame.getTextFieldValorParticular().getText());
			
	    	Medico medico = (Medico)panelCadastrarExame.getComboBoxMedico().getSelectedItem();
	    	String tipoExame = (String)panelCadastrarExame.getComboBoxTipoExame().getSelectedItem();
	    	
	    	Exame e = new Exame(nome, descricao, valorParticular, materiaisUtilizados, medico, tipoExame);
	    	
	    	examesCadastrados.add(e);
	    	JOptionPane.showMessageDialog(panelCadastrarExame, "Exame "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			
		} catch(Exception e){
			JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarExame.getTextFieldNomeExame().setText("");
		panelCadastrarExame.getTextAreaDescricao().setText("");
		panelCadastrarExame.getTextAreaMateriaisUtilizados().setText("");
		panelCadastrarExame.getTextFieldValorParticular().setText("");
		
    	panelCadastrarExame.getComboBoxMedico().setSelectedIndex(-1);
    	panelCadastrarExame.getComboBoxTipoExame().setSelectedIndex(-1);
	}
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import modelo.Exame;
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
		panelCadastrarExame.getButtonAdicionar().addActionListener(this);
		panelCadastrarExame.getButtonRemover().addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarExame.getButtonLimpar()) {
			limparPanel();

		} else if(e.getSource() == panelCadastrarExame.getButtonAdicionar()) {
			if(panelCadastrarExame.getComboBoxAdicionarMaterial().getSelectedItem() != null) {
				String materialName = (String) panelCadastrarExame.getComboBoxAdicionarMaterial().getSelectedItem();
                DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarExame.getListMateriaisUtilizados().getModel();
                model.addElement(materialName);
                panelCadastrarExame.getComboBoxAdicionarMaterial().setSelectedIndex(-1);;
			}
			
		} else if(e.getSource() == panelCadastrarExame.getButtonRemover()) {
		    if(panelCadastrarExame.getListMateriaisUtilizados().getSelectedIndex() >= 0) {
		        int selectedIndex = panelCadastrarExame.getListMateriaisUtilizados().getSelectedIndex();
		        DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarExame.getListMateriaisUtilizados().getModel();
		        model.remove(selectedIndex);
		    }
		    
		}
	}

	public void cadastrarConsulta() {
		try {
			String nomeExame = panelCadastrarExame.getTextFieldNomeExame().getText();
			String descricao = panelCadastrarExame.getTextAreaDescricao().getText();
			String data = panelCadastrarExame.getTextFieldData().getText();
			String hora = panelCadastrarExame.getTextFieldHora().getText();

			float valorParticular = Float.parseFloat(panelCadastrarExame.getTextFieldValorParticular().getText());
			
			JList<String> materiaisUtilizados = panelCadastrarExame.getListMateriaisUtilizados();

			String paciente = (String) panelCadastrarExame.getComboBoxPaciente().getSelectedItem();			
			String medico = (String) panelCadastrarExame.getComboBoxMedico().getSelectedItem();
			String tipoExame = (String) panelCadastrarExame.getComboBoxTipoExame().getSelectedItem();
			
			if(Verificacao.verificaCamposVazios(nomeExame, descricao, paciente, medico, tipoExame)) {
				JOptionPane.showMessageDialog(panelCadastrarExame, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
			} else {
				Exame e = new Exame(nomeExame,  valorParticular, paciente, data, hora, medico, tipoExame, descricao, materiaisUtilizados);
				e.salvarDados();
				
				examesCadastrados.add(e);
				
				JOptionPane.showMessageDialog(panelCadastrarExame, "Exame "+nomeExame+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
				limparPanel();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarExame.getTextFieldNomeExame().setText("");
		panelCadastrarExame.getTextFieldValorParticular().setText("");
//		panelCadastrarExame.getListMateriaisUtilizados().de("");
		panelCadastrarExame.getTextAreaDescricao().setText("");
		
		panelCadastrarExame.getComboBoxMedico().setSelectedIndex(-1);
		panelCadastrarExame.getComboBoxTipoExame().setSelectedIndex(-1);
	}
}
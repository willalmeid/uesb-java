package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import modelo.Medico;
import visual.Dialog;
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
		panelCadastrarMedico.getButtonAdicionar().addActionListener(this);
		panelCadastrarMedico.getButtonRemover().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarMedico.getButtonCadastrar()) {
			cadastrarMedico();

		} else if(e.getSource() == panelCadastrarMedico.getButtonLimpar()) {
			limparPanel();

		} else if(e.getSource() == panelCadastrarMedico.getButtonAdicionar()) {
			if(panelCadastrarMedico.getComboBoxAdicionarHorarios().getSelectedItem() != null) {
				String materialName = (String) panelCadastrarMedico.getComboBoxAdicionarHorarios().getSelectedItem();
                DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarMedico.getListHorariosDeAtendimento().getModel();
                model.addElement(materialName);
                panelCadastrarMedico.getComboBoxAdicionarHorarios().setSelectedIndex(-1);;
			}
			
		} else if(e.getSource() == panelCadastrarMedico.getButtonRemover()) {
		    if(panelCadastrarMedico.getListHorariosDeAtendimento().getSelectedIndex() >= 0) {
		        int selectedIndex = panelCadastrarMedico.getListHorariosDeAtendimento().getSelectedIndex();
		        DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarMedico.getListHorariosDeAtendimento().getModel();
		        model.remove(selectedIndex);
		    }
		    
		}
	}

	public void cadastrarMedico() {
		try {
			String nome = panelCadastrarMedico.getTextFieldNome().getText();
			String especialidade = panelCadastrarMedico.getTextFieldEspecialidade().getText(); 
			String crm = panelCadastrarMedico.getTextFieldCrm().getText();
			String contato = panelCadastrarMedico.getTextFieldContato().getText(); 
			float valorConsultaParticular = Float.parseFloat(panelCadastrarMedico.getTextFieldValorConsultaParticular().getText());
			JList<String> horariosDeAtendimento = panelCadastrarMedico.getListHorariosDeAtendimento();
			
			if(Verificacao.verificaCamposVazios(nome, especialidade, crm, contato)) {
				JOptionPane.showMessageDialog(panelCadastrarMedico, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
			} else {
				Medico m = new Medico(nome, especialidade, crm, contato, valorConsultaParticular, horariosDeAtendimento);
				m.salvarDados();
				
				medicosCadastrados.add(m);		
				JOptionPane.showMessageDialog(panelCadastrarMedico, "Medico "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

				if (panelCadastrarMedico.getTopLevelAncestor() instanceof Dialog) {
	                Dialog dialog = (Dialog) panelCadastrarMedico.getTopLevelAncestor();
	                dialog.dispose();  // Fecha o JDialog
	            }
			}
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

		DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarMedico.getListHorariosDeAtendimento().getModel();
		model.clear();}
}
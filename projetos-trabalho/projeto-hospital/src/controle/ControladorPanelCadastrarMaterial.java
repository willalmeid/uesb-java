package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Material;
import visual.Dialog;
import visual.PanelCadastrarMaterial;

public class ControladorPanelCadastrarMaterial implements ActionListener{

	PanelCadastrarMaterial panelCadastrarMaterial;
	ArrayList<Material> materiaisCadastrados;
	
	public ControladorPanelCadastrarMaterial(PanelCadastrarMaterial panelCadastrarMaterial) {
		this.panelCadastrarMaterial = panelCadastrarMaterial;
		materiaisCadastrados = new ArrayList<Material>();
		addEventos();
	}
	
	public void addEventos(){
		panelCadastrarMaterial.getButtonCadastrar().addActionListener(this);
		panelCadastrarMaterial.getButtonLimpar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarMaterial.getButtonCadastrar()) {
			cadastrarMaterial();
		}
		else if(e.getSource() == panelCadastrarMaterial.getButtonLimpar()) {
			limparPanel();
		}
		
	}

	private void cadastrarMaterial() {
		try {
			int qtdEmEstoque = Integer.parseInt(panelCadastrarMaterial.getTextFieldQtdEmEstoque().getText());
			int qtdMinimaEmEstoque = Integer.parseInt(panelCadastrarMaterial.getTextFieldQtdMinimaEmEstoque().getText());
			float preco = Float.parseFloat(panelCadastrarMaterial.getTextFieldPreco().getText());
			String nome = panelCadastrarMaterial.getTextFieldNome().getText();
			String fornecedor = panelCadastrarMaterial.getTextFieldFornecedor().getText();
			
			if(Verificacao.verificaCamposVazios(nome, fornecedor)) {
				JOptionPane.showMessageDialog(panelCadastrarMaterial, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
			} else {
				Material m = new Material(nome, qtdEmEstoque, qtdMinimaEmEstoque, fornecedor, preco);
				m.salvarDados();
				
				materiaisCadastrados.add(m);
				JOptionPane.showMessageDialog(panelCadastrarMaterial, "Material "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

				if (panelCadastrarMaterial.getTopLevelAncestor() instanceof Dialog) {
	                Dialog dialog = (Dialog) panelCadastrarMaterial.getTopLevelAncestor();
	                dialog.dispose();  // Fecha o JDialog
	            }
			}			
		} catch(Exception e){
			JOptionPane.showMessageDialog(panelCadastrarMaterial, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
		
	}

	private void limparPanel() {
		panelCadastrarMaterial.getTextFieldNome().setText("");
		panelCadastrarMaterial.getTextFieldQtdEmEstoque().setText("");
		panelCadastrarMaterial.getTextFieldQtdMinimaEmEstoque().setText("");
		panelCadastrarMaterial.getTextFieldFornecedor().setText("");
		panelCadastrarMaterial.getTextFieldPreco().setText("");
	}

}
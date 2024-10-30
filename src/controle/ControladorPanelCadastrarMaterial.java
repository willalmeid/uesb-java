package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarMaterial;

public class ControladorPanelCadastrarMaterial implements ActionListener{

	PanelCadastrarMaterial panelCadastrarMaterial;
	
	public ControladorPanelCadastrarMaterial(PanelCadastrarMaterial panelCadastrarMaterial) {
		this.panelCadastrarMaterial = panelCadastrarMaterial;
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
		
	}

	private void limparPanel() {
		panelCadastrarMaterial.getTextFieldNome().setText("");
		panelCadastrarMaterial.getTextFieldQtdEmEstoque().setText("");
		panelCadastrarMaterial.getTextFieldQtdMinimaEmEstoque().setText("");
		panelCadastrarMaterial.getTextFieldFornecedor().setText("");
		panelCadastrarMaterial.getTextFieldPreco().setText("");
	}

}

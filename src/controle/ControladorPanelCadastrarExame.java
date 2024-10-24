package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import visual.PanelCadastrarExame;

public class ControladorPanelCadastrarExame implements ActionListener{

	PanelCadastrarExame panelCadastrarExame;
	
	public ControladorPanelCadastrarExame(PanelCadastrarExame panelCadastrarExame) {
		this.panelCadastrarExame = panelCadastrarExame;
		addEventos();
	}
	
	public void addEventos(){
		panelCadastrarExame.getButtonCadastrar().addActionListener(this);
		panelCadastrarExame.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
			cadastrarExame();
			System.out.println("Exame Cadastrado!");
		} else if(e.getSource() == panelCadastrarExame.getButtonLimpar()) {
			limparPanel();
			System.out.println("Panel Limpo!");
		}
	}


	public void cadastrarExame() {
		
	}
	
	public void limparPanel() {
		panelCadastrarExame.getTextFieldNomeExame().setText("");
		panelCadastrarExame.getTextFieldDescricao().setText("");
		panelCadastrarExame.getTextFieldMateriaisUtilizados().setText("");
		panelCadastrarExame.getTextFieldValorParticular().setText("");
	}
}

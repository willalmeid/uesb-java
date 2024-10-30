package visual;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;

public class PanelCadastrarExame extends JPanel {
	
	private JLabel labelTitlePanel;
	private JPanel panelMain;
	
	private JLabel labelNomeExame;
	private JLabel labelDescricao;
	private JLabel labelMateriaisUtilizados;
	private JLabel labelValorParticular;
	private JLabel labelMedico;
	private JLabel labelTipoExame;
	
	private JTextField textFieldNomeExame;
	private JTextField textFieldDescricao;
	private JTextField textFieldMateriaisUtilizados;
	private JTextField textFieldValorParticular;
	
	private JComboBox<String> comboBoxMedico;
	private JComboBox<String> comboBoxTipoExame;
	
	private JButton buttonCadastrar;
	private JButton buttonLimpar;

	public PanelCadastrarExame() {
		setBackground(new Color(0, 128, 255));
		setSize(1280, 750);
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonCadastrar());
		add(getButtonLimpar());
		setLayout(null);
	}
	
	public JPanel getPanelMain() {
		if(panelMain == null) {
			panelMain = new JPanel();
			panelMain.setBackground(new Color(0, 128, 192));
			panelMain.setBounds(30, 135, 1220, 490);
			panelMain.setLayout(null);
			
			panelMain.add(getLabelNomeExame());
			panelMain.add(getLabelDescricao()); 
			panelMain.add(getLabelValorParticular()); 
			panelMain.add(getLabelMateriaisUtilizados());
			panelMain.add(getLabelMedico());
			panelMain.add(getLabelTipoExame());
			
			panelMain.add(getTextFieldNomeExame());
			panelMain.add(getTextFieldDescricao());
			panelMain.add(getTextFieldMateriaisUtilizados());
			panelMain.add(getTextFieldValorParticular());
			
			panelMain.add(getComboBoxMedico());
			panelMain.add(getComboBoxTipoExame());
		}
		return panelMain;
	}
	
	/* -------------------------------------------------------------- Labels ----------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setText("Tela de Cadastro de Exame");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(397, 30, 485, 76);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelNomeExame() {
		if(labelNomeExame == null) {
			labelNomeExame = new JLabel();
			labelNomeExame.setBounds(382, 439, 39, 20);
			labelNomeExame.setText("Nome do Exame");
		}
		return labelNomeExame;
	}

	public JLabel getLabelDescricao() {
		if(labelDescricao == null) {
			labelDescricao = new JLabel();
			labelDescricao.setBounds(431, 439, 39, 20);
			labelDescricao.setText("Decrição");
		}
		return labelDescricao;
	}

	public JLabel getLabelMateriaisUtilizados() {
		if(labelMateriaisUtilizados == null) {
			labelMateriaisUtilizados = new JLabel();
			labelMateriaisUtilizados.setText("Materiais Utilizados");
			labelMateriaisUtilizados.setBounds(333, 439, 39, 20);
		}
		return labelMateriaisUtilizados;
	}

	public JLabel getLabelValorParticular() {
		if(labelValorParticular == null) {
			labelValorParticular = new JLabel();
			labelValorParticular.setText("Valor Particular");
			labelValorParticular.setBounds(480, 439, 39, 20);
		}
		return labelValorParticular;
	}
	
	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setText("Medico");
			labelMedico.setBounds(676, 428, 39, 20);
		}
		return labelMedico;
	}
	
	public JLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new JLabel();
			labelTipoExame.setText("TipoExame");
			labelTipoExame.setBounds(834, 428, 39, 20);
		}
		return labelTipoExame;
	}

	/* --------------------------------------------------------------- Imputs ----------------------------------------------------------- */
	public JTextField getTextFieldNomeExame() {
		if(textFieldNomeExame == null) {
			textFieldNomeExame = new JTextField();
			textFieldNomeExame.setBounds(382, 459, 39, 20);
		}
		return textFieldNomeExame;
	}
	
	public JTextField getTextFieldDescricao() {
		if (textFieldDescricao == null) {
			textFieldDescricao = new JTextField();
			textFieldDescricao.setBounds(431, 459, 39, 20);
		}
		return textFieldDescricao;
	}
	
	public JTextField getTextFieldMateriaisUtilizados() {
		if (textFieldMateriaisUtilizados == null) {
			textFieldMateriaisUtilizados = new JTextField();
			textFieldMateriaisUtilizados.setBounds(333, 459, 39, 20);
		}
		return textFieldMateriaisUtilizados;
	}
	
	public JTextField getTextFieldValorParticular() {
		if (textFieldValorParticular == null) {
			textFieldValorParticular = new JTextField();
			textFieldValorParticular.setBounds(480, 459, 39, 20);
		}
		return textFieldValorParticular;
	}
	
	public JComboBox getComboBoxMedico() {
		if(comboBoxMedico == null) {
			comboBoxMedico = new JComboBox();
			comboBoxMedico.setBounds(629, 449, 150, 30);
			comboBoxMedico.addItem("TESTE");
		}
		return comboBoxMedico;
	}

	public JComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox();
			comboBoxTipoExame.setBounds(789, 449, 150, 30);
			comboBoxTipoExame.addItem("TESTE");
		}
		return comboBoxTipoExame;
	}
	
	/* ------------------------------------------------------------- Buttons ------------------------------------------------------------ */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1170, 631, 80, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(30, 631, 80, 35);
		}
		return buttonLimpar;
	}
}

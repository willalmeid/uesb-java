package visual;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

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
	private JTextField textFieldValorParticular;
	private JTextArea textAreaMateriaisUtilizados;
	private JTextArea textAreaDescricao;
	
	private JComboBox<String> comboBoxMedico;
	private JComboBox<String> comboBoxTipoExame;
	
	private JButton buttonCadastrar;
	private JButton buttonLimpar;

	public PanelCadastrarExame() {
		setBackground(new Color(2, 83, 112));
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
			panelMain.setBorder(new LineBorder(null));
			panelMain.setBackground(new Color(204, 229, 233));
			panelMain.setBounds(140, 150, 1000, 405);
			panelMain.setLayout(null);
			
			panelMain.add(getLabelNomeExame());
			panelMain.add(getLabelDescricao()); 
			panelMain.add(getLabelValorParticular()); 
			panelMain.add(getLabelMateriaisUtilizados());
			panelMain.add(getLabelMedico());
			panelMain.add(getLabelTipoExame());
			
			panelMain.add(getTextFieldNomeExame());
			panelMain.add(getTextFieldValorParticular());
			panelMain.add(getTextAreaMateriaisUtilizados());
			panelMain.add(getTextAreaDescricao());
			
			panelMain.add(getComboBoxMedico());
			panelMain.add(getComboBoxTipoExame());
		}
		return panelMain;
	}
	
	/* -------------------------------------------------------------- Labels ----------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setText("Cadastro de Exame");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(486, 50, 308, 44);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelNomeExame() {
		if(labelNomeExame == null) {
			labelNomeExame = new JLabel();
			labelNomeExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNomeExame.setBounds(100, 30, 650, 20);
			labelNomeExame.setText("Nome do Exame");
		}
		return labelNomeExame;
	}

	public JLabel getLabelDescricao() {
		if(labelDescricao == null) {
			labelDescricao = new JLabel();
			labelDescricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelDescricao.setBounds(525, 150, 375, 20);
			labelDescricao.setText("Decrição");
		}
		return labelDescricao;
	}

	public JLabel getLabelMateriaisUtilizados() {
		if(labelMateriaisUtilizados == null) {
			labelMateriaisUtilizados = new JLabel();
			labelMateriaisUtilizados.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMateriaisUtilizados.setText("Materiais Utilizados");
			labelMateriaisUtilizados.setBounds(100, 150, 400, 20);
		}
		return labelMateriaisUtilizados;
	}

	public JLabel getLabelValorParticular() {
		if(labelValorParticular == null) {
			labelValorParticular = new JLabel();
			labelValorParticular.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelValorParticular.setText("Valor Particular");
			labelValorParticular.setBounds(775, 30, 125, 20);
		}
		return labelValorParticular;
	}
	
	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMedico.setText("Medico");
			labelMedico.setBounds(100, 90, 400, 20);
		}
		return labelMedico;
	}
	
	public JLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new JLabel();
			labelTipoExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelTipoExame.setText("TipoExame");
			labelTipoExame.setBounds(525, 90, 375, 20);
		}
		return labelTipoExame;
	}

	/* --------------------------------------------------------------- Imputs ----------------------------------------------------------- */
	public JTextField getTextFieldNomeExame() {
		if(textFieldNomeExame == null) {
			textFieldNomeExame = new JTextField();
			textFieldNomeExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNomeExame.setBounds(100, 55, 650, 25);
		}
		return textFieldNomeExame;
	}
	
	public JTextArea getTextAreaDescricao() {
		if (textAreaDescricao == null) {
			textAreaDescricao = new JTextArea();
			textAreaDescricao.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaDescricao.setBounds(525, 175, 375, 200);
		}
		return textAreaDescricao;
	}
	
	public JTextArea getTextAreaMateriaisUtilizados() {
		if (textAreaMateriaisUtilizados == null) {
			textAreaMateriaisUtilizados = new JTextArea();
			textAreaMateriaisUtilizados.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaMateriaisUtilizados.setBounds(100, 175, 400, 200);
		}
		return textAreaMateriaisUtilizados;
	}
	
	public JTextField getTextFieldValorParticular() {
		if (textFieldValorParticular == null) {
			textFieldValorParticular = new JTextField();
			textFieldValorParticular.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldValorParticular.setBounds(775, 55, 125, 25);
		}
		return textFieldValorParticular;
	}
	
	public JComboBox getComboBoxMedico() {
		if(comboBoxMedico == null) {
			comboBoxMedico = new JComboBox();
			comboBoxMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxMedico.setBounds(100, 115, 400, 25);
			comboBoxMedico.addItem("");
		}
		return comboBoxMedico;
	}

	public JComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox();
			comboBoxTipoExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxTipoExame.setBounds(525, 115, 375, 25);
			comboBoxTipoExame.addItem("");
		}
		return comboBoxTipoExame;
	}
	
	/* ------------------------------------------------------------- Buttons ------------------------------------------------------------ */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1040, 600, 100, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(140, 600, 100, 35);
		}
		return buttonLimpar;
	}
}

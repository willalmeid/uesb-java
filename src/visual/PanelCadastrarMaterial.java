package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarMaterial extends JPanel {
	private JPanel panelMain;
	
	private JLabel labelTitlePanel;
	private JLabel labelNome;
	private JLabel labelQtdEmEstoque;
	private JLabel labelQtdMinimaEmEstoque;
	private JLabel labelFornecedor;
	private JLabel labelPreco;
	
	private JButton buttonLimpar;
	private JButton  buttonCadastrar;
	private JTextField textFieldNome;
	private JTextField textFieldQtdEmEstoque;
	private JTextField textFieldQtdMinimaEmEstoque;
	private JTextField textFieldFornecedor;
	private JTextField textFieldPreco;
	
	public PanelCadastrarMaterial() {
		setBackground(new Color(0, 128, 0)); // Apenas um teste
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonLimpar());
		add(getButtonCadastrar());
	}
	/* ------------------------------------------------------------- Acesso ao PanelMain ------------------------------------------------------------ */
	public JPanel getPanelMain() {
		if(panelMain == null) {
			panelMain = new JPanel();
			panelMain.setBackground(new Color(128, 255, 128));
			panelMain.setBounds(30, 135, 1220, 490);
			panelMain.setLayout(null);
			panelMain.add(getLabelNome());
			panelMain.add(getLabelQtdEmEstoque());
			panelMain.add(getLabelQtdMinimaEmEstoque());
			panelMain.add(getLabelFornecedor());
			panelMain.add(getLabelPreco());
			panelMain.add(getTextFieldNome());
			panelMain.add(getTextFieldQtdEmEstoque());
			panelMain.add(getTextFieldQtdMinimaEmEstoque());
			panelMain.add(getTextFieldFornecedor());
			panelMain.add(getTextFieldPreco());
		}
		return panelMain;
	}
	
	/* ------------------------------------------------------------- Acesso aos Labels ------------------------------------------------------------ */
	
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Tela de Cadastro de Materiais");
			labelTitlePanel.setBounds(397, 30, 485, 76);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setBounds(150, 380, 39, 20);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelQtdEmEstoque() {
		if(labelQtdEmEstoque == null) {
			labelQtdEmEstoque = new JLabel();
			labelQtdEmEstoque.setBounds(250, 380, 140, 20);
			labelQtdEmEstoque.setText("Quantidade em estoque");
		}
		return labelQtdEmEstoque;
	}
	
	public JLabel getLabelQtdMinimaEmEstoque() {
		if(labelQtdMinimaEmEstoque == null) {
			labelQtdMinimaEmEstoque = new JLabel();
			labelQtdMinimaEmEstoque.setBounds(400, 380, 180, 20);
			labelQtdMinimaEmEstoque.setText("Quantidade minima em estoque");
		}
		return labelQtdMinimaEmEstoque;
	}
	
	public JLabel getLabelFornecedor() {
		if(labelFornecedor == null) {
			labelFornecedor = new JLabel();
			labelFornecedor.setBounds(590, 380, 70, 20);
			labelFornecedor.setText("Fornecedor");
		}
		return labelFornecedor;
	}
	
	public JLabel getLabelPreco() {
		if(labelPreco == null) {
			labelPreco = new JLabel();
			labelPreco.setBounds(690, 380, 39, 20);
			labelPreco.setText("Preço");
		}
		return labelPreco;
	}
	
	/* ------------------------------------------------------------- Acesso aos Inputs ------------------------------------------------------------ */
	
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(150, 400, 86, 20);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldQtdEmEstoque() {
		if (textFieldQtdEmEstoque == null) {
			textFieldQtdEmEstoque = new JTextField();
			textFieldQtdEmEstoque.setBounds(250, 400, 140, 20);
			textFieldQtdEmEstoque.setColumns(10);
		}
		return textFieldQtdEmEstoque;
	}
	public JTextField getTextFieldQtdMinimaEmEstoque() {
		if (textFieldQtdMinimaEmEstoque == null) {
			textFieldQtdMinimaEmEstoque = new JTextField();
			textFieldQtdMinimaEmEstoque.setBounds(400, 400, 180, 20);
			textFieldQtdMinimaEmEstoque.setColumns(10);
		}
		return textFieldQtdMinimaEmEstoque;
	}
	public JTextField getTextFieldFornecedor() {
		if (textFieldFornecedor == null) {
			textFieldFornecedor = new JTextField();
			textFieldFornecedor.setBounds(590, 400, 86, 20);
			textFieldFornecedor.setColumns(10);
		}
		return textFieldFornecedor;
	}
	public JTextField getTextFieldPreco() {
		if (textFieldPreco == null) {
			textFieldPreco = new JTextField();
			textFieldPreco.setBounds(690, 400, 86, 20);
			textFieldPreco.setColumns(10);
		}
		return textFieldPreco;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
	
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

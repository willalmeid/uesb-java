package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarMaterial extends JPanel {
	private JPanel panelPrincipal;
	private JLabel labelTitlePanel;
	
	private JLabel labelNome;
	private JLabel labelQtdEmEstoque;
	private JLabel labelQtdMinimaEmEstoque;
	private JLabel labelFornecedor;
	private JLabel labelPreco;
	
	private JTextField textFieldNome;
	private JTextField textFieldQtdEmEstoque;
	private JTextField textFieldQtdMinimaEmEstoque;
	private JTextField textFieldFornecedor;
	private JTextField textFieldPreco;
	
	private JButton buttonLimpar;
	private JButton  buttonCadastrar;

	public PanelCadastrarMaterial() {
		setBackground(new Color(0, 128, 0));
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonLimpar());
		add(getButtonCadastrar());
	}
	
	/* ---------------------------------------------------------------- Panel ------------------------------------------------------------ */
	public JPanel getPanelMain() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(128, 255, 128));
			panelPrincipal.setBounds(30, 135, 1220, 490);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelNome());
			panelPrincipal.add(getLabelQtdEmEstoque());
			panelPrincipal.add(getLabelQtdMinimaEmEstoque());
			panelPrincipal.add(getLabelFornecedor());
			panelPrincipal.add(getLabelPreco());
			panelPrincipal.add(getTextFieldNome());
			panelPrincipal.add(getTextFieldQtdEmEstoque());
			panelPrincipal.add(getTextFieldQtdMinimaEmEstoque());
			panelPrincipal.add(getTextFieldFornecedor());
			panelPrincipal.add(getTextFieldPreco());
		}
		return panelPrincipal;
	}
	
	/* ------------------------------------------------------------- Labels -------------------------------------------------------------- */
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
	
	/* ------------------------------------------------------------- Inputs ------------------------------------------------------------ */
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

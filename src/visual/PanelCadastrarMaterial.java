package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
		setSize(1280, 750);
		setBackground(new Color(2, 83, 112));
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
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setBounds(140, 150, 1000, 170);
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
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Cadastro de Materiais");
			labelTitlePanel.setBounds(468, 50, 344, 44);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNome.setBounds(100, 30, 39, 20);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelQtdEmEstoque() {
		if(labelQtdEmEstoque == null) {
			labelQtdEmEstoque = new JLabel();
			labelQtdEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelQtdEmEstoque.setBounds(100, 90, 250, 20);
			labelQtdEmEstoque.setText("Quantidade em estoque");
		}
		return labelQtdEmEstoque;
	}
	
	public JLabel getLabelQtdMinimaEmEstoque() {
		if(labelQtdMinimaEmEstoque == null) {
			labelQtdMinimaEmEstoque = new JLabel();
			labelQtdMinimaEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelQtdMinimaEmEstoque.setBounds(375, 90, 250, 20);
			labelQtdMinimaEmEstoque.setText("Quantidade minima em estoque");
		}
		return labelQtdMinimaEmEstoque;
	}
	
	public JLabel getLabelFornecedor() {
		if(labelFornecedor == null) {
			labelFornecedor = new JLabel();
			labelFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelFornecedor.setBounds(650, 90, 250, 20);
			labelFornecedor.setText("Fornecedor");
		}
		return labelFornecedor;
	}
	
	public JLabel getLabelPreco() {
		if(labelPreco == null) {
			labelPreco = new JLabel();
			labelPreco.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelPreco.setBounds(775, 30, 125, 20);
			labelPreco.setText("Preço");
		}
		return labelPreco;
	}
	
	/* ------------------------------------------------------------- Inputs ------------------------------------------------------------ */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNome.setBounds(100, 55, 650, 25);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldQtdEmEstoque() {
		if (textFieldQtdEmEstoque == null) {
			textFieldQtdEmEstoque = new JTextField();
			textFieldQtdEmEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldQtdEmEstoque.setBounds(100, 115, 250, 25);
			textFieldQtdEmEstoque.setColumns(10);
		}
		return textFieldQtdEmEstoque;
	}
	public JTextField getTextFieldQtdMinimaEmEstoque() {
		if (textFieldQtdMinimaEmEstoque == null) {
			textFieldQtdMinimaEmEstoque = new JTextField();
			textFieldQtdMinimaEmEstoque.setBounds(375, 115, 250, 25);
			textFieldQtdMinimaEmEstoque.setColumns(10);
		}
		return textFieldQtdMinimaEmEstoque;
	}
	public JTextField getTextFieldFornecedor() {
		if (textFieldFornecedor == null) {
			textFieldFornecedor = new JTextField();
			textFieldFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldFornecedor.setBounds(650, 115, 250, 25);
			textFieldFornecedor.setColumns(10);
		}
		return textFieldFornecedor;
	}
	public JTextField getTextFieldPreco() {
		if (textFieldPreco == null) {
			textFieldPreco = new JTextField();
			textFieldPreco.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldPreco.setBounds(775, 55, 125, 25);
			textFieldPreco.setColumns(10);
		}
		return textFieldPreco;
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

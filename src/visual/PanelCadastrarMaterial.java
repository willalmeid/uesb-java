package visual;

import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Buttons;
import styles.Input;
import styles.InputLabel;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCadastrarMaterial extends JPanel {
	private JPanel panelPrincipal;
	private TitlePanel labelTitlePanel;
	
	private InputLabel labelNome;
	private InputLabel labelQtdEmEstoque;
	private InputLabel labelQtdMinimaEmEstoque;
	private InputLabel labelFornecedor;
	private InputLabel labelPreco;
	
	private Input textFieldNome;
	private Input textFieldQtdEmEstoque;
	private Input textFieldQtdMinimaEmEstoque;
	private Input textFieldFornecedor;
	private Input textFieldPreco;
	
	private Buttons buttonLimpar;
	private Buttons  buttonCadastrar;

	public PanelCadastrarMaterial() {
		setBackground(Thema.corPrincipal);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
					.addGroup(groupLayout.createSequentialGroup()
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(20)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
									.addGroup(groupLayout.createSequentialGroup()
										.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
									.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)))
							.addGroup(groupLayout.createSequentialGroup()
								.addGap(218)
								.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE)))
						.addContainerGap(15, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
					.addGap(280)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		setLayout(groupLayout);
	}
	
	/* ---------------------------------------------------------------- Panel ------------------------------------------------------------ */
	public JPanel getPanelMain() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(new Color(204, 229, 233));
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
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Materiais");
		}
		return labelTitlePanel;
	}
	
	public InputLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new InputLabel("Nome");
			labelNome.setBounds(10, 11, 600, 20);
		}
		return labelNome;
	}
	
	public InputLabel getLabelQtdEmEstoque() {
		if(labelQtdEmEstoque == null) {
			labelQtdEmEstoque = new InputLabel("Quantidade em estoque");
			labelQtdEmEstoque.setBounds(10, 71, 200, 20);
		}
		return labelQtdEmEstoque;
	}
	
	public InputLabel getLabelQtdMinimaEmEstoque() {
		if(labelQtdMinimaEmEstoque == null) {
			labelQtdMinimaEmEstoque = new InputLabel("Quantidade minima em estoque");
			labelQtdMinimaEmEstoque.setBounds(225, 71, 250, 20);
		}
		return labelQtdMinimaEmEstoque;
	}
	
	public InputLabel getLabelFornecedor() {
		if(labelFornecedor == null) {
			labelFornecedor = new InputLabel("Fornecedor");
			labelFornecedor.setBounds(490, 71, 260, 20);
		}
		return labelFornecedor;
	}
	
	public InputLabel getLabelPreco() {
		if(labelPreco == null) {
			labelPreco = new InputLabel("Preço");
			labelPreco.setBounds(625, 10, 125, 20);
		}
		return labelPreco;
	}
	
	/* ------------------------------------------------------------- Inputs ------------------------------------------------------------ */
	public Input getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new Input();
			textFieldNome.setBounds(10, 36, 600, 25);
		}
		return textFieldNome;
	}
	public Input getTextFieldQtdEmEstoque() {
		if (textFieldQtdEmEstoque == null) {
			textFieldQtdEmEstoque = new Input();
			textFieldQtdEmEstoque.setBounds(10, 96, 200, 25);
		}
		return textFieldQtdEmEstoque;
	}
	public Input getTextFieldQtdMinimaEmEstoque() {
		if (textFieldQtdMinimaEmEstoque == null) {
			textFieldQtdMinimaEmEstoque = new Input();
			textFieldQtdMinimaEmEstoque.setBounds(225, 96, 250, 25);
		}
		return textFieldQtdMinimaEmEstoque;
	}
	public Input getTextFieldFornecedor() {
		if (textFieldFornecedor == null) {
			textFieldFornecedor = new Input();
			textFieldFornecedor.setBounds(490, 96, 260, 25);
		}
		return textFieldFornecedor;
	}
	public Input getTextFieldPreco() {
		if (textFieldPreco == null) {
			textFieldPreco = new Input();
			textFieldPreco.setBounds(625, 35, 125, 25);
		}
		return textFieldPreco;
	}
	
	/* ------------------------------------------------------------- Buttons ------------------------------------------------------------ */
	
	public Buttons getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new Buttons("Cadastrar");
		}
		return buttonCadastrar;
	}
	
	public Buttons getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Buttons("Limpar");
		}
		return buttonLimpar;
	}
}
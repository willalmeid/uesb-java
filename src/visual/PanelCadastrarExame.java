package visual;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import java.awt.Color;
import javax.swing.border.LineBorder;

import styles.Buttons;
import styles.Input;
import styles.InputLabel;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCadastrarExame extends JPanel {
	
	private TitlePanel labelTitlePanel;
	private JPanel panelMain;
	
	private InputLabel labelNomeExame;
	private InputLabel labelDescricao;
	private InputLabel labelMateriaisUtilizados;
	private InputLabel labelValorParticular;
	private InputLabel labelMedico;
	private InputLabel labelTipoExame;
	
	private Input textFieldNomeExame;
	private Input textFieldValorParticular;
	private JTextArea textAreaMateriaisUtilizados;
	private JTextArea textAreaDescricao;
	
	private JComboBox<String> comboBoxMedico;
	private JComboBox<String> comboBoxTipoExame;
	
	private Buttons buttonCadastrar;
	private Buttons buttonLimpar;

	public PanelCadastrarExame() {
		setBackground(Thema.corPrincipal);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(265)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
								.addComponent(getPanelMain(), Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		setLayout(groupLayout);
	}
	
	public JPanel getPanelMain() {
		if(panelMain == null) {
			panelMain = new JPanel();
			panelMain.setBorder(new LineBorder(null));
			panelMain.setBackground(new Color(204, 229, 233));
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
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Exame");
		}
		return labelTitlePanel;
	}

	public InputLabel getLabelNomeExame() {
		if(labelNomeExame == null) {
			labelNomeExame = new InputLabel("Nome do Exame");
			labelNomeExame.setBounds(10, 11, 585, 20);
		}
		return labelNomeExame;
	}

	public InputLabel getLabelDescricao() {
		if(labelDescricao == null) {
			labelDescricao = new InputLabel("Decrição");
			labelDescricao.setBounds(385, 131, 365, 20);
		}
		return labelDescricao;
	}

	public InputLabel getLabelMateriaisUtilizados() {
		if(labelMateriaisUtilizados == null) {
			labelMateriaisUtilizados = new InputLabel("Materiais Utilizados");
			labelMateriaisUtilizados.setBounds(10, 131, 360, 20);
		}
		return labelMateriaisUtilizados;
	}

	public InputLabel getLabelValorParticular() {
		if(labelValorParticular == null) {
			labelValorParticular = new InputLabel("Valor Particular");
			labelValorParticular.setBounds(610, 10, 140, 20);
		}
		return labelValorParticular;
	}
	
	public InputLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new InputLabel("Médico");
			labelMedico.setBounds(10, 71, 410, 20);
		}
		return labelMedico;
	}
	
	public InputLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new InputLabel("Tipo do Exame");
			labelTipoExame.setBounds(435, 71, 375, 20);
		}
		return labelTipoExame;
	}

	/* --------------------------------------------------------------- Imputs ----------------------------------------------------------- */
	public Input getTextFieldNomeExame() {
		if(textFieldNomeExame == null) {
			textFieldNomeExame = new Input();
			textFieldNomeExame.setBounds(10, 36, 585, 25);
		}
		return textFieldNomeExame;
	}
	
	public JTextArea getTextAreaDescricao() {
		if (textAreaDescricao == null) {
			textAreaDescricao = new JTextArea();
			textAreaDescricao.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			textAreaDescricao.setFont(Thema.FONT_INPUTS);
			textAreaDescricao.setBounds(385, 156, 365, 200);
		}
		return textAreaDescricao;
	}
	
	public JTextArea getTextAreaMateriaisUtilizados() {
		if (textAreaMateriaisUtilizados == null) {
			textAreaMateriaisUtilizados = new JTextArea();
			textAreaMateriaisUtilizados.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			textAreaMateriaisUtilizados.setFont(Thema.FONT_INPUTS);
			textAreaMateriaisUtilizados.setBounds(10, 156, 360, 200);
		}
		return textAreaMateriaisUtilizados;
	}
	
	public Input getTextFieldValorParticular() {
		if (textFieldValorParticular == null) {
			textFieldValorParticular = new Input();
			textFieldValorParticular.setBounds(610, 35, 140, 25);
		}
		return textFieldValorParticular;
	}
	
	public JComboBox<String> getComboBoxMedico() {
		if(comboBoxMedico == null) {
			comboBoxMedico = new JComboBox<String>();
			comboBoxMedico.setFont(Thema.FONT_INPUTS);
			comboBoxMedico.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			comboBoxMedico.setBounds(10, 96, 410, 25);
			comboBoxMedico.addItem("NOME MÉDICO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}

	public JComboBox<String> getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox<String>();
			comboBoxTipoExame.setBounds(435, 96, 315, 25);
			comboBoxTipoExame.setFont(Thema.FONT_INPUTS);
			comboBoxTipoExame.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			comboBoxTipoExame.addItem("Exames Físicos");
			comboBoxTipoExame.addItem("Exames Laboratoriais");
			comboBoxTipoExame.addItem("Imagens");
			comboBoxTipoExame.addItem("Biópsia");
			comboBoxTipoExame.addItem("Patologia e análise clínica");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxTipoExame.setSelectedIndex(-1);
		}
		return comboBoxTipoExame;
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
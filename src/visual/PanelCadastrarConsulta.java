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

public class PanelCadastrarConsulta extends JPanel {

	private JPanel panelPrincipal;
	private TitlePanel labelTitlePanel;
	
	private InputLabel labelData;
	private InputLabel labelHora;
	private InputLabel labelQueixaPaciente;
	private InputLabel labelObservacoes;
	private InputLabel labelMaterial;
	private InputLabel labelMedico;
	private InputLabel labelPaciente;
	private InputLabel labelTipoDeConsulta;
	private InputLabel labelConvenio;
	
	private Input textFieldData;
	private Input textFieldHora;
	private Input textFieldPaciente;
	
	private JTextArea textAreaObservacoes;
	private JTextArea textAreaMaterial;
	private JTextArea textAreaQueixaPaciente;

	private JComboBox<String> comboBoxMedico;
	private JComboBox<String> comboBoxTipoDeConsulta;
	private JComboBox<String> comboBoxConvenio;
	
	private Buttons buttonCadastrar;
	private Buttons buttonLimpar;
	
	public PanelCadastrarConsulta() {
		setSize(830, 785);
		setBackground(Thema.corPrincipal);
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(239)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 351, GroupLayout.PREFERRED_SIZE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addComponent(getPanelMain(), Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		setLayout(groupLayout);
	}
	
	public JPanel getPanelMain() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelQueixaPaciente());
			panelPrincipal.add(getLabelObservacoes());
			panelPrincipal.add(getLabelMaterial());
			panelPrincipal.add(getLabelMedico());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelTipoDeConsulta());
			panelPrincipal.add(getLabelConvenio());
			
			panelPrincipal.add(getTextFieldPaciente());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getTextFieldData());
			
			panelPrincipal.add(getTextAreaQueixaPaciente());
			panelPrincipal.add(getTextAreaObservacoes());
			panelPrincipal.add(getTextAreaMaterial());
			
			panelPrincipal.add(getComboBoxMedico());
			panelPrincipal.add(getComboBoxTipoDeConsulta());
			panelPrincipal.add(getComboBoxConvenio());
		}
		return panelPrincipal;
	}
	
	/* ----------------------------------------------------------------- Labels -------------------------------------------------------------- */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Consultas");
		}
		return labelTitlePanel;
	}
	
	public InputLabel getLabelData() {
		if(labelData == null) {
			labelData = new InputLabel("Data");
			labelData.setBounds(525, 11, 120, 20);
		}
		return labelData;
	}
	
	public InputLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new InputLabel("Hora");
			labelHora.setBounds(660, 11, 90, 20);
		}
		return labelHora;
	}
	
	public InputLabel getLabelQueixaPaciente() {
		if(labelQueixaPaciente == null) {
			labelQueixaPaciente = new InputLabel("Queixa do Paciente");
			labelQueixaPaciente.setBounds(10, 126, 740, 20);
		}
		return labelQueixaPaciente;
	}
	
	public InputLabel getLabelObservacoes() {
		if(labelObservacoes == null) {
			labelObservacoes = new InputLabel("Observações");
			labelObservacoes.setBounds(10, 236, 740, 20);
		}
		return labelObservacoes;
	}
	
	public InputLabel getLabelMaterial() {
		if(labelMaterial == null) {
			labelMaterial = new InputLabel("Materiais");
			labelMaterial.setBounds(10, 346, 740, 20);
		}
		return labelMaterial;
	}
	
	public InputLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new InputLabel("Médico");
			labelMedico.setBounds(10, 71, 350, 20);
		}
		return labelMedico;
	}
	
	public InputLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new InputLabel("Paciente");
			labelPaciente.setBounds(10, 11, 220, 20);
		}
		return labelPaciente;
	}
	
	public InputLabel getLabelTipoDeConsulta() {
		if(labelTipoDeConsulta == null) {
			labelTipoDeConsulta = new InputLabel("Tipo De Consulta");
			labelTipoDeConsulta.setBounds(375, 71, 145, 20);
		}
		return labelTipoDeConsulta;
	}
	
	public InputLabel getLabelConvenio() {
		if(labelConvenio == null) {
			labelConvenio = new InputLabel("Convênio");
			labelConvenio.setBounds(535, 71, 215, 20);
		}
		return labelConvenio;
	}
	
	/* ----------------------------------------------------------------- Imputs -------------------------------------------------------------- */
	public Input getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new Input();
			textFieldData.setBounds(10, 36, 500, 25);
		}
		return textFieldData;
	}
	
	public Input getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new Input();
			textFieldHora.setBounds(660, 36, 90, 25);
		}
		return textFieldHora;
	}
	
	public Input getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new Input();
			textFieldPaciente.setBounds(525, 36, 120, 25);
		}
		return textFieldPaciente;
	}
	
	public JTextArea getTextAreaQueixaPaciente() {
		if (textAreaQueixaPaciente == null) {
			textAreaQueixaPaciente = new JTextArea();
			textAreaQueixaPaciente.setFont(Thema.FONT_INPUTS);
			textAreaQueixaPaciente.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			textAreaQueixaPaciente.setBounds(10, 151, 740, 75);
		}
		return textAreaQueixaPaciente;
	}
	
	public JTextArea getTextAreaObservacoes() {
		if (textAreaObservacoes == null) {
			textAreaObservacoes = new JTextArea();
			textAreaObservacoes.setFont(Thema.FONT_INPUTS);
			textAreaObservacoes.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			textAreaObservacoes.setBounds(10, 261, 740, 75);
		}
		return textAreaObservacoes;
	}
	
	public JTextArea getTextAreaMaterial() {
		if (textAreaMaterial == null) {
			textAreaMaterial = new JTextArea();
			textAreaMaterial.setFont(Thema.FONT_INPUTS);
			textAreaMaterial.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			textAreaMaterial.setBounds(10, 371, 740, 75);
		}
		return textAreaMaterial;
	}
	
	public JComboBox<String> getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new JComboBox<String>();
			comboBoxMedico.setFont(Thema.FONT_INPUTS);
			comboBoxMedico.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			comboBoxMedico.setBounds(10, 96, 350, 25);
			comboBoxMedico.addItem("NOME MÉDICO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	public JComboBox<String> getComboBoxTipoDeConsulta() {
		if (comboBoxTipoDeConsulta == null) {
			comboBoxTipoDeConsulta = new JComboBox<String>();
			comboBoxTipoDeConsulta.setFont(Thema.FONT_INPUTS);
			comboBoxTipoDeConsulta.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			comboBoxTipoDeConsulta.setBounds(375, 96, 145, 25);
			comboBoxTipoDeConsulta.addItem("TIPO DE CONSULTA");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxTipoDeConsulta.setSelectedIndex(-1);
		}
		return comboBoxTipoDeConsulta;
	}
	
	public JComboBox<String> getComboBoxConvenio() {
		if (comboBoxConvenio == null) {
			comboBoxConvenio = new JComboBox<String>();
			comboBoxConvenio.setFont(Thema.FONT_INPUTS);
			comboBoxConvenio.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
			comboBoxConvenio.setBounds(535, 96, 215, 25);
			comboBoxConvenio.addItem("TIPO DE CONVÊNIO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxConvenio.setSelectedIndex(-1);
		}
		return comboBoxConvenio;
	}
	
	/* ---------------------------------------------------------------- Buttons -------------------------------------------------------------- */
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
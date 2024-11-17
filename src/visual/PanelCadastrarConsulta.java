package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputTextField;
import styles.InputLabel;
import styles.InputTextArea;
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
	
	private InputTextField textFieldData;
	private InputTextField textFieldHora;
	private InputTextField textFieldPaciente;
	
	private InputTextArea textAreaObservacoes;
	private InputTextArea textAreaMaterial;
	private InputTextArea textAreaQueixaPaciente;

	private InputComboBox comboBoxMedico;
	private InputComboBox comboBoxTipoDeConsulta;
	private InputComboBox comboBoxConvenio;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	
	public PanelCadastrarConsulta() {
		setBackground(Thema.PRINCIPAL);
		
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
			panelPrincipal.setBackground(Thema.BACKGROUND);
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
	public InputTextField getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new InputTextField();
			textFieldData.setBounds(10, 36, 500, 25);
		}
		return textFieldData;
	}
	
	public InputTextField getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new InputTextField();
			textFieldHora.setBounds(660, 36, 90, 25);
		}
		return textFieldHora;
	}
	
	public InputTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new InputTextField();
			textFieldPaciente.setBounds(525, 36, 120, 25);
		}
		return textFieldPaciente;
	}
	
	public InputTextArea getTextAreaQueixaPaciente() {
		if (textAreaQueixaPaciente == null) {
			textAreaQueixaPaciente = new InputTextArea();
			textAreaQueixaPaciente.setBounds(10, 151, 740, 75);
		}
		return textAreaQueixaPaciente;
	}
	
	public InputTextArea getTextAreaObservacoes() {
		if (textAreaObservacoes == null) {
			textAreaObservacoes = new InputTextArea();
			textAreaObservacoes.setBounds(10, 261, 740, 75);
		}
		return textAreaObservacoes;
	}
	
	public InputTextArea getTextAreaMaterial() {
		if (textAreaMaterial == null) {
			textAreaMaterial = new InputTextArea();
			textAreaMaterial.setBounds(10, 371, 740, 75);
		}
		return textAreaMaterial;
	}
	
	public InputComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new InputComboBox();
			comboBoxMedico.setBounds(10, 96, 350, 25);
			
			comboBoxMedico.addItem("NOME MÉDICO");
			
			comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	public InputComboBox getComboBoxTipoDeConsulta() {
		if (comboBoxTipoDeConsulta == null) {
			comboBoxTipoDeConsulta = new InputComboBox();
			comboBoxTipoDeConsulta.setBounds(375, 96, 145, 25);
			
			comboBoxTipoDeConsulta.addItem("TIPO DE CONSULTA");
			
			comboBoxTipoDeConsulta.setSelectedIndex(-1);
		}
		return comboBoxTipoDeConsulta;
	}
	
	public InputComboBox getComboBoxConvenio() {
		if (comboBoxConvenio == null) {
			comboBoxConvenio = new InputComboBox();
			comboBoxConvenio.setBounds(535, 96, 215, 25);
			
			comboBoxConvenio.addItem("TIPO DE CONVÊNIO");
			
			comboBoxConvenio.setSelectedIndex(-1);
		}
		return comboBoxConvenio;
	}
	
	/* ---------------------------------------------------------------- Buttons -------------------------------------------------------------- */
	public Button getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new Button("Cadastrar");
		}
		return buttonCadastrar;
	}
	
	public Button getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
		}
		return buttonLimpar;
	}
}
package visual;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Font;
import java.awt.Button;
import java.awt.Panel;

public class PanelCadastrarConsulta extends JPanel {

	private JLabel labelTitlePanel;
	
	
	private JLabel labelData;
	private JLabel labelHora;
	private JLabel labelQueixaPaciente;
	private JLabel labelObservacoes;
	private JLabel labelMaterial;
	
	private JLabel labelMedico;
	private JLabel labelPaciente;
	private JLabel labelTipoDeConsulta;
	private JLabel labelConvenio;
	
	
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTextField textFieldQueixaPaciente;
	private JTextField textFieldObservacoes;
	private JTextField textFieldMaterial;
	
	private Choice choiceMedico;
	private Choice choicePaciente;
	private Choice choiceTipoDeConsulta;
	private Choice choiceConvenio;
	
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	private Panel panelMain;
	
	public PanelCadastrarConsulta() {
		setBackground(new Color(255, 0, 128)); // Apenas um teste
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonCadastrar());
		add(getButtonLimpar());
	}
	
	
	/* ------------------------------------------------------------- Acesso ao PanelMain ------------------------------------------------------------ */
	public Panel getPanelMain() {
		if (panelMain == null) {
			panelMain = new Panel();
			panelMain.setBackground(new Color(255, 128, 255));
			panelMain.setBounds(30, 135, 1220, 490);
			panelMain.setLayout(null);
			panelMain.add(getLabelData());
			panelMain.add(getLabelHora());
			panelMain.add(getLabelQueixaPaciente());
			panelMain.add(getLabelObservacoes());
			panelMain.add(getLabelMaterial());
			panelMain.add(getLabelMedico());
			panelMain.add(getLabelPaciente());
			panelMain.add(getLabelTipoDeConsulta());
			panelMain.add(getLabelConvenio());
			panelMain.add(getChoiceMedico());
			panelMain.add(getChoicePaciente());
			panelMain.add(getChoiceTipoDeConsulta());
			panelMain.add(getChoiceConvenio());
			panelMain.add(getTextFieldData());
			panelMain.add(getTextFieldHora());
			panelMain.add(getTextFieldQueixaPaciente());
			panelMain.add(getTextFieldObservacoes());
			panelMain.add(getTextFieldMaterial());
		}
		return panelMain;
	}
	
	/* ------------------------------------------------------------- Acesso aos Labels ------------------------------------------------------------ */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Tela de Cadastro de Consultas");
			labelTitlePanel.setBounds(397, 30, 485, 76);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setBounds(406, 368, 39, 20);
			labelData.setText("Data");
		}
		return labelData;
	}
	
	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setBounds(494, 368, 39, 20);
			labelHora.setText("Hora");
		}
		return labelHora;
	}
	
	public JLabel getLabelQueixaPaciente() {
		if(labelQueixaPaciente == null) {
			labelQueixaPaciente = new JLabel();
			labelQueixaPaciente.setBounds(579, 368, 39, 20);
			labelQueixaPaciente.setText("QueixaPaciente");
		}
		return labelQueixaPaciente;
	}
	
	public JLabel getLabelObservacoes() {
		if(labelObservacoes == null) {
			labelObservacoes = new JLabel();
			labelObservacoes.setBounds(674, 368, 39, 20);
			labelObservacoes.setText("Observações");
		}
		return labelObservacoes;
	}
	
	public JLabel getLabelMaterial() {
		if(labelMaterial == null) {
			labelMaterial = new JLabel();
			labelMaterial.setBounds(776, 368, 39, 20);
			labelMaterial.setText("Material");
		}
		return labelMaterial;
	}
	
	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setBounds(503, 419, 39, 20);
			labelMedico.setText("Médico");
		}
		return labelMedico;
	}
	
	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setBounds(413, 421, 48, 17);
			labelPaciente.setText("Paciente");
		}
		return labelPaciente;
	}
	
	public JLabel getLabelTipoDeConsulta() {
		if(labelTipoDeConsulta == null) {
			labelTipoDeConsulta = new JLabel();
			labelTipoDeConsulta.setBounds(598, 421, 88, 17);
			labelTipoDeConsulta.setText("Tipo De Consulta");
		}
		return labelTipoDeConsulta;
	}
	
	public JLabel getLabelConvenio() {
		if(labelConvenio == null) {
			labelConvenio = new JLabel();
			labelConvenio.setBounds(708, 419, 48, 20);
			labelConvenio.setText("Convenio");
		}
		return labelConvenio;
	}
	
	/* ------------------------------------------------------------- Acesso aos imputs ------------------------------------------------------------ */
	public JTextField getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setBounds(406, 388, 28, 20);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}
	
	public JTextField getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setBounds(492, 388, 28, 20);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}
	
	public JTextField getTextFieldQueixaPaciente() {
		if (textFieldQueixaPaciente == null) {
			textFieldQueixaPaciente = new JTextField();
			textFieldQueixaPaciente.setBounds(579, 388, 28, 20);
			textFieldQueixaPaciente.setColumns(10);
		}
		return textFieldQueixaPaciente;
	}
	
	public JTextField getTextFieldObservacoes() {
		if (textFieldObservacoes == null) {
			textFieldObservacoes = new JTextField();
			textFieldObservacoes.setBounds(674, 388, 28, 20);
			textFieldObservacoes.setColumns(10);
		}
		return textFieldObservacoes;
	}
	
	public JTextField getTextFieldMaterial() {
		if (textFieldMaterial == null) {
			textFieldMaterial = new JTextField();
			textFieldMaterial.setBounds(776, 388, 28, 20);
			textFieldMaterial.setColumns(10);
		}
		return textFieldMaterial;
	}
	
	public Choice getChoiceMedico() {
		if (choiceMedico == null) {
			choiceMedico = new Choice();
			choiceMedico.setBounds(514, 444, 28, 20);
			choiceMedico.add("TESTE");
		}
		return choiceMedico;
	}
	
	public Choice getChoicePaciente() {
		if (choicePaciente == null) {
			choicePaciente = new Choice();
			choicePaciente.setBounds(416, 444, 28, 20);
			choicePaciente.add("TESTE");
		}
		return choicePaciente;
	}
	
	public Choice getChoiceTipoDeConsulta() {
		if (choiceTipoDeConsulta == null) {
			choiceTipoDeConsulta = new Choice();
			choiceTipoDeConsulta.setBounds(624, 444, 28, 20);
			choiceTipoDeConsulta.add("TESTE");
		}
		return choiceTipoDeConsulta;
	}
	
	public Choice getChoiceConvenio() {
		if (choiceConvenio == null) {
			choiceConvenio = new Choice();
			choiceConvenio.setBounds(708, 444, 28, 20);
			choiceConvenio.add("TESTE");
		}
		return choiceConvenio;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
	public Button getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new Button("Cadastrar");
			buttonCadastrar.setBounds(1170, 631, 80, 35);
		}
		return buttonCadastrar;
	}
	
	public Button getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
			buttonLimpar.setBounds(30, 631, 80, 35);
		}
		return buttonLimpar;
	}
}

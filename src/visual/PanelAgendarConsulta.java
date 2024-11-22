package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputLabel;
import styles.InputTextField;
import styles.Thema;
import styles.TitlePanel;

public class PanelAgendarConsulta extends JPanel{

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private InputLabel labelData;
	private InputLabel labelHora;
	private InputLabel labelPaciente;
	private InputLabel labelMedico;
	
	private InputTextField textFieldData;
	private InputTextField textFieldHora;
	private InputTextField textFieldPaciente;
	
	private InputComboBox comboBoxMedico;

	private Button buttonAgendar;
	private Button buttonLimpar;
	
	public PanelAgendarConsulta() {
		setSize(830, 600);
		setBackground(Thema.PRINCIPAL);
		setLayout(null);
		
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
		add(getButtonAgendar());
		add(getButtonLimpar());
	}

	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.WHITE);
			panelPrincipal.setLocation(10, 151);
			panelPrincipal.setSize(776, 138);
			panelPrincipal.setLayout(null);
			
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelMedico());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getTextFieldPaciente());
			panelPrincipal.add(getComboBoxMedico());
		}
		return panelPrincipal;
	}
	
	/* ------------------------------------------------------------- Label ----------------------------------------------------------------- */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Agendamento de Consulta");
			labelTitlePanel.setBounds(186, 50, 457, 44);
		}
		return labelTitlePanel;
	}

	public InputLabel getLabelData() {
		if(labelData == null) {
			labelData = new InputLabel("Data:");
			labelData.setBounds(541, 71, 100, 20);
		}
		return labelData;
	}

	public InputLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new InputLabel("Hora:");
			labelHora.setBounds(666, 71, 100, 20);
		}
		return labelHora;
	}

	public InputLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new InputLabel("Paciente:");
			labelPaciente.setBounds(10, 11, 778, 20);
		}
		return labelPaciente;
	}

	public InputLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new InputLabel("Medico:");
			labelMedico.setBounds(10, 71, 443, 20);
		}
		return labelMedico;
	}

	/* --------------------------------------------------------------- Inputs ------------------------------------------------------------ */
	public InputTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new InputTextField();
			textFieldData.setBounds(541, 96, 100, 25);
		}
		return textFieldData;
	}

	public InputTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new InputTextField();
			textFieldHora.setBounds(666, 96, 100, 25);
		}
		return textFieldHora;
	}
	public InputTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new InputTextField();
			textFieldPaciente.setBounds(10, 36, 756, 25);
		}
		return textFieldPaciente;
	}
	public InputComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new InputComboBox();
			comboBoxMedico.setBounds(10, 96, 521, 25);
			comboBoxMedico.addItem("NOME MÉDICO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	/* --------------------------------------------------------- Button ----------------------------------------------------------------- */
	public Button getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new Button("Agendar");
			buttonAgendar.setBounds(686, 500, 100, 35);
		}
		return buttonAgendar;
	}
	
	public Button getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
			buttonLimpar.setBounds(10, 500, 108, 35);
		}
		return buttonLimpar;
	}
}
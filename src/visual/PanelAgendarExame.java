package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputLabel;
import styles.InputTextField;
import styles.Thema;
import styles.TitlePanel;

public class PanelAgendarExame extends JPanel{

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private InputLabel labelData;
	private InputLabel labelHora;
	private InputLabel labelTipoExame;
	private InputLabel labelPaciente;
	
	private InputTextField textFieldData;
	private InputTextField textFieldHora;
	private InputTextField textFieldPaciente;
	
	private InputComboBox comboBoxTipoExame;
	
	private Button buttonAgendar;
	private Button buttonLimpar;
	
	public PanelAgendarExame() {
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
			panelPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(10, 151);
			panelPrincipal.setSize(769, 138);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelTipoExame());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getTextFieldPaciente());
			panelPrincipal.add(getComboBoxTipoExame());
		}
		return panelPrincipal;
	}

	/* ------------------------------------------------------------ Label --------------------------------------------------------------- */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Agendamento de Exame");
			labelTitlePanel.setBounds(204, 50, 422, 44);
		}
		return labelTitlePanel;
	}

	public InputLabel getLabelData() {
		if(labelData == null) {
			labelData = new InputLabel("Data:");
			labelData.setBounds(10, 71, 241, 20);
		}
		return labelData;
	}

	public InputLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new InputLabel("Hora:");
			labelHora.setBounds(261, 71, 250, 20);
		}
		return labelHora;
	}
	
	public InputLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new InputLabel("Paciente:");
			labelPaciente.setBounds(10, 11, 760, 20);
		}
		return labelPaciente;
	}
	
	public InputLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new InputLabel("Tipo Exame:");
			labelTipoExame.setBounds(521, 71, 249, 17);
		}
		return labelTipoExame;
	}
	
	/* ------------------------------------------------------------- Inputs --------------------------------------------------------------- */
	public InputTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new InputTextField();
			textFieldData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldData.setBounds(10, 96, 241, 25);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public InputTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new InputTextField();
			textFieldHora.setBounds(261, 96, 250, 25);
		}
		return textFieldHora;
	}
	
	public InputTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new InputTextField();
			textFieldPaciente.setBounds(10, 36, 749, 25);
		}
		return textFieldPaciente;
	}
	
	public InputComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new InputComboBox();
			comboBoxTipoExame.setBounds(521, 96, 238, 25);
			
			comboBoxTipoExame.addItem("Exames Físicos");
			comboBoxTipoExame.addItem("Exames Laboratoriais");
			comboBoxTipoExame.addItem("Imagens");
			comboBoxTipoExame.addItem("Biópsia");
			comboBoxTipoExame.addItem("Patologia e análise clínica");
			
			comboBoxTipoExame.setSelectedIndex(-1);
		}
		return comboBoxTipoExame;
	}
	
	/* ------------------------------------------------------------- Button ---------------------------------------------------------------- */
	public Button getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new Button("Agendar");
			buttonAgendar.setBounds(679, 500, 100, 35);
		}
		return buttonAgendar;
	}
	
	public Button getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
			buttonLimpar.setBounds(10, 500, 100, 35);
		}
		return buttonLimpar;
	}
	
}
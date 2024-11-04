package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class PanelAgendarConsulta extends JPanel{

	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private JLabel labelData;
	private JLabel labelHora;
	private JLabel labelPaciente;
	private JLabel labelMedico;
	
	private JTextField textFieldData;
	private JTextField textFieldHora;
	
	private JButton buttonAgendar;
	private JButton buttonLimpar;
	private JComboBox comboBoxPaciente;
	private JComboBox comboBoxMedico;
	
	public PanelAgendarConsulta() {
		setSize(1280, 750);
		setBackground(new Color(2, 83, 112));
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
		add(getButtonAgendar());
		add(getButtonLimpar());
	}

	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(80, 125);
			panelPrincipal.setSize(1120, 432);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelMedico());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getComboBoxPaciente());
			panelPrincipal.add(getComboBoxMedico());
		}
		return panelPrincipal;
	}
	
	/* ------------------------------------------------------------- Label ----------------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setBackground(new Color(240, 240, 240));
			labelTitlePanel.setText("Tela Agendamento de Consulta");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(388, 30, 503, 76);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelData.setBounds(90, 162, 220, 14);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelHora.setBounds(388, 161, 220, 17);
			labelHora.setText("Hora:");
		}
		return labelHora;
	}

	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelPaciente.setBounds(90, 71, 152, 14);
			labelPaciente.setText("Paciente:");
		}
		return labelPaciente;
	}

	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMedico.setBounds(661, 162, 380, 14);
			labelMedico.setText("Medico:");
		}
		return labelMedico;
	}

	/* --------------------------------------------------------------- Inputs ------------------------------------------------------------ */
	public JTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setBounds(90, 181, 220, 37);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public JTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setBounds(388, 181, 220, 37);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}
	public JComboBox getComboBoxPaciente() {
		if (comboBoxPaciente == null) {
			comboBoxPaciente = new JComboBox();
			comboBoxPaciente.setBounds(90, 96, 518, 22);
			comboBoxPaciente.addItem("TESTE");
		}
		return comboBoxPaciente;
	}
	public JComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new JComboBox();
			comboBoxMedico.setBounds(661, 181, 380, 37);
			comboBoxMedico.addItem("TESTE");
		}
		return comboBoxMedico;
	}
	
	/* --------------------------------------------------------- Button ----------------------------------------------------------------- */
	public JButton getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new JButton();
			buttonAgendar.setText("Agendar");
			buttonAgendar.setBounds(1070, 608, 108, 32);
		}
		return buttonAgendar;
	}
	
	public JButton getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new JButton();
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(80, 608, 108, 32);
		}
		return buttonLimpar;
	}
}

package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgendarConsulta extends JPanel{

	private JLabel labelTitlePanel;
	
	private JPanel panelPrincipal;
	
	private JLabel labelData;
	private JLabel labelHora;
	private JLabel labelPaciente;
	private JLabel labelMedico;
	
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTextField textFieldPaciente;
	private JTextField textFieldMedico;
	
	private JButton buttonAgendar;
	private JButton buttonLimpar;
	
	public PanelAgendarConsulta() {
		setSize(1280, 768);
		setBackground(new Color(128, 255, 128));
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
		add(getButtonAgendar());
		add(getButtonLimpar());
	}

	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(0, 255, 0));
			panelPrincipal.setLocation(80, 125);
			panelPrincipal.setSize(1120, 517);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelMedico());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getTextFieldPaciente());
			panelPrincipal.add(getTextFieldMedico());
		}
		return panelPrincipal;
	}
	
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setText("Tela Agendamento de Consulta");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(388, 30, 503, 76);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setBounds(477, 459, 27, 14);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setBounds(568, 458, 48, 17);
			labelHora.setText("Hora:");
		}
		return labelHora;
	}

	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setBounds(659, 459, 45, 14);
			labelPaciente.setText("Paciente:");
		}
		return labelPaciente;
	}

	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setBounds(750, 459, 37, 14);
			labelMedico.setText("Medico:");
		}
		return labelMedico;
	}

	public JTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setBounds(477, 486, 86, 20);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public JTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setBounds(568, 486, 86, 20);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}

	public JTextField getTextFieldPaciente() {
		if(textFieldPaciente == null) {
			textFieldPaciente = new JTextField();
			textFieldPaciente.setBounds(659, 486, 86, 20);
			textFieldPaciente.setColumns(10);
		}
		return textFieldPaciente;
	}

	public JTextField getTextFieldMedico() {
		if(textFieldMedico == null) {
			textFieldMedico = new JTextField();
			textFieldMedico.setBounds(750, 486, 86, 20);
			textFieldMedico.setColumns(10);
		}
		return textFieldMedico;
	}
	
	public JButton getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new JButton();
			buttonAgendar.setText("Agendar");
			buttonAgendar.setBounds(1092, 705, 108, 32);
		}
		return buttonAgendar;
	}
	
	public JButton getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new JButton();
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(80, 705, 108, 32);
		}
		return buttonLimpar;
	}
}

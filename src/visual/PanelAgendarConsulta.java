package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;

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
	
	private JButton buttonAgendar;
	private JButton buttonLimpar;
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
			panelPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(140, 150);
			panelPrincipal.setSize(1000, 170);
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
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setBackground(new Color(240, 240, 240));
			labelTitlePanel.setText("Agendamento de Consulta");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(430, 50, 419, 44);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelData.setBounds(675, 90, 100, 20);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelHora.setBounds(800, 90, 100, 20);
			labelHora.setText("Hora:");
		}
		return labelHora;
	}

	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelPaciente.setBounds(100, 30, 800, 20);
			labelPaciente.setText("Paciente:");
		}
		return labelPaciente;
	}

	public JLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new JLabel();
			labelMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelMedico.setBounds(100, 90, 550, 20);
			labelMedico.setText("Medico:");
		}
		return labelMedico;
	}

	/* --------------------------------------------------------------- Inputs ------------------------------------------------------------ */
	public JTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldData.setBounds(675, 115, 100, 25);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public JTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldHora.setBounds(800, 115, 100, 25);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}
	public JTextField getTextFieldPaciente() {
		if (textFieldPaciente == null) {
			textFieldPaciente = new JTextField();
			textFieldPaciente.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldPaciente.setBounds(100, 55, 800, 25);
		}
		return textFieldPaciente;
	}
	public JComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new JComboBox();
			comboBoxMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxMedico.setBounds(100, 115, 550, 25);
			comboBoxMedico.addItem("NOME MÉDICO");
			
			// Definir seu padrão como nenhum dos itens acima
	    	comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	/* --------------------------------------------------------- Button ----------------------------------------------------------------- */
	public JButton getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new JButton();
			buttonAgendar.setText("Agendar");
			buttonAgendar.setBounds(1040, 600, 100, 35);
		}
		return buttonAgendar;
	}
	
	public JButton getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new JButton();
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(140, 600, 108, 35);
		}
		return buttonLimpar;
	}
}

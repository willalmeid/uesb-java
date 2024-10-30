package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelAgendarExame extends JPanel{

	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private JLabel labelData;
	private JLabel labelHora;
	private JLabel labelTipoExame;
	private JLabel labelPaciente;
	
	private JTextField textFieldData;
	private JTextField textFieldHora;
	private JTextField textFieldPaciente;
	
	private JComboBox<String> comboBoxTipoExame;
	
	private JButton buttonAgendar;
	private JButton buttonLimpar;
	
	public PanelAgendarExame() {
		setSize(1280, 750);
		setBackground(new Color(255, 0, 255));
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
		add(getButtonAgendar());
		add(getButtonLimpar());
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(255, 128, 255));
			panelPrincipal.setLocation(65, 137);
			panelPrincipal.setSize(1120, 401);
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
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setText("Tela Agendamento de Exame");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(388, 30, 503, 76);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setBounds(484, 331, 27, 14);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setBounds(671, 317, 48, 17);
			labelHora.setText("Hora:");
		}
		return labelHora;
	}
	
	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setBounds(769, 317, 48, 17);
			labelPaciente.setText("Paciente:");
		}
		return labelPaciente;
	}
	
	public JLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new JLabel();
			labelTipoExame.setBounds(575, 330, 59, 17);
			labelTipoExame.setText("Tipo Exame:");
		}
		return labelTipoExame;
	}
	
	/* ------------------------------------------------------------- Inputs --------------------------------------------------------------- */
	public JTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setBounds(479, 345, 86, 20);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public JTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setBounds(671, 345, 86, 20);
			textFieldHora.setColumns(10);
		}
		return textFieldHora;
	}
	
	public JTextField getTextFieldPaciente() {
		if(textFieldPaciente == null) {
			textFieldPaciente = new JTextField();
			textFieldPaciente.setBounds(769, 345, 86, 20);
			textFieldPaciente.setColumns(10);
		}
		return textFieldPaciente;
	}
	
	public JComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox();
			comboBoxTipoExame.setBounds(575, 345, 86, 20);
			comboBoxTipoExame.addItem("TESTE");
		}
		return comboBoxTipoExame;
	}
	
	/* ------------------------------------------------------------- Button ---------------------------------------------------------------- */
	public JButton getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new JButton();
			buttonAgendar.setText("Agendar");
			buttonAgendar.setBounds(1060, 603, 108, 32);
		}
		return buttonAgendar;
	}
	
	public JButton getButtonLimpar() {
		if(buttonLimpar == null) {
			buttonLimpar = new JButton();
			buttonLimpar.setText("Limpar");
			buttonLimpar.setBounds(65, 603, 108, 32);
		}
		return buttonLimpar;
	}
}

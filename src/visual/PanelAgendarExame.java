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
	
	private JComboBox<String> comboBoxTipoExame;
	
	private JButton buttonAgendar;
	private JButton buttonLimpar;
	private JComboBox comboBoxPaciente;
	
	public PanelAgendarExame() {
		setSize(1280, 750);
		setBackground(new Color(2, 82, 112));
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
			panelPrincipal.setLocation(65, 137);
			panelPrincipal.setSize(1120, 401);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelTipoExame());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getComboBoxTipoExame());
			panelPrincipal.add(getComboBoxPaciente());
		}
		return panelPrincipal;
	}

	/* ------------------------------------------------------------ Label --------------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setText("Tela Agendamento de Exame");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(388, 30, 503, 76);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setBounds(90, 162, 220, 14);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setBounds(388, 161, 220, 17);
			labelHora.setText("Hora:");
		}
		return labelHora;
	}
	
	public JLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new JLabel();
			labelPaciente.setBounds(90, 72, 518, 17);
			labelPaciente.setText("Paciente:");
		}
		return labelPaciente;
	}
	
	public JLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new JLabel();
			labelTipoExame.setBounds(676, 161, 59, 17);
			labelTipoExame.setText("Tipo Exame:");
		}
		return labelTipoExame;
	}
	
	/* ------------------------------------------------------------- Inputs --------------------------------------------------------------- */
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
			comboBoxPaciente.setBounds(90, 100, 518, 22);
			comboBoxPaciente.addItem("TESTE");
		}
		return comboBoxPaciente;
	}
	
	public JComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox();
			comboBoxTipoExame.setBounds(676, 181, 271, 37);
			comboBoxTipoExame.addItem("TESTE");
		}
		return comboBoxTipoExame;
	}
	
	/* ------------------------------------------------------------- Button ---------------------------------------------------------------- */
	public JButton getButtonAgendar() {
		if(buttonAgendar == null) {
			buttonAgendar = new JButton();
			buttonAgendar.setText("Agendar");
			buttonAgendar.setBounds(1077, 603, 108, 32);
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

package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
			panelPrincipal.setBorder(new LineBorder(new Color(0, 0, 0)));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(140, 150);
			panelPrincipal.setSize(1000, 170);
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
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setText("Agendamento de Exame");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(446, 50, 388, 44);
		}
		return labelTitlePanel;
	}

	public JLabel getLabelData() {
		if(labelData == null) {
			labelData = new JLabel();
			labelData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelData.setBounds(100, 90, 220, 20);
			labelData.setText("Data:");
		}
		return labelData;
	}

	public JLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new JLabel();
			labelHora.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelHora.setBounds(375, 90, 250, 20);
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
	
	public JLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new JLabel();
			labelTipoExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelTipoExame.setBounds(650, 90, 250, 17);
			labelTipoExame.setText("Tipo Exame:");
		}
		return labelTipoExame;
	}
	
	/* ------------------------------------------------------------- Inputs --------------------------------------------------------------- */
	public JTextField getTextFieldData() {
		if(textFieldData == null) {
			textFieldData = new JTextField();
			textFieldData.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldData.setBounds(100, 115, 250, 25);
			textFieldData.setColumns(10);
		}
		return textFieldData;
	}

	public JTextField getTextFieldHora() {
		if(textFieldHora == null) {
			textFieldHora = new JTextField();
			textFieldHora.setBounds(375, 115, 250, 25);
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
	
	public JComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new JComboBox();
			comboBoxTipoExame.setFont(new Font("Tahoma", Font.PLAIN, 14));
			comboBoxTipoExame.setBounds(650, 115, 250, 25);
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
			buttonLimpar.setBounds(140, 600, 100, 35);
		}
		return buttonLimpar;
	}
	
}

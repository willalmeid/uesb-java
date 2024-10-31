package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PanelCadastrarMedico extends JPanel{
	
	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private JLabel labelNome;
	private JLabel labelEspecialidade;
	private JLabel labelCrm;
	private JLabel labelContato;
	private JLabel labelValorConsultaParticular;
	private JLabel labelHistoricoDeAtendimento;
	
	private JTextField textFieldNome;
	private JTextField textFieldEspecialidade;
	private JTextField textFieldCrm;
	private JTextField textFieldContato;
	private JTextField textFieldValorConsultaParticular;
	private JTextArea textAreaHistoricoDeAtendimento;
	
	private JButton buttonCadastrar;
	private JButton buttonLimpar;

	public PanelCadastrarMedico() {
		setBackground(new Color(255, 0, 0));
		setSize(1280, 750);
		setLayout(null);
		
		add(getLabelTitlePanel());
		add(getPanelMain());
		add(getButtonCadastrar());
		add(getButtonLimpar());
	}
	
	/* ------------------------------------------------------------- Panel Principal ------------------------------------------------------------- */
	public JPanel getPanelMain() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(255, 128, 128));
			panelPrincipal.setBounds(140, 202, 1000, 345);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelNome());
			panelPrincipal.add(getLabelEspecialidade());
			panelPrincipal.add(getLabelCrm());
			panelPrincipal.add(getLabelContato());
			panelPrincipal.add(getLabelValorConsultaParticular());
			panelPrincipal.add(getLabelHistoricoDeAtendimento());

			panelPrincipal.add(getTextFieldNome());
			panelPrincipal.add(getTextFieldEspecialidade());
			panelPrincipal.add(getTextFieldCrm());
			panelPrincipal.add(getTextFieldContato());
			panelPrincipal.add(getTextFieldValorConsultaParticular());
			panelPrincipal.add(getTextAreaHistoricoDeAtendimento());
		}
		return panelPrincipal;
	}
	
	/* ------------------------------------------------------------------- Labels --------------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Cadastro de Médico");
			labelTitlePanel.setBounds(483, 50, 314, 44);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNome.setBounds(100, 15, 800, 20);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelEspecialidade() {
		if(labelEspecialidade == null) {
			labelEspecialidade = new JLabel();
			labelEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelEspecialidade.setBounds(100, 75, 800, 20);
			labelEspecialidade.setText("Especialidade");
		}
		return labelEspecialidade;
	}
	
	public JLabel getLabelCrm() {
		if(labelCrm == null) {
			labelCrm = new JLabel();
			labelCrm.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelCrm.setBounds(100, 135, 220, 20);
			labelCrm.setText("CRM");
		}
		return labelCrm;
	}
	
	public JLabel getLabelContato() {
		if(labelContato == null) {
			labelContato = new JLabel();
			labelContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelContato.setBounds(390, 135, 220, 20);
			labelContato.setText("Contato");
		}
		return labelContato;
	}
	
	public JLabel getLabelValorConsultaParticular() {
		if(labelValorConsultaParticular == null) {
			labelValorConsultaParticular = new JLabel();
			labelValorConsultaParticular.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelValorConsultaParticular.setBounds(680, 135, 220, 20);
			labelValorConsultaParticular.setText("Valor Consulta Particular");
		}
		return labelValorConsultaParticular;
	}
	
	public JLabel getLabelHistoricoDeAtendimento() {
		if(labelHistoricoDeAtendimento == null) {
			labelHistoricoDeAtendimento = new JLabel();
			labelHistoricoDeAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelHistoricoDeAtendimento.setBounds(100, 195, 800, 20);
			labelHistoricoDeAtendimento.setText("Histórico De Atendimento");
		}
		return labelHistoricoDeAtendimento;
	}
	
	/* ------------------------------------------------------------------ Imputs --------------------------------------------------------------- */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNome.setBounds(100, 40, 800, 25);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldEspecialidade() {
		if (textFieldEspecialidade == null) {
			textFieldEspecialidade = new JTextField();
			textFieldEspecialidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldEspecialidade.setBounds(100, 100, 800, 25);
			textFieldEspecialidade.setColumns(10);
		}
		return textFieldEspecialidade;
	}
	
	public JTextField getTextFieldCrm() {
		if (textFieldCrm == null) {
			textFieldCrm = new JTextField();
			textFieldCrm.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldCrm.setBounds(100, 160, 220, 25);
			textFieldCrm.setColumns(10);
		}
		return textFieldCrm;
	}
	
	public JTextField getTextFieldContato() {
		if (textFieldContato == null) {
			textFieldContato = new JTextField();
			textFieldContato.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldContato.setBounds(390, 160, 220, 25);
			textFieldContato.setColumns(10);
		}
		return textFieldContato;
	}
	
	public JTextField getTextFieldValorConsultaParticular() {
		if (textFieldValorConsultaParticular == null) {
			textFieldValorConsultaParticular = new JTextField();
			textFieldValorConsultaParticular.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldValorConsultaParticular.setBounds(680, 160, 220, 25);
			textFieldValorConsultaParticular.setColumns(10);
		}
		return textFieldValorConsultaParticular;
	}
	
	public JTextArea getTextAreaHistoricoDeAtendimento() {
		if (textAreaHistoricoDeAtendimento == null) {
			textAreaHistoricoDeAtendimento = new JTextArea();
			textAreaHistoricoDeAtendimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textAreaHistoricoDeAtendimento.setBounds(100, 220, 800, 100);
			textAreaHistoricoDeAtendimento.setColumns(10);
		}
		return textAreaHistoricoDeAtendimento;
	}
	
	/* ---------------------------------------------------------------- Buttons ----------------------------------------------------------------- */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1040, 600, 100, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(140, 600, 100, 35);
		}
		return buttonLimpar;
	}

}

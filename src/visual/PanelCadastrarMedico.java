package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
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
	private JTextField textFieldHistoricoDeAtendimento;
	
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
			panelPrincipal.setBounds(30, 135, 1220, 490);
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
			panelPrincipal.add(getTextFieldHistoricoDeAtendimento());
		}
		return panelPrincipal;
	}
	
	/* ------------------------------------------------------------------- Labels --------------------------------------------------------------- */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Tela de Cadastro de Médico");
			labelTitlePanel.setBounds(397, 30, 485, 76);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setBounds(178, 408, 39, 20);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelEspecialidade() {
		if(labelEspecialidade == null) {
			labelEspecialidade = new JLabel();
			labelEspecialidade.setBounds(227, 408, 39, 20);
			labelEspecialidade.setText("Especialidade");
		}
		return labelEspecialidade;
	}
	
	public JLabel getLabelCrm() {
		if(labelCrm == null) {
			labelCrm = new JLabel();
			labelCrm.setBounds(276, 408, 39, 20);
			labelCrm.setText("CRM");
		}
		return labelCrm;
	}
	
	public JLabel getLabelContato() {
		if(labelContato == null) {
			labelContato = new JLabel();
			labelContato.setBounds(312, 408, 39, 20);
			labelContato.setText("Contato");
		}
		return labelContato;
	}
	
	public JLabel getLabelValorConsultaParticular() {
		if(labelValorConsultaParticular == null) {
			labelValorConsultaParticular = new JLabel();
			labelValorConsultaParticular.setBounds(361, 408, 39, 20);
			labelValorConsultaParticular.setText("Valor Consulta Particular");
		}
		return labelValorConsultaParticular;
	}
	
	public JLabel getLabelHistoricoDeAtendimento() {
		if(labelHistoricoDeAtendimento == null) {
			labelHistoricoDeAtendimento = new JLabel();
			labelHistoricoDeAtendimento.setBounds(410, 408, 39, 20);
			labelHistoricoDeAtendimento.setText("Histórico De Atendimento");
		}
		return labelHistoricoDeAtendimento;
	}
	
	/* ------------------------------------------------------------------ Imputs --------------------------------------------------------------- */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(178, 427, 28, 20);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldEspecialidade() {
		if (textFieldEspecialidade == null) {
			textFieldEspecialidade = new JTextField();
			textFieldEspecialidade.setBounds(227, 427, 28, 20);
			textFieldEspecialidade.setColumns(10);
		}
		return textFieldEspecialidade;
	}
	
	public JTextField getTextFieldCrm() {
		if (textFieldCrm == null) {
			textFieldCrm = new JTextField();
			textFieldCrm.setBounds(276, 427, 28, 20);
			textFieldCrm.setColumns(10);
		}
		return textFieldCrm;
	}
	
	public JTextField getTextFieldContato() {
		if (textFieldContato == null) {
			textFieldContato = new JTextField();
			textFieldContato.setBounds(312, 427, 28, 20);
			textFieldContato.setColumns(10);
		}
		return textFieldContato;
	}
	
	public JTextField getTextFieldValorConsultaParticular() {
		if (textFieldValorConsultaParticular == null) {
			textFieldValorConsultaParticular = new JTextField();
			textFieldValorConsultaParticular.setBounds(361, 427, 28, 20);
			textFieldValorConsultaParticular.setColumns(10);
		}
		return textFieldValorConsultaParticular;
	}
	
	public JTextField getTextFieldHistoricoDeAtendimento() {
		if (textFieldHistoricoDeAtendimento == null) {
			textFieldHistoricoDeAtendimento = new JTextField();
			textFieldHistoricoDeAtendimento.setBounds(407, 427, 28, 20);
			textFieldHistoricoDeAtendimento.setColumns(10);
		}
		return textFieldHistoricoDeAtendimento;
	}
	
	/* ---------------------------------------------------------------- Buttons ----------------------------------------------------------------- */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1170, 631, 80, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(30, 631, 80, 35);
		}
		return buttonLimpar;
	}

}

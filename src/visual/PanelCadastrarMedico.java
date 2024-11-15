package visual;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import styles.Buttons;
import styles.Input;
import styles.InputLabel;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCadastrarMedico extends JPanel{
	
	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private InputLabel labelNome;
	private InputLabel labelEspecialidade;
	private InputLabel labelCrm;
	private InputLabel labelContato;
	private InputLabel labelValorConsultaParticular;
	private InputLabel labelHistoricoDeAtendimento;
	
	private Input textFieldNome;
	private Input textFieldEspecialidade;
	private Input textFieldCrm;
	private Input textFieldContato;
	private Input textFieldValorConsultaParticular;
	private JTextArea textAreaHistoricoDeAtendimento;
	
	private Buttons buttonCadastrar;
	private Buttons buttonLimpar;

	public PanelCadastrarMedico() {
		setBackground(Thema.corPrincipal);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE))
								.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(260)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 385, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)))
		);
		setLayout(groupLayout);
	}
	
	/* ------------------------------------------------------------- Panel Principal ------------------------------------------------------------- */
	public JPanel getPanelMain() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.corFundoPrincipal);
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
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Médico");
		}
		return labelTitlePanel;
	}
	
	public InputLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new InputLabel("Nome");
			labelNome.setBounds(10, 11, 740, 20);
		}
		return labelNome;
	}
	
	public InputLabel getLabelEspecialidade() {
		if(labelEspecialidade == null) {
			labelEspecialidade = new InputLabel("Especialidade");
			labelEspecialidade.setBounds(10, 71, 740, 20);
		}
		return labelEspecialidade;
	}
	
	public InputLabel getLabelCrm() {
		if(labelCrm == null) {
			labelCrm = new InputLabel("CRM");
			labelCrm.setBounds(10, 131, 235, 20);
		}
		return labelCrm;
	}
	
	public InputLabel getLabelContato() {
		if(labelContato == null) {
			labelContato = new InputLabel("Contato");
			labelContato.setBounds(265, 131, 280, 20);
		}
		return labelContato;
	}
	
	public InputLabel getLabelValorConsultaParticular() {
		if(labelValorConsultaParticular == null) {
			labelValorConsultaParticular = new InputLabel("Valor Consulta Particular");
			labelValorConsultaParticular.setBounds(560, 131, 190, 20);
		}
		return labelValorConsultaParticular;
	}
	
	public InputLabel getLabelHistoricoDeAtendimento() {
		if(labelHistoricoDeAtendimento == null) {
			labelHistoricoDeAtendimento = new InputLabel("Histórico De Atendimento");
			labelHistoricoDeAtendimento.setBounds(10, 191, 740, 20);
		}
		return labelHistoricoDeAtendimento;
	}
	
	/* ------------------------------------------------------------------ Imputs --------------------------------------------------------------- */
	public Input getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new Input();
			textFieldNome.setBounds(10, 36, 740, 25);
		}
		return textFieldNome;
	}
	
	public Input getTextFieldEspecialidade() {
		if (textFieldEspecialidade == null) {
			textFieldEspecialidade = new Input();
			textFieldEspecialidade.setBounds(10, 96, 740, 25);
		}
		return textFieldEspecialidade;
	}
	
	public Input getTextFieldCrm() {
		if (textFieldCrm == null) {
			textFieldCrm = new Input();
			textFieldCrm.setBounds(10, 156, 240, 25);
		}
		return textFieldCrm;
	}
	
	public Input getTextFieldContato() {
		if (textFieldContato == null) {
			textFieldContato = new Input();
			textFieldContato.setBounds(265, 156, 280, 25);
		}
		return textFieldContato;
	}
	
	public Input getTextFieldValorConsultaParticular() {
		if (textFieldValorConsultaParticular == null) {
			textFieldValorConsultaParticular = new Input();
			textFieldValorConsultaParticular.setBounds(560, 156, 190, 25);
		}
		return textFieldValorConsultaParticular;
	}
	
	public JTextArea getTextAreaHistoricoDeAtendimento() {
		if (textAreaHistoricoDeAtendimento == null) {
			textAreaHistoricoDeAtendimento = new JTextArea();
			textAreaHistoricoDeAtendimento.setBounds(10, 216, 740, 150);
			textAreaHistoricoDeAtendimento.setFont(Thema.FONT_INPUTS);
			textAreaHistoricoDeAtendimento.setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
		}
		return textAreaHistoricoDeAtendimento;
	}
	
	/* ---------------------------------------------------------------- Buttons ----------------------------------------------------------------- */
	public Buttons getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new Buttons("Cadastrar");
		}
		return buttonCadastrar;
	}
	
	public Buttons getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Buttons("Limpar");
		}
		return buttonLimpar;
	}

}
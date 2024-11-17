package visual;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputTextField;
import styles.InputLabel;
import styles.InputTextArea;
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
	
	private InputTextField textFieldNome;
	private InputTextField textFieldEspecialidade;
	private InputTextField textFieldCrm;
	private InputTextField textFieldContato;
	private InputTextField textFieldValorConsultaParticular;
	private InputTextArea textAreaHistoricoDeAtendimento;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;

	public PanelCadastrarMedico() {
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE))
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
			panelPrincipal.setBackground(Thema.BACKGROUND);
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
	public InputTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new InputTextField();
			textFieldNome.setBounds(10, 36, 740, 25);
		}
		return textFieldNome;
	}
	
	public InputTextField getTextFieldEspecialidade() {
		if (textFieldEspecialidade == null) {
			textFieldEspecialidade = new InputTextField();
			textFieldEspecialidade.setBounds(10, 96, 740, 25);
		}
		return textFieldEspecialidade;
	}
	
	public InputTextField getTextFieldCrm() {
		if (textFieldCrm == null) {
			textFieldCrm = new InputTextField();
			textFieldCrm.setBounds(10, 156, 240, 25);
		}
		return textFieldCrm;
	}
	
	public InputTextField getTextFieldContato() {
		if (textFieldContato == null) {
			textFieldContato = new InputTextField();
			textFieldContato.setBounds(265, 156, 280, 25);
		}
		return textFieldContato;
	}
	
	public InputTextField getTextFieldValorConsultaParticular() {
		if (textFieldValorConsultaParticular == null) {
			textFieldValorConsultaParticular = new InputTextField();
			textFieldValorConsultaParticular.setBounds(560, 156, 190, 25);
		}
		return textFieldValorConsultaParticular;
	}
	
	public JTextArea getTextAreaHistoricoDeAtendimento() {
		if (textAreaHistoricoDeAtendimento == null) {
			textAreaHistoricoDeAtendimento = new InputTextArea();
			textAreaHistoricoDeAtendimento.setBounds(10, 216, 740, 150);
		}
		return textAreaHistoricoDeAtendimento;
	}
	
	/* ---------------------------------------------------------------- Buttons ----------------------------------------------------------------- */
	public Button getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new Button("Cadastrar");
		}
		return buttonCadastrar;
	}
	
	public Button getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
		}
		return buttonLimpar;
	}

}
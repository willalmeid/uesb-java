package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputTextField;
import styles.InputLabel;
import styles.Thema;
import styles.TitlePanel;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCadastrarMedico extends JPanel{
	
	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	private InputLabel labelNome;
	private InputLabel labelEspecialidade;
	private InputLabel labelCrm;
	private InputLabel labelContato;
	private InputLabel labelValorConsultaParticular;
	private InputLabel labelHorariosDeAtendimento;
	
	private InputTextField textFieldNome;
	private InputTextField textFieldEspecialidade;
	private InputTextField textFieldCrm;
	private InputTextField textFieldContato;
	private InputTextField textFieldValorConsultaParticular;
	
	private InputComboBox comboBoxAdicionarHorarios;
	private JList<String> listHorariosDeAtendimento;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	private Button buttonRemover;
	private Button buttonAdicionar;

	public PanelCadastrarMedico() {
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(260)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(26, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 336, GroupLayout.PREFERRED_SIZE)
					.addGap(79)
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
			panelPrincipal.add(getLabelHorariosDeAtendimento());

			panelPrincipal.add(getTextFieldNome());
			panelPrincipal.add(getTextFieldEspecialidade());
			panelPrincipal.add(getTextFieldCrm());
			panelPrincipal.add(getTextFieldContato());
			panelPrincipal.add(getTextFieldValorConsultaParticular());
			
			panelPrincipal.add(getComboBoxAdicionarHorarios());
			panelPrincipal.add(getListHorariosDeAtendimento());
			
			panelPrincipal.add(getButtonRemover());
			panelPrincipal.add(getButtonAdicionar());
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
			labelNome.setBounds(10, 10, 740, 20);
		}
		return labelNome;
	}
	
	public InputLabel getLabelEspecialidade() {
		if(labelEspecialidade == null) {
			labelEspecialidade = new InputLabel("Especialidade");
			labelEspecialidade.setBounds(10, 70, 740, 20);
		}
		return labelEspecialidade;
	}
	
	public InputLabel getLabelCrm() {
		if(labelCrm == null) {
			labelCrm = new InputLabel("CRM");
			labelCrm.setBounds(10, 130, 235, 20);
		}
		return labelCrm;
	}
	
	public InputLabel getLabelContato() {
		if(labelContato == null) {
			labelContato = new InputLabel("Contato");
			labelContato.setBounds(265, 130, 280, 20);
		}
		return labelContato;
	}
	
	public InputLabel getLabelValorConsultaParticular() {
		if(labelValorConsultaParticular == null) {
			labelValorConsultaParticular = new InputLabel("Valor Consulta Particular");
			labelValorConsultaParticular.setBounds(560, 130, 190, 20);
		}
		return labelValorConsultaParticular;
	}
	
	public InputLabel getLabelHorariosDeAtendimento() {
		if(labelHorariosDeAtendimento == null) {
			labelHorariosDeAtendimento = new InputLabel("Histórico De Atendimento");
			labelHorariosDeAtendimento.setText("Horários De Atendimento");
			labelHorariosDeAtendimento.setBounds(10, 190, 740, 20);
		}
		return labelHorariosDeAtendimento;
	}
	
	/* ------------------------------------------------------------------ Imputs --------------------------------------------------------------- */
	public InputTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new InputTextField();
			textFieldNome.setBounds(10, 35, 740, 25);
		}
		return textFieldNome;
	}
	
	public InputTextField getTextFieldEspecialidade() {
		if (textFieldEspecialidade == null) {
			textFieldEspecialidade = new InputTextField();
			textFieldEspecialidade.setBounds(10, 95, 740, 25);
		}
		return textFieldEspecialidade;
	}
	
	public InputTextField getTextFieldCrm() {
		if (textFieldCrm == null) {
			textFieldCrm = new InputTextField("######/??");
			textFieldCrm.setBounds(10, 155, 240, 25);
		}
		return textFieldCrm;
	}
	
	public InputTextField getTextFieldContato() {
		if (textFieldContato == null) {
			textFieldContato = new InputTextField();
			textFieldContato.setBounds(265, 155, 280, 25);
		}
		return textFieldContato;
	}
	
	public InputTextField getTextFieldValorConsultaParticular() {
		if (textFieldValorConsultaParticular == null) {
			textFieldValorConsultaParticular = new InputTextField();
			textFieldValorConsultaParticular.setBounds(560, 155, 190, 25);
		}
		return textFieldValorConsultaParticular;
	}
	
	public InputComboBox getComboBoxAdicionarHorarios() {
		if (comboBoxAdicionarHorarios == null) {
			comboBoxAdicionarHorarios = new InputComboBox();
			comboBoxAdicionarHorarios.setSelectedIndex(-1);
			comboBoxAdicionarHorarios.setBounds(10, 215, 525, 25);
			
			try {
				File file = new File("./dados/horarios-de-atendimento.txt");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
		            String nome = linha;
		            comboBoxAdicionarHorarios.addItem(nome);
			        linha = br.readLine();
				}
				
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			comboBoxAdicionarHorarios.setSelectedIndex(-1);
		}
		
		return comboBoxAdicionarHorarios;
	}
	
	public JList<String> getListHorariosDeAtendimento() {
		if (listHorariosDeAtendimento == null) {
			DefaultListModel<String> model = new DefaultListModel<>();
	        listHorariosDeAtendimento = new JList<>(model);
	        listHorariosDeAtendimento.setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	        listHorariosDeAtendimento.setBorder(new LineBorder(new Color(0, 0, 0)));
			listHorariosDeAtendimento.setBounds(10, 250, 740, 75);;
		}
		return listHorariosDeAtendimento;
	}
	
	/* ---------------------------------------------------------------- Buttons ----------------------------------------------------------------- */
	public Button getButtonRemover() {
		if (buttonRemover == null) {
			buttonRemover = new Button("Limpar");
			buttonRemover.setText("Remover");
			buttonRemover.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonRemover.setBounds(650, 215, 100, 25);
		}
		return buttonRemover;
	}
	
	public Button getButtonAdicionar() {
		if (buttonAdicionar == null) {
			buttonAdicionar = new Button("Limpar");
			buttonAdicionar.setText("Adicionar");
			buttonAdicionar.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonAdicionar.setBounds(545, 215, 100, 25);
		}
		return buttonAdicionar;
	}
	
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
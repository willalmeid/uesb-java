package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputTextField;
import styles.InputLabel;
import styles.InputTextArea;
import styles.Thema;
import styles.TitlePanel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.JList;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class PanelCadastrarConsulta extends JPanel {

	private JPanel panelPrincipal;
	private TitlePanel labelTitlePanel;
	
	private InputLabel labelData;
	private InputLabel labelHora;
	private InputLabel labelQueixaPaciente;
	private InputLabel labelObservacoes;
	private InputLabel labelMateriaisUtilizados;
	private InputLabel labelMedico;
	private InputLabel labelPaciente;
	private InputLabel labelTipoDeConsulta;
	private InputLabel labelConvenio;
	
	private InputComboBox comboBoxPaciente;
	private InputTextField textFieldHora;
	private InputTextField textFieldData;
	
	private InputTextArea textAreaObservacoes;
	private JList<String> listMateriaisUtilizados;
	private InputTextArea textAreaQueixaPaciente;

	private InputComboBox comboBoxMedico;
	private InputComboBox comboBoxTipoDeConsulta;
	private InputComboBox comboBoxConvenio;
	private InputComboBox comboBoxAdicionarMaterial;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	private Button buttonRemover;
	private Button buttonAdicionar;
	
	public PanelCadastrarConsulta() {
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(218)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 358, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(15, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 505, GroupLayout.PREFERRED_SIZE)
					.addGap(40)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		setLayout(groupLayout);
	}
	
	public JPanel getPanelMain() {
		if (panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.BACKGROUND);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getLabelData());
			panelPrincipal.add(getLabelHora());
			panelPrincipal.add(getLabelQueixaPaciente());
			panelPrincipal.add(getLabelObservacoes());
			panelPrincipal.add(getLabelMateriaisUtilizados());
			panelPrincipal.add(getLabelMedico());
			panelPrincipal.add(getLabelPaciente());
			panelPrincipal.add(getLabelTipoDeConsulta());
			panelPrincipal.add(getLabelConvenio());
			
			panelPrincipal.add(getTextFieldData());
			panelPrincipal.add(getTextFieldHora());
			panelPrincipal.add(getComboBoxPaciente());
			
			panelPrincipal.add(getTextAreaQueixaPaciente());
			panelPrincipal.add(getTextAreaObservacoes());
			panelPrincipal.add(getListMateriaisUtilizados());
			
			panelPrincipal.add(getComboBoxMedico());
			panelPrincipal.add(getComboBoxTipoDeConsulta());
			panelPrincipal.add(getComboBoxConvenio());
			
			panelPrincipal.add(getComboBoxAdicionarMaterial());
			
			panelPrincipal.add(getButtonRemover());
			panelPrincipal.add(getButtonAdicionar());
		}
		return panelPrincipal;
	}
	
	/* ----------------------------------------------------------------- Labels -------------------------------------------------------------- */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Consultas");
		}
		return labelTitlePanel;
	}
	
	public InputLabel getLabelPaciente() {
		if(labelPaciente == null) {
			labelPaciente = new InputLabel("Paciente");
			labelPaciente.setBounds(10, 10, 220, 20);
		}
		return labelPaciente;
	}
	
	public InputLabel getLabelData() {
		if(labelData == null) {
			labelData = new InputLabel("Data");
			labelData.setBounds(525, 10, 120, 20);
		}
		return labelData;
	}
	
	public InputLabel getLabelHora() {
		if(labelHora == null) {
			labelHora = new InputLabel("Hora");
			labelHora.setBounds(660, 10, 90, 20);
		}
		return labelHora;
	}
	
	public InputLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new InputLabel("Médico");
			labelMedico.setBounds(10, 70, 350, 20);
		}
		return labelMedico;
	}
	
	public InputLabel getLabelTipoDeConsulta() {
		if(labelTipoDeConsulta == null) {
			labelTipoDeConsulta = new InputLabel("Tipo De Consulta");
			labelTipoDeConsulta.setBounds(375, 70, 145, 20);
		}
		return labelTipoDeConsulta;
	}
	
	public InputLabel getLabelConvenio() {
		if(labelConvenio == null) {
			labelConvenio = new InputLabel("Convênio");
			labelConvenio.setBounds(535, 70, 215, 20);
		}
		return labelConvenio;
	}
	
	public InputLabel getLabelQueixaPaciente() {
		if(labelQueixaPaciente == null) {
			labelQueixaPaciente = new InputLabel("Queixa do Paciente");
			labelQueixaPaciente.setBounds(10, 130, 740, 20);
		}
		return labelQueixaPaciente;
	}
	
	public InputLabel getLabelObservacoes() {
		if(labelObservacoes == null) {
			labelObservacoes = new InputLabel("Observações");
			labelObservacoes.setBounds(10, 240, 740, 20);
		}
		return labelObservacoes;
	}
	
	public InputLabel getLabelMateriaisUtilizados() {
		if(labelMateriaisUtilizados == null) {
			labelMateriaisUtilizados = new InputLabel("Materiais Utilizados");
			labelMateriaisUtilizados.setBounds(10, 360, 740, 20);
		}
		return labelMateriaisUtilizados;
	}
	
	/* ----------------------------------------------------------------- Imputs -------------------------------------------------------------- */
	public InputComboBox getComboBoxPaciente() {
		if (comboBoxPaciente == null) {
			comboBoxPaciente = new InputComboBox();
			comboBoxPaciente.setBounds(10, 35, 500, 25);
			
			try {
				File f = new File("./dados/pacientes.txt");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
					if(linha.startsWith("Nome: ")) {
						String nome = linha.substring(6).trim();
						comboBoxPaciente.addItem(nome);
					}
					linha = br.readLine();
				}
				
				br.close();
				fr.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			comboBoxPaciente.setSelectedIndex(-1);
		}
		return comboBoxPaciente;
	}
	
	public InputTextField getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new InputTextField("##/##/####");
			textFieldData.setBounds(525, 35, 120, 25);
		}
		return textFieldData;
	}
	
	public InputTextField getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new InputTextField("##:##");
			textFieldHora.setBounds(660, 35, 90, 25);
		}
		return textFieldHora;
	}
	
	public InputComboBox getComboBoxMedico() {
		if (comboBoxMedico == null) {
			comboBoxMedico = new InputComboBox();
			comboBoxMedico.setBounds(10, 95, 350, 25);
			
			try {
				File f = new File("./dados/medicos.txt");
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
					if(linha.startsWith("Nome: ")) {
						String nome = linha.substring(6).trim();
						comboBoxMedico.addItem(nome);
					}
					linha = br.readLine();
				}
				
				br.close();
				fr.close();
				
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	public InputComboBox getComboBoxTipoDeConsulta() {
		if (comboBoxTipoDeConsulta == null) {
			comboBoxTipoDeConsulta = new InputComboBox();
			comboBoxTipoDeConsulta.setBounds(375, 95, 145, 25);
			
			comboBoxTipoDeConsulta.addItem("Clínica Geral");
			comboBoxTipoDeConsulta.addItem("Cardiologia");
			comboBoxTipoDeConsulta.addItem("Dermatologia");
			comboBoxTipoDeConsulta.addItem("Neurologia");
			comboBoxTipoDeConsulta.addItem("Ortopedia");
			
			comboBoxTipoDeConsulta.setSelectedIndex(-1);
		}
		return comboBoxTipoDeConsulta;
	}
	
	public InputComboBox getComboBoxConvenio() {
		if (comboBoxConvenio == null) {
			comboBoxConvenio = new InputComboBox();
			comboBoxConvenio.setBounds(535, 95, 215, 25);
			
			comboBoxConvenio.addItem("SUS");
	        comboBoxConvenio.addItem("Particular");
	        comboBoxConvenio.addItem("Plano Familiar");
	        comboBoxConvenio.addItem("Empresarial");
			
			comboBoxConvenio.setSelectedIndex(-1);
		}
		return comboBoxConvenio;
	}
	
	public InputTextArea getTextAreaQueixaPaciente() {
		if (textAreaQueixaPaciente == null) {
			textAreaQueixaPaciente = new InputTextArea();
			textAreaQueixaPaciente.setBounds(10, 155, 740, 75);
		}
		return textAreaQueixaPaciente;
	}
	
	public InputTextArea getTextAreaObservacoes() {
		if (textAreaObservacoes == null) {
			textAreaObservacoes = new InputTextArea();
			textAreaObservacoes.setBounds(10, 265, 740, 75);
		}
		return textAreaObservacoes;
	}
	
	public InputComboBox getComboBoxAdicionarMaterial() {
		if (comboBoxAdicionarMaterial == null) {
			comboBoxAdicionarMaterial = new InputComboBox();
			comboBoxAdicionarMaterial.setSelectedIndex(-1);
			comboBoxAdicionarMaterial.setBounds(10, 385, 520, 25);
			
			try {
				File file = new File("./dados/materiais.txt");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
					 if (linha.startsWith("Nome do Material: ")) {
			            // Extrai apenas o nome após o prefixo "Nome:"
			            String nome = linha.substring(18).trim();
			            comboBoxAdicionarMaterial.addItem(nome);
			        }
			        linha = br.readLine();
				}
				
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			comboBoxAdicionarMaterial.setSelectedIndex(-1);
		}
		
		return comboBoxAdicionarMaterial;
	}
	
	public JList<String> getListMateriaisUtilizados() {
		if (listMateriaisUtilizados == null) {
			DefaultListModel<String> model = new DefaultListModel<>();
	        listMateriaisUtilizados = new JList<>(model);
	        listMateriaisUtilizados.setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	        listMateriaisUtilizados.setBorder(new LineBorder(new Color(0, 0, 0)));
			listMateriaisUtilizados.setBounds(10, 420, 740, 75);;
		}
		return listMateriaisUtilizados;
	}
	
	/* ---------------------------------------------------------------- Buttons -------------------------------------------------------------- */
	public Button getButtonRemover() {
		if (buttonRemover == null) {
			buttonRemover = new Button("Limpar");
			buttonRemover.setText("Remover");
			buttonRemover.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonRemover.setBounds(650, 385, 100, 25);
		}
		return buttonRemover;
	}
	
	public Button getButtonAdicionar() {
		if (buttonAdicionar == null) {
			buttonAdicionar = new Button("Limpar");
			buttonAdicionar.setText("Adicionar");
			buttonAdicionar.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonAdicionar.setBounds(545, 385, 100, 25);
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
package visual;

import javax.swing.JPanel;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.border.LineBorder;

import styles.Button;
import styles.InputComboBox;
import styles.InputTextField;
import styles.InputLabel;
import styles.InputTextArea;
import styles.Thema;
import styles.TitlePanel;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JList;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCadastrarExame extends JPanel {
	
	private TitlePanel labelTitlePanel;
	private JPanel panelMain;
	
	private InputLabel labelNomeExame;
	private InputLabel labelDescricao;
	private InputLabel labelMateriaisUtilizados;
	private InputLabel labelValorParticular;
	private InputLabel labelMedico;
	private InputLabel labelTipoExame;
	private InputLabel labelPaciente;
	
	private InputTextField textFieldNomeExame;
	private InputTextField textFieldValorParticular;
	private InputTextArea textAreaDescricao;
	
	private InputComboBox comboBoxMedico;
	private InputComboBox comboBoxTipoExame;
	private InputComboBox comboBoxPaciente;
	private InputComboBox comboBoxAdicionarMaterial;
	
	private JList<String> listMateriaisUtilizados;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	private Button buttonRemover;
	private Button buttonAdicionar;
	private InputTextField textFieldHora;
	private InputLabel labelHora;
	private InputLabel labelData;
	private InputTextField textFieldData;

	public PanelCadastrarExame() {
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(265)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 540, Short.MAX_VALUE)
									.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(19, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getPanelMain(), GroupLayout.PREFERRED_SIZE, 463, GroupLayout.PREFERRED_SIZE)
					.addGap(46)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(10))
		);
		setLayout(groupLayout);
	}
	
	public JPanel getPanelMain() {
		if(panelMain == null) {
			panelMain = new JPanel();
			panelMain.setBorder(new LineBorder(null));
			panelMain.setBackground(new Color(204, 229, 233));
			panelMain.setLayout(null);
			
			panelMain.add(getLabelNomeExame());
			panelMain.add(getLabelValorParticular()); 
			panelMain.add(getLabelPaciente());
			panelMain.add(getLabelData());
			panelMain.add(getLabelHora());
			panelMain.add(getLabelMedico());
			panelMain.add(getLabelTipoExame());
			panelMain.add(getLabelDescricao()); 
			panelMain.add(getLabelMateriaisUtilizados());
			
			panelMain.add(getTextFieldNomeExame());
			panelMain.add(getTextFieldValorParticular());
			panelMain.add(getComboBoxPaciente());
			panelMain.add(getTextFieldData());
			panelMain.add(getTextFieldHora());
			panelMain.add(getComboBoxMedico());
			panelMain.add(getComboBoxTipoExame());
			panelMain.add(getTextAreaDescricao());
			panelMain.add(getComboBoxAdicionarMaterial());
			panelMain.add(getListMateriaisUtilizados());
			
			panelMain.add(getButtonRemover());
			panelMain.add(getButtonAdicionar());
		}
		return panelMain;
	}
	
	/* -------------------------------------------------------------- Labels ----------------------------------------------------------- */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Exame");
		}
		return labelTitlePanel;
	}

	public InputLabel getLabelNomeExame() {
		if(labelNomeExame == null) {
			labelNomeExame = new InputLabel("Nome do Exame");
			labelNomeExame.setBounds(10, 10, 585, 20);
		}
		return labelNomeExame;
	}
	
	public InputLabel getLabelValorParticular() {
		if(labelValorParticular == null) {
			labelValorParticular = new InputLabel("Valor Particular");
			labelValorParticular.setBounds(610, 10, 140, 20);
		}
		return labelValorParticular;
	}
	
	public InputLabel getLabelPaciente() {
		if (labelPaciente == null) {
			labelPaciente = new InputLabel("Médico");
			labelPaciente.setText("Paciente");
			labelPaciente.setBounds(10, 70, 484, 20);
		}
		return labelPaciente;
	}
	
	public InputLabel getLabelData() {
		if (labelData == null) {
			labelData = new InputLabel("Valor Particular");
			labelData.setText("Data");
			labelData.setBounds(540, 71, 100, 20);
		}
		return labelData;
	}
	
	public InputLabel getLabelHora() {
		if (labelHora == null) {
			labelHora = new InputLabel("Valor Particular");
			labelHora.setText("Hora");
			labelHora.setBounds(650, 71, 100, 20);
		}
		return labelHora;
	}

	public InputLabel getLabelDescricao() {
		if(labelDescricao == null) {
			labelDescricao = new InputLabel("Decrição");
			labelDescricao.setBounds(10, 190, 740, 20);
		}
		return labelDescricao;
	}
	
	public InputLabel getLabelMedico() {
		if(labelMedico == null) {
			labelMedico = new InputLabel("Médico");
			labelMedico.setBounds(10, 130, 410, 20);
		}
		return labelMedico;
	}

	public InputLabel getLabelTipoExame() {
		if(labelTipoExame == null) {
			labelTipoExame = new InputLabel("Tipo do Exame");
			labelTipoExame.setBounds(435, 130, 315, 20);
		}
		return labelTipoExame;
	}
	
	public InputLabel getLabelMateriaisUtilizados() {
		if(labelMateriaisUtilizados == null) {
			labelMateriaisUtilizados = new InputLabel("Materiais Utilizados");
			labelMateriaisUtilizados.setBounds(10, 290, 740, 20);
		}
		return labelMateriaisUtilizados;
	}

	/* --------------------------------------------------------------- Imputs ----------------------------------------------------------- */
	public InputTextField getTextFieldNomeExame() {
		if(textFieldNomeExame == null) {
			textFieldNomeExame = new InputTextField();
			textFieldNomeExame.setBounds(10, 35, 585, 25);
		}
		return textFieldNomeExame;
	}
	
	public InputTextField getTextFieldValorParticular() {
		if (textFieldValorParticular == null) {
			textFieldValorParticular = new InputTextField();
			textFieldValorParticular.setBounds(610, 35, 140, 25);
		}
		return textFieldValorParticular;
	}
	
	public InputComboBox getComboBoxPaciente() {
		if (comboBoxPaciente == null) {
			comboBoxPaciente = new InputComboBox();
			comboBoxPaciente.setSelectedIndex(-1);
			comboBoxPaciente.setBounds(10, 95, 520, 25);
			
			try {
				File file = new File("./dados/pacientes.txt");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
					 if (linha.startsWith("Nome:")) {
			            // Extrai apenas o nome após o prefixo "Nome:"
			            String nome = linha.substring(6).trim(); // Remove "Nome:" e os espaços extras
			            comboBoxPaciente.addItem(nome);
			        }
			        linha = br.readLine();
				}
				
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			comboBoxPaciente.setSelectedIndex(-1);
		}
		return comboBoxPaciente;
	}
	
	public InputTextField getTextFieldData() {
		if (textFieldData == null) {
			textFieldData = new InputTextField("##/##/####");
			textFieldData.setBounds(540, 96, 100, 25);
		}
		return textFieldData;
	}
	
	public InputTextField getTextFieldHora() {
		if (textFieldHora == null) {
			textFieldHora = new InputTextField("##:##");
			textFieldHora.setBounds(650, 96, 100, 25);
		}
		return textFieldHora;
	}
	
	public InputComboBox getComboBoxMedico() {
		if(comboBoxMedico == null) {
			comboBoxMedico = new InputComboBox();
			comboBoxMedico.setBounds(10, 155, 410, 25);
			
			try {
				File file = new File("./dados/medicos.txt");
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
				
				String linha = br.readLine();
				
				while(linha != null) {
					 if (linha.startsWith("Nome:")) {
			            // Extrai apenas o nome após o prefixo "Nome:"
			            String nome = linha.substring(6).trim(); // Remove "Nome:" e os espaços extras
			            comboBoxMedico.addItem(nome);
			        }
			        linha = br.readLine();
				}
				
				br.close();
				fr.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			comboBoxMedico.setSelectedIndex(-1);
		}
		return comboBoxMedico;
	}
	
	public InputComboBox getComboBoxTipoExame() {
		if(comboBoxTipoExame == null) {
			comboBoxTipoExame = new InputComboBox();
			comboBoxTipoExame.setBounds(435, 155, 315, 25);
			
			comboBoxTipoExame.addItem("Exames Físicos");
			comboBoxTipoExame.addItem("Exames Laboratoriais");
			comboBoxTipoExame.addItem("Imagens");
			comboBoxTipoExame.addItem("Biópsia");
			comboBoxTipoExame.addItem("Patologia e análise clínica");
			
			comboBoxTipoExame.setSelectedIndex(-1);
		}
		return comboBoxTipoExame;
	}
	
	public InputTextArea getTextAreaDescricao() {
		if (textAreaDescricao == null) {
			textAreaDescricao = new InputTextArea();
			textAreaDescricao.setBounds(10, 215, 740, 65);
		}
		return textAreaDescricao;
	}
	
	public InputComboBox getComboBoxAdicionarMaterial() {
		if (comboBoxAdicionarMaterial == null) {
			comboBoxAdicionarMaterial = new InputComboBox();
			comboBoxAdicionarMaterial.setSelectedIndex(-1);
			comboBoxAdicionarMaterial.setBounds(10, 315, 520, 25);
			
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
			listMateriaisUtilizados.setBounds(10, 350, 740, 100);
		}
		return listMateriaisUtilizados;
	}
	
	/* ------------------------------------------------------------- Buttons ------------------------------------------------------------ */
	public Button getButtonRemover() {
		if (buttonRemover == null) {
			buttonRemover = new Button("Limpar");
			buttonRemover.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			buttonRemover.setText("Remover");
			buttonRemover.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonRemover.setBounds(650, 315, 100, 25);
		}
		return buttonRemover;
	}
	
	public Button getButtonAdicionar() {
		if (buttonAdicionar == null) {
			buttonAdicionar = new Button("Limpar");
			buttonAdicionar.setText("Adicionar");
			buttonAdicionar.setFont(new Font("Dialog", Font.BOLD, 12));
			buttonAdicionar.setBounds(540, 315, 100, 25);
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
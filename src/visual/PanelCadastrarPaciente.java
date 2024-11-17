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

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelCadastrarPaciente extends JPanel{
	private TitlePanel labelTitlePanel;
	private TitlePanel labelTitlePessoais;
	private TitlePanel labelTitleEndereco;
	
	private JPanel panelPaciente;
	private JPanel panelEndereco;
	
	private InputLabel labelNome;
	private InputLabel labelDataNascimento;
	private InputLabel labelTelefone;
	private InputLabel labelTipoSanguineo;
	private InputLabel labelHistoricoMedico;
	private InputLabel labelCovenio;
	private InputLabel labelPeso;
	private InputLabel labelAltura;
	
	private InputTextField textFieldNome;
	private InputTextField textFieldDataNascimento;
	private InputTextField textFieldTelefone;
	private InputTextField textFieldPeso;
	private InputTextField textFieldAltura;
	
	private InputTextArea textAreaHistoricoMedico;

	private InputComboBox comboBoxCovenio;
	private InputComboBox comboBoxTipoSanguineo;
	
	// Endereço
	private InputLabel labelCEP;
	private InputLabel labelEstado;
	private InputLabel labelCidade;
	private InputLabel labelBairro;
	private InputLabel labelNumero;
	private InputLabel labelLogradouro;
	private InputLabel labelComplemento;
	
	private InputTextField textFieldCEP;
	private InputTextField textFieldEstado;
	private InputTextField textFieldCidade;
	private InputTextField textFieldBairro;
	private InputTextField textFieldNumero;
	private InputTextField textFieldLogradouro;
	private InputTextField textFieldComplemento;
	
	private Button buttonCadastrar;
	private Button buttonLimpar;
	
	public PanelCadastrarPaciente() {
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(233)
							.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 333, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(getLabelTitlePaciente(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(getPanelPaciente(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(getLabelTitleEndereco(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(getPanelEndereco(), GroupLayout.PREFERRED_SIZE, 760, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)
							.addGap(549)
							.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 110, GroupLayout.PREFERRED_SIZE)))
					.addGap(358))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
					.addGap(15)
					.addComponent(getLabelTitlePaciente(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(getPanelPaciente(), GroupLayout.PREFERRED_SIZE, 255, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getLabelTitleEndereco(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
					.addGap(5)
					.addComponent(getPanelEndereco(), GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(getButtonLimpar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrar(), GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE))
					.addGap(30))
		);
		setLayout(groupLayout);
	}
	
	/* ------------------------------------------------------------- Acesso aos Panels ------------------------------------------------------------ */
	public JPanel getPanelPaciente() {
		if (panelPaciente == null) {
			panelPaciente = new JPanel();
			panelPaciente.setBorder(new LineBorder(null));
			panelPaciente.setBackground(Thema.BACKGROUND);
			panelPaciente.setLayout(null);
			
			panelPaciente.add(getLabelNome());
			panelPaciente.add(getLabelDataNascimento());
			panelPaciente.add(getLabelTelefone());
			panelPaciente.add(getLabelTipoSanguineo());
			panelPaciente.add(getLabelHistoricoMedico());
			panelPaciente.add(getLabelCovenio());
			panelPaciente.add(getLabelPeso());
			panelPaciente.add(getLabelAltura());
			
			panelPaciente.add(getTextFieldNome());
			panelPaciente.add(getTextFieldDataNascimento());
			panelPaciente.add(getTextFieldTelefone());
			panelPaciente.add(getComboBoxTipoSanguineo());
			panelPaciente.add(getTextAreaHistoricoMedico());
			panelPaciente.add(getTextFieldPeso());
			panelPaciente.add(getTextFieldAltura());
			panelPaciente.add(getComboBoxCovenio());
		}
		return panelPaciente;
	}
	
	public JPanel getPanelEndereco() {
		if (panelEndereco == null) {
			panelEndereco = new JPanel();
			panelEndereco.setBorder(new LineBorder(null));
			panelEndereco.setBackground(Thema.BACKGROUND);
			panelEndereco.setLayout(null);
			panelEndereco.add(getLabelCEP());
			panelEndereco.add(getTextFieldCEP());
			panelEndereco.add(getTextFieldEstado());
			panelEndereco.add(getLabelEstado());
			panelEndereco.add(getTextFieldCidade());
			panelEndereco.add(getTextFieldBairro());
			panelEndereco.add(getTextFieldNumero());
			panelEndereco.add(getLabelCidade());
			panelEndereco.add(getLabelBairro());
			panelEndereco.add(getLabelNumero());
			panelEndereco.add(getLabelLogradouro());
			panelEndereco.add(getTextFieldLogradouro());
			panelEndereco.add(getLabelComplemento());
			panelEndereco.add(getTextFieldComplemento());
		}
		return panelEndereco;
	}
	
	/* ------------------------------------------------------------- Acesso aos Labels ------------------------------------------------------------ */
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Cadastrar Paciente");
		}
		return labelTitlePanel;
	}
	
	public TitlePanel getLabelTitlePaciente() {
		if(labelTitlePessoais == null) {
			labelTitlePessoais = new TitlePanel("Dados Pessoais");
			labelTitlePessoais.setFont(Thema.FONT_SUB_TITLE);
		}
		return labelTitlePessoais;
	}
	
	public TitlePanel getLabelTitleEndereco() {
		if(labelTitleEndereco == null) {
			labelTitleEndereco = new TitlePanel("Dados de Endereço");
			labelTitleEndereco.setFont(Thema.FONT_SUB_TITLE);
		}
		return labelTitleEndereco;
	}
	
	public InputLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new InputLabel("Nome Completo");
			labelNome.setBounds(10, 11, 565, 20);
		}
		return labelNome;
	}
	
	public InputLabel getLabelDataNascimento() {
	    if (labelDataNascimento == null) {
	        labelDataNascimento = new InputLabel("Data de Nascimento");
	        labelDataNascimento.setBounds(590, 11, 160, 20);
	    }
	    return labelDataNascimento;
	}

	public InputLabel getLabelTelefone() {
	    if (labelTelefone == null) {
	        labelTelefone = new InputLabel("Telefone");
	        labelTelefone.setBounds(345, 71, 140, 20);
	    }
	    return labelTelefone;
	}

	public InputLabel getLabelTipoSanguineo() {
	    if (labelTipoSanguineo == null) {
	        labelTipoSanguineo = new InputLabel("Tipo Sanguíneo");
	        labelTipoSanguineo.setBounds(220, 71, 110, 20);
	    }
	    return labelTipoSanguineo;
	}

	public InputLabel getLabelHistoricoMedico() {
	    if (labelHistoricoMedico == null) {
	        labelHistoricoMedico = new InputLabel("Histórico Médico");
	        labelHistoricoMedico.setBounds(10, 131, 740, 20);
	    }
	    return labelHistoricoMedico;
	}

	public InputLabel getLabelCovenio() {
	    if (labelCovenio == null) {
	        labelCovenio = new InputLabel("Convênio");
	        labelCovenio.setBounds(500, 71, 250, 20);
	    }
	    return labelCovenio;
	}

	public InputLabel getLabelPeso() {
	    if (labelPeso == null) {
	        labelPeso = new InputLabel("Peso");
	        labelPeso.setBounds(10, 71, 100, 20);
	    }
	    return labelPeso;
	}

	public InputLabel getLabelAltura() {
	    if (labelAltura == null) {
	        labelAltura = new InputLabel("Altura");
	        labelAltura.setBounds(115, 71, 90, 20);
	    }
	    return labelAltura;
	}
	
	public InputLabel getLabelCEP() {
		if (labelCEP == null) {
			labelCEP = new InputLabel("CEP:");
			labelCEP.setBounds(10, 12, 150, 20);
		}
		return labelCEP;
	}

	public InputLabel getLabelLogradouro() {
		if (labelLogradouro == null) {
			labelLogradouro = new InputLabel("Logradouro:");
			labelLogradouro.setBounds(11, 73, 365, 20);
		}
		return labelLogradouro;
	}

	public InputLabel getLabelNumero() {
		if (labelNumero == null) {
			labelNumero = new InputLabel("Num:");
			labelNumero.setBounds(670, 12, 80, 20);
		}
		return labelNumero;
	}
	
	public InputLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new InputLabel("Estado:");
			labelEstado.setBounds(175, 12, 150, 20);
		}
		return labelEstado;
	}
	
	public InputLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new InputLabel("Cidade:");
			labelCidade.setBounds(340, 12, 150, 20);
		}
		return labelCidade;
	}
	
	public InputLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new InputLabel("Bairro:");
			labelBairro.setBounds(505, 12, 150, 20);
		}
		return labelBairro;
	}
	
	public InputLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new InputLabel("Complemento:");
			labelComplemento.setBounds(390, 72, 360, 20);
		}
		return labelComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos imputs ------------------------------------------------------------ */
	public InputTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new InputTextField();
			textFieldNome.setBounds(10, 36, 565, 25);
		}
		return textFieldNome;
	}
	
	public InputTextField getTextFieldDataNascimento() {
	    if (textFieldDataNascimento == null) {
	        textFieldDataNascimento = new InputTextField();
	        textFieldDataNascimento.setBounds(590, 36, 160, 25);
	    }
	    return textFieldDataNascimento;
	}

	public InputTextField getTextFieldTelefone() {
	    if (textFieldTelefone == null) {
	        textFieldTelefone = new InputTextField();
	        textFieldTelefone.setBounds(345, 95, 140, 25);
	    }
	    return textFieldTelefone;
	}

	public InputTextArea getTextAreaHistoricoMedico() {
	    if (textAreaHistoricoMedico == null) {
	        textAreaHistoricoMedico = new InputTextArea();
	        textAreaHistoricoMedico.setBounds(10, 156, 740, 75);
	    }
	    return textAreaHistoricoMedico;
	}

	public InputTextField getTextFieldPeso() {
	    if (textFieldPeso == null) {
	        textFieldPeso = new InputTextField();
	        textFieldPeso.setBounds(10, 95, 90, 25);
	    }
	    return textFieldPeso;
	}

	public InputTextField getTextFieldAltura() {
	    if (textFieldAltura == null) {
	        textFieldAltura = new InputTextField();
	        textFieldAltura.setBounds(115, 95, 90, 25);
	    }
	    return textFieldAltura;
	}

	public InputComboBox getComboBoxCovenio() {
	    if (comboBoxCovenio == null) {
	        comboBoxCovenio = new InputComboBox();
	        comboBoxCovenio.setBounds(500, 95, 250, 25);
	        
	        comboBoxCovenio.addItem("TIPO DO CONVÊNIO");
	        
	        comboBoxCovenio.setSelectedIndex(-1);
	    }
	    return comboBoxCovenio;
	}

	public InputComboBox getComboBoxTipoSanguineo() {
	    if (comboBoxTipoSanguineo == null) {
	    	comboBoxTipoSanguineo = new InputComboBox();
	    	comboBoxTipoSanguineo.setBounds(220, 96, 110, 25);
	    	
	    	comboBoxTipoSanguineo.addItem("A+");
	    	comboBoxTipoSanguineo.addItem("A-");
	    	comboBoxTipoSanguineo.addItem("B+");
	    	comboBoxTipoSanguineo.addItem("B-");
	    	comboBoxTipoSanguineo.addItem("AB+");
	    	comboBoxTipoSanguineo.addItem("AB-");
	    	comboBoxTipoSanguineo.addItem("O+");
	    	comboBoxTipoSanguineo.addItem("O-");
	    	
	    	comboBoxTipoSanguineo.setSelectedIndex(-1);
	    }
	    return comboBoxTipoSanguineo;
	}
	
	public InputTextField getTextFieldCEP() {
		if (textFieldCEP == null) {
			textFieldCEP = new InputTextField();
			textFieldCEP.setBounds(10, 37, 150, 25);
		}
		return textFieldCEP;
	}
	
	public InputTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new InputTextField();
			textFieldLogradouro.setBounds(11, 98, 365, 25);
		}
		return textFieldLogradouro;
	}
	
	public InputTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new InputTextField();
			textFieldNumero.setBounds(670, 37, 80, 25);
		}
		return textFieldNumero;
	}
	
	public InputTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new InputTextField();
			textFieldEstado.setBounds(175, 37, 150, 25);
		}
		return textFieldEstado;
	}
	
	public InputTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new InputTextField();
			textFieldCidade.setBounds(340, 37, 150, 25);
		}
		return textFieldCidade;
	}
	
	public InputTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new InputTextField();
			textFieldBairro.setBounds(505, 37, 150, 25);
		}
		return textFieldBairro;
	}
	
	public InputTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new InputTextField();
			textFieldComplemento.setBounds(390, 98, 360, 25);
		}
		return textFieldComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
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
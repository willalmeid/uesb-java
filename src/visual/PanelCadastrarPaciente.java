package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanelCadastrarPaciente extends JPanel{

	private JLabel labelTitlePanel;
	private JLabel labelTitlePessoais;
	private JLabel labelTitleEndereco;
	
	private JPanel panelPaciente;
	private JPanel panelEndereco;
	
	private JLabel labelNome;
	private JLabel labelDataNascimento;
	private JLabel labelTelefone;
	private JLabel labelTipoSanguineo;
	private JLabel labelHistoricoMedico;
	private JLabel labelCovenio;
	private JLabel labelPeso;
	private JLabel labelAltura;
	
	private JTextField textFieldNome;
	private JTextField textFieldDataNascimento;
	private JTextField textFieldTelefone;
	private JTextField textFieldHistoricoMedico;
	private JTextField textFieldPeso;
	private JTextField textFieldAltura;
	
	private JComboBox<String> comboBoxCovenio;
	private JComboBox<String> comboBoxTipoSanguineo;
	
	// Endereço
	private JLabel labelCEP;
	private JLabel labelEstado;
	private JLabel labelCidade;
	private JLabel labelBairro;
	private JLabel labelNumero;
	private JLabel labelLogradouro;
	private JLabel labelComplemento;
	
	private JTextField textFieldCEP;
	private JTextField textFieldEstado;
	private JTextField textFieldCidade;
	private JTextField textFieldBairro;
	private JTextField textFieldNumero;
	private JTextField textFieldLogradouro;
	private JTextField textFieldComplemento;
	
	private JButton buttonCadastrar;
	private JButton buttonLimpar;
	
	public PanelCadastrarPaciente() {
		setBackground(new Color(0, 255, 128));
		setSize(1280, 750);
		setLayout(null);
		add(getLabelTitlePanel());
		add(getLabelTitlePaciente());
		add(getLabelTitleEndereco());
		add(getPanelPaciente());
		add(getPanelEndereco());
		add(getButtonCadastrar());
		add(getButtonLimpar());
	}
	
	/* ------------------------------------------------------------- Acesso aos Panels ------------------------------------------------------------ */
	public JPanel getPanelPaciente() {
		if (panelPaciente == null) {
			panelPaciente = new JPanel();
			panelPaciente.setBackground(new Color(128, 255, 128));
			panelPaciente.setBounds(30, 135, 1220, 251);
			panelPaciente.setLayout(null);
			
			panelPaciente.add(getLabelDataNascimento());
			panelPaciente.add(getLabelTelefone());
			panelPaciente.add(getLabelTipoSanguineo());
			panelPaciente.add(getLabelHistoricoMedico());
			panelPaciente.add(getLabelCovenio());
			panelPaciente.add(getLabelPeso());
			panelPaciente.add(getLabelAltura());
			
			panelPaciente.add(getTextFieldDataNascimento());
			panelPaciente.add(getTextFieldTelefone());
			panelPaciente.add(getComboBoxTipoSanguineo());
			panelPaciente.add(getTextFieldHistoricoMedico());
			panelPaciente.add(getTextFieldPeso());
			panelPaciente.add(getTextFieldAltura());
			panelPaciente.add(getComboBoxCovenio());
		}
		return panelPaciente;
	}
	
	public JPanel getPanelEndereco() {
		if (panelEndereco == null) {
			panelEndereco = new JPanel();
			panelEndereco.setBackground(new Color(128, 255, 128));
			panelEndereco.setBounds(30, 434, 1220, 186);
			panelEndereco.setLayout(null);
			
			panelEndereco.add(getLabelCEP());
			panelEndereco.add(getLabelEstado());
			panelEndereco.add(getLabelCidade());
			panelEndereco.add(getLabelBairro());
			panelEndereco.add(getLabelNumero());
			panelEndereco.add(getLabelLogradouro());
			panelEndereco.add(getLabelComplemento());

			panelEndereco.add(getTextFieldCEP());
			panelEndereco.add(getTextFieldEstado());
			panelEndereco.add(getTextFieldCidade());
			panelEndereco.add(getTextFieldBairro());
			panelEndereco.add(getTextFieldNumero());
			panelEndereco.add(getTextFieldLogradouro());
			panelEndereco.add(getTextFieldComplemento());
		}
		return panelEndereco;
	}
	
	/* ------------------------------------------------------------- Acesso aos Labels ------------------------------------------------------------ */
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Tela de Cadastro de Consultas");
			labelTitlePanel.setBounds(397, 30, 485, 76);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelTitlePaciente() {
		if(labelTitlePessoais == null) {
			labelTitlePessoais = new JLabel();
			labelTitlePessoais.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelTitlePessoais.setText("Dados Pessoais");
			labelTitlePessoais.setBounds(30, 99, 485, 35);
		}
		return labelTitlePessoais;
	}
	
	public JLabel getLabelTitleEndereco() {
		if(labelTitleEndereco == null) {
			labelTitleEndereco = new JLabel();
			labelTitleEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelTitleEndereco.setText("Dados de Endereço");
			labelTitleEndereco.setBounds(30, 388, 485, 35);
		}
		return labelTitleEndereco;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setBounds(413, 421, 48, 17);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelDataNascimento() {
	    if (labelDataNascimento == null) {
	        labelDataNascimento = new JLabel();
	        labelDataNascimento.setBounds(420, 187, 48, 17);
	        labelDataNascimento.setText("Data de Nascimento");
	    }
	    return labelDataNascimento;
	}

	public JLabel getLabelTelefone() {
	    if (labelTelefone == null) {
	        labelTelefone = new JLabel();
	        labelTelefone.setBounds(549, 187, 48, 17);
	        labelTelefone.setText("Telefone");
	    }
	    return labelTelefone;
	}

	public JLabel getLabelTipoSanguineo() {
	    if (labelTipoSanguineo == null) {
	        labelTipoSanguineo = new JLabel();
	        labelTipoSanguineo.setBounds(656, 191, 48, 17);
	        labelTipoSanguineo.setText("Tipo Sanguíneo");
	    }
	    return labelTipoSanguineo;
	}

	public JLabel getLabelHistoricoMedico() {
	    if (labelHistoricoMedico == null) {
	        labelHistoricoMedico = new JLabel();
	        labelHistoricoMedico.setBounds(731, 168, 48, 17);
	        labelHistoricoMedico.setText("Histórico Médico");
	    }
	    return labelHistoricoMedico;
	}

	public JLabel getLabelCovenio() {
	    if (labelCovenio == null) {
	        labelCovenio = new JLabel();
	        labelCovenio.setBounds(1070, 187, 48, 17);
	        labelCovenio.setText("Convênio");
	    }
	    return labelCovenio;
	}

	public JLabel getLabelPeso() {
	    if (labelPeso == null) {
	        labelPeso = new JLabel();
	        labelPeso.setBounds(928, 187, 48, 17);
	        labelPeso.setText("Peso");
	    }
	    return labelPeso;
	}

	public JLabel getLabelAltura() {
	    if (labelAltura == null) {
	        labelAltura = new JLabel();
	        labelAltura.setBounds(1001, 187, 48, 17);
	        labelAltura.setText("Altura");
	    }
	    return labelAltura;
	}
	
	public JLabel getLabelCEP() {
		if (labelCEP == null) {
			labelCEP = new JLabel("CEP:");
			labelCEP.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCEP.setBounds(20, 25, 46, 30);
		}
		return labelCEP;
	}

	public JLabel getLabelLogradouro() {
		if (labelLogradouro == null) {
			labelLogradouro = new JLabel("Logradouro:");
			labelLogradouro.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelLogradouro.setBounds(20, 67, 87, 30);
		}
		return labelLogradouro;
	}

	public JLabel getLabelNumero() {
		if (labelNumero == null) {
			labelNumero = new JLabel("Num:");
			labelNumero.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelNumero.setBounds(938, 25, 41, 30);
		}
		return labelNumero;
	}
	
	public JLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new JLabel("Estado:");
			labelEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelEstado.setBounds(236, 25, 64, 30);
		}
		return labelEstado;
	}
	
	public JLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new JLabel("Cidade:");
			labelCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCidade.setBounds(470, 25, 64, 30);
		}
		return labelCidade;
	}
	
	public JLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new JLabel("Bairro:");
			labelBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelBairro.setBounds(704, 25, 64, 30);
		}
		return labelBairro;
	}
	
	public JLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new JLabel("Complemento:");
			labelComplemento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelComplemento.setBounds(544, 67, 102, 30);
		}
		return labelComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos imputs ------------------------------------------------------------ */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(406, 388, 28, 20);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldDataNascimento() {
	    if (textFieldDataNascimento == null) {
	        textFieldDataNascimento = new JTextField();
	        textFieldDataNascimento.setBounds(421, 211, 100, 20);
	        textFieldDataNascimento.setColumns(10);
	    }
	    return textFieldDataNascimento;
	}

	public JTextField getTextFieldTelefone() {
	    if (textFieldTelefone == null) {
	        textFieldTelefone = new JTextField();
	        textFieldTelefone.setBounds(546, 211, 100, 20);
	        textFieldTelefone.setColumns(10);
	    }
	    return textFieldTelefone;
	}

	public JTextField getTextFieldHistoricoMedico() {
	    if (textFieldHistoricoMedico == null) {
	        textFieldHistoricoMedico = new JTextField();
	        textFieldHistoricoMedico.setBounds(716, 191, 200, 60);
	        textFieldHistoricoMedico.setColumns(20);
	    }
	    return textFieldHistoricoMedico;
	}

	public JTextField getTextFieldPeso() {
	    if (textFieldPeso == null) {
	        textFieldPeso = new JTextField();
	        textFieldPeso.setBounds(926, 211, 50, 20);
	        textFieldPeso.setColumns(5);
	    }
	    return textFieldPeso;
	}

	public JTextField getTextFieldAltura() {
	    if (textFieldAltura == null) {
	        textFieldAltura = new JTextField();
	        textFieldAltura.setBounds(1001, 211, 50, 20);
	        textFieldAltura.setColumns(5);
	    }
	    return textFieldAltura;
	}

	public JComboBox getComboBoxCovenio() {
	    if (comboBoxCovenio == null) {
	        comboBoxCovenio = new JComboBox();
	        comboBoxCovenio.setBounds(1070, 211, 150, 20);
	        comboBoxCovenio.addItem("TESTE");
	    }
	    return comboBoxCovenio;
	}

	public JComboBox getComboBoxTipoSanguineo() {
	    if (comboBoxTipoSanguineo == null) {
	    	comboBoxTipoSanguineo = new JComboBox();
	    	comboBoxTipoSanguineo.setBounds(656, 211, 50, 20);
	    	comboBoxTipoSanguineo.addItem("TESTE");
	    }
	    return comboBoxTipoSanguineo;
	}
	
	public JTextField getTextFieldCEP() {
		if (textFieldCEP == null) {
			textFieldCEP = new JTextField();
			textFieldCEP.setColumns(10);
			textFieldCEP.setBounds(76, 25, 150, 30);
		}
		return textFieldCEP;
	}
	
	public JTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setColumns(10);
			textFieldLogradouro.setBounds(117, 67, 417, 30);
		}
		return textFieldLogradouro;
	}
	
	public JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setColumns(10);
			textFieldNumero.setBounds(989, 25, 89, 30);
		}
		return textFieldNumero;
	}
	
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setColumns(10);
			textFieldEstado.setBounds(310, 25, 150, 30);
		}
		return textFieldEstado;
	}
	
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setColumns(10);
			textFieldCidade.setBounds(544, 25, 150, 30);
		}
		return textFieldCidade;
	}
	
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setColumns(10);
			textFieldBairro.setBounds(778, 25, 150, 30);
		}
		return textFieldBairro;
	}
	
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setColumns(10);
			textFieldComplemento.setBounds(656, 67, 422, 30);
		}
		return textFieldComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
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

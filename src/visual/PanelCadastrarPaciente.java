package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
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
	private JTextArea textAreaHistoricoMedico;
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
			panelPaciente.setBounds(140, 118, 1000, 251);
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
			panelEndereco.setBackground(new Color(128, 255, 128));
			panelEndereco.setBounds(140, 439, 1000, 186);
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
			labelTitlePanel.setText("Cadastro de Paciente");
			labelTitlePanel.setBounds(470, 15, 340, 60);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelTitlePaciente() {
		if(labelTitlePessoais == null) {
			labelTitlePessoais = new JLabel();
			labelTitlePessoais.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelTitlePessoais.setText("Dados Pessoais");
			labelTitlePessoais.setBounds(140, 74, 1000, 35);
		}
		return labelTitlePessoais;
	}
	
	public JLabel getLabelTitleEndereco() {
		if(labelTitleEndereco == null) {
			labelTitleEndereco = new JLabel();
			labelTitleEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelTitleEndereco.setText("Dados de Endereço");
			labelTitleEndereco.setBounds(140, 393, 1000, 35);
		}
		return labelTitleEndereco;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNome.setBounds(25, 25, 50, 20);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelDataNascimento() {
	    if (labelDataNascimento == null) {
	        labelDataNascimento = new JLabel();
	        labelDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelDataNascimento.setBounds(296, 62, 130, 20);
	        labelDataNascimento.setText("Data de Nascimento");
	    }
	    return labelDataNascimento;
	}

	public JLabel getLabelTelefone() {
	    if (labelTelefone == null) {
	        labelTelefone = new JLabel();
	        labelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelTelefone.setBounds(25, 62, 60, 20);
	        labelTelefone.setText("Telefone");
	    }
	    return labelTelefone;
	}

	public JLabel getLabelTipoSanguineo() {
	    if (labelTipoSanguineo == null) {
	        labelTipoSanguineo = new JLabel();
	        labelTipoSanguineo.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelTipoSanguineo.setBounds(656, 62, 101, 20);
	        labelTipoSanguineo.setText("Tipo Sanguíneo");
	    }
	    return labelTipoSanguineo;
	}

	public JLabel getLabelHistoricoMedico() {
	    if (labelHistoricoMedico == null) {
	        labelHistoricoMedico = new JLabel();
	        labelHistoricoMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelHistoricoMedico.setBounds(283, 130, 116, 20);
	        labelHistoricoMedico.setText("Histórico Médico");
	    }
	    return labelHistoricoMedico;
	}

	public JLabel getLabelCovenio() {
	    if (labelCovenio == null) {
	        labelCovenio = new JLabel();
	        labelCovenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelCovenio.setBounds(25, 93, 66, 20);
	        labelCovenio.setText("Convênio");
	    }
	    return labelCovenio;
	}

	public JLabel getLabelPeso() {
	    if (labelPeso == null) {
	        labelPeso = new JLabel();
	        labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelPeso.setBounds(25, 124, 41, 20);
	        labelPeso.setText("Peso");
	    }
	    return labelPeso;
	}

	public JLabel getLabelAltura() {
	    if (labelAltura == null) {
	        labelAltura = new JLabel();
	        labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelAltura.setBounds(136, 124, 50, 20);
	        labelAltura.setText("Altura");
	    }
	    return labelAltura;
	}
	
	public JLabel getLabelCEP() {
		if (labelCEP == null) {
			labelCEP = new JLabel("CEP:");
			labelCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelCEP.setBounds(20, 25, 46, 20);
		}
		return labelCEP;
	}

	public JLabel getLabelLogradouro() {
		if (labelLogradouro == null) {
			labelLogradouro = new JLabel("Logradouro:");
			labelLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelLogradouro.setBounds(20, 67, 87, 20);
		}
		return labelLogradouro;
	}

	public JLabel getLabelNumero() {
		if (labelNumero == null) {
			labelNumero = new JLabel("Num:");
			labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNumero.setBounds(388, 125, 41, 20);
		}
		return labelNumero;
	}
	
	public JLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new JLabel("Estado:");
			labelEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelEstado.setBounds(236, 25, 64, 20);
		}
		return labelEstado;
	}
	
	public JLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new JLabel("Cidade:");
			labelCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelCidade.setBounds(470, 25, 64, 20);
		}
		return labelCidade;
	}
	
	public JLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new JLabel("Bairro:");
			labelBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelBairro.setBounds(704, 25, 64, 20);
		}
		return labelBairro;
	}
	
	public JLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new JLabel("Complemento:");
			labelComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelComplemento.setBounds(544, 67, 102, 20);
		}
		return labelComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos imputs ------------------------------------------------------------ */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(87, 25, 807, 25);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldDataNascimento() {
	    if (textFieldDataNascimento == null) {
	        textFieldDataNascimento = new JTextField();
	        textFieldDataNascimento.setBounds(436, 62, 200, 25);
	        textFieldDataNascimento.setColumns(10);
	    }
	    return textFieldDataNascimento;
	}

	public JTextField getTextFieldTelefone() {
	    if (textFieldTelefone == null) {
	        textFieldTelefone = new JTextField();
	        textFieldTelefone.setBounds(87, 62, 200, 25);
	        textFieldTelefone.setColumns(10);
	    }
	    return textFieldTelefone;
	}

	public JTextArea getTextAreaHistoricoMedico() {
	    if (textAreaHistoricoMedico == null) {
	        textAreaHistoricoMedico = new JTextArea();
	        textAreaHistoricoMedico.setBounds(409, 112, 200, 60);
	        textAreaHistoricoMedico.setColumns(20);
	    }
	    return textAreaHistoricoMedico;
	}

	public JTextField getTextFieldPeso() {
	    if (textFieldPeso == null) {
	        textFieldPeso = new JTextField();
	        textFieldPeso.setBounds(66, 124, 60, 25);
	        textFieldPeso.setColumns(5);
	    }
	    return textFieldPeso;
	}

	public JTextField getTextFieldAltura() {
	    if (textFieldAltura == null) {
	        textFieldAltura = new JTextField();
	        textFieldAltura.setBounds(181, 124, 71, 25);
	        textFieldAltura.setColumns(5);
	    }
	    return textFieldAltura;
	}

	public JComboBox getComboBoxCovenio() {
	    if (comboBoxCovenio == null) {
	        comboBoxCovenio = new JComboBox();
	        comboBoxCovenio.setBounds(97, 95, 150, 20);
	        comboBoxCovenio.addItem("TESTE");
	    }
	    return comboBoxCovenio;
	}

	public JComboBox getComboBoxTipoSanguineo() {
	    if (comboBoxTipoSanguineo == null) {
	    	comboBoxTipoSanguineo = new JComboBox();
	    	comboBoxTipoSanguineo.setBounds(767, 64, 80, 20);
	    	comboBoxTipoSanguineo.addItem("TESTE");
	    }
	    return comboBoxTipoSanguineo;
	}
	
	public JTextField getTextFieldCEP() {
		if (textFieldCEP == null) {
			textFieldCEP = new JTextField();
			textFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldCEP.setColumns(10);
			textFieldCEP.setBounds(76, 25, 150, 25);
		}
		return textFieldCEP;
	}
	
	public JTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldLogradouro.setColumns(10);
			textFieldLogradouro.setBounds(117, 67, 417, 25);
		}
		return textFieldLogradouro;
	}
	
	public JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNumero.setColumns(10);
			textFieldNumero.setBounds(439, 125, 89, 25);
		}
		return textFieldNumero;
	}
	
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldEstado.setColumns(10);
			textFieldEstado.setBounds(310, 25, 150, 25);
		}
		return textFieldEstado;
	}
	
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldCidade.setColumns(10);
			textFieldCidade.setBounds(544, 25, 150, 25);
		}
		return textFieldCidade;
	}
	
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldBairro.setColumns(10);
			textFieldBairro.setBounds(778, 25, 150, 25);
		}
		return textFieldBairro;
	}
	
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldComplemento.setColumns(10);
			textFieldComplemento.setBounds(656, 67, 221, 25);
		}
		return textFieldComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1040, 645, 100, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(140, 645, 100, 35);
		}
		return buttonLimpar;
	}
}

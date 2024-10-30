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
			panelPaciente.setBounds(140, 115, 1000, 250);
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
			panelEndereco.setBounds(140, 435, 1000, 140);
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
			labelTitlePessoais.setBounds(140, 75, 1000, 35);
		}
		return labelTitlePessoais;
	}
	
	public JLabel getLabelTitleEndereco() {
		if(labelTitleEndereco == null) {
			labelTitleEndereco = new JLabel();
			labelTitleEndereco.setFont(new Font("Tahoma", Font.PLAIN, 20));
			labelTitleEndereco.setText("Dados de Endereço");
			labelTitleEndereco.setBounds(140, 395, 1000, 35);
		}
		return labelTitleEndereco;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNome.setBounds(100, 15, 800, 20);
			labelNome.setText("Nome Completo");
		}
		return labelNome;
	}
	
	public JLabel getLabelDataNascimento() {
	    if (labelDataNascimento == null) {
	        labelDataNascimento = new JLabel();
	        labelDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelDataNascimento.setBounds(255, 75, 125, 20);
	        labelDataNascimento.setText("Data de Nascimento");
	    }
	    return labelDataNascimento;
	}

	public JLabel getLabelTelefone() {
	    if (labelTelefone == null) {
	        labelTelefone = new JLabel();
	        labelTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelTelefone.setBounds(100, 75, 150, 20);
	        labelTelefone.setText("Telefone");
	    }
	    return labelTelefone;
	}

	public JLabel getLabelTipoSanguineo() {
	    if (labelTipoSanguineo == null) {
	        labelTipoSanguineo = new JLabel();
	        labelTipoSanguineo.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelTipoSanguineo.setBounds(595, 75, 110, 20);
	        labelTipoSanguineo.setText("Tipo Sanguíneo");
	    }
	    return labelTipoSanguineo;
	}

	public JLabel getLabelHistoricoMedico() {
	    if (labelHistoricoMedico == null) {
	        labelHistoricoMedico = new JLabel();
	        labelHistoricoMedico.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelHistoricoMedico.setBounds(100, 135, 800, 20);
	        labelHistoricoMedico.setText("Histórico Médico");
	    }
	    return labelHistoricoMedico;
	}

	public JLabel getLabelCovenio() {
	    if (labelCovenio == null) {
	        labelCovenio = new JLabel();
	        labelCovenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelCovenio.setBounds(740, 75, 160, 20);
	        labelCovenio.setText("Convênio");
	    }
	    return labelCovenio;
	}

	public JLabel getLabelPeso() {
	    if (labelPeso == null) {
	        labelPeso = new JLabel();
	        labelPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelPeso.setBounds(415, 75, 60, 20);
	        labelPeso.setText("Peso");
	    }
	    return labelPeso;
	}

	public JLabel getLabelAltura() {
	    if (labelAltura == null) {
	        labelAltura = new JLabel();
	        labelAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        labelAltura.setBounds(510, 75, 50, 20);
	        labelAltura.setText("Altura");
	    }
	    return labelAltura;
	}
	
	public JLabel getLabelCEP() {
		if (labelCEP == null) {
			labelCEP = new JLabel("CEP:");
			labelCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelCEP.setBounds(100, 15, 150, 20);
		}
		return labelCEP;
	}

	public JLabel getLabelLogradouro() {
		if (labelLogradouro == null) {
			labelLogradouro = new JLabel("Logradouro:");
			labelLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelLogradouro.setBounds(100, 75, 420, 20);
		}
		return labelLogradouro;
	}

	public JLabel getLabelNumero() {
		if (labelNumero == null) {
			labelNumero = new JLabel("Num:");
			labelNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelNumero.setBounds(820, 15, 80, 20);
		}
		return labelNumero;
	}
	
	public JLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new JLabel("Estado:");
			labelEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelEstado.setBounds(280, 15, 150, 20);
		}
		return labelEstado;
	}
	
	public JLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new JLabel("Cidade:");
			labelCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelCidade.setBounds(460, 15, 150, 20);
		}
		return labelCidade;
	}
	
	public JLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new JLabel("Bairro:");
			labelBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelBairro.setBounds(640, 15, 150, 20);
		}
		return labelBairro;
	}
	
	public JLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new JLabel("Complemento:");
			labelComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			labelComplemento.setBounds(550, 75, 102, 20);
		}
		return labelComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos imputs ------------------------------------------------------------ */
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNome.setBounds(100, 40, 800, 25);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldDataNascimento() {
	    if (textFieldDataNascimento == null) {
	        textFieldDataNascimento = new JTextField();
	        textFieldDataNascimento.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        textFieldDataNascimento.setBounds(255, 100, 125, 25);
	        textFieldDataNascimento.setColumns(10);
	    }
	    return textFieldDataNascimento;
	}

	public JTextField getTextFieldTelefone() {
	    if (textFieldTelefone == null) {
	        textFieldTelefone = new JTextField();
	        textFieldTelefone.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        textFieldTelefone.setBounds(100, 100, 120, 25);
	        textFieldTelefone.setColumns(10);
	    }
	    return textFieldTelefone;
	}

	public JTextArea getTextAreaHistoricoMedico() {
	    if (textAreaHistoricoMedico == null) {
	        textAreaHistoricoMedico = new JTextArea();
	        textAreaHistoricoMedico.setBounds(100, 160, 800, 75);
	        textAreaHistoricoMedico.setColumns(20);
	    }
	    return textAreaHistoricoMedico;
	}

	public JTextField getTextFieldPeso() {
	    if (textFieldPeso == null) {
	        textFieldPeso = new JTextField();
	        textFieldPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        textFieldPeso.setBounds(415, 100, 60, 25);
	        textFieldPeso.setColumns(5);
	    }
	    return textFieldPeso;
	}

	public JTextField getTextFieldAltura() {
	    if (textFieldAltura == null) {
	        textFieldAltura = new JTextField();
	        textFieldAltura.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        textFieldAltura.setBounds(510, 100, 50, 25);
	        textFieldAltura.setColumns(5);
	    }
	    return textFieldAltura;
	}

	public JComboBox getComboBoxCovenio() {
	    if (comboBoxCovenio == null) {
	        comboBoxCovenio = new JComboBox();
	        comboBoxCovenio.setFont(new Font("Tahoma", Font.PLAIN, 14));
	        comboBoxCovenio.setBounds(740, 102, 160, 20);
	        comboBoxCovenio.addItem("TESTE");
	    }
	    return comboBoxCovenio;
	}

	public JComboBox getComboBoxTipoSanguineo() {
	    if (comboBoxTipoSanguineo == null) {
	    	comboBoxTipoSanguineo = new JComboBox();
	    	comboBoxTipoSanguineo.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    	comboBoxTipoSanguineo.setBounds(595, 102, 110, 20);
	    	comboBoxTipoSanguineo.addItem("A+");
	    	comboBoxTipoSanguineo.addItem("A-");
	    	comboBoxTipoSanguineo.addItem("B+");
	    	comboBoxTipoSanguineo.addItem("B-");
	    	comboBoxTipoSanguineo.addItem("AB+");
	    	comboBoxTipoSanguineo.addItem("AB-");
	    	comboBoxTipoSanguineo.addItem("O+");
	    	comboBoxTipoSanguineo.addItem("O-");
	    }
	    return comboBoxTipoSanguineo;
	}
	
	public JTextField getTextFieldCEP() {
		if (textFieldCEP == null) {
			textFieldCEP = new JTextField();
			textFieldCEP.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldCEP.setColumns(10);
			textFieldCEP.setBounds(100, 40, 150, 25);
		}
		return textFieldCEP;
	}
	
	public JTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldLogradouro.setColumns(10);
			textFieldLogradouro.setBounds(100, 100, 420, 25);
		}
		return textFieldLogradouro;
	}
	
	public JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNumero.setColumns(10);
			textFieldNumero.setBounds(820, 40, 80, 25);
		}
		return textFieldNumero;
	}
	
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldEstado.setColumns(10);
			textFieldEstado.setBounds(280, 40, 150, 25);
		}
		return textFieldEstado;
	}
	
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldCidade.setColumns(10);
			textFieldCidade.setBounds(460, 40, 150, 25);
		}
		return textFieldCidade;
	}
	
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldBairro.setColumns(10);
			textFieldBairro.setBounds(640, 40, 150, 25);
		}
		return textFieldBairro;
	}
	
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldComplemento.setColumns(10);
			textFieldComplemento.setBounds(550, 100, 350, 25);
		}
		return textFieldComplemento;
	}
	
	/* ------------------------------------------------------------- Acesso aos Buttons ------------------------------------------------------------ */
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1040, 610, 100, 35);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(140, 610, 100, 35);
		}
		return buttonLimpar;
	}
}

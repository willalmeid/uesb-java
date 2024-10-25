package visual;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelCadastrarAluno extends JPanel {
	
	//---------------------------------------------- Declaração do Labels ----------------------------------------------
	JLabel labelEndereco;
	JLabel labelTitle;
	JLabel labelNome;
	JLabel labelCpf;
	JLabel labelRg;
	JLabel labelDataNascimento;
	JLabel labelEmail;
	JLabel labelTitulo;
	JLabel labelReservista;
	JLabel labelTelefone;
	JLabel labelComprovanteEleitoral;
	JLabel labelAntecedentes;
	JLabel labelCurso;
	JLabel labelMatricula;
	JLabel labelAnoEntrada;
	JLabel labelCampus;
	JLabel labelLogradouro;
	JLabel labelNumero;
	JLabel labelComplemento;
	JLabel labelBairro;
	JLabel labelCep;
	JLabel labelCidade;
	JLabel labelEstado;

	// ---------------------------------------------- Declaração dos TextField ----------------------------------------------
	JTextField textFieldNome;
	JTextField textFieldCpf;
	JTextField textFieldRg;
	JTextField textFieldDataNascimento;	
	JTextField textFieldEmail;
	JTextField textFieldTitulo;
	JTextField textFieldReservista;
	JTextField textFieldTelefone;	
	JTextField textFieldCurso;
	JTextField textFieldMatricula;
	JTextField textFieldAnoEntrada;
	JTextField textFieldCampus;
	JTextField textFieldLogradouro;
	JTextField textFieldNumero;
	JTextField textFieldComplemento;
	JTextField textFieldBairro;
	JTextField textFieldCep;
	JTextField textFieldCidade;
	JTextField textFieldEstado;
	
	// Mudar depois para booblean
	JTextField textFieldComprovanteEleitoral;
	JTextField textFieldAntecedentes;
	
	//------------------------------------------ Declarações dos Botoes ------------------------------------------
	JButton buttonCadastrar;
	JButton buttonLimpar;
	
	public PanelCadastrarAluno() {
		
		this.setLayout(null);
		this.setSize(1280, 768);
		
		
		//------------------------------------------------ Labels ------------------------------------------------
		this.add(getLabelTitle());
		this.add(getLabelEndereco());
		this.add(getLabelNome());
		this.add(getLabelCpf());
		this.add(getLabelRg());
		this.add(getLabelDataNascimento());
		this.add(getLabelEmail());
		this.add(getLabelTitulo());
		this.add(getLabelReservista());
		this.add(getLabelTelefone());
		this.add(getLabelComprovanteEleitoral());
		this.add(getLabelAntecedentes());
		this.add(getLabelCurso());
		this.add(getLabelMatricula());
		this.add(getLabelAnoEntrada());
		this.add(getLabelCampus());
		this.add(getLabelLogradouro());
		this.add(getLabelComplemento());
		this.add(getLabelBairro());
		this.add(getLabelCep());
		this.add(getLabelCidade());
		this.add(getLabelEstado());

		
		//---------------------------------------------- Text Field ----------------------------------------------
		this.add(getTextFieldNome());
		this.add(getTextFieldCpf());
		this.add(getTextFieldRg());
		this.add(getTextFieldDataNascimento());
		this.add(getTextFieldEmail());
		this.add(getTextFieldTitulo());
		this.add(getTextFieldReservista());		
		this.add(getTextFieldTelefone());
		this.add(getTextFieldComprovanteEleitoral());
		this.add(getTextFieldAntecedentes());
		this.add(getTextFieldCurso());
		this.add(getTextFieldMatricula());
		this.add(getTextFieldAnoEntrada());
		this.add(getTextFieldCampus());
		this.add(getTextFieldLogradouro());
		this.add(getTextFieldComplemento());
		this.add(getTextFieldBairro());
		this.add(getTextFieldCep());
		this.add(getTextFieldCidade());
		this.add(getTextFieldEstado());		
		
		//---------------------------------------------- Buttons ----------------------------------------------
		this.add(getButtonCadastrar());
		this.add(getButtonLimpar());
	}
	
	
	//---------------------------------------------- Metodos de Acesso ----------------------------------------------
	public JLabel getLabelTitle() {
		if(labelTitle == null) {
			labelTitle = new JLabel();
			labelTitle.setBounds(500, 30, 285, 40);
			labelTitle.setText("Cadastro Aluno");
			labelTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		}
		return labelTitle;
	}
	
	public JLabel getLabelEndereco() {
		if (labelEndereco == null) {
			labelEndereco = new JLabel();
			labelEndereco.setText("Endereço");
			labelEndereco.setFont(new Font("Tahoma", Font.BOLD, 22));
			labelEndereco.setBounds(152, 404, 150, 15);
		}
		return labelEndereco;
	}
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setFont(new Font("Tahoma", Font.BOLD, 16));
			labelNome.setBounds(152, 95, 150, 27);
			labelNome.setText("Nome: ");
		}
		return labelNome;
	}
	
	public JTextField getTextFieldNome() {
		if(textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldNome.setBounds(152, 126, 1023, 30);
		}
		return textFieldNome;
	}
	
	
	public JLabel getLabelCpf() {
		if(labelCpf == null) {
			labelCpf = new JLabel();
			labelCpf.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCpf.setBounds(152, 167, 150, 15);
			labelCpf.setText("CPF: ");
		}
		return labelCpf;
	}
	
	public JTextField getTextFieldCpf() {
		if(textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setBounds(152, 193, 206, 30);
		}
		return textFieldCpf;
	}
	
	
	public JLabel getLabelRg() {
		if(labelRg == null) {
			labelRg = new JLabel();
			labelRg.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelRg.setBounds(370, 167, 150, 15);
			labelRg.setText("RG: ");
		}
		return labelRg;
	}
	
	public JTextField getTextFieldRg() {
		if(textFieldRg == null) {
			textFieldRg = new JTextField();
			textFieldRg.setBounds(370, 193,194, 30);
		}
		return textFieldRg;
	}
	
	public JLabel getLabelDataNascimento() {
		if (labelDataNascimento == null) {
			labelDataNascimento = new JLabel();
			labelDataNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelDataNascimento.setText("Data Nascimento: ");
			labelDataNascimento.setBounds(152, 234, 150, 15);
		}
		return labelDataNascimento;
	}
	
	public JTextField getTextFieldDataNascimento() {
		if (textFieldDataNascimento == null) {
			textFieldDataNascimento = new JTextField();
			textFieldDataNascimento.setBounds(152, 260, 206, 30);
		}
		return textFieldDataNascimento;
	}
	
	public JLabel getLabelEmail() {
		if (labelEmail == null) {
			labelEmail = new JLabel();
			labelEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelEmail.setText("E-mail");
			labelEmail.setBounds(370, 234, 377, 15);
		}
		return labelEmail;
	}
	
	public JTextField getTextFieldEmail() {
		if (textFieldEmail == null) {
			textFieldEmail = new JTextField();
			textFieldEmail.setBounds(370, 260, 377, 30);
		}
		return textFieldEmail;
	}
	
	public JLabel getLabelTitulo() {
		if (labelTitulo == null) {
			labelTitulo = new JLabel();
			labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelTitulo.setText("Titulo:");
			labelTitulo.setBounds(152, 301, 150, 15);
		}
		return labelTitulo;
	}
	
	public JTextField getTextFieldTitulo() {
		if (textFieldTitulo == null) {
			textFieldTitulo = new JTextField();
			textFieldTitulo.setBounds(152, 321, 324, 30);
		}
		return textFieldTitulo;
	}
	
	public JLabel getLabelReservista() {
		if (labelReservista == null) {
			labelReservista = new JLabel();
			labelReservista.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelReservista.setText("Reservista:");
			labelReservista.setBounds(486, 301, 150, 15);
		}
		return labelReservista;
	}
	
	public JTextField getTextFieldReservista() {
		if (textFieldReservista == null) {
			textFieldReservista = new JTextField();
			textFieldReservista.setBounds(486, 320, 261, 30);
		}
		return textFieldReservista;
	}
	
	public JLabel getLabelTelefone() {
		if (labelTelefone == null) {
			labelTelefone = new JLabel();
			labelTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelTelefone.setText("Titulo: ");
			labelTelefone.setBounds(574, 169, 150, 15);
		}
		return labelTelefone;
	}
	
	public JTextField getTextFieldTelefone() {
		if (textFieldTelefone == null) {
			textFieldTelefone = new JTextField();
			textFieldTelefone.setBounds(574, 193, 173, 30);
		}
		return textFieldTelefone;
	}
	
	public JLabel getLabelComprovanteEleitoral() {
		if (labelComprovanteEleitoral == null) {
			labelComprovanteEleitoral = new JLabel();
			labelComprovanteEleitoral.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelComprovanteEleitoral.setText("Comprovante Eleitoral: ");
			labelComprovanteEleitoral.setBounds(761, 301, 206, 15);
		}
		return labelComprovanteEleitoral;
	}
	
	public JTextField getTextFieldComprovanteEleitoral() {
		if (textFieldComprovanteEleitoral == null) {
			textFieldComprovanteEleitoral = new JTextField();
			textFieldComprovanteEleitoral.setBounds(761, 319, 206, 30);
		}
		return textFieldComprovanteEleitoral;
	}
	
	public JLabel getLabelAntecedentes() {
		if (labelAntecedentes == null) {
			labelAntecedentes = new JLabel();
			labelAntecedentes.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelAntecedentes.setText("Antecedentes: ");
			labelAntecedentes.setBounds(977, 301, 198, 15);
		}
		return labelAntecedentes;
	}
	
	public JTextField getTextFieldAntecedentes() {
		if (textFieldAntecedentes == null) {
			textFieldAntecedentes = new JTextField();
			textFieldAntecedentes.setBounds(977, 319, 198, 30);
		}
		return textFieldAntecedentes;
	}
	
	public JLabel getLabelCurso() {
		if (labelCurso == null) {
			labelCurso = new JLabel();
			labelCurso.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCurso.setText("Curso: ");
			labelCurso.setBounds(761, 168, 150, 15);
		}
		return labelCurso;
	}	
	
	public JTextField getTextFieldCurso() {
		if (textFieldCurso == null) {
			textFieldCurso = new JTextField();
			textFieldCurso.setBounds(761, 191, 205, 30);
		}
		return textFieldCurso;
	}
	
	public JLabel getLabelMatricula() {
		if (labelMatricula == null) {
			labelMatricula = new JLabel();
			labelMatricula.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelMatricula.setText("Matricula: ");
			labelMatricula.setBounds(976, 167, 150, 15);
		}
		return labelMatricula;
	}
	
	public JTextField getTextFieldMatricula() {
		if (textFieldMatricula == null) {
			textFieldMatricula = new JTextField();
			textFieldMatricula.setBounds(976, 191, 199, 30);
		}
		return textFieldMatricula;
	}
	
	public JLabel getLabelAnoEntrada() {
		if (labelAnoEntrada == null) {
			labelAnoEntrada = new JLabel();
			labelAnoEntrada.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelAnoEntrada.setText("Ano Entrada: ");
			labelAnoEntrada.setBounds(761, 232, 205, 15);
		}
		return labelAnoEntrada;
	}
	
	public JTextField getTextFieldAnoEntrada() {
		if (textFieldAnoEntrada == null) {
			textFieldAnoEntrada = new JTextField();
			textFieldAnoEntrada.setBounds(761, 258, 205, 30);
		}
		return textFieldAnoEntrada;
	}
	
	public JLabel getLabelCampus() {
		if (labelCampus == null) {
			labelCampus = new JLabel();
			labelCampus.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCampus.setText("Campus: ");
			labelCampus.setBounds(976, 232, 150, 15);
		}
		return labelCampus;
	}
	
	public JTextField getTextFieldCampus() {
		if (textFieldCampus == null) {
			textFieldCampus = new JTextField();
			textFieldCampus.setBounds(976, 258, 199, 30);
		}
		return textFieldCampus;
	}
	
	public JLabel getLabelLogradouro() {
		if (labelLogradouro == null) {
			labelLogradouro = new JLabel();
			labelLogradouro.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelLogradouro.setText("Logradouro: ");
			labelLogradouro.setBounds(152, 440, 150, 15);
		}
		return labelLogradouro;
	}
	
	public JTextField getTextFieldLogradouro() {
		if (textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setBounds(152, 459, 595, 30);
		}
		return textFieldLogradouro;
	}
	
	public JLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new JLabel();
			labelComplemento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelComplemento.setText("Complemento: ");
			labelComplemento.setBounds(761, 440, 324, 15);
		}
		return labelComplemento;
	}
	
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setBounds(761, 459, 428, 30);
		}
		return textFieldComplemento;
	}
	
	public JLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new JLabel();
			labelBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelBairro.setText("Bairro: ");
			labelBairro.setBounds(152, 500, 261, 15);
		}
		return labelBairro;
	}
	
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setBounds(152, 519, 363, 30);
		}
		return textFieldBairro;
	}
	
	public JLabel getLabelCep() {
		if (labelCep == null) {
			labelCep = new JLabel();
			labelCep.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCep.setText("Cep: ");
			labelCep.setBounds(525, 500, 150, 15);
		}
		return labelCep;
	}
	
	public JTextField getTextFieldCep() {
		if (textFieldCep == null) {
			textFieldCep = new JTextField();
			textFieldCep.setBounds(525, 519, 222, 30);
		}
		return textFieldCep;
	}
	
	public JLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new JLabel();
			labelCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCidade.setText("Cidade: ");
			labelCidade.setBounds(761, 500, 150, 15);
		}
		return labelCidade;
	}
	
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
			textFieldCidade.setBounds(761, 519, 222, 30);
		}
		return textFieldCidade;
	}

	public JLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new JLabel();
			labelEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelEstado.setText("Estado: ");
			labelEstado.setBounds(990, 500, 199, 15);
		}
		return labelEstado;
	}
	
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setBounds(990, 520, 199, 30);
		}
		return textFieldEstado;
	}
	
	public JButton getButtonCadastrar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new JButton("Cadastrar");
			buttonCadastrar.setBounds(1100, 607, 89, 38);
		}
		return buttonCadastrar;
	}
	
	public JButton getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new JButton("Limpar");
			buttonLimpar.setBounds(986, 607, 89, 38);
		}
		return buttonLimpar;
	}
}

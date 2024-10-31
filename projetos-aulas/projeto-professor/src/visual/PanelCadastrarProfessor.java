package visual;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.border.LineBorder;

import java.awt.Button;

public class PanelCadastrarProfessor extends JPanel{
	private JPanel panelInformacoesPessoais;
	private JPanel panelEndereco;
	private JPanel panelInformacoesProfissionais;
	
	private JLabel TitleInformacoesPessoais;
	private JLabel labelTitleEndereco;
	private JLabel labelInformacoesProficionais;

	private JLabel labelNome;
	private JLabel labelCadastroProfessor;
	private JLabel labelRG;
	private JLabel labelCPF;
	private JLabel labelDataNascimento;
	private JLabel labelReservista;
	private JLabel labelEmail;
	private JLabel labelTelefone;
	private JLabel labelTitulo;
	private JLabel labelComprovanteEleitoral;
	private JLabel labelAntecedentes;
	private JLabel labelTitulacao;
	private JLabel labelArea;
	private JLabel labelClasse;
	private JLabel labelDepartamento;
	private JLabel labelRegime;
	private JLabel labelCEP;
	private JLabel labelEstado;
	private JLabel labelCidade;
	private JLabel labelBairro;
	private JLabel labelNumero;
	private JLabel labelLogradouro;
	private JLabel labelComplemento;
	
	private JTextField textFieldNome;
	private JTextField textFieldRG;
	private JTextField textFieldCPF;
	private JTextField textFieldDataNascimento;
	private JTextField textFieldReservista;
	private JTextField textFieldEmail;
	private JTextField textFieldTelefone;
	private JTextField textFieldTitulo;
	private JTextField textFieldTitulacao;
	private JTextField textFieldArea;
	private JTextField textFieldClasse;
	private JTextField textFieldCEP;
	private JTextField textFieldEstado;
	private JTextField textFieldCidade;
	private JTextField textFieldBairro;
	private JTextField textFieldNumero;
	private JTextField textFieldLogradouro;
	private JTextField textFieldComplemento;

	private Choice choiceComprovanteEleitoral;
	private Choice choiceAntecedentes;
	private Choice choiceDepartamento;
	private Choice choiceRegime;

	private Button buttonLimpar;
	private Button buttonEnviar;
	private Button buttonMensagem;
	
	//-------------------------------------------------------- Painel Principal -------------------------------------------------------
	public PanelCadastrarProfessor() {
		setBackground(new Color(185, 220, 255));
		this.setSize(1280, 768);
		setLayout(null);
		
		add(getLabelCadastroProfessor());
		add(getTitleInformacoesPessoais());
		add(getLabelTitleEndereco());
		add(getLabelInformacoesProficionais());
		
		add(getPanelInformacoesPessoais());
		add(getPanelEndereco());
		add(getPanelInformacoesProfissionais());

		add(getButtonLimpar());
		add(getButtonCadastrar());
	}
	
	//-------------------------------------------------------------------- Titles ------------------------------------------------------------------
	public JLabel getLabelCadastroProfessor() {
		if (labelCadastroProfessor == null) {
			labelCadastroProfessor = new JLabel("Cadastrar Professor");
			labelCadastroProfessor.setFont(new Font("Tahoma", Font.BOLD, 36));
			labelCadastroProfessor.setBounds(470, 45, 400, 33);
		}
		return labelCadastroProfessor;
	}
	
	public JLabel getTitleInformacoesPessoais() {
		if (TitleInformacoesPessoais == null) {
			TitleInformacoesPessoais = new JLabel();
			TitleInformacoesPessoais.setFont(new Font("Tahoma", Font.BOLD, 20));
			TitleInformacoesPessoais.setBounds(96, 76, 1088, 25);
		}
		return TitleInformacoesPessoais;
	}
	
	public JLabel getLabelTitleEndereco() {
		if (labelTitleEndereco == null) {
			labelTitleEndereco = new JLabel();
			labelTitleEndereco.setFont(new Font("Tahoma", Font.BOLD, 20));
			labelTitleEndereco.setBounds(96, 301, 1088, 25);
		}
		return labelTitleEndereco;
	}
	
	public JLabel getLabelInformacoesProficionais() {
		if (labelInformacoesProficionais == null) {
			labelInformacoesProficionais = new JLabel();
			labelInformacoesProficionais.setFont(new Font("Tahoma", Font.BOLD, 20));
			labelInformacoesProficionais.setBounds(96, 465, 1088, 25);
		}
		return labelInformacoesProficionais;
	}
	
	//--------------------------------------------------------------------- Paineis ---------------------------------------------------------------
	public JPanel getPanelInformacoesPessoais() {
		if (panelInformacoesPessoais == null) {
			panelInformacoesPessoais = new JPanel();
			panelInformacoesPessoais.setBackground(new Color(240, 248, 255));
			panelInformacoesPessoais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panelInformacoesPessoais.setBounds(96, 112, 1088, 178);
			panelInformacoesPessoais.setLayout(null);

			//-------------------- Adicionando os Labels ------------------------
			panelInformacoesPessoais.add(getLabelNome());
			panelInformacoesPessoais.add(getLabelEmail());
			panelInformacoesPessoais.add(getLabelRG());
			panelInformacoesPessoais.add(getLabelDataNascimento());
			panelInformacoesPessoais.add(getLabelTelefone());
			panelInformacoesPessoais.add(getLabelCPF());
			panelInformacoesPessoais.add(getLabelReservista());
			panelInformacoesPessoais.add(getLabelTitulo());
			panelInformacoesPessoais.add(getLabelComprovanteEleitoral());
			panelInformacoesPessoais.add(getLabelAntecedentes());
			
			//-------------------- Adicionando os TextField -----------------------
			panelInformacoesPessoais.add(getTextFieldNome());
			panelInformacoesPessoais.add(getTextFieldEmail());
			panelInformacoesPessoais.add(getTextFieldRG());
			panelInformacoesPessoais.add(getTextFieldDataNascimento());
			panelInformacoesPessoais.add(getTextFieldTelefone());
			panelInformacoesPessoais.add(getTextFieldCPF());
			panelInformacoesPessoais.add(getTextFieldReservista());
			panelInformacoesPessoais.add(getTextFieldTitulo());
			
			//-------------------- Adicionando os Choice --------------------------
			panelInformacoesPessoais.add(getChoiceComprovanteEleitoral());
			panelInformacoesPessoais.add(getChoiceAntecedentes());
		}
		return panelInformacoesPessoais;
	}
	
	public JPanel getPanelInformacoesProfissionais() {
		if (panelInformacoesProfissionais == null) {
			panelInformacoesProfissionais = new JPanel();
			panelInformacoesProfissionais.setBackground(new Color(240, 248, 255));
			panelInformacoesProfissionais.setLayout(null);
			panelInformacoesProfissionais.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panelInformacoesProfissionais.setBounds(96, 501, 1088, 106);
			
			
			//------------------------- Adicionando os Labels ----------------------
			panelInformacoesProfissionais.add(getLabelTitulacao());
			panelInformacoesProfissionais.add(getLabelArea());
			panelInformacoesProfissionais.add(getLabelClasse());
			panelInformacoesProfissionais.add(getLabelRegime());
			panelInformacoesProfissionais.add(getLabelDepartamento());
			
			//------------------------- Adicionando os TextField -------------------
			panelInformacoesProfissionais.add(getTextFieldTitulacao());
			panelInformacoesProfissionais.add(getTextFieldArea());
			panelInformacoesProfissionais.add(getTextFieldClasse());
			
			//------------------------- Adicionando os Choice ----------------------
			panelInformacoesProfissionais.add(getChoiceDepartamento());
			panelInformacoesProfissionais.add(getChoiceRegime());
		}
		return panelInformacoesProfissionais;
	}
	
	public JPanel getPanelEndereco() {
		if (panelEndereco == null) {
			panelEndereco = new JPanel();
			panelEndereco.setBackground(new Color(240, 248, 255));
			panelEndereco.setLayout(null);
			panelEndereco.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			panelEndereco.setBounds(96, 336, 1088, 118);

			//------------------------- Adicionando os Labels ----------------------
			panelEndereco.add(getLabelCEP());
			panelEndereco.add(getLabelEstado());
			panelEndereco.add(getLabelCidade());
			panelEndereco.add(getLabelBairro());
			panelEndereco.add(getLabelNumero());
			panelEndereco.add(getLabelLogradouro());
			panelEndereco.add(getLabelComplemento());

			//------------------------- Adicionando os TextField -------------------
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
	
	//--------------------------------------------------------------- Metodos de Acesso -----------------------------------------------------------
	public JLabel getLabelNome() {
		if (labelNome == null) {
			labelNome = new JLabel("Nome: ");
			labelNome.setBounds(20, 25, 50, 30);
			labelNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		}
		return labelNome;
	}
	
	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(80, 25, 615, 30);
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	
	
	public JLabel getLabelRG() {
		if (labelRG == null) {
			labelRG = new JLabel("RG: ");
			labelRG.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelRG.setBounds(20, 61, 50, 30);
		}
		return labelRG;
	}
	
	public JTextField getTextFieldRG() {
		if (textFieldRG == null) {
			textFieldRG = new JTextField();
			textFieldRG.setColumns(10);
			textFieldRG.setBounds(80, 61, 290, 30);
		}
		return textFieldRG;
	}
	
	
	public JLabel getLabelCPF() {
		if (labelCPF == null) {
			labelCPF = new JLabel("CPF: ");
			labelCPF.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCPF.setBounds(20, 97, 50, 30);
		}
		return labelCPF;
	}
	
	public JTextField getTextFieldCPF() {
		if (textFieldCPF == null) {
			textFieldCPF = new JTextField();
			textFieldCPF.setColumns(10);
			textFieldCPF.setBounds(80, 97, 290, 30);
		}
		return textFieldCPF;
	}
	
	
	public JLabel getLabelDataNascimento() {
		if (labelDataNascimento == null) {
			labelDataNascimento = new JLabel("Nascimento:");
			labelDataNascimento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelDataNascimento.setBounds(380, 61, 92, 30);
		}
		return labelDataNascimento;
	}
	
	public JTextField getTextFieldDataNascimento() {
		if (textFieldDataNascimento == null) {
			textFieldDataNascimento = new JTextField();
			textFieldDataNascimento.setColumns(10);
			textFieldDataNascimento.setBounds(475, 61, 220, 30);
		}
		return textFieldDataNascimento;
	}
	
	
	public JLabel getLabelReservista() {
		if (labelReservista == null) {
			labelReservista = new JLabel("Reservista:");
			labelReservista.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelReservista.setBounds(380, 97, 92, 30);
		}
		return labelReservista;
	}
	
	public JTextField getTextFieldReservista() {
		if (textFieldReservista == null) {
			textFieldReservista = new JTextField();
			textFieldReservista.setColumns(10);
			textFieldReservista.setBounds(475, 97, 220, 30);
		}
		return textFieldReservista;
	}
	
	
	public JLabel getLabelEmail() {
		if (labelEmail == null) {
			labelEmail = new JLabel("Email:");
			labelEmail.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelEmail.setBounds(705, 25, 41, 30);
		}
		return labelEmail;
	}
	
	public JTextField getTextFieldEmail() {
		if (textFieldEmail == null) {
			textFieldEmail = new JTextField();
			textFieldEmail.setColumns(10);
			textFieldEmail.setBounds(756, 25, 322, 30);
		}
		return textFieldEmail;
	}
	
	
	public JLabel getLabelTelefone() {
		if (labelTelefone == null) {
			labelTelefone = new JLabel("Tel.:");
			labelTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelTelefone.setBounds(705, 61, 50, 30);
		}
		return labelTelefone;
	}
	
	public JTextField getTextFieldTelefone() {
		if (textFieldTelefone == null) {
			textFieldTelefone = new JTextField();
			textFieldTelefone.setColumns(10);
			textFieldTelefone.setBounds(756, 61, 322, 30);
		}
		return textFieldTelefone;
	}
	
	
	public JLabel getLabelTitulo() {
		if (labelTitulo == null) {
			labelTitulo = new JLabel("Título:");
			labelTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelTitulo.setBounds(705, 97, 85, 30);
		}
		return labelTitulo;
	}
	
	public JTextField getTextFieldTitulo() {
		if (textFieldTitulo == null) {
			textFieldTitulo = new JTextField();
			textFieldTitulo.setColumns(10);
			textFieldTitulo.setBounds(756, 97, 322, 30);
		}
		return textFieldTitulo;
	}
	
	
	public Choice getChoiceComprovanteEleitoral() {
		if (choiceComprovanteEleitoral == null) {
			choiceComprovanteEleitoral = new Choice();
			choiceComprovanteEleitoral.setBounds(397, 138, 116, 30);
			choiceComprovanteEleitoral.add("Não possui");
			choiceComprovanteEleitoral.add("Regular");
			choiceComprovanteEleitoral.add("Suspenso");
			choiceComprovanteEleitoral.add("Cancelado");
		}
		return choiceComprovanteEleitoral;
	}
	
	public JLabel getLabelComprovanteEleitoral() {
		if (labelComprovanteEleitoral == null) {
			labelComprovanteEleitoral = new JLabel("Comp. Eleitoral");
			labelComprovanteEleitoral.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelComprovanteEleitoral.setBounds(280, 133, 111, 30);
		}
		return labelComprovanteEleitoral;
	}
	
	
	public JLabel getLabelAntecedentes() {
		if (labelAntecedentes == null) {
			labelAntecedentes = new JLabel("Antecedentes");
			labelAntecedentes.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelAntecedentes.setBounds(567, 133, 101, 30);
		}
		return labelAntecedentes;
	}
	
	public Choice getChoiceAntecedentes() {
		if (choiceAntecedentes == null) {
			choiceAntecedentes = new Choice();
			choiceAntecedentes.setBounds(674, 138, 116, 20);
			choiceAntecedentes.add("Nada Consta");
			choiceAntecedentes.add("Investigado");
			choiceAntecedentes.add("Réu ou Denunciado");
			choiceAntecedentes.add("Condenando");
			choiceAntecedentes.add("Condenado");
		}
		return choiceAntecedentes;
	}
	
	
	public JLabel getLabelTitulacao() {
		if (labelTitulacao == null) {
			labelTitulacao = new JLabel("Titulação: ");
			labelTitulacao.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelTitulacao.setBounds(20, 25, 71, 30);
		}
		return labelTitulacao;
	}
	
	public JTextField getTextFieldTitulacao() {
		if (textFieldTitulacao == null) {
			textFieldTitulacao = new JTextField();
			textFieldTitulacao.setColumns(10);
			textFieldTitulacao.setBounds(101, 25, 269, 30);
		}
		return textFieldTitulacao;
	}
	
	
	public JLabel getLabelArea() {
		if (labelArea == null) {
			labelArea = new JLabel("Area: ");
			labelArea.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelArea.setBounds(390, 25, 41, 30);
		}
		return labelArea;
	}
	
	public JTextField getTextFieldArea() {
		if (textFieldArea == null) {
			textFieldArea = new JTextField();
			textFieldArea.setColumns(10);
			textFieldArea.setBounds(441, 25, 269, 30);
		}
		return textFieldArea;
	}
	
	
	public JLabel getLabelClasse() {
		if (labelClasse == null) {
			labelClasse = new JLabel("Classe: ");
			labelClasse.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelClasse.setBounds(728, 25, 52, 30);
		}
		return labelClasse;
	}
	public JTextField getTextFieldClasse() {
		if (textFieldClasse == null) {
			textFieldClasse = new JTextField();
			textFieldClasse.setColumns(10);
			textFieldClasse.setBounds(809, 25, 269, 30);
		}
		return textFieldClasse;
	}
	
	public JLabel getLabelDepartamento() {
		if (labelDepartamento == null) {
			labelDepartamento = new JLabel("Departamento");
			labelDepartamento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelDepartamento.setBounds(290, 67, 100, 30);
		}
		return labelDepartamento;
	}
	
	public Choice getChoiceDepartamento() {
		if (choiceDepartamento == null) {
			choiceDepartamento = new Choice();
			choiceDepartamento.setBounds(400, 72, 190, 20);
			choiceDepartamento.add("Ciências Exatas e Tecnologia");
			choiceDepartamento.add("Ciências Biológicas");
			choiceDepartamento.add("Ciências da Saúde");
			choiceDepartamento.add("Engenharia Agrícola e Solos");
		}
		return choiceDepartamento;
	}
	
	
	public JLabel getLabelRegime() {
		if (labelRegime == null) {
			labelRegime = new JLabel("Regime");
			labelRegime.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelRegime.setBounds(612, 67, 59, 30);
		}
		return labelRegime;
	}
	
	public Choice getChoiceRegime() {
		if (choiceRegime == null) {
			choiceRegime = new Choice();
			choiceRegime.setBounds(681, 72, 150, 20);
			choiceRegime.add("Dedicação Exclusiva");
			choiceRegime.add("40 Horas");
			choiceRegime.add("20 Horas");
		}
		return choiceRegime;
	}
	
	public JLabel getLabelCEP() {
		if (labelCEP == null) {
			labelCEP = new JLabel("CEP:");
			labelCEP.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCEP.setBounds(20, 25, 46, 30);
		}
		return labelCEP;
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
	
	public JTextField getTextFieldNumero() {
		if (textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setColumns(10);
			textFieldNumero.setBounds(989, 25, 89, 30);
		}
		return textFieldNumero;
	}
	
	public JLabel getLabelEstado() {
		if (labelEstado == null) {
			labelEstado = new JLabel("Estado:");
			labelEstado.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelEstado.setBounds(236, 25, 64, 30);
		}
		return labelEstado;
	}
	
	public JTextField getTextFieldEstado() {
		if (textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setColumns(10);
			textFieldEstado.setBounds(310, 25, 150, 30);
		}
		return textFieldEstado;
	}
	
	public JLabel getLabelCidade() {
		if (labelCidade == null) {
			labelCidade = new JLabel("Cidade:");
			labelCidade.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelCidade.setBounds(470, 25, 64, 30);
		}
		return labelCidade;
	}
	
	public JTextField getTextFieldCidade() {
		if (textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setColumns(10);
			textFieldCidade.setBounds(544, 25, 150, 30);
		}
		return textFieldCidade;
	}
	
	public JLabel getLabelBairro() {
		if (labelBairro == null) {
			labelBairro = new JLabel("Bairro:");
			labelBairro.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelBairro.setBounds(704, 25, 64, 30);
		}
		return labelBairro;
	}
	
	public JTextField getTextFieldBairro() {
		if (textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setColumns(10);
			textFieldBairro.setBounds(778, 25, 150, 30);
		}
		return textFieldBairro;
	}
	
	public JLabel getLabelComplemento() {
		if (labelComplemento == null) {
			labelComplemento = new JLabel("Complemento:");
			labelComplemento.setFont(new Font("Tahoma", Font.BOLD, 14));
			labelComplemento.setBounds(544, 67, 102, 30);
		}
		return labelComplemento;
	}
	
	public JTextField getTextFieldComplemento() {
		if (textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setColumns(10);
			textFieldComplemento.setBounds(656, 67, 422, 30);
		}
		return textFieldComplemento;
	}
	
	public Button getButtonCadastrar() {
		if (buttonEnviar == null) {
			buttonEnviar = new Button("Enviar");
			buttonEnviar.setBackground(new Color(76, 175, 80));
			buttonEnviar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonEnviar.setBounds(1104, 666, 100, 30);
		}
		return buttonEnviar;
	}
	
	public Button getButtonLimpar() {
		if (buttonLimpar == null) {
			buttonLimpar = new Button("Limpar");
			buttonLimpar.setBackground(new Color(169, 169, 169));
			buttonLimpar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonLimpar.setBounds(96, 666, 100, 30);
		}
		return buttonLimpar;
	}
}

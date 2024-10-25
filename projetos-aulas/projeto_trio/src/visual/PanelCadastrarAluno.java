package visual;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelCadastrarAluno extends JPanel {
	
	// Declara as etiquetas
	JLabel labelNome;
	JLabel labelMatricula;
	JLabel labelCurso;
	JLabel labelCpf;
	JLabel labelDataNasc;
	JLabel labelLogradouro;
	JLabel labelNumero;
	JLabel labelComplemento;
	JLabel labelBairro;
	JLabel labelCep;
	JLabel labelCidade;
	JLabel labelEstado;
	JLabel labelTitleSection;
	
	// Declara os campos de textos
	JTextField textFieldNome;
	JTextField textFieldMatricula;
	JTextField textFieldCurso;
	JTextField textFieldCpf;
	JTextField textFieldDataNasc;
	JTextField textFieldLogradouro;
	JTextField textFieldNumero;
	JTextField textFieldComplemento;
	JTextField textFieldBairro;
	JTextField textFieldCep;
	JTextField textFieldCidade;
	JTextField textFieldEstado;

	public PanelCadastrarAluno() {
		
		this.setLayout(null);
		
		// Adiciona/Utiliza as etiquetas
		this.add(getLabelNome());
		this.add(getLabelMatricula());
		this.add(getLabelCurso());
		this.add(getLabelCpf());
		this.add(getLabelDataNasc());
		this.add(getLabelLogradouro());
		this.add(getLabelNumero());
		this.add(getLabelComplemento());
		this.add(getLabelBairro());
		this.add(getLabelCep());
		this.add(getLabelCidade());
		this.add(getLabelEstado());
		
		
		// Adiciona/Utiliza os campos de textos
		this.add(getTextFieldNome());
		this.add(getTextFieldMatricula());
		this.add(getTextFieldCurso());
		this.add(getTextFieldCpf());
		this.add(getTextFieldDataNasc());
		this.add(getTextFieldLogradouro());
		this.add(getTextFieldNumero());
		this.add(getTextFieldBairro());
		this.add(getTextFieldCep());
		this.add(getTextFieldCidade());
		this.add(getTextFieldEstado());
		
		// Addiciona/Utiliza a mesma função para criar seções na interface gráfica
		this.add(getLabelTitleSection("Aluno", 110, 10));
		this.add(getLabelTitleSection("Endereço", 280, 10));	
	}
	
	//################################## Inicialização dos títulos de seção ##################################
	
	public JLabel getLabelTitleSection(String content, int x, int y) {
	 
			labelTitleSection = new JLabel();
			labelTitleSection.setSize(100, 20);
			labelTitleSection.setLocation(x, y);
			labelTitleSection.setText(content);
		
		return labelTitleSection;
	}
	
	//################################## Inicialização das Etiquetas ##################################
	
	public JLabel getLabelNome() {
		if(labelNome == null) {
			labelNome = new JLabel();
			labelNome.setSize(50, 20);
			labelNome.setLocation(50, 30);
			labelNome.setText("Nome");
		}
		return labelNome;
	}
	
	public JLabel getLabelMatricula() {
		if(labelMatricula == null) {
			labelMatricula = new JLabel();
			labelMatricula.setSize(100, 20);
			labelMatricula.setLocation(50, 80);
			labelMatricula.setText("Matricula");
		}
		return labelMatricula;
	}
	
	public JLabel getLabelCurso() {
		if(labelCurso == null) {
			labelCurso = new JLabel();
			labelCurso.setSize(100, 20);
			labelCurso.setLocation(50, 130);
			labelCurso.setText("Curso");
		}
		return labelCurso;
	}
	
	public JLabel getLabelCpf() {
		if(labelCpf == null) {
			labelCpf = new JLabel();
			labelCpf.setSize(100, 20);
			labelCpf.setLocation(50, 180);
			labelCpf.setText("Cpf");
		}
		return labelCpf;
	}
	
	public JLabel getLabelDataNasc() {
		if(labelDataNasc == null) {
			labelDataNasc = new JLabel();
			labelDataNasc.setSize(150, 20);
			labelDataNasc.setLocation(50, 230);
			labelDataNasc.setText("Data de Nascimento");
		}
		return labelDataNasc;
	}
	
	public JLabel getLabelLogradouro() {
		if(labelLogradouro == null) {
			labelLogradouro = new JLabel();
			labelLogradouro.setSize(150, 20);
			labelLogradouro.setLocation(250, 30);
			labelLogradouro.setText("Logradouro");
		}
		return labelLogradouro;
	}
	
	public JLabel getLabelNumero() {
		if(labelNumero == null) {
			labelNumero = new JLabel();
			labelNumero.setSize(150, 20);
			labelNumero.setLocation(250, 80);
			labelNumero.setText("Numero");
		}
		return labelNumero;
	}
	
	public JLabel getLabelComplemento() {
		if(labelComplemento == null) {
			labelComplemento = new JLabel();
			labelComplemento.setSize(100, 20);
			labelComplemento.setLocation(250, 130);
			labelComplemento.setText("Complemento");
		}
		return labelComplemento;
	}
	
	public JLabel getLabelBairro() {
		if(labelBairro == null) {
			labelBairro = new JLabel();
			labelBairro.setSize(50, 20);
			labelBairro.setLocation(250, 130);
			labelBairro.setText("Bairro");
		}
		return labelComplemento;
	}
	
	public JLabel getLabelCep() {
		if(labelCep == null) {
			labelCep = new JLabel();
			labelCep.setSize(50, 20);
			labelCep.setLocation(250, 180);
			labelCep.setText("Cep");
		}
		return labelCep;
	}
	
	public JLabel getLabelCidade() {
		if(labelCidade == null) {
			labelCidade = new JLabel();
			labelCidade.setSize(50, 20);
			labelCidade.setLocation(250, 230);
			labelCidade.setText("Cidade");
		}
		return labelCidade;
	}
	
	public JLabel getLabelEstado() {
		if(labelEstado == null) {
			labelEstado = new JLabel();
			labelEstado.setSize(50, 20);
			labelEstado.setLocation(250, 280);
			labelEstado.setText("Estado");
		}
		return labelEstado;
	}
	
	//################################## Inicialização dos Campos de Texto ##################################
	
	public JTextField getTextFieldNome() {
		if(textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setSize(150, 30);
			textFieldNome.setLocation(50, 50);
		}
		return textFieldNome;
	}
	
	public JTextField getTextFieldMatricula() {
		if(textFieldMatricula == null) {
			textFieldMatricula = new JTextField();
			textFieldMatricula.setSize(150, 30);
			textFieldMatricula.setLocation(50, 100);
		}
		return textFieldMatricula;
	}
	
	public JTextField getTextFieldCurso() {
		if(textFieldCurso == null) {
			textFieldCurso = new JTextField();
			textFieldCurso.setSize(150, 30);
			textFieldCurso.setLocation(50, 150);
		}
		return textFieldCurso;
	}
	
	public JTextField getTextFieldCpf() {
		if(textFieldCpf == null) {
			textFieldCpf = new JTextField();
			textFieldCpf.setSize(150, 30);
			textFieldCpf.setLocation(50, 200);
		}
		return textFieldCpf;
	}
	
	public JTextField getTextFieldDataNasc() {
		if(textFieldDataNasc == null) {
			textFieldDataNasc = new JTextField();
			textFieldDataNasc.setSize(150, 30);
			textFieldDataNasc.setLocation(50, 250);
		}
		return textFieldDataNasc;
	}
	
	public JTextField getTextFieldLogradouro() {
		if(textFieldLogradouro == null) {
			textFieldLogradouro = new JTextField();
			textFieldLogradouro.setSize(150, 30);
			textFieldLogradouro.setLocation(250, 50);
		}
		return textFieldLogradouro;
	}
	
	public JTextField getTextFieldNumero() {
		if(textFieldNumero == null) {
			textFieldNumero = new JTextField();
			textFieldNumero.setSize(150, 30);
			textFieldNumero.setLocation(250, 100);
		}
		return textFieldNumero;
	}
	
	public JTextField getTextFieldComplemento() {
		if(textFieldComplemento == null) {
			textFieldComplemento = new JTextField();
			textFieldComplemento.setSize(150, 30);
			textFieldComplemento.setLocation(250, 150);
		}
		return textFieldComplemento;
	}
	
	public JTextField getTextFieldBairro() {
		if(textFieldBairro == null) {
			textFieldBairro = new JTextField();
			textFieldBairro.setSize(150, 30);
			textFieldBairro.setLocation(250, 150);
		}
		return textFieldBairro;
	}
	
	public JTextField getTextFieldCep() {
		if(textFieldCep == null) {
			textFieldCep = new JTextField();
			textFieldCep.setSize(150, 30);
			textFieldCep.setLocation(250, 200);
		}
		return textFieldCep;
	}
	
	public JTextField getTextFieldCidade() {
		if(textFieldCidade == null) {
			textFieldCidade = new JTextField();
			textFieldCidade.setSize(150, 30);
			textFieldCidade.setLocation(250, 250);
		}
		return textFieldCidade;
	}
	
	public JTextField getTextFieldEstado() {
		if(textFieldEstado == null) {
			textFieldEstado = new JTextField();
			textFieldEstado.setSize(150, 30);
			textFieldEstado.setLocation(250, 300);
		}
		return textFieldEstado;
	}
}

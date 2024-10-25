package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import modelo.Aluno;
import modelo.Endereco;
import visual.PanelCadastrarAluno;

public class ControladorCadastrarAluno implements ActionListener{

	PanelCadastrarAluno panelCadastrarAluno;
	ArrayList<Aluno> listaAlunoCadastrado;
	
	public ControladorCadastrarAluno(PanelCadastrarAluno panelCadastarAluno) {
		this.panelCadastrarAluno = panelCadastarAluno;
		listaAlunoCadastrado = new ArrayList<Aluno>();
		addEventos();
	}
	
	private void addEventos() {
		panelCadastrarAluno.getButtonCadastrar().addActionListener(this);
		panelCadastrarAluno.getButtonLimpar().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarAluno.getButtonCadastrar()) {
			cadastarAluno();
		} else if(e.getSource() == panelCadastrarAluno.getButtonLimpar()) {
			limparCampos();
		}
	}
	
	public void cadastarAluno() {
		
		String nome = panelCadastrarAluno.getTextFieldNome().getText();
		String cpf = panelCadastrarAluno.getTextFieldCpf().getText();
		String rg = panelCadastrarAluno.getTextFieldRg().getText();
		String dataNasc = panelCadastrarAluno.getTextFieldDataNascimento().getText();
		String email = panelCadastrarAluno.getTextFieldEmail().getText();
		String titulo = panelCadastrarAluno.getTextFieldTitulo().getText();
		String reservista = panelCadastrarAluno.getTextFieldReservista().getText();
		String telefone = panelCadastrarAluno.getTextFieldTelefone().getText();
		String comprovanteEleitoral = panelCadastrarAluno.getTextFieldComprovanteEleitoral().getText();
		String antecedentes = panelCadastrarAluno.getTextFieldAntecedentes().getText();
		
		String curso = panelCadastrarAluno.getTextFieldCurso().getText();
		String matricula = panelCadastrarAluno.getTextFieldMatricula().getText();
		String anoEntrada = panelCadastrarAluno.getTextFieldAnoEntrada().getText();
		String campus = panelCadastrarAluno.getTextFieldCampus().getText();
		
		String logradouro = panelCadastrarAluno.getTextFieldLogradouro().getText();
//		String numero = panelCadastrarAluno.getTextFieldNumero().getText();
		String numero = "302";
		String complemento = panelCadastrarAluno.getTextFieldComplemento().getText();
		String bairro = panelCadastrarAluno.getTextFieldBairro().getText();
		String cep = panelCadastrarAluno.getTextFieldCep().getText();
		String cidade = panelCadastrarAluno.getTextFieldCidade().getText();
		String estado = panelCadastrarAluno.getTextFieldEstado().getText();
		
		Endereco endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
		Aluno aluno = new Aluno(nome, cpf, rg, dataNasc, email, titulo, reservista, telefone, endereco, comprovanteEleitoral, antecedentes, curso, matricula, anoEntrada, campus);
	
		listaAlunoCadastrado.add(aluno);
		
		System.out.println("Aluno Cadastardo!");
		System.out.println(listaAlunoCadastrado.getLast());
	}
	
	public void limparCampos() {
		panelCadastrarAluno.getTextFieldNome().setText("");
		panelCadastrarAluno.getTextFieldCpf().setText("");
		panelCadastrarAluno.getTextFieldRg().setText("");
		panelCadastrarAluno.getTextFieldDataNascimento().setText("");
		panelCadastrarAluno.getTextFieldEmail().setText("");
		panelCadastrarAluno.getTextFieldTitulo().setText("");
		panelCadastrarAluno.getTextFieldReservista().setText("");
		panelCadastrarAluno.getTextFieldTelefone().setText("");
		panelCadastrarAluno.getTextFieldComprovanteEleitoral().setText("");
		panelCadastrarAluno.getTextFieldAntecedentes().setText("");
		panelCadastrarAluno.getTextFieldCurso().setText("");
		panelCadastrarAluno.getTextFieldMatricula().setText("");
		panelCadastrarAluno.getTextFieldAnoEntrada().setText("");
		panelCadastrarAluno.getTextFieldCampus().setText("");
		panelCadastrarAluno.getTextFieldLogradouro().setText("");
		panelCadastrarAluno.getTextFieldComplemento().setText("");
		panelCadastrarAluno.getTextFieldBairro().setText("");
		panelCadastrarAluno.getTextFieldCep().setText("");
		panelCadastrarAluno.getTextFieldCidade().setText("");
		panelCadastrarAluno.getTextFieldEstado().setText("");
	}

}

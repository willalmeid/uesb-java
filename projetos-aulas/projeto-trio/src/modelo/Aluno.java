package modelo;

public class Aluno {
	
	private String nome;
	private String matricula;
	private String curso;
	private String cpf;
	private String data_nasc;
	private Endereco endereco;
	
	public Aluno() {}

	public Aluno(String nome, String matricula, String curso, String cpf, String dataNasc, Endereco endereco){
		this.nome = nome;
		this.matricula = matricula;
		this.curso = curso;
		this.cpf = cpf;
		this.data_nasc = dataNasc;
		this.endereco = endereco;
	}
}

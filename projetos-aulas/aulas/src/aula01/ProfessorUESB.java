package aula01;

public class ProfessorUESB {
	int matricula;
	int cpf;
	int rg;
	int cargaHoraria;
	
	String nome;
	String situacaoEleitoral;
	String situacaoVacinacao;
	String formacao;
	String nivelAcademico;
	String disciplinaMinistrada;
	
	
	public ProfessorUESB() {
		
	}
	
	public ProfessorUESB(int matricula, int cpf, int rg, int cargaHoraria, String nome, String situacaoEleitoral, String situacaoVacinacao, String formacao, String nivelAcademico, String disciplinaMinistrada) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.rg = rg;
		this.cargaHoraria = cargaHoraria;
		
		this.nome = nome;
		this.situacaoEleitoral = situacaoEleitoral;
		this.situacaoVacinacao = situacaoVacinacao;
		this.formacao = formacao;
		this.nivelAcademico = nivelAcademico;
		this.disciplinaMinistrada = disciplinaMinistrada;
	}
}

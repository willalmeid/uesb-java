package teste;

public class Medico {
	int cpf;
	int rg;
	int cfm;
	
	String nome;
	String areaAtuacao;
	String nívelAcademico;
	
	public Medico() {
		
	}
	
	public Medico(int cpf, int rg, int cfm, String nome, String areaAtuacao, String nívelAcademico) {
		this.cpf = cpf;
		this.rg = rg;
		this.cfm = cfm;
		
		this.nome = nome;
		this.areaAtuacao = areaAtuacao;
		this.nívelAcademico = nívelAcademico;
	}
}

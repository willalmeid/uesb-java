package teste;

public class AlunoUESB {
	int matricula;
	int cpf;
	int rg;
	
	String nome;
	String condicaoEleitoral;
	String situacaoDeVacinacao;
	String logradouro;
	String zonaHabitada;
	String situacaoMilitar;
	
	public AlunoUESB() {
		
	}
	
	public AlunoUESB(int matricula, int cpf, int rg, String nome, String condicaoEleitoral, String situacaoDeVacinacao, String logradouro, String zonaHabitada, String situacaoMilitar) {
		this.matricula = matricula;
		this.cpf = cpf;
		this.rg = rg;
		
		this.nome = nome;
		this.condicaoEleitoral = condicaoEleitoral;
		this.situacaoDeVacinacao = situacaoDeVacinacao;
		this.logradouro = logradouro;
		this.zonaHabitada = zonaHabitada;
		this.situacaoMilitar = situacaoMilitar;
	}
}

package aula01;

public class Paciente {
	int cpf;
	int rg;
	int numSus;
	
	String nome;
	String alergias;
	String historicoFamiliar;
	String tipoSanguineo;
	String etnia;
	String prioridadeDeAtendimento;
	
	public Paciente() {
		
	}
	
	public Paciente(int cpf, int rg, int numSus, String nome, String alergias, String historicoFamiliar, String tipoSanguineo, String etnia, String prioridadeDeAtendimento) {
		this.cpf = cpf;
		this.rg = rg;
		this.numSus = numSus;
		
		this.nome = nome;
		this.alergias = alergias;
		this.historicoFamiliar = historicoFamiliar;
		this.tipoSanguineo = tipoSanguineo;
		this.etnia = etnia;
		this.prioridadeDeAtendimento = prioridadeDeAtendimento;
	}
}

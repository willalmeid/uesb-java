package aula01;

public class Pessoa {
	int cpf;
	int rg;
	int dataNascimento;
	int numSus;
	int numReservista;
	
	float altura;
	float peso;
	
	String nome;
	String etnia;
	String logradouro;
	
	public Pessoa() {
		
	}
	
	public Pessoa(int cpf, int rg, int dataNascimento, int numSus, int numReservista, float altura, float peso, String nome, String etnia, String logradouro) {
		this.cpf = cpf;
		this.rg = rg;
		this.dataNascimento = dataNascimento;
		this.numSus = numSus;
		this.numReservista = numReservista;
		
		this.altura = altura;
		this.peso = peso;
		
		this.nome = nome;
		this.etnia = etnia;
		this.logradouro = logradouro;
	}
}

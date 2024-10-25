package teste;

public class Loja {
	int cnpj;
	int qtdFuncionarios;
	
	String nome;
	String logradouro;
	
	public Loja() {
		
	}
	
	public Loja(int cnpj, int qtdFuncionarios, String nome, String logradouro) {
		this.cnpj = cnpj;
		this.qtdFuncionarios = qtdFuncionarios;
		
		this.nome = nome;
		this.logradouro = logradouro;
	}
}

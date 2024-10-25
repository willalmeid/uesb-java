package teste;

public class Cliente {
	int cpf;
	int rg;
	
	String nome;
	String frequenciaDeCompra;
	
	public Cliente(){
		
	}
	
	public Cliente(int cpf, int rg, String nome, String frequenciaDeCompra) {
		this.cpf = cpf;
		this.rg = rg;
		
		this.nome = nome;
		this.frequenciaDeCompra = frequenciaDeCompra;
	}
}

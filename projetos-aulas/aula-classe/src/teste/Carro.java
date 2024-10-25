package teste;

public class Carro {
	int ano;
	int potencia;
	int qtdPortas;
	
	String marca;
	String modelo;
	String placa;
	String condicao;
	String tipoCambio;
	String tipoVolante;
	
	public Carro(){
		
	}
	
	public Carro(int ano, int potencia, int qtdPortas, String marca, String modelo, String placa, String condicao, String tipoCambio, String tipoVolante){
		this.ano = ano;
		this.potencia = potencia;
		this.qtdPortas = qtdPortas;
		
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.condicao = condicao;
		this.tipoCambio = tipoCambio;
		this.tipoVolante = tipoVolante;
	}
}

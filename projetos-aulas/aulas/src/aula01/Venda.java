package aula01;

public class Venda {
	int numVenda;
	int codProduto;
	int cpf;
	
	float valorVenda;
	float valorPagamento;
	float valorTroco;
	
	String nomeCliente;
	
	public Venda() {
		
	}
	
	public Venda(int numVenda, int codProduto, int cpf, float valorVenda, float valorPagamento, float valorTroco, String nomeCliente) {
		this.numVenda = numVenda;
		this.codProduto = codProduto;
		this.cpf = cpf;
		
		this.valorVenda = valorVenda;
		this.valorPagamento = valorPagamento;
		this.valorTroco = valorTroco;
		
		this.nomeCliente = nomeCliente;
	}
}

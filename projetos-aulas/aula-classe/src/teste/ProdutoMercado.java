package teste;

public class ProdutoMercado {
	int dataFabri;
	int dataValid;
	int lote;
	int dataCompra;
	
	String nome;
	String tipo;
	String setor;
	
	public ProdutoMercado() {
		
	}
	
	public ProdutoMercado(int dataFabri, int dataValid, int lote, int dataCompra, String nome, String tipo, String setor) {
		this.dataFabri = dataFabri;
		this.dataValid = dataValid;
		this.lote = lote;
		this.dataCompra = dataCompra;
		
		this.nome = nome;
		this.tipo = tipo;
		this.setor = setor;
	}
	
}

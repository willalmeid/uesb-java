package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Material {

	private String nomeDoMaterial;
	private String fornecedor;

	private int qtdEstoque;
	private int qtdMinEstoque;
	
	private float preco;
	
	// Sistema de Alerta para baixo estoque.
	
	public Material() {
		
	}

	public Material(String nomeDoMaterial, int qtdEstoque, int qtdMinEstoque, String fornecedor, float preco) {
		super();
		this.nomeDoMaterial = nomeDoMaterial;
		this.qtdEstoque = qtdEstoque;
		this.qtdMinEstoque = qtdMinEstoque;
		this.fornecedor = fornecedor;
		this.preco = preco;
	}
	
public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("material.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome do Material: " + this.nomeDoMaterial);
			pw.println("Qtd. Estoque: " + this.qtdEstoque);
			pw.println("qtd. Mínima: " + this.qtdMinEstoque);
			pw.println("Fornecedor: " + this.fornecedor);
			pw.println("Preço: " + this.preco);
			pw.println("\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	public String getNomeDoMaterial() {
		return nomeDoMaterial;
	}

	public void setNomeDoMaterial(String nomeDoMaterial) {
		this.nomeDoMaterial = nomeDoMaterial;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public int getQtdMinEstoque() {
		return qtdMinEstoque;
	}

	public void setQtdMinEstoque(int qtdMinEstoque) {
		this.qtdMinEstoque = qtdMinEstoque;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}

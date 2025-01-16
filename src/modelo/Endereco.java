package modelo;

import java.io.PrintWriter;

public class Endereco {

	private String logradouro;
	private String numero;
	private String complemento;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public Endereco(){
		
	}
	
	public Endereco(String logradouro, String numero, String complemento, String bairro, 
					String cep, String cidade, String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
	
	public void salvarDados(PrintWriter pw) {
		pw.println("Logradouro: " + this.logradouro);
		pw.println("Número: " + this.numero);
		pw.println("Complemento: " + this.complemento);
		pw.println("Bairro: " + this.bairro);
		pw.println("CEP: " + this.cep);
		pw.println("Cidade: " + this.cidade);
		pw.println("Estado: " + this.estado);
	}
	
	public String getLogradouro() {
		return logradouro;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public String getComplemento() {
		return complemento;
	}
	
	public String getBairro() {
		return bairro;
	}
	
	public String getCep() {
		return cep;
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public String getEstado() {
		return estado;
	}
	
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	
	public void setCep(String cep) {
		this.cep = cep;
	}
	
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
}

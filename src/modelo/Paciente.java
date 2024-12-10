package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Paciente {
	
	private String nome;
	private String dataNascimento;
	private String telefone;
	private String tipoSanguineo;
	
	/* 
	 * Nessas variáveis coloquei como string mas pela pesquisa no GPT,
	 * poderia ser uma lista para histórico médico e um enum para o convênio.
	 * Sendo assim, teremos que discutir depois.
	 * */
	private String historicoMedico;
	private String covenio;
	
	private float peso;
	private float altura;
	
	private Endereco endereco;

	public Paciente() {

	}

	public Paciente(String nome, String dataNascimento, String telefone, String tipoSanguineo, String historicoMédico,
			String covenio, float peso, float altura, Endereco endereco) {
		super();
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.tipoSanguineo = tipoSanguineo;
		this.historicoMedico = historicoMédico;
		this.covenio = covenio;
		this.peso = peso;
		this.altura = altura;
		this.endereco = endereco;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("pacientes.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome: " + this.nome);
			pw.println("Data de Nascimento: " + this.dataNascimento);
			pw.println("Telefone: " + this.telefone);
			pw.println("Tipo Sanguineo: " + this.tipoSanguineo);
			pw.println("Histórico Médico: " + this.historicoMedico);
			pw.println("Convênio: " + this.covenio);
			pw.println("Peso: " + this.peso);
			pw.println("Altura: " + this.altura);
			endereco.salvarDados(pw);
			pw.println("\n----------------------------------------------------\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	/* --------------------------------------------------- Metodos de Acesso ---------------------------------------------------------------- */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTipoSanguineo() {
		return tipoSanguineo;
	}

	public void setTipoSanguineo(String tipoSanguineo) {
		this.tipoSanguineo = tipoSanguineo;
	}

	public String getHistoricoMédico() {
		return historicoMedico;
	}

	public void setHistoricoMédico(String historicoMédico) {
		this.historicoMedico = historicoMédico;
	}

	public String getCovenio() {
		return covenio;
	}

	public void setCovenio(String covenio) {
		this.covenio = covenio;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}

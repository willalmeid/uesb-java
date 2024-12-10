package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Medico {
	
	private String nome;
	private String especialidade;
	private String crm;
	private String contato;
	
	private float valorConsultaParticular;
	
	// Pensei em criar uma class para isso
	private String historicoDeAtendimento;

	public Medico() {
		
	}

	public Medico(String nome, String especialidade, String crm, String contato, float valorConsultaParticular,
			String históricoDeAtendimento) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.crm = crm;
		this.contato = contato;
		this.valorConsultaParticular = valorConsultaParticular;
		this.historicoDeAtendimento = históricoDeAtendimento;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("pacientes.txt");
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome: " + this.nome);
			pw.println("Especialidade: " + this.especialidade);
			pw.println("CRM: " + this.crm);
			pw.println("Contato: " + this.contato);
			pw.println("Valor Consulta Particular: " + this.valorConsultaParticular);
			pw.println("Histórico de Atendimento: " + this.historicoDeAtendimento);
			pw.println("\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public float getValorConsultaParticular() {
		return valorConsultaParticular;
	}

	public void setValorConsultaParticular(float valorConsultaParticular) {
		this.valorConsultaParticular = valorConsultaParticular;
	}

	public String getHistóricoDeAtendimento() {
		return historicoDeAtendimento;
	}

	public void setHistóricoDeAtendimento(String históricoDeAtendimento) {
		this.historicoDeAtendimento = históricoDeAtendimento;
	}

}

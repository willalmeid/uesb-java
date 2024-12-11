package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Consulta {
	
	private String data;
	private String hora;
	private String queixaPaciente;
	private String tipoDeConsulta;
	private String convenio;
	private String observacoes;
	
	private Medico medico;
	
	private Paciente paciente;	
	
	private Material material;

	public Consulta() {
		
	}

	public Consulta(String data, String hora, String queixaPaciente, String tipoDeConsulta, String convenio,
			String observacoes, Medico medico, Paciente paciente, Material material) {
		super();
		this.data = data;
		this.hora = hora;
		this.queixaPaciente = queixaPaciente;
		this.tipoDeConsulta = tipoDeConsulta;
		this.convenio = convenio;
		this.observacoes = observacoes;
		this.medico = medico;
		this.paciente = paciente;
		this.material = material;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("./dados/consultas.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Data: " + this.data);
			pw.println("Hora: " + this.hora);
			pw.println("Queixa do Paciente: " + this.queixaPaciente);
			pw.println("Tipo de Consulta: " + this.tipoDeConsulta);
			pw.println("Convênio: " + this.convenio);
			pw.println("Observações: " + this.observacoes);
			pw.println("Médico: " + this.medico.getNome());
			pw.println("Paciente: " + this.paciente.getNome());
			pw.println("\n----------------------------------------------------\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getQueixaPaciente() {
		return queixaPaciente;
	}

	public void setQueixaPaciente(String queixaPaciente) {
		this.queixaPaciente = queixaPaciente;
	}

	public String getTipoDeConsulta() {
		return tipoDeConsulta;
	}

	public void setTipoDeConsulta(String tipoDeConsulta) {
		this.tipoDeConsulta = tipoDeConsulta;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

}

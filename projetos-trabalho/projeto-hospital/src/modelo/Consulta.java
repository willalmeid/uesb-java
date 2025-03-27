package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Consulta {
	
	private String data;
	private String hora;
	private String queixaPaciente;
	private String tipoDeConsulta;
	private String convenio;
	private String observacoes;
	
	private String medico;
	
	private String paciente;	
	
	private JList<String> materiaisUtilizados;

	public Consulta() {
		
	}

	public Consulta(String paciente, String data, String hora, String medico, String tipoDeConsulta, String convenio, String queixaPaciente, 
			String observacoes, JList<String> materiaisUtilizados) {
		super();
		this.paciente = paciente;
		this.data = data;
		this.hora = hora;
		this.medico = medico;
		this.tipoDeConsulta = tipoDeConsulta;
		this.convenio = convenio;
		this.queixaPaciente = queixaPaciente;
		this.observacoes = observacoes;
		this.materiaisUtilizados = materiaisUtilizados;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("./dados/consultas.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Paciente: " + this.paciente);
			pw.println("Data: " + this.data);
			pw.println("Hora: " + this.hora);
			pw.println("Médico: " + this.medico);
			pw.println("Tipo de Consulta: " + this.tipoDeConsulta);
			pw.println("Convênio: " + this.convenio);
			pw.println("Queixa do Paciente: " + this.queixaPaciente);
			pw.println("Observações: " + this.observacoes);
			
			DefaultListModel<String> model = (DefaultListModel<String>) this.materiaisUtilizados.getModel();
			
			pw.print("Materiais Usados: ");
			for (int i = 0; i < model.getSize(); i++) {
			    String material = model.getElementAt(i);

			    // Imprime o material com uma vírgula e um espaço, exceto para o último
			    pw.print("[" + material);
			    if (i < model.getSize() - 1) {
			        pw.print("], ");
			    } else {
			    	pw.println("]");
			    }
			}
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

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}

	public JList<String> getMaterial() {
		return materiaisUtilizados;
	}

	public void setMaterial(JList<String> materiaisUtilizados) {
		this.materiaisUtilizados = materiaisUtilizados;
	}

}

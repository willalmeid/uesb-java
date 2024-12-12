package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Exame {
	
	private String nomeExame;
	private String descricao;

	private float valorParticular;
	
	/* No documento está no plural, mas eu não sei ainda como fazer isso */
	private JList<String> materiasUtilizado;

	private String medico;
	private String paciente;
	
	/* Poderia der do tipo enum, pois os tipos já são definidos */
	private String tipoExame;

	public Exame() {
		
	}

	public Exame(String nomeExame, String descricao, float valorParticular, JList<String> materiasUtilizado, String paciente, String medico,
			String tipoExame) {
		super();
		this.nomeExame = nomeExame;
		this.descricao = descricao;
		this.valorParticular = valorParticular;
		this.materiasUtilizado = materiasUtilizado;
		this.paciente = paciente;
		this.medico = medico;
		this.tipoExame = tipoExame;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("./dados/exames.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome do Exame: " + this.nomeExame);
			pw.println("Descrição: " + this.descricao);
			pw.println("Valor Particular: " + this.valorParticular);
			
			DefaultListModel<String> model = (DefaultListModel<String>) this.materiasUtilizado.getModel();
			
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
			pw.println("Médico: " + this.medico);
			pw.println("Tipo Exame: " + this.tipoExame);
			pw.println("\n----------------------------------------------------\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	public String getNomeExame() {
		return nomeExame;
	}

	public void setNomeExame(String nomeExame) {
		this.nomeExame = nomeExame;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getValorParticular() {
		return valorParticular;
	}

	public void setValorParticular(float valorParticular) {
		this.valorParticular = valorParticular;
	}

	public JList<String> getMateriasUtilizado() {
		return materiasUtilizado;
	}

	public void setMateriasUtilizado(JList<String> materiasUtilizado) {
		this.materiasUtilizado = materiasUtilizado;
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

	public String getTipo() {
		return tipoExame;
	}

	public void setTipo(String tipoExame) {
		this.tipoExame = tipoExame;
	}

}

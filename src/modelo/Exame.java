package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Exame {
	
	private String nomeExame;
	private String descricao;

	private float valorParticular;
	
	/* No documento está no plural, mas eu não sei ainda como fazer isso */
	private Material materiasUtilizado;

	private Medico medico;
	
	/* Poderia der do tipo enum, pois os tipos já são definidos */
	private String tipoExame;

	public Exame() {
		
	}

	public Exame(String nomeExame, String descricao, float valorParticular, Material materiasUtilizado, Medico medico,
			String tipoExame) {
		super();
		this.nomeExame = nomeExame;
		this.descricao = descricao;
		this.valorParticular = valorParticular;
		this.materiasUtilizado = materiasUtilizado;
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
			pw.println("Materiais Usados: " + this.materiasUtilizado);
			pw.println("Médico: " + this.medico);
			pw.println("Tipo Exame: " + this.tipoExame);
			pw.println("\n");
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

	public Material getMateriasUtilizado() {
		return materiasUtilizado;
	}

	public void setMateriasUtilizado(Material materiasUtilizado) {
		this.materiasUtilizado = materiasUtilizado;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public String getTipo() {
		return tipoExame;
	}

	public void setTipo(String tipoExame) {
		this.tipoExame = tipoExame;
	}

}

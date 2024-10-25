package modelo;

public class Aluno extends Pessoa {
	
	private String curso;
	private String matricula;
	private String anoEntrada;
	private String campus;

	public Aluno() {
		super();
	}

	public Aluno(String nome, String cpf, String rg, String dataNasc, String email, String titulo, String reservista, String telefone,
			Endereco endereco, String comprovanteEleitoral, String antecedentes, String curso, String matricula, String anoEntrada, String campus) {
		super();
		this.curso = curso;
		this.matricula = matricula;
		this.anoEntrada = anoEntrada;
		this.campus = campus;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAnoEntrada() {
		return anoEntrada;
	}

	public void setAnoEntrada(String anoEntrada) {
		this.anoEntrada = anoEntrada;
	}

	public String getCampus() {
		return campus;
	}

	public void setCampus(String campus) {
		this.campus = campus;
	}	
}

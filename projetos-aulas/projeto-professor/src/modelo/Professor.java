package modelo;

public class Professor extends Pessoa {

	private String departamento;
	private String area;
	private String titulacao;
	private String regimeTrabalho;
	private String classe;
	
	public Professor() {
		super();
	}

	public Professor(String nome, String cpf, String rg, String dataNasc, String email, String titulo, String reservista, String telefone,
					Endereco endereco, boolean comprovanteEleitoral, boolean antecedentes, String departamento, String area, String titulacao, 
					String regimeTrabalho, String classe) {
		super();
		this.departamento = departamento;
		this.area = area;
		this.titulacao = titulacao;
		this.regimeTrabalho = regimeTrabalho;
		this.classe = classe;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}

	public String getTitulacao() {
		return titulacao;
	}

	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}

	public String getRegimeTrabalho() {
		return regimeTrabalho;
	}

	public void setRegimeTrabalho(String regimeTrabalho) {
		this.regimeTrabalho = regimeTrabalho;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}

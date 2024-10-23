package modelo;

public class Medico {
	
	private String nome;
	private String especialidade;
	private String crm;
	private String contato;
	
	private float valorConsultaParticular;
	
	// Pensei em criar uma class para isso
	private String históricoDeAtendimento;

	public Medico() {
		// TODO Auto-generated constructor stub
	}

	public Medico(String nome, String especialidade, String crm, String contato, float valorConsultaParticular,
			String históricoDeAtendimento) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.crm = crm;
		this.contato = contato;
		this.valorConsultaParticular = valorConsultaParticular;
		this.históricoDeAtendimento = históricoDeAtendimento;
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
		return históricoDeAtendimento;
	}

	public void setHistóricoDeAtendimento(String históricoDeAtendimento) {
		this.históricoDeAtendimento = históricoDeAtendimento;
	}

}

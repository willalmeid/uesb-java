package modelo;

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

package modelo;

public abstract class Pessoa {

	private String nome;
	private String cpf;
	private String rg;
	private String dataNasc;
	private String email;
	private String titulo;
	private String reservista;
	private String telefone;
	
	private Endereco endereco;
	
	private String comprovanteEleitoral;
	private String antecedentes;
	
	public Pessoa() {
		
	}

	public Pessoa(String nome, String cpf, String rg, String dataNasc, Endereco endereco, String email, String titulo, 
			String reservista, String telefone, String comprovanteEleitoral, String antecedentes) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.dataNasc = dataNasc;
		this.endereco = endereco;
		this.email = email;
		this.titulo = titulo;
		this.reservista = reservista;
		this.telefone = telefone;
		this.comprovanteEleitoral = comprovanteEleitoral;
		this.antecedentes = antecedentes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getReservista() {
		return reservista;
	}

	public void setReservista(String reservista) {
		this.reservista = reservista;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String isComprovanteEleitoral() {
		return comprovanteEleitoral;
	}

	public void setComprovanteEleitoral(String comprovanteEleitoral) {
		this.comprovanteEleitoral = comprovanteEleitoral;
	}

	public String isAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}
}

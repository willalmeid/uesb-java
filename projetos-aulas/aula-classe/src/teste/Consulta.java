package teste;

public class Consulta {
	int numConsulta;
	
	float valor;
	
	String nomePaciente;
	String nomeMedico;
	String problema;
	String horario;
	
	public Consulta(){
		
	}
	
	public Consulta(int numConsulta, float valor, String nomePaciente, String nomeMedico, String problema, String horario) {
		this.numConsulta = numConsulta;
		
		this.valor = valor;
		
		this.nomePaciente = nomePaciente;
		this.nomeMedico = nomeMedico;
		this.problema = problema;
		this.horario = horario;
	}
}

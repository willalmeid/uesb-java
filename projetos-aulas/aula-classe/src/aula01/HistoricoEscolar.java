package aula01;

public class HistoricoEscolar {
	int matricula;
	int cargaHoraria;
	
	String nome;
	String curso;
	
	public HistoricoEscolar(){
		
	}
	
	public HistoricoEscolar(int matricula, int cargaHoraria, String nome, String curso){
		this.matricula = matricula;
		this.cargaHoraria = cargaHoraria;
		
		this.nome = nome;
		this.curso = curso;
	}
}

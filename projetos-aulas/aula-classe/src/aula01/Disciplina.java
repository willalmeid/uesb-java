package aula01;

public class Disciplina {
	int cargaHorária;
	
	String nome;
	String area;
	String semestre;
	String disciplinasPre;
	String disciplinasPos;
	String biografiaBasica;
	
	public Disciplina() {
		
	}
	
	public Disciplina(int cargaHorária, String nome, String area, String semestre, String disciplinasPre, String disciplinasPos, String biografiaBasica) {
		this.cargaHorária = cargaHorária;
		
		this.nome = nome;
		this.area = area;
		this.semestre = semestre;
		this.disciplinasPre = disciplinasPre;
		this.disciplinasPos = disciplinasPos;
		this.biografiaBasica = biografiaBasica;
	}
}

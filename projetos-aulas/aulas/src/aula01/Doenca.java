package aula01;

public class Doenca {
	String nome;
	String localização;
	String sinal;
	String sintomas;
	String area;
	String periculosidade;
	String curabilidade;
	String especialidadeNesc;
	
	public Doenca() {
		
	}
	
	public Doenca(String nome,String localização, String sinal, String sintomas, String area, String periculosidade, String curabilidade, String especialidadeNesc){
		this.nome = nome;
		this.localização = localização;
		this.sinal = sinal;
		this.sintomas = sintomas;
		this.area = area;
		this.periculosidade = periculosidade;
		this.curabilidade = curabilidade;
		this.especialidadeNesc = especialidadeNesc;
	}
}

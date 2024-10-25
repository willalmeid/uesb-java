package teste;

public class Computador {
	int bateria;
	
	String mec;
	String cpu;
	String placaMae;
	String memoriaRAM;
	String memoriaROM;
	String fonteAlimentacao;
	String placaDeVideo;
	String cooler;
	
	public Computador() {
		
	}
	
	public Computador(int bateria, String mec, String cpu, String placaMae, String memoriaRAM, String memoriaROM, String fonteAlimentacao, String placaDeVideo, String cooler) {
		this.bateria = bateria;
		
		this.mec = mec;
		this.cpu = cpu;
		this.placaMae = placaMae;
		this.memoriaRAM = memoriaRAM;
		this.memoriaROM = memoriaROM;
		this.fonteAlimentacao = fonteAlimentacao;
		this.placaDeVideo = placaDeVideo;
		this.cooler = cooler;
	}
}

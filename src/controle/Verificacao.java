package controle;

public class Verificacao {
	//As funções retornam true se houver algo errado e false se estiver tudo ok
	
	
	public static boolean verificaCamposVazios(String... campos) { 
	    for (String campo : campos) {
	        if (campo == null || campo.trim().isEmpty()) {
	            return true;
	        }
	    }
	    return false;
	}
	
	public static boolean verificaDatas(String data) {
		if(!data.contains("/")) {
			return true;
		}
		
		String[] dataQuebrada = data.split("/");
		int dia = Integer.parseInt(dataQuebrada[0]);
		int mes = Integer.parseInt(dataQuebrada[1]);
		int ano = Integer.parseInt(dataQuebrada[2]);
		
		if(mes < 1 || mes > 12) return true;
		if(dia < 1 || dia > 31) return true;
		
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) { //meses com 30 dias
			if(dia > 30) return true;
		
		}
		
		if(mes == 2) {
			if(ano%4==0 && ano%100!=0 || ano%400==0) { //regras de an bissexto
				if(dia > 29) return true;
			}
			if(dia > 28) return true;
		}
		
		return false;
	}
}

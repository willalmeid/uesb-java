package controle;

public class Verificacao {
	
	public static boolean verificaCamposVazios(String... campos) {
	    for (String campo : campos) {
	        if (campo == null || campo.trim().isEmpty()) {
	            return true;
	        }
	    }
	    return false;
	}
}

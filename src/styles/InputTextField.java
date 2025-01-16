package styles;

import javax.swing.BorderFactory;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class InputTextField extends JFormattedTextField {
	
	public InputTextField() {
		setFont(Thema.FONT_INPUTS);
		setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	}
	
	public InputTextField(String mask) {
		super(createFormatter(mask));
		setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
		setFont(Thema.FONT_INPUTS);
	}
	
	private static MaskFormatter createFormatter(String mask) {
	    try {
	        if (mask != null) {
	            MaskFormatter formatter = new MaskFormatter(mask);
	            formatter.setPlaceholderCharacter('_'); // Caractere de preenchimento
	            return formatter;
	        }
	    } catch (java.text.ParseException e) {
	        e.printStackTrace();
	    }
	    return null; // Retorna null se não houver máscara ou se ocorrer erro
	}
}

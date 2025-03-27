package styles;

import javax.swing.BorderFactory;
import javax.swing.JComboBox;

public class InputComboBox extends JComboBox<String>{
	public InputComboBox() {
		setFont(Thema.FONT_INPUTS);
		setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	}
}

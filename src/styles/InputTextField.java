package styles;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class InputTextField extends JTextField {
	public InputTextField() {
		super();
		setFont(Thema.FONT_INPUTS);
		setColumns(30);
		setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	}
}

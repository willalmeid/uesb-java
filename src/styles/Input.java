package styles;

import javax.swing.BorderFactory;
import javax.swing.JTextField;

public class Input extends JTextField {
	public Input() {
		super();
		setFont(Thema.FONT_INPUTS);
		setColumns(30);
		setBorder(BorderFactory.createLineBorder(Thema.corAuxiliar2, 2));
	}
}

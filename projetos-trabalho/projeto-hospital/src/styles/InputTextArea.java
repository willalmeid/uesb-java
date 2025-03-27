package styles;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;

public class InputTextArea extends JTextArea {
	public InputTextArea() {
		setFont(Thema.FONT_INPUTS);
		setColumns(30);
		setBorder(BorderFactory.createLineBorder(Thema.AUXILIAR, 2));
	}
}

package styles;

import javax.swing.JLabel;

public class InputLabel extends JLabel {

	public InputLabel(String text) {
		setText(text);
		setForeground(Thema.AUXILIAR);
		setFont(Thema.FONT_LABELS_INPUTS);
	}
}

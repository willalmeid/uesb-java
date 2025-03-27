package styles;

import java.awt.Dimension;

import javax.swing.JLabel;

public class TitlePanel extends JLabel {
	public TitlePanel(String text) {
		setText(text);
		setPreferredSize(new Dimension(300, 500));
		setForeground(Thema.WHITE);
		setFont(Thema.FONT_TITLE);
	}
}

package styles;

import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JButton;

public class ButtonNavegacao extends JButton {

	public ButtonNavegacao() {
		setBackground(Thema.TRANSPARENT);
		setPreferredSize(new Dimension(32, 32));
		
		setAlignmentX(Component.CENTER_ALIGNMENT);
		
		setBorderPainted(false);
		setFocusPainted(false);
		setOpaque(false);
		setContentAreaFilled(false);
	}
}

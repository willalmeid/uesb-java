package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelHome extends JPanel {
	private JLabel lblNewLabel;

	public PanelHome() {
		this.setLayout(null);
		this.setSize(1280, 768);
		add(getLblNewLabel());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("HOME");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 99));
			lblNewLabel.setBounds(498, 340, 283, 87);
		}
		return lblNewLabel;
	}
}

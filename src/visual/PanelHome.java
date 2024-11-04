package visual;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class PanelHome extends JPanel {

	private JLabel labelTitlePanel;
	
	public PanelHome() {
		setBackground(new Color(2, 83, 112));
		setSize(1280, 750);
		add(getLabelTitle());
		setLayout(null);
	}

	public JLabel getLabelTitle() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 30));
			labelTitlePanel.setSize(454, 37);
			labelTitlePanel.setLocation(413, 100);
			labelTitlePanel.setText("Bem vindo(a) ao sitema hospitalar");
		}
		return labelTitlePanel;
	}
}

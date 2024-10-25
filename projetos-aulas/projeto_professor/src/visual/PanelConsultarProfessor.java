package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelConsultarProfessor extends JPanel{
	private JLabel lblNewLabel;

	public PanelConsultarProfessor() {
		this.setLayout(null);
		this.setSize(1280, 768);
		add(getLblNewLabel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Apenas um TESTE");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 75));
			lblNewLabel.setBounds(241, 218, 618, 237);
		}
		return lblNewLabel;
	}
}

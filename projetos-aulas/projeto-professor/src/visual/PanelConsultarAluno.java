package visual;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelConsultarAluno extends JPanel{
	private JLabel lblNewLabel;

	public PanelConsultarAluno() {
		this.setLayout(null);
		this.setSize(1280, 768);
		
		add(getLblNewLabel());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("TESTE");
			lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
			lblNewLabel.setBounds(227, 217, 663, 210);
		}
		return lblNewLabel;
	}
}

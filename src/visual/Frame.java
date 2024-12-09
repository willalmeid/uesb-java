package visual;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame {

	private JPanel panel;
	private JLabel labelTitle;
	private JButton buttonStart;
	
	public Frame() {
		setSize(600, 800);
		setTitle("Desafio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
		setContentPane(getPanel());
	}
	
	public JPanel getPanel() {
		if(panel == null) {
			panel = new JPanel();
			panel.setVisible(true);
			panel.setSize(600, 800);
			panel.setLayout(null);
			panel.add(getLabelTitle());
			panel.add(getButtonStart());
		}
		return panel;
	}
	
	public JLabel getLabelTitle() {
		if (labelTitle == null) {
			labelTitle = new JLabel("Animação Boneco");
			labelTitle.setFont(new Font("Inter", Font.PLAIN, 45));
			labelTitle.setBounds(101, 5, 381, 55);
		}
		return labelTitle;
	}
	
	public JButton getButtonStart() {
		if (buttonStart == null) {
			buttonStart = new JButton("Pular");
			buttonStart.setFont(new Font("Inter", Font.BOLD, 20));
			buttonStart.setBounds(474, 715, 100, 35);
		}
		return buttonStart;
	}
}

package visual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class Frame extends JFrame {
	private JLabel labelTitlePanel;
	private JButton buttonBola;
	private JButton buttonLancar;
	
	public Frame(){
		setSize(600, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().add(getLabelTitlePanel());
		getContentPane().add(getButtonBola());
		getContentPane().add(getButtonLancar());
		setVisible(true);
	}
	
	public JLabel getLabelTitlePanel() {
		if (labelTitlePanel == null) {
			labelTitlePanel = new JLabel("Desafio Bola Caindo");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			labelTitlePanel.setBounds(181, 10, 222, 35);
		}
		return labelTitlePanel;
	}
	
	public JButton getButtonBola() {
		if (buttonBola == null) {
			buttonBola = new JButton("");
			buttonBola.setBounds(150, 60, 40, 40);
		}
		return buttonBola;
	}
	
	public JButton getButtonLancar() {
		if (buttonLancar == null) {
			buttonLancar = new JButton("Começar");
			buttonLancar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonLancar.setBounds(371, 64, 100, 32);
		}
		return buttonLancar;
	}
}

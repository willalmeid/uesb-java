package visual;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Color;

public class Frame extends JFrame {
	private JLabel labelTitlePanel;
	private JLabel labelBola;
	private JButton buttonLancar;
	private JPanel panel;
	
	public Frame(){
		setSize(600, 800);
		setTitle("Desafio");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().add(getLabelTitlePanel());
		getContentPane().add(getLabelBola());
		getContentPane().add(getButtonLancar());
		getContentPane().add(getPanel());
		setVisible(true);
	}
	
	public JLabel getLabelTitlePanel() {
		if (labelTitlePanel == null) {
			labelTitlePanel = new JLabel("Animação da Bola Caindo");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 25));
			labelTitlePanel.setBounds(150, 10, 283, 31);
		}
		return labelTitlePanel;
	}
	
	public JLabel getLabelBola() {
		if (labelBola == null) {
			labelBola = new JLabel();
			labelBola.setIcon(new ImageIcon("C:\\Users\\Will\\OneDrive\\Documentos\\AreaDEV\\Acadêmico\\uesb\\uesb-java\\projetos-desafios\\projeto-animacao\\src\\imagem\\bola-de-futebol.png"));
			labelBola.setBounds(150, 60, 40, 40);
		}
		return labelBola;
	}
	
	public JButton getButtonLancar() {
		if (buttonLancar == null) {
			buttonLancar = new JButton("Começar");
			buttonLancar.setBounds(371, 64, 120, 30);
			buttonLancar.setFont(new Font("Arial", Font.BOLD, 16));
		}
		return buttonLancar;
	}
	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setBackground(new Color(0, 0, 0));
			panel.setBounds(0, 750, 600, 15);
		}
		return panel;
	}
}

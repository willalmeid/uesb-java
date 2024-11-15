package visual;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Frame extends JFrame {

	private JPanel panel;
	private JButton buttonExibir;
	private JLabel labelTitlePanel;
	private JLabel labelLado1;
	private JButton buttonAnterior;
	private JButton butttonProximo;
	private JTextField textFieldLado1;
	private JLabel labelLado2;
	private JTextField textFieldLado2;
	private JLabel labelLado3;
	private JTextField textFieldLado3;
	private JLabel labelTrianguloAtual;
	private JButton buttonDelete;
	private JButton buttonAdicionar;
	
	public Frame() {
		setVisible(true);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		setContentPane(getPanel());
		
		repaint();
		revalidate();
	}
	
	public JPanel getPanel() {
		if(panel == null) {
			panel = new JPanel();
			panel.setLayout(null);
			panel.add(getButtonExibir());
			panel.add(getLabelTitlePanel());
			panel.add(getLabelLado1());
			panel.add(getButtonAnterior());
			panel.add(getButtonProximo());
			panel.add(getTextFieldLado1());
			panel.add(getLabelLado2());
			panel.add(getTextFieldLado2());
			panel.add(getLabelLado3());
			panel.add(getTextFieldLado3());
			panel.add(getLabelTrianguloAtual());
			panel.add(getButtonDelete());
			panel.add(getButtonAdicionar());
		}
		return panel;
	}
	
	public JLabel getLabelTitlePanel() {
		if (labelTitlePanel == null) {
			labelTitlePanel = new JLabel("Triângulos");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(309, 50, 165, 44);
		}
		return labelTitlePanel;
	}
	
	public JButton getButtonExibir() {
		if(buttonExibir == null) {
			buttonExibir = new JButton();
			buttonExibir.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonExibir.setText("Exibir");
			buttonExibir.setBounds(342, 500, 100, 30);
		}
		return buttonExibir;
	}
	
	public JLabel getLabelLado1() {
		if (labelLado1 == null) {
			labelLado1 = new JLabel("Lado 1");
			labelLado1.setVisible(false);
			labelLado1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			labelLado1.setBounds(94, 201, 75, 31);
		}
		return labelLado1;
	}
	
	public JLabel getLabelLado2() {
		if (labelLado2 == null) {
			labelLado2 = new JLabel("Lado 2");
			labelLado2.setVisible(false);
			labelLado2.setFont(new Font("Tahoma", Font.PLAIN, 25));
			labelLado2.setBounds(94, 265, 75, 31);
		}
		return labelLado2;
	}
	
	public JLabel getLabelLado3() {
		if (labelLado3 == null) {
			labelLado3 = new JLabel("Lado 3");
			labelLado3.setVisible(false);
			labelLado3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			labelLado3.setBounds(94, 325, 75, 31);
		}
		return labelLado3;
	}
	
	public JTextField getTextFieldLado1() {
		if (textFieldLado1 == null) {
			textFieldLado1 = new JTextField();
			textFieldLado1.setVisible(false);
			textFieldLado1.setFont(new Font("Tahoma", Font.PLAIN, 25));
			textFieldLado1.setBounds(192, 198, 216, 37);
			textFieldLado1.setColumns(10);
		}
		return textFieldLado1;
	}
	
	public JTextField getTextFieldLado2() {
		if (textFieldLado2 == null) {
			textFieldLado2 = new JTextField();
			textFieldLado2.setVisible(false);
			textFieldLado2.setFont(new Font("Tahoma", Font.PLAIN, 25));
			textFieldLado2.setColumns(10);
			textFieldLado2.setBounds(192, 262, 216, 37);
		}
		return textFieldLado2;
	}
	
	public JTextField getTextFieldLado3() {
		if (textFieldLado3 == null) {
			textFieldLado3 = new JTextField();
			textFieldLado3.setVisible(false);
			textFieldLado3.setFont(new Font("Tahoma", Font.PLAIN, 25));
			textFieldLado3.setColumns(10);
			textFieldLado3.setBounds(192, 322, 216, 37);
		}
		return textFieldLado3;
	}
	
	public JLabel getLabelTrianguloAtual() {
		if (labelTrianguloAtual == null) {
			labelTrianguloAtual = new JLabel("");
			labelTrianguloAtual.setVisible(false);
			labelTrianguloAtual.setFont(new Font("Tahoma", Font.PLAIN, 99));
			labelTrianguloAtual.setBounds(496, 220, 108, 120);
		}
		return labelTrianguloAtual;
	}
	
	public JButton getButtonAnterior() {
		if (buttonAnterior == null) {
			buttonAnterior = new JButton("<");
			buttonAnterior.setEnabled(false);
			buttonAnterior.setVisible(false);
			buttonAnterior.setFont(new Font("Tahoma", Font.BOLD, 14));
			buttonAnterior.setBounds(50, 493, 45, 45);
		}
		return buttonAnterior;
	}
	
	public JButton getButtonProximo() {
		if (butttonProximo == null) {
			butttonProximo = new JButton(">");
			butttonProximo.setVisible(false);
			butttonProximo.setFont(new Font("Tahoma", Font.BOLD, 14));
			butttonProximo.setBounds(691, 493, 45, 45);
		}
		return butttonProximo;
	}
	public JButton getButtonDelete() {
		if (buttonDelete == null) {
			buttonDelete = new JButton();
			buttonDelete.setVisible(false);
			buttonDelete.setText("Deletar");
			buttonDelete.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonDelete.setBounds(256, 370, 100, 30);
		}
		return buttonDelete;
	}
	public JButton getButtonAdicionar() {
		if (buttonAdicionar == null) {
			buttonAdicionar = new JButton();
			buttonAdicionar.setEnabled(false);
			buttonAdicionar.setVisible(false);
			buttonAdicionar.setText("Adicionar");
			buttonAdicionar.setFont(new Font("Tahoma", Font.PLAIN, 14));
			buttonAdicionar.setBounds(342, 500, 100, 30);
		}
		return buttonAdicionar;
	}
}

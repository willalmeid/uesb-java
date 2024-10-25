package visual;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class PanelInicial extends JPanel{
	private JLabel labelQuantidadeDeLados;
	private JTextField textFieldQuantidadeDeLados;
	
	private JLabel labelMensagemQuantidadeLados;
	private JLabel labelMensagemValorLados;
	private JLabel labelMensagemArea;
	
	private JLabel labelLado1;
	private JLabel labelLado2;
	private JLabel labelLado3;
	private JLabel labelLado4;
	private JLabel labelLado5;
	private JLabel labelLado6;
	
	private JTextField textFieldLado1;
	private JTextField textFieldLado2;
	private JTextField textFieldLado3;
	private JTextField textFieldLado4;
	private JTextField textFieldLado5;
	private JTextField textFieldLado6;

	private JButton buttonEnviar;
	private JButton buttonValorLados;
	private JLabel labelTitlePanel;
	private JLabel labelTitleValorArea;
	private JButton buttonReset;
	
	public PanelInicial() {
		setLayout(null);
		setSize(1280, 768);
		add(getLabelQuantidadeDeLados());
		add(getTextFieldQuantidadeDeLados());
		
		add(getLabelLado1());
		add(getLabelLado2());
		add(getLabelLado3());
		add(getLabelLado4());
		add(getLabelLado5());
		add(getLabelLado6());
		
		add(getTextFieldLado1());
		add(getTextFieldLado2());
		add(getTextFieldLado3());
		add(getTextFieldLado4());
		add(getTextFieldLado5());
		add(getTextFieldLado6());
		
		add(getButtonEnviar());
		add(getButtonValorLados());
		add(getLabelMensagemQuantidadeLados());
		add(getLabelMensagemValorLados());
		add(getLabelMensagemArea());
		add(getLabelTitlePanel());
		add(getLabelTitleValorArea());
		add(getButtonReset());
	}
	
	public JLabel getLabelQuantidadeDeLados() {
		if (labelQuantidadeDeLados == null) {
			labelQuantidadeDeLados = new JLabel("Digite a Quantidade de lados:");
			labelQuantidadeDeLados.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelQuantidadeDeLados.setBounds(314, 349, 205, 20);
		}
		return labelQuantidadeDeLados;
	}
	
	public JTextField getTextFieldQuantidadeDeLados() {
		if (textFieldQuantidadeDeLados == null) {
			textFieldQuantidadeDeLados = new JTextField();
			textFieldQuantidadeDeLados.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldQuantidadeDeLados.setBounds(314, 375, 205, 25);
			textFieldQuantidadeDeLados.setColumns(10);
		}
		return textFieldQuantidadeDeLados;
	}
	
	public JLabel getLabelLado1() {
		if (labelLado1 == null) {
			labelLado1 = new JLabel("Valor Lado 1");
			labelLado1.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado1.setEnabled(false);
			labelLado1.setBounds(701, 287, 100, 20);
		}
		return labelLado1;
	}
	
	public JTextField getTextFieldLado1() {
		if (textFieldLado1 == null) {
			textFieldLado1 = new JTextField();
			textFieldLado1.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldLado1.setEnabled(false);
			textFieldLado1.setBounds(701, 312, 100, 25);
			textFieldLado1.setColumns(10);
		}
		return textFieldLado1;
	}
	
	public JLabel getLabelLado2() {
		if (labelLado2 == null) {
			labelLado2 = new JLabel("Valor Lado 2");
			labelLado2.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado2.setEnabled(false);
			labelLado2.setBounds(701, 348, 100, 20);
		}
		return labelLado2;
	}
	
	public JTextField getTextFieldLado2() {
		if (textFieldLado2 == null) {
			textFieldLado2 = new JTextField();
			textFieldLado2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			textFieldLado2.setEnabled(false);
			textFieldLado2.setBounds(701, 373, 100, 25);
			textFieldLado2.setColumns(10);
		}
		return textFieldLado2;
	}
	
	public JLabel getLabelLado3() {
		if (labelLado3 == null) {
			labelLado3 = new JLabel("Valor Lado 3");
			labelLado3.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado3.setEnabled(false);
			labelLado3.setBounds(701, 409, 100, 20);
		}
		return labelLado3;
	}
	
	public JTextField getTextFieldLado3() {
		if (textFieldLado3 == null) {
			textFieldLado3 = new JTextField();
			textFieldLado3.setEnabled(false);
			textFieldLado3.setBounds(701, 434, 100, 25);
			textFieldLado3.setColumns(10);
		}
		return textFieldLado3;
	}
	
	public JLabel getLabelLado4() {
		if (labelLado4 == null) {
			labelLado4 = new JLabel("Valor Lado 4");
			labelLado4.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado4.setEnabled(false);
			labelLado4.setBounds(836, 287, 100, 20);
		}
		return labelLado4;
	}
	
	public JTextField getTextFieldLado4() {
		if (textFieldLado4 == null) {
			textFieldLado4 = new JTextField();
			textFieldLado4.setEnabled(false);
			textFieldLado4.setBounds(836, 312, 100, 25);
			textFieldLado4.setColumns(10);
		}
		return textFieldLado4;
	}
	
	public JLabel getLabelLado5() {
		if (labelLado5 == null) {
			labelLado5 = new JLabel("Valor Lado 5");
			labelLado5.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado5.setEnabled(false);
			labelLado5.setBounds(836, 348, 100, 20);
		}
		return labelLado5;
	}
	
	public JTextField getTextFieldLado5() {
		if (textFieldLado5 == null) {
			textFieldLado5 = new JTextField();
			textFieldLado5.setEnabled(false);
			textFieldLado5.setBounds(836, 373, 100, 25);
			textFieldLado5.setColumns(10);
		}
		return textFieldLado5;
	}
	
	public JLabel getLabelLado6() {
		if (labelLado6 == null) {
			labelLado6 = new JLabel("Valor Lado 6");
			labelLado6.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelLado6.setEnabled(false);
			labelLado6.setBounds(836, 409, 100, 20);
		}
		return labelLado6;
	}
	
	public JTextField getTextFieldLado6() {
		if (textFieldLado6 == null) {
			textFieldLado6 = new JTextField();
			textFieldLado6.setEnabled(false);
			textFieldLado6.setBounds(836, 434, 100, 25);
			textFieldLado6.setColumns(10);
		}
		return textFieldLado6;
	}
	
	public JButton getButtonEnviar() {
		if(buttonEnviar == null) {
			buttonEnviar = new JButton("Enviar");
			buttonEnviar.setBounds(341, 410, 150, 25);
			
		}
		return buttonEnviar;
	}
	
	public JButton getButtonValorLados() {
		if(buttonValorLados == null) {
			buttonValorLados = new JButton("Calcular");
			buttonValorLados.setEnabled(false);
			buttonValorLados.setBounds(750, 470, 150, 25);
			
		}
		return buttonValorLados;
	}
	
	public JLabel getLabelMensagemQuantidadeLados() {
		if (labelMensagemQuantidadeLados == null) {
			labelMensagemQuantidadeLados = new JLabel("");
			labelMensagemQuantidadeLados.setBounds(314, 439, 205, 20);
		}
		return labelMensagemQuantidadeLados;
	}
	
	public JLabel getLabelMensagemValorLados() {
		if (labelMensagemValorLados == null) {
			labelMensagemValorLados = new JLabel("");
			labelMensagemValorLados.setBounds(701, 506, 235, 20);
		}
		return labelMensagemValorLados;
	}
	
	public JLabel getLabelMensagemArea() {
		if (labelMensagemArea == null) {
			labelMensagemArea = new JLabel("");
			labelMensagemArea.setBounds(567, 645, 142, 20);
		}
		return labelMensagemArea;
	}
	public JLabel getLabelTitlePanel() {
		if (labelTitlePanel == null) {
			labelTitlePanel = new JLabel("Calculo de Área de um Polígono");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(385, 130, 510, 50);
		}
		return labelTitlePanel;
	}
	public JLabel getLabelTitleValorArea() {
		if (labelTitleValorArea == null) {
			labelTitleValorArea = new JLabel("Valor da Área");
			labelTitleValorArea.setEnabled(false);
			labelTitleValorArea.setFont(new Font("Tahoma", Font.PLAIN, 15));
			labelTitleValorArea.setBounds(588, 620, 100, 20);
		}
		return labelTitleValorArea;
	}
	public JButton getButtonReset() {
		if (buttonReset == null) {
			buttonReset = new JButton("Novo Cálculo");
			buttonReset.setEnabled(false);
			buttonReset.setBounds(565, 673, 150, 25);
		}
		return buttonReset;
	}
}

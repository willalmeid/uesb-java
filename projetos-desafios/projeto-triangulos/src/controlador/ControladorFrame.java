package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Triangulo;
import visual.Frame;

public class ControladorFrame implements ActionListener {

	Frame frame;
	ArrayList<Triangulo> triangulos;
	
	int trianguloAtual = 1;
	boolean delete = false;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
	}
	
	public void addEventos() {
		frame.getButtonExibir().addActionListener(this);
		frame.getButtonDelete().addActionListener(this);
		frame.getButtonAdicionar().addActionListener(this);
		frame.getButtonProximo().addActionListener(this);
		frame.getButtonAnterior().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == frame.getButtonExibir()) {
			triangulos = new ArrayList<Triangulo>();
			
			ativarComponentes();
			
			for(int i = 1; i <= 10; i++) {
				triangulos.add(new Triangulo(i, i, i));
			}
	
			recarrecarLabels();
			frame.getButtonExibir().setEnabled(false);
			
		} else if(e.getSource() == frame.getButtonAdicionar()) {
			try {
				String lado1 = JOptionPane.showInputDialog(null, "Digite o valor do lado 1: ", "Adicionar Novo Triângulo", JOptionPane.PLAIN_MESSAGE);
				String lado2 = JOptionPane.showInputDialog(null, "Digite o valor do lado 2: ", "Adicionar Novo Triângulo", JOptionPane.PLAIN_MESSAGE);
				String lado3 = JOptionPane.showInputDialog(null, "Digite o valor do lado 3: ", "Adicionar Novo Triângulo", JOptionPane.PLAIN_MESSAGE);
				
				int l1 = Integer.parseInt(lado1);
		        int l2 = Integer.parseInt(lado2);
		        int l3 = Integer.parseInt(lado3);

		        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
		            triangulos.add(new Triangulo(l1, l2, l3));
		            JOptionPane.showMessageDialog(null, "Triângulo adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
		        } else {
		            JOptionPane.showMessageDialog(null, "Os valores inseridos não formam um triângulo válido.", "Erro", JOptionPane.ERROR_MESSAGE);
		        }
				
			} catch (NumberFormatException nfe){
				JOptionPane.showMessageDialog(null, "Por favor, insira valores numéricos válidos.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
			}
			
		} else if(e.getSource() == frame.getButtonDelete()) {
			deleteTriangulo();
			recarrecarLabels();
			
		} else if(e.getSource() == frame.getButtonAnterior()) {
			atualizarValores(Integer.parseInt(frame.getTextFieldLado1().getText()), Integer.parseInt(frame.getTextFieldLado2().getText()), Integer.parseInt(frame.getTextFieldLado3().getText()), e);
			trianguloAtual--;
			recarrecarLabels();
			
		} else if(e.getSource() == frame.getButtonProximo()) {			
			atualizarValores(Integer.parseInt(frame.getTextFieldLado1().getText()), Integer.parseInt(frame.getTextFieldLado2().getText()), Integer.parseInt(frame.getTextFieldLado3().getText()), e);
			trianguloAtual++;			
			recarrecarLabels();
		}
				
		trianguloAtual = Integer.parseInt(frame.getLabelTrianguloAtual().getText());
		verificarBotoes();
		
//		teste();
	}
	
	public void ativarComponentes() {
		frame.getButtonExibir().setVisible(false);
		
		frame.getButtonAdicionar().setVisible(true);
		frame.getButtonAdicionar().setEnabled(true);
		
		frame.getLabelLado1().setVisible(true);
		frame.getLabelLado2().setVisible(true);
		frame.getLabelLado3().setVisible(true);
		
		frame.getTextFieldLado1().setVisible(true);
		frame.getTextFieldLado2().setVisible(true);
		frame.getTextFieldLado3().setVisible(true);
		
		frame.getLabelTrianguloAtual().setVisible(true);
		
		frame.getButtonDelete().setVisible(true);
		frame.getButtonAnterior().setVisible(true);
		frame.getButtonProximo().setVisible(true);
	}
	
	public void recarrecarLabels() {
		frame.getLabelTrianguloAtual().setText("" + trianguloAtual);
		frame.getTextFieldLado1().setText(String.valueOf(triangulos.get(trianguloAtual - 1).getLado1()));
		frame.getTextFieldLado2().setText(String.valueOf(triangulos.get(trianguloAtual - 1).getLado2()));
		frame.getTextFieldLado3().setText(String.valueOf(triangulos.get(trianguloAtual - 1).getLado3()));
	}
	
	public void atualizarValores(int lado1, int lado2, int lado3, Object e) {
		
		if(delete) {
			return;
		}
		
		Triangulo triangulo = triangulos.get(trianguloAtual - 1);
		
		if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
			if(lado1 != triangulo.getLado1() || lado2 != triangulo.getLado2() || lado3 != triangulo.getLado3()) {
				triangulo.setLado1(lado1);
				triangulo.setLado2(lado2);
				triangulo.setLado3(lado3);
				
				JOptionPane.showMessageDialog(null, "Os valores foram alterados com sucesso!", "Alteração de Valores", JOptionPane.INFORMATION_MESSAGE);
			}			
		} else {
			if(e == frame.getButtonAnterior()) {
				trianguloAtual++;
			} else {
				trianguloAtual--;				
			}
			JOptionPane.showMessageDialog(null, "Os valores inseridos não formam um triângulo válido!", "Erro de Validação", JOptionPane.ERROR_MESSAGE);			
		}
		
	}
	
	public void verificarBotoes() {
		if(trianguloAtual == triangulos.size()) {
			frame.getButtonProximo().setEnabled(false);
		} else {
			frame.getButtonProximo().setEnabled(true);
		}
		
		if(trianguloAtual == 1 || trianguloAtual == 0) {
			frame.getButtonAnterior().setEnabled(false);
		} else {
			frame.getButtonAnterior().setEnabled(true);
		}
		
		if(triangulos.size() == 1) {
			frame.getButtonDelete().setEnabled(false);
		} else {
			frame.getButtonDelete().setEnabled(true);			
		}
	}
	
	public void deleteTriangulo() {
		triangulos.remove(trianguloAtual - 1);
		
		if (trianguloAtual > triangulos.size()) {
		    trianguloAtual--;  // Ajusta para o último triângulo caso seja removido o último item
		} else if (trianguloAtual == 1 && triangulos.isEmpty()) {
		    trianguloAtual = 0; // Nenhum triângulo restante, índice volta a zero
		}
		delete = true;
	}
	
	public void teste() {
		for(int i = 0; i < triangulos.size(); i++) {
			System.out.println("Triangulo " + (i + 1));
			System.out.println(triangulos.get(i).getLado1());
			System.out.println(triangulos.get(i).getLado2());
			System.out.println(triangulos.get(i).getLado3());
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		new ControladorFrame(frame);
	}
}

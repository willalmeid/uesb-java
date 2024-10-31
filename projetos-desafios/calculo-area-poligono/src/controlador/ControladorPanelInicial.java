package controlador;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

import visual.PanelInicial;

public class ControladorPanelInicial implements ActionListener{

	PanelInicial panelInicial;
	int quantidadeLados;
	
	public ControladorPanelInicial(PanelInicial panelInicial) {
		this.panelInicial = panelInicial;
		addEventos();
	}
	
	public void addEventos() {
		panelInicial.getButtonEnviar().addActionListener(this);
		panelInicial.getButtonValorLados().addActionListener(this);
		panelInicial.getButtonReset().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == panelInicial.getButtonEnviar()) {
			ativarInputs();

		} else if(e.getSource() == panelInicial.getButtonValorLados()) {
			verificarValores();
			
		} else if(e.getSource() == panelInicial.getButtonReset()) {
			resetarPanel();
			
		}
	}
	
	public void ativarInputs() {

	    try {
	        quantidadeLados = Integer.parseInt(panelInicial.getTextFieldQuantidadeDeLados().getText());
	    } catch (NumberFormatException e) {
	        panelInicial.getLabelMensagemQuantidadeLados().setText("Digite um número válido.");
	        return;
	    }

	    if (quantidadeLados >= 3 && quantidadeLados <= 6) {
	    	alterarElementosPanel(true);
	        panelInicial.getLabelMensagemQuantidadeLados().setText("Dado " + quantidadeLados + " lados, digite:");
	        
	    } else {
	        panelInicial.getLabelMensagemQuantidadeLados().setText("Digite um número entre 3 e 6.");
	        
	    }
	}
	
	public void verificarValores() {
		try {
		    int qtd = Integer.parseInt(panelInicial.getTextFieldQuantidadeDeLados().getText());
		    float[] lados = obterLados(qtd);

		    if (lados == null) {
		        panelInicial.getLabelMensagemValorLados().setText("Algum dos valores está inválido.");
		        return;
		    }

		    double mediaLado = calcularMediaLado(lados);
		    
		    if (formaValida(lados)) {
		        double area = calcularArea(qtd, mediaLado);
		        panelInicial.getLabelMensagemArea().setText("Área: " + area);

		        alterarElementosPanel(false);
		        
		        panelInicial.getButtonEnviar().setEnabled(false);
	            panelInicial.getTextFieldQuantidadeDeLados().setEnabled(false);
		        
		        panelInicial.getButtonReset().setEnabled(true);
		    } else {
		        panelInicial.getLabelMensagemArea().setText("Área Inválida");
		    }
		} catch (NumberFormatException nfe) {
		    panelInicial.getLabelMensagemValorLados().setText("Algum dos valores está inválido.");
		}
	}
	
	public void resetarPanel() {
		panelInicial.getButtonReset().setEnabled(false);
		panelInicial.getButtonValorLados().setEnabled(false);
		panelInicial.getButtonEnviar().setEnabled(true);
		
		panelInicial.getLabelMensagemArea().setText("");
		panelInicial.getTextFieldQuantidadeDeLados().setText("");
		panelInicial.getLabelMensagemQuantidadeLados().setText("");
		
		alterarElementosPanel(false);
	}
	
	
	/* --------------------------------------------------------- Métodos auxiliares ------------------------------------------------------------- */
	private float[] obterLados(int qtd) {
	    try {
	        float[] lados = new float[qtd];
	        for (int i = 0; i < qtd; i++) {
	            JTextField textField = (JTextField) panelInicial.getClass().getMethod("getTextFieldLado" + (i + 1)).invoke(panelInicial);
	            lados[i] = Float.parseFloat(textField.getText());
	        }
	        return lados;
	    } catch (Exception e) {
	        return null;
	    }
	}
	
	private double calcularMediaLado(float[] lados) {
	    double soma = 0;
	    for (float lado : lados) {
	        soma += lado;
	    }
	    return soma / lados.length;
	}
	
	private boolean formaValida(float[] lados) {
	    for (int i = 0; i < lados.length; i++) {
	        float somaRestante = 0;
	        for (int j = 0; j < lados.length; j++) {
	            if (i != j) {
	            	somaRestante += lados[j];
	            }
	        }
	        if (lados[i] >= somaRestante) {
	        	return false;
	        }
	    }
	    return true;
	}

	private double calcularArea(int qtd, double mediaLado) {
	    switch (qtd) {
	        case 3:
	            return mediaLado * (mediaLado * Math.sqrt(3) / 2) / 2;
	        case 4:
	            return mediaLado * mediaLado;
	        case 5:
	            return mediaLado * 5 * (mediaLado / (2 * Math.tan(0.6283)) / 2);
	        case 6:
	            return 3 * mediaLado * mediaLado * (Math.sqrt(3) / 2);
	        default:
	            throw new IllegalArgumentException("Número de lados não suportado: " + qtd);
	    }
	}
	
	private void alterarElementosPanel(boolean b) {
		try {
            for (int i = 1; i <= quantidadeLados; i++) {
                // Obtém e habilita o JLabel correspondente            	
                Method getLabelMethod = panelInicial.getClass().getMethod("getLabelLado" + i);
                JLabel label = (JLabel) getLabelMethod.invoke(panelInicial);
                label.setEnabled(b);

                // Obtém e habilita o JTextField correspondente
                Method getTextFieldMethod = panelInicial.getClass().getMethod("getTextFieldLado" + i);
                JTextField textField = (JTextField) getTextFieldMethod.invoke(panelInicial);
                textField.setEnabled(b);
                textField.setText("");
            }

            panelInicial.getButtonValorLados().setEnabled(b);
            
            // Desativa os campos e botão após a seleção
            panelInicial.getButtonEnviar().setEnabled(!b);
            panelInicial.getTextFieldQuantidadeDeLados().setEnabled(!b);

        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            // Exibe a pilha de erros para facilitar o debug
            e.printStackTrace();
        }
	}
}

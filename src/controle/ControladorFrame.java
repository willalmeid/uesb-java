package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;

import visual.Frame;

public class ControladorFrame implements ActionListener {

	private Frame frame;
	Timer timer;
    
    int posicaoY = 500;
    double velocidade = 0;
    double aceleracao = 10;
    long tempoIntervalo = 20;
    int frameAtual = 0;
    int contador = 0;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		addEventos();
	}
	
	public void addEventos() {
		frame.getButtonStart().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == frame.getButtonStart()) {
			iniciarSimulacao();
		}
		
	}
	
	public void iniciarSimulacao() {
		frame.getButtonStart().setEnabled(false);
		
		contador = 0;
        velocidade = 8; // valor que respondeu melhor
        
        if (timer != null) {
            timer.cancel(); // Cancela qualquer timer anterior para evitar conflitos
        }
        
        timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                atualizarPosicao(); // Chama a função de atualização da posição
                System.out.println(contador);
                contador++;
            }
        }, 0, tempoIntervalo); // Intervalo definido para cada 20ms
	}
	
	public void atualizarPosicao() {
		
		posicaoY -= (int) velocidade;
        velocidade -= (aceleracao * tempoIntervalo) / 1000;

        if (posicaoY >= 501) {
            finalizarSimulacao();
        }

        frame.getLabelBoneco().setBounds(259, posicaoY, 66, 95); // Atualiza a posição no frame
        if(contador%4 == 0) {
        	atualizarSprite();        	
        }
	}
	
	private void atualizarSprite() {
        // Atualiza o sprite de 0.png até 20.png
        String caminho = String.format("sprite_goku/%d.png", frameAtual);
        frame.getLabelBoneco().setIcon(new ImageIcon(caminho));

        frameAtual = (frameAtual + 1) % 21; // Reinicia o contador após o último sprite
    }
	
	private void finalizarSimulacao() {
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        frame.getButtonStart().setEnabled(true);
        frameAtual = 0;
        frame.getLabelBoneco().setIcon(new ImageIcon("sprite_goku/0.png"));
    }
	
	public static void main(String[] args) {
		new ControladorFrame(new Frame());
	}

}

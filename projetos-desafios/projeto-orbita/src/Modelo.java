import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Modelo extends JPanel implements ActionListener {
    private final int WIDTH = 1000;
    private final int HEIGHT = 1000;
    private final int STAR_RADIUS = 20; // Tamanho da estrela
    private final int BODY_RADIUS = 5;  // Tamanho do corpo celeste
    private final int ORBIT_RADIUS_X = 300; // Raio do eixo x da órbita
    private final int ORBIT_RADIUS_Y = 200; // Raio do eixo y da órbita

    private double angle = 0; // Ângulo de rotação do corpo celeste

    public Modelo() {
        Timer timer = new Timer(20, this); // Timer para atualizar a animação
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Desenha a estrela no centro
        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - STAR_RADIUS, centerY - STAR_RADIUS, STAR_RADIUS * 2, STAR_RADIUS * 2);

        // Calcula a posição do corpo celeste na órbita
        int bodyX = (int) (centerX + ORBIT_RADIUS_X * Math.cos(angle));
        int bodyY = (int) (centerY + ORBIT_RADIUS_Y * Math.sin(angle));

        // Desenha o corpo celeste
        g2d.setColor(Color.RED);
        g2d.fillOval(bodyX - BODY_RADIUS, bodyY - BODY_RADIUS, BODY_RADIUS * 2, BODY_RADIUS * 2);

        // Desenha a órbita (opcional)
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawOval(centerX - ORBIT_RADIUS_X, centerY - ORBIT_RADIUS_Y, ORBIT_RADIUS_X * 2, ORBIT_RADIUS_Y * 2);
    }

    public Dimension getPreferredSize() {
        return new Dimension(WIDTH, HEIGHT);
    }

    public void actionPerformed(ActionEvent e) {
        angle += 0.01; // Incremento do ângulo para criar o movimento
        repaint(); // Atualiza o painel para redesenhar o corpo celeste
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Simulação de Órbita");
        Modelo orbitPanel = new Modelo();
        frame.add(orbitPanel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

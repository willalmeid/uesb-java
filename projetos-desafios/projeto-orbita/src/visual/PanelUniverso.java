package visual;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

public class PanelUniverso extends JPanel{

	private JButton buttonComecar;
	
	private final int WIDTH = 1280;
    private final int HEIGHT = 768;
    private final int STAR_RADIUS = 20;
    private final int BODY_RADIUS = 5;
    private final int ORBIT_RADIUS_X = 300;
    private final int ORBIT_RADIUS_Y = 200;
    
    private double angle = 0;
    private JLabel labelTitlePanel;
	
	public PanelUniverso() {
		setSize(1280, 768);
		setLayout(null);
		add(getButtonComecar());
		add(getLabelTitlePanel());
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        
        // Desenha a estrela
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(centerX - STAR_RADIUS, centerY - STAR_RADIUS, STAR_RADIUS * 2, STAR_RADIUS * 2);

        // Calcula e desenha a posição do corpo celeste
        int bodyX = (int) (centerX + ORBIT_RADIUS_X * Math.cos(angle));
        int bodyY = (int) (centerY + ORBIT_RADIUS_Y * Math.sin(angle));

        g2d.setColor(Color.RED);
        g2d.fillOval(bodyX - BODY_RADIUS, bodyY - BODY_RADIUS, BODY_RADIUS * 2, BODY_RADIUS * 2);

        // Desenha a órbita
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawOval(centerX - ORBIT_RADIUS_X, centerY - ORBIT_RADIUS_Y, ORBIT_RADIUS_X * 2, ORBIT_RADIUS_Y * 2);
    }
	
	public void atualizarAngulo(double incremento) {
        angle += incremento;
        repaint();
    }

	public JButton getButtonComecar() {
		if(buttonComecar == null) {
			buttonComecar = new JButton();
			buttonComecar.setBounds(590, 100, 100, 30);
			buttonComecar.setText("BIG BANG");
		}
		return buttonComecar;
	}
	public JLabel getLabelTitlePanel() {
		if (labelTitlePanel == null) {
			labelTitlePanel = new JLabel("Simulação de Orbita");
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setBounds(480, 26, 319, 44);
		}
		return labelTitlePanel;
	}
}

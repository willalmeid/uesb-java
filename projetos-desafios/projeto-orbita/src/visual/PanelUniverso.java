package visual;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class PanelUniverso extends JPanel{

	private JLabel labelTitlePanel;
	private JLabel imageSol;
	private JLabel imageTerra;
	
	private JButton buttonComecar;

	private final int WIDTH = 1280;
    private final int HEIGHT = 768;
    private final int STAR_RADIUS = 50;
    private final int ORBIT_RADIUS_X = 300;
    private final int ORBIT_RADIUS_Y = 200;
    
    private double angle = 0;
    
	public PanelUniverso() {
		setSize(1280, 768);
		setLayout(null);
		add(getButtonComecar());
		add(getLabelTitlePanel());
		add(getImageSol());
		add(getImageTerra());
	}
	
	protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        int centerX = WIDTH / 2;
        int centerY = HEIGHT / 2;
        
        // Desenha a estrela
        imageSol.setBounds(centerX - 32, centerY - 32, 64, 64);

        // Desenha a órbita
        g2d.setColor(Color.LIGHT_GRAY);
        g2d.drawOval(centerX - ORBIT_RADIUS_X, centerY - ORBIT_RADIUS_Y, ORBIT_RADIUS_X * 2, ORBIT_RADIUS_Y * 2);
        
        // Calcula e desenha a posição do corpo celeste
        int bodyX = (int) (centerX + ORBIT_RADIUS_X * Math.cos(angle));
        int bodyY = (int) (centerY + ORBIT_RADIUS_Y * Math.sin(angle));
       
        imageTerra.setBounds(bodyX - 16, bodyY - 16, 32, 32);
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
	
	public JLabel getImageSol() {
		if(imageSol == null) {
			imageSol = new JLabel("");
			imageSol.setIcon(new ImageIcon(PanelUniverso.class.getResource("/imagem/sol.png")));
			imageSol.setBounds(STAR_RADIUS, STAR_RADIUS, 64, 64);
		}
		return imageSol;
	}
	public JLabel getImageTerra() {
		if (imageTerra == null) {
			imageTerra = new JLabel("");
			try {
				imageTerra.setIcon(new ImageIcon(ImageIO.read(PanelUniverso.class.getResourceAsStream("/imagem/sprite.png")).getSubimage(0, 0, 32, 32)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			imageTerra.setBounds(241, 436, 32, 32);
		}
		return imageTerra;
	}
	
	public double getAngle() {
		return angle;
	}
	
	public void setAngle(double angle) {
		this.angle = angle;
	}
}

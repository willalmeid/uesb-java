package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.Timer;

import visual.PanelUniverso;

public class ControladorPanelUniverso implements ActionListener {

	PanelUniverso panelUniverso;
	private Timer timer;
	
	private BufferedImage spriteSheet;
    private BufferedImage[] frames;
    private int currentFrame = 0;
	
	public ControladorPanelUniverso(PanelUniverso panelUniverso) {
		this.panelUniverso = panelUniverso;
		loadFrames();
		addEventos();
	}
	
	public void addEventos() {
		panelUniverso.getButtonComecar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelUniverso.getButtonComecar()) {
			iniciarGalaxia();
        } else if (e.getSource() == timer) {
            atualizarAngulo(0.03);
            updateFrame();
        }
	}
	
	public void atualizarAngulo(double incremento) {
        panelUniverso.setAngle(panelUniverso.getAngle() + incremento);
        panelUniverso.repaint();
    }
	
	public void loadFrames() {
		try {
           spriteSheet = ImageIO.read(PanelUniverso.class.getResourceAsStream("/imagem/sprite.png"));
           if (spriteSheet == null) {
               throw new IllegalArgumentException("Imagem sprite não encontrada no caminho especificado.");
           }

           frames = new BufferedImage[30];
           int frameWidth = 32;
           int frameHeight = 32;
           int framesPerRow = 5; // Número de frames em cada fileira (exceto a última)

           for (int i = 0; i < 30; i++) {
               // Calcula a posição x e y para cada frame
               int x = (i % framesPerRow) * frameWidth;
               int y = (i / framesPerRow) * frameHeight;

               

               frames[i] = spriteSheet.getSubimage(x, y, frameWidth, frameHeight);
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
	}

	public void updateFrame() {
        // Atualiza o JLabel com o próximo quadro
        panelUniverso.getImageTerra().setIcon(new ImageIcon(frames[currentFrame]));
        currentFrame = (currentFrame + 1) % 30;
    }
	
	public void iniciarGalaxia() {
        if (timer == null) {
            timer = new Timer(70, this);
            timer.start();
        }
    }

}

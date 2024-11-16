package styles;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;

public class Buttons extends JButton {
	public Buttons(String text) {
		setText(text);
		setFont(Thema.FONT_LABELS_INPUTS);
		setPreferredSize(new Dimension(160, 80));
		setAlignmentX(Component.CENTER_ALIGNMENT);
		setBackground(Thema.WHITE);
		setForeground(Thema.AUXILIAR);
		setBorderPainted(false);
		setFocusPainted(false);
		setOpaque(false);
		setContentAreaFilled(true);
	}
	
	public void paintBorder(Graphics g) {
        // Não faz nada, pois queremos controlar a borda manualmente
    }
	
	protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Preenchendo o fundo com cor arredondada
        g2.setColor(Thema.WHITE);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 10, 10); // 20, 20 define os cantos arredondados

        // Desenhando a borda arredondada
        g2.setColor(Thema.AUXILIAR);
        g2.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, 10, 10); // Borda arredondada

        g2.dispose();
        super.paintComponent(g); // Continua desenhando o conteúdo do botão
    }
}

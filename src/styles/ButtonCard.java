package styles;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ButtonCard extends JButton {
    public ButtonCard(String text) {
    	setText(text);
        setFont(Thema.FONT_BUTTON_NAVEGACAO);
        setBackground(Thema.TRANSPARENT);
        setForeground(Thema.PRINCIPAL);
        setPreferredSize(new Dimension(300, 300));
        
        setAlignmentX(Component.CENTER_ALIGNMENT);
        setVerticalTextPosition(SwingConstants.BOTTOM); // Texto embaixo
        setHorizontalTextPosition(SwingConstants.CENTER); // Centralizado
        
        setBorderPainted(false);          // Não desenhar borda padrão
        setFocusPainted(false);           // Não desenhar borda de foco
        setOpaque(true);                  // Garantir que o botão seja opaco
        setContentAreaFilled(true);       // Habilitar a área de conteúdo preenchida
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

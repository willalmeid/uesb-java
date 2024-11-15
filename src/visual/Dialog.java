package visual;

import java.awt.Component;

import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Dialog extends JDialog {
    
    public Dialog(Component panel) {
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(15);
        setContentPane(scrollPane);

        setSize(830, 600);
        setResizable(false);
        setLocationRelativeTo(panel);
        setVisible(true);

        // Torna o JDialog modal, para que o usuário não possa interagir com o restante da interface até fechá-lo
        setModal(true); 
    }
}

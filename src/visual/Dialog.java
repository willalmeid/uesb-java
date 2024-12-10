package visual;

import java.awt.Component;

import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class Dialog extends JDialog {
    
    public Dialog(Frame frame, Component panel) {
    	super(frame, false);
    	
        JScrollPane scrollPane = new JScrollPane(panel);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setUnitIncrement(15);
        setContentPane(scrollPane);

        setVisible(true);
        setSize(830, 600);
        setResizable(false);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(frame);

        // Torna o JDialog modal, para que o usuário não possa interagir com o restante da interface até fechá-lo
//        setModal(true); 
    }
}

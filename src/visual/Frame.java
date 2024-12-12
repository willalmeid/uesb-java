package visual;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;

public class Frame extends JFrame {

	public Frame() {
		super();
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource("/assets/icons/icon-adicionar.png")));
		this.setVisible(true);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 1264, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGap(0, 729, Short.MAX_VALUE)
		);
		getContentPane().setLayout(groupLayout);
	}
}

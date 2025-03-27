package visual;

import javax.swing.JFrame;

import styles.Icons;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Toolkit;

public class Frame extends JFrame {

	public Frame() {
		super();
		this.setVisible(true);
		this.setSize(1280, 720);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setTitle("Sistema Hospitalar - Almeida e Bezerra");
		this.setIconImage(Toolkit.getDefaultToolkit().getImage(Frame.class.getResource(Icons.ICON_FRAME)));
		
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

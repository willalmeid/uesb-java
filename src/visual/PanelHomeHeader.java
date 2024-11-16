package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import styles.Thema;

public class PanelHomeHeader extends JPanel{
	
	private JLabel labelLogo;
	private JLabel labelNome;
	private JLabel labelFrase;
	
	public PanelHomeHeader() {
		setBackground(Thema.PRINCIPAL);
		GroupLayout gl_panelHeader = new GroupLayout(this);
		gl_panelHeader.setHorizontalGroup(
			gl_panelHeader.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHeader.createSequentialGroup()
					.addGap(208)
					.addComponent(getLabelLogo())
					.addPreferredGap(ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
					.addGroup(gl_panelHeader.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panelHeader.createSequentialGroup()
							.addComponent(getLabelFrase())
							.addGap(183))
						.addGroup(Alignment.TRAILING, gl_panelHeader.createSequentialGroup()
							.addComponent(getLabelNome())
							.addGap(218))))
		);
		gl_panelHeader.setVerticalGroup(
			gl_panelHeader.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelHeader.createSequentialGroup()
					.addGroup(gl_panelHeader.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelHeader.createSequentialGroup()
							.addGap(25)
							.addComponent(getLabelLogo()))
						.addGroup(gl_panelHeader.createSequentialGroup()
							.addGap(37)
							.addComponent(getLabelNome())
							.addGap(11)
							.addComponent(getLabelFrase())))
					.addContainerGap(246, Short.MAX_VALUE))
		);
		setLayout(gl_panelHeader);
	}

	public JLabel getLabelLogo() {
		if (labelLogo == null) {
			labelLogo = new JLabel("");
			labelLogo.setIcon(new ImageIcon(PanelHomeHeader.class.getResource("/assets/logo-fundo-transparente-129x150.png")));
			labelLogo.setFont(new Font("Tahoma", Font.PLAIN, 99));
		}
		return labelLogo;
	}
	public JLabel getLabelNome() {
		if (labelNome == null) {
			labelNome = new JLabel("ALMEIDA & BEZERRA");
			labelNome.setForeground(new Color(0, 0, 0));
			labelNome.setFont(new Font("Tahoma", Font.PLAIN, 50));
		}
		return labelNome;
	}
	public JLabel getLabelFrase() {
		if (labelFrase == null) {
			labelFrase = new JLabel("Cuidando de vidas com tecnologia e humanidade");
			labelFrase.setForeground(new Color(255, 255, 255));
			labelFrase.setFont(new Font("Tahoma", Font.PLAIN, 25));
		}
		return labelFrase;
	}
}

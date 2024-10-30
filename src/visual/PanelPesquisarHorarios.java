package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelPesquisarHorarios extends JPanel {

	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelPesquisarHorarios() {
		setBackground(new Color(128, 64, 64));
		setSize(1280, 750);
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}

	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Pesquisar Horários");
			labelTitlePanel.setBounds(488, 30, 303, 76);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(128, 0, 0));
			panelPrincipal.setLocation(207, 136);
			panelPrincipal.setSize(500, 400);
			panelPrincipal.setBounds(30, 135, 1220, 490);
		}
		return panelPrincipal;
	}
}

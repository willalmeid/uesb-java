package visual;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelVisualizarAgenda extends JPanel {

	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelVisualizarAgenda() {
		setBackground(new Color(2, 82, 112));
		setSize(1280, 750);
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}
	
	public JLabel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new JLabel();
			labelTitlePanel.setForeground(new Color(255, 255, 255));
			labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
			labelTitlePanel.setText("Visualizar Agenda");
			labelTitlePanel.setBounds(497, 50, 279, 44);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(207, 136);
			panelPrincipal.setSize(500, 400);
			panelPrincipal.setBounds(140, 150, 1000, 490);
		}
		return panelPrincipal;
	}

}

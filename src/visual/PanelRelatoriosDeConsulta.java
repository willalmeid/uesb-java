package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelRelatoriosDeConsulta extends JPanel {

	private JLabel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelRelatoriosDeConsulta() {
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
			labelTitlePanel.setText("Relatório de Consulta");
			labelTitlePanel.setBounds(467, 30, 345, 76);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBackground(new Color(204, 229, 233));
			panelPrincipal.setLocation(207, 136);
			panelPrincipal.setSize(500, 400);
			panelPrincipal.setBounds(30, 135, 1220, 490);
		}
		return panelPrincipal;
	}

}

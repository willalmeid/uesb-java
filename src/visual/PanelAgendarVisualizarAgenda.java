package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;

public class PanelAgendarVisualizarAgenda extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelAgendarVisualizarAgenda() {
		setBackground(Thema.PRINCIPAL);
		setSize(830, 600);
		setLayout(null);
		
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}
	
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Visualizar Agenda");
			labelTitlePanel.setBounds(260, 50, 309, 44);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.WHITE);
			panelPrincipal.setSize(500, 400);
			panelPrincipal.setBounds(10, 105, 770, 430);
		}
		return panelPrincipal;
	}

}
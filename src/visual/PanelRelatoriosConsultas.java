package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;
import javax.swing.JLabel;

public class PanelRelatoriosConsultas extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JLabel lblNewLabel;
	
	public PanelRelatoriosConsultas() {
		setSize(830, 600);
		setLayout(null);
		setBackground(Thema.PRINCIPAL);
		add(getPanelMain());
		add(getLabelTitlePanel());
	}

	public JPanel getPanelMain() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setLocation(20, 80);
			panelPrincipal.setSize(760, 440);
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.BACKGROUND);
			panelPrincipal.setLayout(null);
		}
		return panelPrincipal;
	}
	
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Relatórios de Consultas");
			labelTitlePanel.setBounds(209, 22, 412, 39);
		}
		return labelTitlePanel;
	}
}

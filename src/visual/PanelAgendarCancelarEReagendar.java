package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;

public class PanelAgendarCancelarEReagendar extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelAgendarCancelarEReagendar() {
		setBackground(Thema.PRINCIPAL);
		setSize(830, 600);
		setLayout(null);
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}

	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Reagendar ou Cancelar");
			labelTitlePanel.setBounds(212, 51, 406, 44);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.WHITE);
			panelPrincipal.setBounds(10, 106, 777, 460);
		}
		return panelPrincipal;
	}
}
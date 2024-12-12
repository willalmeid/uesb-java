package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;

public class PanelAgendamentoPesquisarHorarios extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	
	public PanelAgendamentoPesquisarHorarios() {
		setBackground(Thema.PRINCIPAL);
		setSize(830, 600);
		setLayout(null);
		
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}

	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Pesquisar Horários");
			labelTitlePanel.setBounds(251, 50, 328, 44);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.BACKGROUND);
			panelPrincipal.setBounds(10, 105, 779, 429);
		}
		return panelPrincipal;
	}
}
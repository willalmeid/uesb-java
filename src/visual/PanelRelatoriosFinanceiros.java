package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelRelatoriosFinanceiros extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JLabel lblNewLabel;
	private JTextArea textAreaRelatorio;
	
	public PanelRelatoriosFinanceiros() {
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
			panelPrincipal.add(getTextAreaRelatorio());
		}
		return panelPrincipal;
	}
	
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Relatório Financeiro");
			labelTitlePanel.setBounds(209, 22, 412, 39);
		}
		return labelTitlePanel;
	}
	public JTextArea getTextAreaRelatorio() {
		if (textAreaRelatorio == null) {
			textAreaRelatorio = new JTextArea();
			textAreaRelatorio.setBounds(24, 42, 708, 371);
		}
		return textAreaRelatorio;
	}
}

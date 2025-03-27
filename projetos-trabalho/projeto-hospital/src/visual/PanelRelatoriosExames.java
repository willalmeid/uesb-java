package visual;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;

public class PanelRelatoriosExames extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JTextArea textAreaRelatorioExames;
	
	public PanelRelatoriosExames() {
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
			panelPrincipal.add(getScrollPaneRelatorioExames());
		}
		return panelPrincipal;
	}
	
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Relatórios de Exames");
			labelTitlePanel.setBounds(209, 22, 412, 39);
		}
		return labelTitlePanel;
	}
	
	private JScrollPane getScrollPaneRelatorioExames() {
        JScrollPane scrollPane = new JScrollPane(getTextAreaRelatorioExames());
        scrollPane.setBounds(50, 20, 660, 409);
        return scrollPane;
    }
	
	public JTextArea getTextAreaRelatorioExames() {
		if (textAreaRelatorioExames == null) {
			textAreaRelatorioExames = new JTextArea();
			textAreaRelatorioExames.setBounds(25, 25, 711, 391);
		}
		return textAreaRelatorioExames;
	}
}

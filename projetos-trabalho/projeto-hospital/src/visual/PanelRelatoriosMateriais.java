package visual;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;

public class PanelRelatoriosMateriais extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JTextArea textAreaRelatorioMateriais;
	
	public PanelRelatoriosMateriais() {
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
			panelPrincipal.add(getScrollPaneRelatorioMaterias());
		}
		return panelPrincipal;
	}
	
	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Relatórios de Materiais");
			labelTitlePanel.setBounds(209, 22, 412, 39);
		}
		return labelTitlePanel;
	}
	
	private JScrollPane getScrollPaneRelatorioMaterias() {
        JScrollPane scrollPane = new JScrollPane(getTextAreaRelatorioMateriais());
        scrollPane.setBounds(50, 20, 660, 409);
        return scrollPane;
    }
	
	public JTextArea getTextAreaRelatorioMateriais() {
		if (textAreaRelatorioMateriais == null) {
			textAreaRelatorioMateriais = new JTextArea();
			textAreaRelatorioMateriais.setBounds(25, 25, 711, 391);
		}
		return textAreaRelatorioMateriais;
	}
}

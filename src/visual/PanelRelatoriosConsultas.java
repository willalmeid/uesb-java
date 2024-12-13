package visual;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class PanelRelatoriosConsultas extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JLabel lblNewLabel;
	private JTextArea textAreaRelatorioConsulta;
	
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
			panelPrincipal.setSize(760, 450);
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.BACKGROUND);
			panelPrincipal.setLayout(null);
			panelPrincipal.add(getScrollPaneRelatorioConsulta());
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
	
	private JScrollPane getScrollPaneRelatorioConsulta() {
        JScrollPane scrollPane = new JScrollPane(getTextAreaRelatorioConsulta());
        scrollPane.setBounds(50, 20, 660, 409);
        return scrollPane;
    }
	
	public JTextArea getTextAreaRelatorioConsulta() {
		if (textAreaRelatorioConsulta == null) {
			textAreaRelatorioConsulta = new JTextArea();
			textAreaRelatorioConsulta.setBounds(25, 25, 711, 391);
		}
		return textAreaRelatorioConsulta;
	}
}

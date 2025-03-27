package visual;

import javax.swing.GroupLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import controle.ControladorPanelMain;

import javax.swing.GroupLayout.Alignment;

public class PanelHome extends JPanel {

	private JSplitPane splitPane;
	private PanelHomeHeader panelHeader;
	
	public PanelHome() {
		setVisible(true);
		setSize(1280, 768);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(getSplitPane(), GroupLayout.PREFERRED_SIZE, 400, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(getSplitPane(), GroupLayout.PREFERRED_SIZE, 729, GroupLayout.PREFERRED_SIZE)
		);
		setLayout(groupLayout);
	}
	
	public JSplitPane getSplitPane() {
		if (splitPane == null) {
			splitPane = new JSplitPane();
			splitPane.setContinuousLayout(true);
			splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
			splitPane.setLeftComponent(new PanelHomeHeader());
			
			PanelHomeMain panelMain = new PanelHomeMain();
			new ControladorPanelMain(panelMain);
			splitPane.setRightComponent(panelMain);
			
			splitPane.setDividerSize(0); // Define a largura da barra para 0, tornando-a invisível
			splitPane.setEnabled(false); // Desativa o redimensionamento do JSplitPane
		}
		return splitPane;
	}
}

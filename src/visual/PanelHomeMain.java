package visual;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import styles.ButtonCard;
import styles.Icons;
import styles.Thema;

public class PanelHomeMain extends JPanel{

	private ButtonCard buttonCadastrar;
	private ButtonCard buttonAgendar;
	private ButtonCard buttonRelatorios;
	
	public PanelHomeMain() {
		this.setBackground(Thema.BACKGROUND);
		GroupLayout gl_panelHome = new GroupLayout(this);
		gl_panelHome.setHorizontalGroup(
			gl_panelHome.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panelHome.createSequentialGroup()
				.addGap(90)
				.addComponent(getButtonCadastar(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addGap(100)
				.addComponent(getButtonAgendar(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addGap(100)
				.addComponent(getButtonRelatorios(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addContainerGap(150, Short.MAX_VALUE)
			)
		);
		
		gl_panelHome.setVerticalGroup(
			gl_panelHome.createParallelGroup(Alignment.LEADING)
			.addGroup(gl_panelHome.createSequentialGroup()
				.addGap(100)
				.addGroup(gl_panelHome.createParallelGroup(Alignment.BASELINE)
					.addComponent(getButtonRelatorios(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(getButtonCadastar(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
					.addComponent(getButtonAgendar(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				)
				.addGap(488)
			)
		);
		setLayout(gl_panelHome);
	}
	
	public ButtonCard getButtonCadastar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new ButtonCard("Cadastrar");
			buttonCadastrar.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR)));
		}
		return buttonCadastrar;
	}
	
	public ButtonCard getButtonAgendar() {
		if (buttonAgendar == null) {
			buttonAgendar = new ButtonCard("Agendar");
			buttonAgendar.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.AGENDAR)));
		}
		return buttonAgendar;
	}
	
	public ButtonCard getButtonRelatorios() {
		if (buttonRelatorios == null) {
			buttonRelatorios = new ButtonCard("Relatórios");
			buttonRelatorios.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.RELATORIO)));
		}
		return buttonRelatorios;
	}
}

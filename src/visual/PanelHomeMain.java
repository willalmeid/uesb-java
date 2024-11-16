package visual;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import styles.ButtonNavegacao;
import styles.Icons;
import styles.Thema;

public class PanelHomeMain extends JPanel{

	private ButtonNavegacao buttonCadastrar;
	private ButtonNavegacao buttonAgendar;
	private ButtonNavegacao buttonRelatorios;
	
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
				.addGroup(gl_panelHome.createParallelGroup(Alignment.TRAILING, false)
					.addComponent(getButtonRelatorios(), Alignment.LEADING, 0, 0, Short.MAX_VALUE)
					.addComponent(getButtonCadastar(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
					.addComponent(getButtonAgendar(), Alignment.LEADING, 0, 0, Short.MAX_VALUE)
				)
				.addGap(488)
			)
		);
		setLayout(gl_panelHome);
	}
	
	public ButtonNavegacao getButtonCadastar() {
		if (buttonCadastrar == null) {
			buttonCadastrar = new ButtonNavegacao("Cadastrar");
			buttonCadastrar.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR)));
		}
		return buttonCadastrar;
	}
	
	public ButtonNavegacao getButtonAgendar() {
		if (buttonAgendar == null) {
			buttonAgendar = new ButtonNavegacao("Agendar");
			buttonAgendar.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.AGENDAR)));
		}
		return buttonAgendar;
	}
	
	public ButtonNavegacao getButtonRelatorios() {
		if (buttonRelatorios == null) {
			buttonRelatorios = new ButtonNavegacao("Relatórios");
			buttonRelatorios.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.RELATORIO)));
		}
		return buttonRelatorios;
	}
}

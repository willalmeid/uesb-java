package visual;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;

import styles.ButtonNavegacao;
import styles.Icons;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

public class PanelCadastrar extends JPanel {

	private TitlePanel titlePanel;
	private ButtonNavegacao buttonCadastrarPaciente;
	private ButtonNavegacao buttonCadastrarMedico;
	private ButtonNavegacao buttonCadastrarExame;
	private ButtonNavegacao buttonCadastrarConsulta;
	private ButtonNavegacao buttonCadastrarMaterial;
	private JButton buttonVoltar;
	private JButton buttonHome;
	
	public PanelCadastrar() {
		setVisible(true);
		setSize(1280, 768);
		setBackground(Thema.corPrincipal);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(getButtonCadastrarMaterial(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarConsulta(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(getButtonCadastrarPaciente(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarMedico(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarExame(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(getButtonVoltar(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(327)
					.addComponent(getTitlePanel(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 314, Short.MAX_VALUE)
					.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(63))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(getButtonVoltar(), GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
								.addComponent(getTitlePanel(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 50, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(getButtonCadastrarExame(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addComponent(getButtonCadastrarPaciente(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addComponent(getButtonCadastrarMedico(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(getButtonCadastrarConsulta(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrarMaterial(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addGap(89))
		);
		setLayout(groupLayout);
	}
	
	public TitlePanel getTitlePanel() {
		if(titlePanel == null) {
			titlePanel = new TitlePanel("Tela de Cadastro");
		}
		return titlePanel;
	}
	
	public ButtonNavegacao getButtonCadastrarPaciente() {
		if(buttonCadastrarPaciente == null) {
			buttonCadastrarPaciente = new ButtonNavegacao();
			buttonCadastrarPaciente.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.gerenciarConsultas)));
		}
		return buttonCadastrarPaciente;
	}
	
	public ButtonNavegacao getButtonCadastrarMedico() {
		if(buttonCadastrarMedico == null) {
			buttonCadastrarMedico = new ButtonNavegacao();
			buttonCadastrarMedico.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.gerenciarConsultas)));
		}
		return buttonCadastrarMedico;
	}
	
	public ButtonNavegacao getButtonCadastrarExame() {
		if(buttonCadastrarExame == null) {
			buttonCadastrarExame = new ButtonNavegacao();
			buttonCadastrarExame.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.gerenciarConsultas)));
		}
		return buttonCadastrarExame;
	}
	
	public ButtonNavegacao getButtonCadastrarConsulta() {
		if(buttonCadastrarConsulta == null) {
			buttonCadastrarConsulta = new ButtonNavegacao();
			buttonCadastrarConsulta.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.gerenciarConsultas)));
		}
		return buttonCadastrarConsulta;
	}
	
	public ButtonNavegacao getButtonCadastrarMaterial() {
		if(buttonCadastrarMaterial == null) {
			buttonCadastrarMaterial = new ButtonNavegacao();
			buttonCadastrarMaterial.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.gerenciarConsultas)));
		}
		return buttonCadastrarMaterial;
	}
	public JButton getButtonVoltar() {
		if (buttonVoltar == null) {
			buttonVoltar = new JButton("<\r\n");
			buttonVoltar.setFont(Thema.FONT_LABELS_INPUTS);
			buttonVoltar.setBackground(Thema.cortransparent);
			buttonVoltar.setOpaque(true);
			buttonVoltar.setBorderPainted(false);          // Não desenhar borda padrão
	        buttonVoltar.setFocusPainted(false); 
		}
		return buttonVoltar;
	}
	public JButton getButtonHome() {
		if (buttonHome == null) {
			buttonHome = new JButton("");
			buttonHome.setIcon(new ImageIcon(PanelCadastrar.class.getResource("/assets/icons/home.png")));
			buttonHome.setFont(Thema.FONT_LABELS_INPUTS);
			buttonHome.setBackground(Thema.cortransparent);
			buttonHome.setOpaque(true);
			buttonHome.setBorderPainted(false); 
			buttonHome.setFocusPainted(false);
		}
		return buttonHome;
	}
}

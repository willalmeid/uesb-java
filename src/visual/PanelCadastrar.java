package visual;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;

import styles.ButtonCard;
import styles.ButtonNavegacao;
import styles.Icons;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelCadastrar extends JPanel {

	private TitlePanel titlePanel;
	private ButtonCard buttonCadastrarPaciente;
	private ButtonCard buttonCadastrarMedico;
	private ButtonCard buttonCadastrarExame;
	private ButtonCard buttonCadastrarConsulta;
	private ButtonCard buttonCadastrarMaterial;
	private ButtonNavegacao buttonVoltar;
	private ButtonNavegacao buttonHome;
	
	public PanelCadastrar() {
		setVisible(true);
		setSize(1280, 768);
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(150)
							.addComponent(getButtonCadastrarConsulta(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarMaterial(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(getButtonCadastrarPaciente(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarMedico(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCadastrarExame(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(211, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(getButtonVoltar(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(378)
					.addComponent(getTitlePanel(), GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(365)
					.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(63))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(getButtonVoltar(), GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED, 51, Short.MAX_VALUE))
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(getTitlePanel(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
							.addComponent(getButtonCadastrarExame(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
							.addComponent(getButtonCadastrarPaciente(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
						.addComponent(getButtonCadastrarMedico(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(getButtonCadastrarMaterial(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCadastrarConsulta(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
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
	
	public ButtonCard getButtonCadastrarPaciente() {
		if(buttonCadastrarPaciente == null) {
			buttonCadastrarPaciente = new ButtonCard("Paciente");
			buttonCadastrarPaciente.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR_PACIENTE)));
		}
		return buttonCadastrarPaciente;
	}
	
	public ButtonCard getButtonCadastrarMedico() {
		if(buttonCadastrarMedico == null) {
			buttonCadastrarMedico = new ButtonCard("Medico");
			buttonCadastrarMedico.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR_MEDICO)));
		}
		return buttonCadastrarMedico;
	}
	
	public ButtonCard getButtonCadastrarExame() {
		if(buttonCadastrarExame == null) {
			buttonCadastrarExame = new ButtonCard("Exame");
			buttonCadastrarExame.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR_EXAME)));
		}
		return buttonCadastrarExame;
	}
	
	public ButtonCard getButtonCadastrarConsulta() {
		if(buttonCadastrarConsulta == null) {
			buttonCadastrarConsulta = new ButtonCard("Consulta");
			buttonCadastrarConsulta.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR_CONSULTA)));
		}
		return buttonCadastrarConsulta;
	}
	
	public ButtonCard getButtonCadastrarMaterial() {
		if(buttonCadastrarMaterial == null) {
			buttonCadastrarMaterial = new ButtonCard("Material");
			buttonCadastrarMaterial.setIcon(new ImageIcon(PanelHome.class.getResource(Icons.CADASTRAR_MATERIAL)));
		}
		return buttonCadastrarMaterial;
	}
	
	public ButtonNavegacao getButtonVoltar() {
		if (buttonVoltar == null) {
			buttonVoltar = new ButtonNavegacao();
			buttonVoltar.setIcon(new ImageIcon(PanelCadastrar.class.getResource(Icons.BUTTON_BACK)));
		}
		return buttonVoltar;
	}
	
	public ButtonNavegacao getButtonHome() {
		if (buttonHome == null) {
			buttonHome = new ButtonNavegacao();
			buttonHome.setIcon(new ImageIcon(PanelCadastrar.class.getResource(Icons.BUTTON_HOME)));
		}
		return buttonHome;
	}
}

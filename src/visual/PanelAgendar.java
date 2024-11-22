package visual;

import javax.swing.JPanel;

import styles.ButtonCard;
import styles.ButtonNavegacao;
import styles.Icons;
import styles.Thema;
import styles.TitlePanel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelAgendar extends JPanel {

	private TitlePanel titlePanel;
	
	private ButtonCard buttonCardAgendarConsulta;
	private ButtonCard buttonCardAgendarExames;
	private ButtonCard buttonCardVisualizarAgenda;
	private ButtonCard buttonCardPesquisarHorarios;
	private ButtonCard buttonCardCancelarEReagendar;
	
	private ButtonNavegacao buttonVoltar;
	private ButtonNavegacao buttonHome;
	
	public PanelAgendar() {
		setVisible(true);
		setSize(1280, 720);
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(50)
							.addComponent(getButtonVoltar(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(341)
							.addComponent(getTitlePanel(), GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
							.addGap(341)
							.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(40)
							.addComponent(getButtonCardAgendarConsulta(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCardAgendarExames(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
							.addGap(30)
							.addComponent(getButtonCardVisualizarAgenda(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(248)
					.addComponent(getButtonCardPesquisarHorarios(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(getButtonCardCancelarEReagendar(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(262, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(getButtonVoltar(), GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
							.addGap(17))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addComponent(getTitlePanel(), GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonCardAgendarConsulta(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCardAgendarExames(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCardVisualizarAgenda(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addGap(28)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(getButtonCardPesquisarHorarios(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCardCancelarEReagendar(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addGap(79))
		);
		setLayout(groupLayout);

	}
	
	public TitlePanel getTitlePanel() {
		if(titlePanel == null) {
			titlePanel = new TitlePanel("Tela de Agendamento");
		}
		return titlePanel;
	}

	public ButtonCard getButtonCardAgendarConsulta() {
	    if (buttonCardAgendarConsulta == null) {
	        buttonCardAgendarConsulta = new ButtonCard("Agendar Consulta");
	        buttonCardAgendarConsulta.setIcon(new ImageIcon(PanelAgendar.class.getResource(Icons.AGENDAR_CONSULTA)));
	    }
	    return buttonCardAgendarConsulta;
	}

	public ButtonCard getButtonCardAgendarExames() {
	    if (buttonCardAgendarExames == null) {
	        buttonCardAgendarExames = new ButtonCard("Agendar Exames");
	        buttonCardAgendarExames.setIcon(new ImageIcon(PanelAgendar.class.getResource(Icons.AGENDAR_EXAME)));
	    }
	    return buttonCardAgendarExames;
	}

	public ButtonCard getButtonCardVisualizarAgenda() {
	    if (buttonCardVisualizarAgenda == null) {
	        buttonCardVisualizarAgenda = new ButtonCard("Visualizar Agenda");
	        buttonCardVisualizarAgenda.setIcon(new ImageIcon(PanelAgendar.class.getResource(Icons.VISUALIZAR_AGENDA)));
	    }
	    return buttonCardVisualizarAgenda;
	}

	public ButtonCard getButtonCardPesquisarHorarios() {
	    if (buttonCardPesquisarHorarios == null) {
	        buttonCardPesquisarHorarios = new ButtonCard("Pesquisar Horários");
	        buttonCardPesquisarHorarios.setIcon(new ImageIcon(PanelAgendar.class.getResource(Icons.PESQUISAR_HORARIOS)));
	    }
	    return buttonCardPesquisarHorarios;
	}

	public ButtonCard getButtonCardCancelarEReagendar() {
	    if (buttonCardCancelarEReagendar == null) {
	        buttonCardCancelarEReagendar = new ButtonCard("Cancelar/Reagendar");
	        buttonCardCancelarEReagendar.setIcon(new ImageIcon(PanelAgendar.class.getResource(Icons.CANCELAR_E_REAGENDAR)));
	    }
	    return buttonCardCancelarEReagendar;
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

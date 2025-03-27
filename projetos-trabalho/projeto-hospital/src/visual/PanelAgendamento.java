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

public class PanelAgendamento extends JPanel {

	private TitlePanel titlePanel;
	
	private ButtonCard buttonCardAgendarConsulta;
	private ButtonCard buttonCardAgendarExames;
	private ButtonCard buttonCardVisualizarAgenda;
	private ButtonCard buttonCardPesquisarHorarios;
	private ButtonCard buttonCardCancelarEReagendar;
	
	private ButtonNavegacao buttonVoltar;
	private ButtonNavegacao buttonHome;
	
	public PanelAgendamento() {
		setVisible(true);
		setSize(1280, 720);
		setBackground(Thema.PRINCIPAL);
		
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(50)
					.addComponent(getButtonVoltar(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addGap(341)
					.addComponent(getTitlePanel(), GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
					.addGap(341)
					.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(50, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(253, Short.MAX_VALUE)
					.addComponent(getButtonCardVisualizarAgenda(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(getButtonCardPesquisarHorarios(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addGap(251))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(455)
					.addComponent(getButtonCardCancelarEReagendar(), GroupLayout.PREFERRED_SIZE, 370, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(455, Short.MAX_VALUE))
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
						.addComponent(getButtonCardPesquisarHorarios(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
						.addComponent(getButtonCardVisualizarAgenda(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
					.addGap(32)
					.addComponent(getButtonCardCancelarEReagendar(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
					.addGap(75))
		);
		setLayout(groupLayout);

	}
	
	public TitlePanel getTitlePanel() {
		if(titlePanel == null) {
			titlePanel = new TitlePanel("Tela de Agendamento");
		}
		return titlePanel;
	}

	public ButtonCard getButtonCardVisualizarAgenda() {
	    if (buttonCardVisualizarAgenda == null) {
	        buttonCardVisualizarAgenda = new ButtonCard("Visualizar Agenda");
	        buttonCardVisualizarAgenda.setIcon(new ImageIcon(PanelAgendamento.class.getResource(Icons.VISUALIZAR_AGENDA)));
	    }
	    return buttonCardVisualizarAgenda;
	}

	public ButtonCard getButtonCardPesquisarHorarios() {
	    if (buttonCardPesquisarHorarios == null) {
	        buttonCardPesquisarHorarios = new ButtonCard("Pesquisar Horários");
	        buttonCardPesquisarHorarios.setIcon(new ImageIcon(PanelAgendamento.class.getResource(Icons.PESQUISAR_HORARIOS)));
	    }
	    return buttonCardPesquisarHorarios;
	}

	public ButtonCard getButtonCardCancelarEReagendar() {
	    if (buttonCardCancelarEReagendar == null) {
	        buttonCardCancelarEReagendar = new ButtonCard("Cancelar/Reagendar");
	        buttonCardCancelarEReagendar.setIcon(new ImageIcon(PanelAgendamento.class.getResource(Icons.CANCELAR_E_REAGENDAR)));
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

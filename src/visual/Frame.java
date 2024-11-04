package visual;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class Frame extends JFrame {
	
	private JMenuBar barraMenu;
	private JMenu menuCadastro;
	private JMenu menuAgendamento;
	private JMenu menuRelatorio;

	private JButton buttonHome;

	private JMenuItem menuItemCadastrarPaciente;
	private JMenuItem menuItemCadastrarMedico;
	private JMenuItem menuItemCadastrarExame;
	private JMenuItem menuItemCadastrarConsulta;
	private JMenuItem menuItemCadastrarMaterial;

	private JMenuItem menuItemAgendarConsulta;
	private JMenuItem menuItemAgendarExame;
	private JMenuItem menuItemVisualizarAgenda;
	private JMenuItem menuItemPesquisarHorarios;
	
	private JMenuItem menuItemCancelarEReagendar;

	private JMenuItem menuItemRelatoriosDeConsulta;
	private JMenuItem menuItemRelatoriosDeExames;
	private JMenuItem menuItemRelatoriosFinanceiros;
	private JMenuItem menuItemRelatoriosDeMateriais;

	public Frame() {
		super();
		this.setVisible(true);
		this.setSize(1280, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setJMenuBar(getBarraMenu());
	}

	public JMenuBar getBarraMenu() {
		if(barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.add(getButtonHome());
			barraMenu.add(getMenuCadastro());
			barraMenu.add(getMenuAgendamento());
			barraMenu.add(getMenuRelatorio());
		}
		return barraMenu;
	}
	
	/* ------------------------------------------------------------ Menus --------------------------------------------------------------- */
	public JMenu getMenuCadastro() {
		if(menuCadastro == null) {
			menuCadastro = new JMenu();
			menuCadastro.setBackground(new Color(255, 255, 255));
			menuCadastro.setBorder(UIManager.getBorder("Menu.border"));
			menuCadastro.setText("Cadastrar");
			menuCadastro.add(getMenuItemCadastrarPaciente());
			menuCadastro.add(getMenuItemCadastrarMedico());
			menuCadastro.add(getMenuItemCadastrarExame());
			menuCadastro.add(getMenuItemCadastrarConsulta());
			menuCadastro.add(getMenuItemCadastrarMaterial());
		}
		return menuCadastro;
	}

	public JMenu getMenuAgendamento() {
		if(menuAgendamento == null) {
			menuAgendamento = new JMenu();
			menuAgendamento.setText("Agendamento");
			menuAgendamento.add(getMenuItemAgendarConsulta());
			menuAgendamento.add(getMenuItemAgendarExame());
			menuAgendamento.add(getMenuItemVisualizarAgenda());
			menuAgendamento.add(getMenuItemPesquisarHorarios());
			menuAgendamento.add(getMenuItemCancelarEReagendar());
		}
		return menuAgendamento;
	}

	public JMenu getMenuRelatorio() {
		if(menuRelatorio == null) {
			menuRelatorio = new JMenu();
			menuRelatorio.setText("Relatórios");
			menuRelatorio.add(getMenuItemRelatoriosDeConsulta());
			menuRelatorio.add(getMenuItemRelatoriosDeExames());
			menuRelatorio.add(getMenuItemRelatoriosFinanceiros());
			menuRelatorio.add(getMenuItemRelatoriosDeMateriais());
		}
		return menuRelatorio;
	}

	/* -------------------------------------------------------- Menu itens -------------------------------------------------------------- */
	public JButton getButtonHome() {
		if(buttonHome == null) {
			buttonHome = new JButton();
			// Ajuste de aparência para se parecer com um JMenu
	        buttonHome.setFocusPainted(false); // Remove o foco visual ao clicar
	        buttonHome.setContentAreaFilled(false); // Remove o preenchimento do botão
	        buttonHome.setBorderPainted(false); // Remove a borda do botão
	        buttonHome.setOpaque(false); // Deixe o fundo transparente
	        
			buttonHome.setFont(new Font("Segoe UI", Font.PLAIN, 12));
			buttonHome.setText("Home");
		}
		return buttonHome;
	}
	
	public JMenuItem getMenuItemCadastrarPaciente() {
		if(menuItemCadastrarPaciente == null) {
			menuItemCadastrarPaciente = new JMenuItem();
			menuItemCadastrarPaciente.setText("Paciente");
		}
		return menuItemCadastrarPaciente;
	}

	public JMenuItem getMenuItemCadastrarMedico() {
		if(menuItemCadastrarMedico == null) {
			menuItemCadastrarMedico = new JMenuItem();
			menuItemCadastrarMedico.setText("Médico");
		}
		return menuItemCadastrarMedico;
	}

	public JMenuItem getMenuItemCadastrarExame() {
		if(menuItemCadastrarExame == null) {
			menuItemCadastrarExame = new JMenuItem();
			menuItemCadastrarExame.setText("Exame");
		}
		return menuItemCadastrarExame;
	}

	public JMenuItem getMenuItemCadastrarConsulta() {
		if(menuItemCadastrarConsulta == null) {
			menuItemCadastrarConsulta = new JMenuItem();
			menuItemCadastrarConsulta.setText("Consulta");
		}
		return menuItemCadastrarConsulta;
	}

	public JMenuItem getMenuItemCadastrarMaterial() {
		if(menuItemCadastrarMaterial == null) {
			menuItemCadastrarMaterial = new JMenuItem();
			menuItemCadastrarMaterial.setText("Material");
		}
		return menuItemCadastrarMaterial;
	}

	public JMenuItem getMenuItemAgendarConsulta() {
	    if (menuItemAgendarConsulta == null) {
	        menuItemAgendarConsulta = new JMenuItem();
	        menuItemAgendarConsulta.setText("Consulta");
	    }
	    return menuItemAgendarConsulta;
	}

	public JMenuItem getMenuItemAgendarExame() {
	    if (menuItemAgendarExame == null) {
	        menuItemAgendarExame = new JMenuItem();
	        menuItemAgendarExame.setText("Exame");
	    }
	    return menuItemAgendarExame;
	}

	public JMenuItem getMenuItemVisualizarAgenda() {
	    if (menuItemVisualizarAgenda == null) {
	        menuItemVisualizarAgenda = new JMenuItem();
	        menuItemVisualizarAgenda.setText("Visualização de Agenda");
	    }
	    return menuItemVisualizarAgenda;
	}

	public JMenuItem getMenuItemPesquisarHorarios() {
	    if (menuItemPesquisarHorarios == null) {
	        menuItemPesquisarHorarios = new JMenuItem();
	        menuItemPesquisarHorarios.setText("Pesquisa de Horários");
	    }
	    return menuItemPesquisarHorarios;
	}

	public JMenuItem getMenuItemCancelarEReagendar() {
	    if (menuItemCancelarEReagendar == null) {
	        menuItemCancelarEReagendar = new JMenuItem();
	        menuItemCancelarEReagendar.setText("Cancelamento e Reagendamento");
	    }
	    return menuItemCancelarEReagendar;
	}

	public JMenuItem getMenuItemRelatoriosDeConsulta() {
	    if (menuItemRelatoriosDeConsulta == null) {
	        menuItemRelatoriosDeConsulta = new JMenuItem();
	        menuItemRelatoriosDeConsulta.setText("Consulta");
	    }
	    return menuItemRelatoriosDeConsulta;
	}

	public JMenuItem getMenuItemRelatoriosDeExames() {
	    if (menuItemRelatoriosDeExames == null) {
	        menuItemRelatoriosDeExames = new JMenuItem();
	        menuItemRelatoriosDeExames.setText("Exames");
	    }
	    return menuItemRelatoriosDeExames;
	}

	public JMenuItem getMenuItemRelatoriosFinanceiros() {
	    if (menuItemRelatoriosFinanceiros == null) {
	        menuItemRelatoriosFinanceiros = new JMenuItem();
	        menuItemRelatoriosFinanceiros.setText("Financeiros");
	    }
	    return menuItemRelatoriosFinanceiros;
	}

	public JMenuItem getMenuItemRelatoriosDeMateriais() {
	    if (menuItemRelatoriosDeMateriais == null) {
	        menuItemRelatoriosDeMateriais = new JMenuItem();
	        menuItemRelatoriosDeMateriais.setText("Materiais");
	    }
	    return menuItemRelatoriosDeMateriais;
	}
}

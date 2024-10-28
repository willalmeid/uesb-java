package visual;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	
	private JMenuBar barraMenu;
	private JMenu menuCadastro;
	private JMenu menuAgendamento;
	private JMenu menuRelatorio;

	private JMenuItem menuItemCadastrarPaciente;
	private JMenuItem menuItemCadastrarMedico;
	private JMenuItem menuItemCadastrarExame;
	private JMenuItem menuItemCadastrarConsulta;
	private JMenuItem menuItemCadastrarMaterial;

	private JMenuItem menuItemAgendarConsulta;
	private JMenuItem menuItemAgendarExame;
	private JMenuItem menuItemVisualizarAgenda;
	private JMenuItem menuItemPesquisarHorarios;
	/* Verificar se os dois são junto ou não */
	private JMenuItem menuItemCancelarEReagendar;

	private JMenuItem menuItemRelatoriosDeConsulta;
	private JMenuItem menuItemRelatoriosDeExames;
	private JMenuItem menuItemRelatoriosFinanceiros;
	private JMenuItem menuItemRelatoriosDeMateriais;

	public Frame() {
		super();
		this.setVisible(true); // Tornar ele visível.
		this.setSize(1280, 768); // Tamanho da Janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Fechar quando apertar no x
		this.setLocationRelativeTo(null); // Abrir ele no centro da tela
		this.setJMenuBar(getBarraMenu());
	}

	public JMenuBar getBarraMenu() {
		if(barraMenu == null) {
			barraMenu = new JMenuBar();
			barraMenu.add(getMenuCadastro());
			barraMenu.add(getMenuAgendamento());
			barraMenu.add(getMenuRelatorio());
		}
		return barraMenu;
	}

	public JMenu getMenuCadastro() {
		if(menuCadastro == null) {
			menuCadastro = new JMenu();
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

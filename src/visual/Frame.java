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

	private JMenuItem menuItemAgendamentoDeConsulta;
	private JMenuItem menuItemAgendamentoDeExame;
	private JMenuItem menuItemVisualizacaoDeAgenda;
	private JMenuItem menuItemPesquisaDeHorarios;
	/* Verificar se os dois são junto ou não */
	private JMenuItem menuItemCancelamentoEReagendamento;

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
			menuAgendamento.add(getMenuItemAgendamentoDeConsulta());
			menuAgendamento.add(getMenuItemAgendamentoDeExame());
			menuAgendamento.add(getMenuItemVisualizacaoDeAgenda());
			menuAgendamento.add(getMenuItemPesquisaDeHorarios());
			menuAgendamento.add(getMenuItemCancelamentoEReagendamento());
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

	public JMenuItem getMenuItemAgendamentoDeConsulta() {
	    if (menuItemAgendamentoDeConsulta == null) {
	        menuItemAgendamentoDeConsulta = new JMenuItem();
	        menuItemAgendamentoDeConsulta.setText("Consulta");
	    }
	    return menuItemAgendamentoDeConsulta;
	}

	public JMenuItem getMenuItemAgendamentoDeExame() {
	    if (menuItemAgendamentoDeExame == null) {
	        menuItemAgendamentoDeExame = new JMenuItem();
	        menuItemAgendamentoDeExame.setText("Exame");
	    }
	    return menuItemAgendamentoDeExame;
	}

	public JMenuItem getMenuItemVisualizacaoDeAgenda() {
	    if (menuItemVisualizacaoDeAgenda == null) {
	        menuItemVisualizacaoDeAgenda = new JMenuItem();
	        menuItemVisualizacaoDeAgenda.setText("Visualização de Agenda");
	    }
	    return menuItemVisualizacaoDeAgenda;
	}

	public JMenuItem getMenuItemPesquisaDeHorarios() {
	    if (menuItemPesquisaDeHorarios == null) {
	        menuItemPesquisaDeHorarios = new JMenuItem();
	        menuItemPesquisaDeHorarios.setText("Pesquisa de Horários");
	    }
	    return menuItemPesquisaDeHorarios;
	}

	public JMenuItem getMenuItemCancelamentoEReagendamento() {
	    if (menuItemCancelamentoEReagendamento == null) {
	        menuItemCancelamentoEReagendamento = new JMenuItem();
	        menuItemCancelamentoEReagendamento.setText("Cancelamento e Reagendamento");
	    }
	    return menuItemCancelamentoEReagendamento;
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

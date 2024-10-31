package visual;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame extends JFrame {
	
	JMenuBar barraMenu;
	JMenu menuCadastrar;
	JMenu menuConsultar;
	JMenuItem menuHome;
	JMenuItem itemCadastrarAluno;
	JMenuItem itemCadastrarProfessor;
	JMenuItem itemConsultarAluno;
	JMenuItem itemConsultarProfessor;
	
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
			barraMenu.add(getMenuHome());
			barraMenu.add(getCadastrar());
			barraMenu.add(getConsultar());
		}
		return barraMenu;
	}
	
	public JMenu getCadastrar() {
		if(menuCadastrar == null) {
			menuCadastrar = new JMenu();
			menuCadastrar.setText("Cadastar");
			menuCadastrar.add(getCadastrarAluno());
			menuCadastrar.add(getCadastrarProfessor());
		}
		return menuCadastrar;
	}
	
	public JMenu getConsultar() {
		if(menuConsultar == null) {
			menuConsultar = new JMenu();
			menuConsultar.setText("Consultar");
			menuConsultar.add(getConsultarAluno());
			menuConsultar.add(getConsultarProfessor());
			
		}
		return menuConsultar;
	}
	
	public JMenuItem getMenuHome(){
		if(menuHome == null) {
			menuHome = new JMenuItem();
			menuHome.setText("Home");
		}
		return menuHome;
	}
	
	public JMenuItem getCadastrarAluno() {
		if(itemCadastrarAluno == null) {
			itemCadastrarAluno = new JMenuItem();
			itemCadastrarAluno.setText("Aluno");
		}
		return itemCadastrarAluno;
	}
	
	public JMenuItem getCadastrarProfessor() {
		if(itemCadastrarProfessor == null) {
			itemCadastrarProfessor = new JMenuItem();
			itemCadastrarProfessor.setText("Professor");
		}
		return itemCadastrarProfessor;
	}
	
	public JMenuItem getConsultarAluno() {
		if(itemConsultarAluno == null) {
			itemConsultarAluno = new JMenuItem();
			itemConsultarAluno.setText("Aluno");
		}
		return itemConsultarAluno;
	}
	
	public JMenuItem getConsultarProfessor() {
		if(itemConsultarProfessor == null) {
			itemConsultarProfessor = new JMenuItem();
			itemConsultarProfessor.setText("Professor");
		}
		return itemConsultarProfessor;
	}

}

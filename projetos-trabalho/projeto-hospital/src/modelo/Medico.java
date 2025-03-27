package modelo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class Medico {
	
	private String nome;
	private String especialidade;
	private String crm;
	private String contato;
	
	private float valorConsultaParticular;
	private JList<String> horariosDeAtendimento;

	public Medico() {
		
	}
 
	public Medico(String nome, String especialidade, String crm, String contato, float valorConsultaParticular,
			JList<String> horariosDeAtendimento) {
		super();
		this.nome = nome;
		this.especialidade = especialidade;
		this.crm = crm;
		this.contato = contato;
		this.valorConsultaParticular = valorConsultaParticular;
		this.horariosDeAtendimento = horariosDeAtendimento;
	}
	
	public String salvarDados() {
		
		try {
			FileWriter fw = new FileWriter("./dados/medicos.txt", true);
			PrintWriter pw = new PrintWriter(fw);
			pw.println("Nome: " + this.nome);
			pw.println("Especialidade: " + this.especialidade);
			pw.println("CRM: " + this.crm);
			pw.println("Contato: " + this.contato);
			pw.println("Valor Consulta Particular: " + this.valorConsultaParticular);

			DefaultListModel<String> model = (DefaultListModel<String>) this.horariosDeAtendimento.getModel();
			
			pw.print("Horários de Atendimento: ");
			for (int i = 0; i < model.getSize(); i++) {
			    String material = model.getElementAt(i);

			    // Imprime o material com uma vírgula e um espaço, exceto para o último
			    pw.print("[" + material);
			    if (i < model.getSize() - 1) {
			        pw.print("], ");
			    } else {
			    	pw.println("]");
			    }
			}
			pw.println("\n----------------------------------------------------\n");
			pw.flush();
			pw.close();
			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return "Cadastrado com sucesso!";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public float getValorConsultaParticular() {
		return valorConsultaParticular;
	}

	public void setValorConsultaParticular(float valorConsultaParticular) {
		this.valorConsultaParticular = valorConsultaParticular;
	}

	public JList<String> getHistóricoDeAtendimento() {
		return horariosDeAtendimento;
	}

	public void setHistóricoDeAtendimento(JList<String> horariosDeAtendimento) {
		this.horariosDeAtendimento = horariosDeAtendimento;
	}

}

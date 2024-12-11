package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

import visual.PanelAgendarExame;

public class ControladorPanelAgendarExame implements ActionListener {

	PanelAgendarExame panelAgendarExame;
	
	public ControladorPanelAgendarExame(PanelAgendarExame panelAgendarExame) {
		this.panelAgendarExame = panelAgendarExame;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendarExame.getButtonAgendar().addActionListener(this);
		panelAgendarExame.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendarExame.getButtonAgendar()) {
			agendarConsulta();
			
		} else if(e.getSource() == panelAgendarExame.getButtonLimpar()){
			limparPanel();
		}
	}
	
	public void agendarConsulta() {
		String data = panelAgendarExame.getTextFieldData().getText();
		String hora = panelAgendarExame.getTextFieldHora().getText();
		
		String tipoExame = (String) panelAgendarExame.getComboBoxTipoExame().getSelectedItem();
		String paciente = (String) panelAgendarExame.getComboBoxPaciente().getSelectedItem();	
		
		if(Verificacao.verificaCamposVazios(data, hora, paciente, tipoExame)) {
			JOptionPane.showMessageDialog(panelAgendarExame, "Preencha todas as informações!", "Erro", JOptionPane.WARNING_MESSAGE);
		} else if(Verificacao.verificaDatas(data)) {
			JOptionPane.showMessageDialog(panelAgendarExame, "Digite uma data válida no formato dd/mm/aaaa", "Erro - Data inválida", JOptionPane.WARNING_MESSAGE);
		} else {
			
			try {
				FileWriter fw = new FileWriter("./dados/exames-agendados.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				
				pw.println("ID do Exame: ");
				pw.println("Paciente: " + paciente);
				pw.println("Tipo Exame: " + tipoExame);
				pw.println("Data: " + data);
				pw.println("Hora: " + hora);
				pw.println("\n----------------------------------------------------\n");
				
				pw.close();
				fw.close();
				
			} catch(IOException e) {
				e.printStackTrace();
			}
			
			JOptionPane.showMessageDialog(panelAgendarExame, "Exame cadastrada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
			limparPanel();
		}
	}
	
	public void limparPanel() {
		panelAgendarExame.getTextFieldData().setText("");
		panelAgendarExame.getTextFieldHora().setText("");
		
		// Definir seu padrão como nenhum dos itens acima
		panelAgendarExame.getComboBoxPaciente().setSelectedIndex(-1);
		panelAgendarExame.getComboBoxTipoExame().setSelectedIndex(-1);
	}
}

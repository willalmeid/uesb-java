package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosConsultas;

public class ControladorPanelRelatoriosConsultas implements ActionListener {

	PanelRelatoriosConsultas panelRelatoriosConsultas;
	
	public ControladorPanelRelatoriosConsultas(PanelRelatoriosConsultas panelRelatoriosConsultas) {
		this.panelRelatoriosConsultas = panelRelatoriosConsultas;
		carregarHistorico();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./dados/consultas.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosConsultas.getTextAreaRelatorioConsulta().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosConsultas, "Erro ao carregar o histórico de consultas.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

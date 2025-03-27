package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosExames;

public class ControladorPanelRelatoriosExames implements ActionListener {

	PanelRelatoriosExames panelRelatoriosExames;
	
	public ControladorPanelRelatoriosExames(PanelRelatoriosExames panelRelatoriosExames) {
		this.panelRelatoriosExames = panelRelatoriosExames;
		carregarHistorico();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./dados/exames.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;
            

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosExames.getTextAreaRelatorioExames().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosExames, "Erro ao carregar o histórico de consultas.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

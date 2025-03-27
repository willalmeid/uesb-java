package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosMateriais;

public class ControladorPanelRelatoriosMateriais implements ActionListener {

	PanelRelatoriosMateriais panelRelatoriosMateriais;
	
	public ControladorPanelRelatoriosMateriais(PanelRelatoriosMateriais panelRelatoriosMateriais) {
		this.panelRelatoriosMateriais = panelRelatoriosMateriais;
		carregarHistorico();
	}

	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("./dados/materiais.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;
            

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosMateriais.getTextAreaRelatorioMateriais().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosMateriais, "Erro ao carregar o histórico de consultas.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

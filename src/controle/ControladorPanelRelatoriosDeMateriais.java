package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosDeMateriais;

public class ControladorPanelRelatoriosDeMateriais implements ActionListener {

    PanelRelatoriosDeMateriais panelRelatoriosDeMateriais;

    public ControladorPanelRelatoriosDeMateriais(PanelRelatoriosDeMateriais panelRelatoriosDeMateriais) {
        this.panelRelatoriosDeMateriais = panelRelatoriosDeMateriais;
        carregarHistorico();
        addEventos();
    }

    public void addEventos() {
        panelRelatoriosDeMateriais.getButtonAtualizar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRelatoriosDeMateriais.getButtonAtualizar()) {
            carregarHistorico();
        }
    }

    private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("materiais.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosDeMateriais.getTextAreaHistorico().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosDeMateriais, "Erro ao carregar o histórico de materiais.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

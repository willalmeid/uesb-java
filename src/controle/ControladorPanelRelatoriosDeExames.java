package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosDeExames;

public class ControladorPanelRelatoriosDeExames implements ActionListener {

    PanelRelatoriosDeExames panelRelatoriosDeExames;

    public ControladorPanelRelatoriosDeExames(PanelRelatoriosDeExames panelRelatoriosDeExames) {
        this.panelRelatoriosDeExames = panelRelatoriosDeExames;
        carregarHistorico();
        addEventos();
    }

    public void addEventos() {
        panelRelatoriosDeExames.getButtonAtualizar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRelatoriosDeExames.getButtonAtualizar()) {
            carregarHistorico();
        }
    }

    private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("exames.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosDeExames.getTextAreaHistorico().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosDeExames, "Erro ao carregar o histórico de exames.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

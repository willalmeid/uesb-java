package controle;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosDeConsulta;

public class ControladorPanelRelatoriosDeConsulta implements ActionListener {

    PanelRelatoriosDeConsulta panelRelatoriosDeConsulta;

    public ControladorPanelRelatoriosDeConsulta(PanelRelatoriosDeConsulta panelRelatoriosDeConsulta) {
        this.panelRelatoriosDeConsulta = panelRelatoriosDeConsulta;
        carregarHistorico();
        addEventos();
    }

    public void addEventos() {
        panelRelatoriosDeConsulta.getButtonAtualizar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelRelatoriosDeConsulta.getButtonAtualizar()) {
            carregarHistorico();
        }
    }

    private void carregarHistorico() {
        try (BufferedReader reader = new BufferedReader(new FileReader("consultas.txt"))) {
            StringBuilder historico = new StringBuilder();
            String linha;

            while ((linha = reader.readLine()) != null) {
                historico.append(linha).append("\n");
            }

            panelRelatoriosDeConsulta.getTextAreaHistorico().setText(historico.toString());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosDeConsulta, "Erro ao carregar o histórico de consultas.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

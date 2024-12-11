package visual;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class PanelRelatoriosDeMateriais extends JPanel {

    private JLabel labelTitlePanel;
    private JPanel panelPrincipal;
    private JTextArea textAreaHistorico;
    private JButton buttonAtualizar;

    public PanelRelatoriosDeMateriais() {
        setBackground(new Color(2, 82, 112));
        setSize(1280, 750);
        setLayout(null);
        add(getLabelTitlePanel());
        add(getPanelPrincipal());
    }

    public JLabel getLabelTitlePanel() {
        if (labelTitlePanel == null) {
            labelTitlePanel = new JLabel();
            labelTitlePanel.setForeground(new Color(255, 255, 255));
            labelTitlePanel.setFont(new Font("Tahoma", Font.PLAIN, 36));
            labelTitlePanel.setText("Relatório de Materiais");
            labelTitlePanel.setBounds(467, 30, 345, 76);
        }
        return labelTitlePanel;
    }

    public JPanel getPanelPrincipal() {
        if (panelPrincipal == null) {
            panelPrincipal = new JPanel();
            panelPrincipal.setBorder(new LineBorder(null));
            panelPrincipal.setBackground(new Color(204, 229, 233));
            panelPrincipal.setLayout(null);
            panelPrincipal.setLocation(207, 136);
            panelPrincipal.setSize(500, 400);
            panelPrincipal.setBounds(290, 120, 700, 550);

            panelPrincipal.add(getScrollPaneHistorico());
            panelPrincipal.add(getButtonAtualizar());
        }
        return panelPrincipal;
    }

    public JTextArea getTextAreaHistorico() {
        if (textAreaHistorico == null) {
            textAreaHistorico = new JTextArea();
            textAreaHistorico.setEditable(false);
            textAreaHistorico.setFont(new Font("Tahoma", Font.PLAIN, 14));
            textAreaHistorico.setLineWrap(true);
            textAreaHistorico.setWrapStyleWord(true);
        }
        return textAreaHistorico;
    }

    private JScrollPane getScrollPaneHistorico() {
        JScrollPane scrollPane = new JScrollPane(getTextAreaHistorico());
        scrollPane.setBounds(20, 20, 660, 450);
        return scrollPane;
    }

    public JButton getButtonAtualizar() {
        if (buttonAtualizar == null) {
            buttonAtualizar = new JButton("Atualizar");
            buttonAtualizar.setFont(new Font("Tahoma", Font.BOLD, 16));
            buttonAtualizar.setBounds(280, 490, 140, 40);
            buttonAtualizar.setBackground(new Color(2, 82, 112));
            buttonAtualizar.setForeground(Color.WHITE);
        }
        return buttonAtualizar;
    }
}

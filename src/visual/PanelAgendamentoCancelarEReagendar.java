package visual;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import styles.Button;
import styles.Thema;
import styles.TitlePanel;

public class PanelAgendamentoCancelarEReagendar extends JPanel {

    private TitlePanel labelTitlePanel;
    private TitlePanel labelTitleConsulta;
    private TitlePanel labelTitleExame;

    private JList<String> listConsultasCadastradas;
    private JList<String> listExamesCadastrados;

    private Button buttonEditarConsulta;
    private Button buttonEditarExames;
    private Button buttonExcluirConsulta;
    private Button buttonExcluirExames;

    public PanelAgendamentoCancelarEReagendar() {
        setBackground(Thema.PRINCIPAL);

        // Criar o layout
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(210)
                    .addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE))
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(48)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(getListConsultasCadastradas(), GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(getLabelTitleConsulta(), GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getButtonExcluirConsulta())
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(getButtonEditarConsulta()))))
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(48)
                    .addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
                        .addComponent(getListExamesCadastrados(), GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
                        .addGroup(groupLayout.createSequentialGroup()
                            .addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(getButtonExcluirExames())
                            .addPreferredGap(ComponentPlacement.RELATED)
                            .addComponent(getButtonEditarExames()))))
        );

        groupLayout.setVerticalGroup(
            groupLayout.createParallelGroup(Alignment.LEADING)
                .addGroup(groupLayout.createSequentialGroup()
                    .addGap(22)
                    .addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                    .addGap(16)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(getLabelTitleConsulta(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getButtonExcluirConsulta())
                        .addComponent(getButtonEditarConsulta()))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(getListConsultasCadastradas(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addGap(16)
                    .addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
                        .addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                        .addComponent(getButtonExcluirExames())
                        .addComponent(getButtonEditarExames()))
                    .addPreferredGap(ComponentPlacement.RELATED)
                    .addComponent(getListExamesCadastrados(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setLayout(groupLayout);
    }

    public TitlePanel getLabelTitlePanel() {
        if (labelTitlePanel == null) {
            labelTitlePanel = new TitlePanel("Reagendar ou Cancelar");
        }
        return labelTitlePanel;
    }

    public TitlePanel getLabelTitleConsulta() {
        if (labelTitleConsulta == null) {
            labelTitleConsulta = new TitlePanel("Agenda de Consultas");
            labelTitleConsulta.setFont(Thema.FONT_SUB_TITLE);
        }
        return labelTitleConsulta;
    }

    public Button getButtonExcluirConsulta() {
        if (buttonExcluirConsulta == null) {
            buttonExcluirConsulta = new Button("Excluir");
            buttonExcluirConsulta.setEnabled(false);
            buttonExcluirConsulta.setVisible(false);
        }
        return buttonExcluirConsulta;
    }

    public Button getButtonEditarConsulta() {
        if (buttonEditarConsulta == null) {
            buttonEditarConsulta = new Button("Editar");
        }
        return buttonEditarConsulta;
    }

    public JList<String> getListConsultasCadastradas() {
        if (listConsultasCadastradas == null) {
            listConsultasCadastradas = criarListaComDados("./dados/consultas.txt");
        }
        return listConsultasCadastradas;
    }

    public TitlePanel getLabelTitleExame() {
        if (labelTitleExame == null) {
            labelTitleExame = new TitlePanel("Agenda de Exames");
            labelTitleExame.setFont(new Font("Dialog", Font.BOLD, 25));
        }
        return labelTitleExame;
    }

    public Button getButtonExcluirExames() {
        if (buttonExcluirExames == null) {
            buttonExcluirExames = new Button("Excluir");
            buttonExcluirExames.setEnabled(false);
            buttonExcluirExames.setVisible(false);
        }
        return buttonExcluirExames;
    }

    public Button getButtonEditarExames() {
        if (buttonEditarExames == null) {
            buttonEditarExames = new Button("Editar");
        }
        return buttonEditarExames;
    }

    public JList<String> getListExamesCadastrados() {
        if (listExamesCadastrados == null) {
            listExamesCadastrados = criarListaComDados("./dados/exames.txt");
        }
        return listExamesCadastrados;
    }

    private JList<String> criarListaComDados(String caminhoArquivo) {
        DefaultListModel<String> model = new DefaultListModel<>();
        JList<String> list = new JList<>(model);
        list.setBorder(new LineBorder(new Color(0, 0, 0)));
        list.setFont(new Font("Courier New", Font.PLAIN, 17));

        try (BufferedReader br = new BufferedReader(new FileReader(new File(caminhoArquivo)))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("Paciente: ")) {
                    String paciente = linha.substring(10).trim();
                    String data = br.readLine().substring(6).trim();
                    String hora = br.readLine().substring(6).trim();
                    model.addElement(String.format(" %-43s %-15s %-1s ", paciente, data, hora));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return list;
    }
}

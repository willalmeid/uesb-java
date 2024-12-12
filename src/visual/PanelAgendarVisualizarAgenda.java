package visual;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import styles.Button;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.GroupLayout.Alignment;

public class PanelAgendarVisualizarAgenda extends JPanel {

    private TitlePanel labelTitlePanel;
    private TitlePanel labelTitleConsulta;
    private TitlePanel labelTitleExame;
    private JPanel panelConsulta;
    private JPanel panelExame;
    private JTable tableConsulta;
    private JTable tableExame;
    private Button buttonAtualizar;

    public PanelAgendarVisualizarAgenda() {
        setBackground(Thema.PRINCIPAL);
        setSize(830, 849);
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(260)
        					.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(getLabelTitleConsulta(), GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(getPanelConsulta(), GroupLayout.PREFERRED_SIZE, 770, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 373, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(getPanelExame(), GroupLayout.PREFERRED_SIZE, 770, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(365)
        					.addComponent(getButtonAtualizar(), GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(50, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(25)
        			.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(getLabelTitleConsulta(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(10)
        			.addComponent(getPanelConsulta(), GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(11)
        			.addComponent(getPanelExame(), GroupLayout.PREFERRED_SIZE, 270, GroupLayout.PREFERRED_SIZE)
        			.addGap(20)
        			.addComponent(getButtonAtualizar(), GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(49))
        );
        setLayout(groupLayout);
    }

    public TitlePanel getLabelTitlePanel() {
        if (labelTitlePanel == null) {
            labelTitlePanel = new TitlePanel("Visualizar Agenda");
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

    public JPanel getPanelConsulta() {
        if (panelConsulta == null) {
            panelConsulta = new JPanel();
            panelConsulta.setBorder(new LineBorder(Thema.TRANSPARENT));
            panelConsulta.setBackground(Thema.TRANSPARENT);
            panelConsulta.setLayout(null);
            panelConsulta.add(getTableScrollPaneConsulta());
        }
        return panelConsulta;
    }

    public JScrollPane getTableScrollPaneConsulta() {
        JScrollPane scrollPane = new JScrollPane(getTableConsulta());
        scrollPane.setBounds(10, 10, 750, 251); // Ajuste de tamanho e posição
        return scrollPane;
    }

    public JTable getTableConsulta() {
        if (tableConsulta == null) {
            tableConsulta = new JTable();

            // Definir os títulos das colunas (dias da semana)
            Object[] columnNames = {"Horário", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

            // Definir os horários (linhas), incluindo o horário de almoço como uma linha vazia
            Object[][] data = {
                {"09:00 - 09:30", "", "", "", "", ""},
                {"09:30 - 10:00", "", "", "", "", ""},
                {"10:00 - 10:30", "", "", "", "", ""},
                {"10:30 - 11:00", "", "", "", "", ""},
                {"11:00 - 11:30", "", "", "", "", ""},
                {"11:30 - 12:00", "", "", "", "", ""},
                {"Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço"},
                {"14:30 - 15:00", "", "", "", "", ""},
                {"15:00 - 15:30", "", "", "", "", ""},
                {"15:30 - 16:00", "", "", "", "", ""},
                {"16:00 - 16:30", "", "", "", "", ""},
                {"16:30 - 17:00", "", "", "", "", ""},
                {"17:00 - 17:30", "", "", "", "", ""},
                {"17:30 - 18:00", "", "", "", "", ""}
            };

            // Criar o modelo da tabela com os dados e os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(data, columnNames) {
                public boolean isCellEditable(int row, int column) {
                    return column < 0;  // Apenas as células de "Segunda" a "Sexta" serão editáveis
                }
            };
            tableConsulta.setModel(model);
        }
        return tableConsulta;
    }
    
    public TitlePanel getLabelTitleExame() {
        if (labelTitleExame == null) {
            labelTitleExame = new TitlePanel("Agenda de Exames");
            labelTitleExame.setFont(Thema.FONT_SUB_TITLE);
        }
        return labelTitleExame;
    }

    public JPanel getPanelExame() {
        if (panelExame == null) {
            panelExame = new JPanel();
            panelExame.setBorder(new LineBorder(Thema.TRANSPARENT));
            panelExame.setBackground(Thema.TRANSPARENT);
            panelExame.setLayout(null);
            panelExame.add(getTableScrollPaneExame());
        }
        return panelExame;
    }

    public JScrollPane getTableScrollPaneExame() {
        JScrollPane scrollPane = new JScrollPane(getTableExame());
        scrollPane.setBounds(10, 10, 750, 251); // Ajuste de tamanho e posição
        return scrollPane;
    }

    public JTable getTableExame() {
        if (tableExame == null) {
            tableExame = new JTable();
            tableExame.setBounds(10, 571, 748, 224);

            // Definir os títulos das colunas (dias da semana)
            Object[] columnNames = {"Horário", "Segunda", "Terça", "Quarta", "Quinta", "Sexta"};

            // Definir os horários (linhas), incluindo o horário de almoço como uma linha vazia
            Object[][] data = {
                {"09:00 - 09:30", "", "", "", "", ""},
                {"09:30 - 10:00", "", "", "", "", ""},
                {"10:00 - 10:30", "", "", "", "", ""},
                {"10:30 - 11:00", "", "", "", "", ""},
                {"11:00 - 11:30", "", "", "", "", ""},
                {"11:30 - 12:00", "", "", "", "", ""},
                {"Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço", "Horário de Almoço"},
                {"14:30 - 15:00", "", "", "", "", ""},
                {"15:00 - 15:30", "", "", "", "", ""},
                {"15:30 - 16:00", "", "", "", "", ""},
                {"16:00 - 16:30", "", "", "", "", ""},
                {"16:30 - 17:00", "", "", "", "", ""},
                {"17:00 - 17:30", "", "", "", "", ""},
                {"17:30 - 18:00", "", "", "", "", ""}
            };

            // Criar o modelo da tabela com os dados e os nomes das colunas
            DefaultTableModel model = new DefaultTableModel(data, columnNames) {
                public boolean isCellEditable(int row, int column) {
                    return column < 0;  // Apenas as células de "Segunda" a "Sexta" serão editáveis, so colocar '>'
                }
            };
            tableExame.setModel(model);
        }
        return tableExame;
    }
    
    public Button getButtonAtualizar() {
		if (buttonAtualizar == null) {
			buttonAtualizar = new Button("Atualizar");
		}
		return buttonAtualizar;
	}
}

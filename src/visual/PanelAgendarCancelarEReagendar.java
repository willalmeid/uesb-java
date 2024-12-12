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

import styles.Button;
import styles.Thema;
import styles.TitlePanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PanelAgendarCancelarEReagendar extends JPanel {

    private TitlePanel labelTitlePanel;
    private TitlePanel labelTitleConsulta;
    private TitlePanel labelTitleExame;

    private JList<String> listConsultasCadastradas;
    private JList<String> listExamesCadastrados;
    
    private Button buttonEditarConsulta;
    private Button buttonEditarExames;

    public PanelAgendarCancelarEReagendar() {
        setBackground(Thema.PRINCIPAL);
        
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
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
        							.addComponent(getButtonEditarConsulta()))))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(48)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(getListExamesCadastrados(), GroupLayout.PREFERRED_SIZE, 680, GroupLayout.PREFERRED_SIZE)
        						.addGroup(groupLayout.createSequentialGroup()
        							.addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 406, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(getButtonEditarExames())))))
        			.addGap(102))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(22)
        			.addComponent(getLabelTitlePanel(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addGap(3)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(8)
        					.addComponent(getButtonEditarConsulta())
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(getListConsultasCadastradas(), GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
        				.addComponent(getLabelTitleConsulta(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
        			.addGap(16)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(getLabelTitleExame(), GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
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
    
    public Button getButtonEditarConsulta() {
		if (buttonEditarConsulta == null) {
			buttonEditarConsulta = new Button("Editar");
		}
		return buttonEditarConsulta;
	}

    public JList<String> getListConsultasCadastradas() {
        if (listConsultasCadastradas == null) {
            DefaultListModel<String> model = new DefaultListModel<>();
            listConsultasCadastradas = new JList<>(model);
            listConsultasCadastradas.setBorder(new LineBorder(new Color(0, 0, 0)));
            listConsultasCadastradas.setFont(new Font("Courier New", Font.PLAIN, 17)); // Fonte monoespaçada
            
            try {
                File file = new File("./dados/consultas.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String linha;
                String paciente = null, data = null, hora = null;

                while ((linha = br.readLine()) != null) {
                    if (linha.startsWith("Paciente: ")) {
                        paciente = linha.substring(10).trim();
                        linha = br.readLine();
                        data = linha.substring(6).trim();
                        linha = br.readLine();
                        hora = linha.substring(6).trim();

                        model.addElement(String.format(" %-43s %-15s %-1s ", paciente, data, hora));
                    }
                }

                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return listConsultasCadastradas;
    }
    
	public TitlePanel getLabelTitleExame() {
		if (labelTitleExame == null) {
			labelTitleExame = new TitlePanel("Agenda de Consultas");
			labelTitleExame.setText("Agenda de Exames");
			labelTitleExame.setFont(new Font("Dialog", Font.BOLD, 25));
		}
		return labelTitleExame;
	}
	
	public Button getButtonEditarExames() {
		if (buttonEditarExames == null) {
			buttonEditarExames = new Button("Editar");
		}
		return buttonEditarExames;
	}
	
	public JList<String> getListExamesCadastrados() {
        if (listExamesCadastrados == null) {
            DefaultListModel<String> model = new DefaultListModel<>();
            listExamesCadastrados = new JList<>(model);
            listExamesCadastrados.setBorder(new LineBorder(new Color(0, 0, 0)));
            listExamesCadastrados.setFont(new Font("Courier New", Font.PLAIN, 17)); // Fonte monoespaçada

            model.clear();
            
            try {
                File file = new File("./dados/exames.txt");
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                String linha;
                String paciente = null, data = null, hora = null;

                while ((linha = br.readLine()) != null) {
                    if (linha.startsWith("Paciente: ")) {
                        paciente = linha.substring(10).trim();
                        linha = br.readLine();
                        data = linha.substring(6).trim();
                        linha = br.readLine();
                        hora = linha.substring(6).trim();

                        model.addElement(String.format(" %-43s %-15s %-1s ", paciente, data, hora));
                    }
                }

                br.close();
                fr.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return listExamesCadastrados;
    }
}
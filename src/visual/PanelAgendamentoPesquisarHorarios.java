package visual;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import styles.Thema;
import styles.TitlePanel;
import javax.swing.JComboBox;
import javax.swing.JList;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import javax.swing.DefaultListModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class PanelAgendamentoPesquisarHorarios extends JPanel {

	private TitlePanel labelTitlePanel;
	private JPanel panelPrincipal;
	private JComboBox<String> comboBoxTipoPesquisa;
	private JComboBox<String> comboBoxPesquisa;
	private JList listHorarios;
	
	public PanelAgendamentoPesquisarHorarios() {
		setBackground(Thema.PRINCIPAL);
		setSize(830, 600);
		setLayout(null);
		
		add(getLabelTitlePanel());
		add(getPanelPrincipal());
	}

	public TitlePanel getLabelTitlePanel() {
		if(labelTitlePanel == null) {
			labelTitlePanel = new TitlePanel("Pesquisar Horários");
			labelTitlePanel.setBounds(251, 50, 328, 44);
		}
		return labelTitlePanel;
	}
	
	public JPanel getPanelPrincipal() {
		if(panelPrincipal == null) {
			panelPrincipal = new JPanel();
			panelPrincipal.setBorder(new LineBorder(null));
			panelPrincipal.setBackground(Thema.BACKGROUND);
			panelPrincipal.setBounds(10, 105, 779, 429);
			GroupLayout gl_panelPrincipal = new GroupLayout(panelPrincipal);
			gl_panelPrincipal.setHorizontalGroup(
				gl_panelPrincipal.createParallelGroup(Alignment.TRAILING)
					.addGroup(gl_panelPrincipal.createSequentialGroup()
						.addContainerGap(325, Short.MAX_VALUE)
						.addComponent(getComboBoxPesquisa(), GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
						.addGap(18)
						.addComponent(getComboBoxTipoPesquisa(), GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
			);
			gl_panelPrincipal.setVerticalGroup(
				gl_panelPrincipal.createParallelGroup(Alignment.LEADING)
					.addGroup(gl_panelPrincipal.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_panelPrincipal.createParallelGroup(Alignment.BASELINE)
							.addComponent(getComboBoxTipoPesquisa(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(getComboBoxPesquisa(), GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(394, Short.MAX_VALUE))
			);
			panelPrincipal.setLayout(gl_panelPrincipal);
		}
		return panelPrincipal;
	}
	public JComboBox getComboBoxTipoPesquisa() {
		if (comboBoxTipoPesquisa == null) {
			comboBoxTipoPesquisa = new JComboBox<String>();
			comboBoxTipoPesquisa.addItem("Por data");
			comboBoxTipoPesquisa.addItem("Por médico");
			comboBoxTipoPesquisa.addItem("Por tipo de consulta/exame");
			comboBoxTipoPesquisa.setSelectedIndex(-1);
		}
		return comboBoxTipoPesquisa;
	}
	public JComboBox getComboBoxPesquisa() {
		if (comboBoxPesquisa == null) {
			comboBoxPesquisa = new JComboBox<String>();
			comboBoxPesquisa.setVisible(false);
			comboBoxPesquisa.setEnabled(false);
			comboBoxPesquisa.setSelectedIndex(-1);
		}
		return comboBoxPesquisa;
	}
	public JList<String> getListHorarios() {
        if (listHorarios == null) {
            DefaultListModel<String> model = new DefaultListModel<>();
            listHorarios = new JList<>(model);
            listHorarios.setBorder(new LineBorder(new Color(0, 0, 0)));
            listHorarios.setFont(new Font("Courier New", Font.PLAIN, 17)); // Fonte monoespaçada
        }
        return listHorarios;
    }
}
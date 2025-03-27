package visual;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import styles.ButtonCard;
import styles.ButtonNavegacao;
import styles.Icons;
import styles.Thema;
import styles.TitlePanel;

import javax.swing.ImageIcon;

public class PanelRelatorios extends JPanel {

    private TitlePanel titlePanel;

    private ButtonCard buttonCardRelatorioConsulta;
    private ButtonCard buttonCardRelatorioExame;
    private ButtonCard buttonCardRelatorioFinanceiro;
    private ButtonCard buttonCardRelatorioMaterial;

    private ButtonNavegacao buttonVoltar;
    private ButtonNavegacao buttonHome;

    public PanelRelatorios() {
        setVisible(true);
        setSize(1280, 720);
        setBackground(Thema.PRINCIPAL);

        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(getButtonVoltar(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        			.addGap(396)
        			.addComponent(getTitlePanel(), GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
        			.addGap(395)
        			.addComponent(getButtonHome(), GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(50, Short.MAX_VALUE))
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap(219, Short.MAX_VALUE)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(getButtonCardRelatorioFinanceiro(), GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
        					.addGap(38)
        					.addComponent(getButtonCardRelatorioMaterial(), GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addComponent(getButtonCardRelatorioConsulta(), GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)
        					.addGap(33)
        					.addComponent(getButtonCardRelatorioExame(), GroupLayout.PREFERRED_SIZE, 395, GroupLayout.PREFERRED_SIZE)))
        			.addGap(233))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(30)
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
        				.addComponent(getButtonVoltar(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        				.addComponent(getButtonHome(), Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
        				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(getTitlePanel(), GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)))
        			.addGap(18)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(getButtonCardRelatorioConsulta(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(getButtonCardRelatorioExame(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        			.addGap(28)
        			.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(getButtonCardRelatorioMaterial(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
        				.addComponent(getButtonCardRelatorioFinanceiro(), GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE))
        			.addGap(91))
        );
        setLayout(groupLayout);
    }

    public TitlePanel getTitlePanel() {
        if (titlePanel == null) {
            titlePanel = new TitlePanel("Tela Relatórios");
        }
        return titlePanel;
    }

    public ButtonNavegacao getButtonVoltar() {
        if (buttonVoltar == null) {
            buttonVoltar = new ButtonNavegacao();
            buttonVoltar.setIcon(new ImageIcon(PanelCadastrar.class.getResource(Icons.BUTTON_BACK)));
        }
        return buttonVoltar;
    }

    public ButtonNavegacao getButtonHome() {
        if (buttonHome == null) {
            buttonHome = new ButtonNavegacao();
            buttonHome.setIcon(new ImageIcon(PanelCadastrar.class.getResource(Icons.BUTTON_HOME)));
        }
        return buttonHome;
    }

    public ButtonCard getButtonCardRelatorioConsulta() {
        if (buttonCardRelatorioConsulta == null) {
            buttonCardRelatorioConsulta = new ButtonCard("Relatório de Consultas");
        }
        return buttonCardRelatorioConsulta;
    }

    public ButtonCard getButtonCardRelatorioExame() {
        if (buttonCardRelatorioExame == null) {
            buttonCardRelatorioExame = new ButtonCard("Relatório de Exames");
        }
        return buttonCardRelatorioExame;
    }

    public ButtonCard getButtonCardRelatorioFinanceiro() {
        if (buttonCardRelatorioFinanceiro == null) {
            buttonCardRelatorioFinanceiro = new ButtonCard("Relatório Financeiro");
        }
        return buttonCardRelatorioFinanceiro;
    }

    public ButtonCard getButtonCardRelatorioMaterial() {
        if (buttonCardRelatorioMaterial == null) {
            buttonCardRelatorioMaterial = new ButtonCard("Relatório de Materiais");
        }
        return buttonCardRelatorioMaterial;
    }
}

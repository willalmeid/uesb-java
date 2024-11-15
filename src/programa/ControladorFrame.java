package programa;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import controle.ControladorPanelCadastrar;
import styles.ButtonNavegacao;

import visual.Dialog;
import visual.Frame;
import visual.PanelHome;
import visual.PanelHomeMain;
import visual.PanelCadastrar;
import visual.PanelCadastrarMedico;
import visual.PanelCadastrarPaciente;

public class ControladorFrame implements ActionListener{

	Frame frame;
	PanelHome panelHome;
	PanelHomeMain panelMain;
	
	public ControladorFrame(Frame frame) {
		this.frame = frame;
		
		if (frame.getContentPane() instanceof PanelHome) {
            this.panelHome = (PanelHome) frame.getContentPane();

            // Obtém o PanelMain através do JSplitPane
            if (panelHome.getSplitPane().getRightComponent() instanceof PanelHomeMain) {
                this.panelMain = (PanelHomeMain) panelHome.getSplitPane().getRightComponent();

                // Adiciona ActionListener aos botões
                ButtonNavegacao buttonCadastrar = panelMain.getButtonCadastar();
                ButtonNavegacao buttonAgendar = panelMain.getButtonAgendar();
                ButtonNavegacao buttonRelatorios = panelMain.getButtonRelatorios();

                buttonCadastrar.addActionListener(this);
                buttonAgendar.addActionListener(this);
                buttonRelatorios.addActionListener(this);
            }
        }
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelMain.getButtonCadastar()) {
			PanelCadastrar panelCadastrar = new PanelCadastrar();
			ControladorPanelCadastrar controladorCadastrar = new ControladorPanelCadastrar(panelCadastrar);
			frame.setContentPane(panelCadastrar);
			
        } else if (e.getSource() == panelMain.getButtonAgendar()) {
            System.out.println("Botão 'Agendar' clicado!");
        } else if (e.getSource() == panelMain.getButtonRelatorios()) {
            System.out.println("Botão 'Relatórios' clicado!");
        }
	}
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		PanelHome panelHome = new PanelHome();
		frame.setContentPane(panelHome);
		new ControladorFrame(frame);
	}
}

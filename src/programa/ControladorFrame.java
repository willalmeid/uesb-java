package programa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controle.ControladorPanelAgendar;
import controle.ControladorPanelCadastrar;
import styles.ButtonCard;

import visual.Frame;
import visual.PanelAgendar;
import visual.PanelHome;
import visual.PanelHomeMain;
import visual.PanelCadastrar;

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
                ButtonCard buttonCadastrar = panelMain.getButtonCadastar();
                ButtonCard buttonAgendar = panelMain.getButtonAgendar();
                ButtonCard buttonRelatorios = panelMain.getButtonRelatorios();

                buttonCadastrar.addActionListener(this);
                buttonAgendar.addActionListener(this);
                buttonRelatorios.addActionListener(this);
            }
        }
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == panelMain.getButtonCadastar()) {
			PanelCadastrar panelCadastrar = new PanelCadastrar();
			ControladorPanelCadastrar controladorCadastrar = new ControladorPanelCadastrar(panelCadastrar, frame, panelHome);
			frame.setContentPane(panelCadastrar);
			
        } else if (e.getSource() == panelMain.getButtonAgendar()) {
        	PanelAgendar panelAgendar = new PanelAgendar();
        	ControladorPanelAgendar controladorAgendar = new ControladorPanelAgendar(panelAgendar, frame, panelHome);
        	frame.setContentPane(panelAgendar);
        	
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

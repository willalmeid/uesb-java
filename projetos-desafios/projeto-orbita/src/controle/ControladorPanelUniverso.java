package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import visual.PanelUniverso;

public class ControladorPanelUniverso implements ActionListener {

	PanelUniverso panelUniverso;
	private Timer timer;
	
	public ControladorPanelUniverso(PanelUniverso panelUniverso) {
		this.panelUniverso = panelUniverso;
		addEventos();
	}
	
	public void addEventos() {
		panelUniverso.getButtonComecar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelUniverso.getButtonComecar()) {
			iniciarGalaxia();
        } else if (e.getSource() == timer) {
            panelUniverso.atualizarAngulo(0.01);
        }
		
	}
	
	public void iniciarGalaxia() {
        if (timer == null) {
            timer = new Timer(20, this);
            timer.start();
        }
    }

}

package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConteudoModelo extends JFrame implements ActionListener{
	

	private static final long serialVersionUID = 1L;
	private JButton btnNewButton;
	private JButton buttonLancar;
	
	public ConteudoModelo() throws InterruptedException  {
		getContentPane().setLayout(null);
		getContentPane().add(getBtnNewButton());
		getContentPane().add(getButtonLancar());
		setVisible(true);
		this.setSize(700, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getButtonLancar().addActionListener(this);
		
	
	}
	
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(0, 10, 100, 40);
		}
		return btnNewButton;
	}
	
	
	
	public JButton getButtonLancar() {
		if (buttonLancar == null) {
			buttonLancar = new JButton("New button");
			buttonLancar.setBounds(93, 145, 85, 21);
		}
		return buttonLancar;
	}
	
//	public static void main (String[] wrf) throws InterruptedException {
//		new ConteudoModelo();		
//		
//	}

	private  Runnable t1 = new Runnable() {
        public void run() {
        	try {
				for (int i = 0; i < 600; i++) {
					try {
						  Thread.sleep(1);
						} catch (InterruptedException e6) {
						  Thread.currentThread().interrupt();
						}
					getBtnNewButton().setLocation(i, 10);
					
				}
			}catch (Exception e1) {
				// TODO: handle exception
			}
		}

        
    };
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == getButtonLancar()) {	
			new Thread(t1).start();
		}
	}
}

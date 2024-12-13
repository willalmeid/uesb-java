package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import visual.PanelAgendamentoPesquisarHorarios;

public class ControladorPanelAgendamentoPesquisarHorarios implements ActionListener{

	PanelAgendamentoPesquisarHorarios panelAgendamentoPesquisarHorarios;
	
	public ControladorPanelAgendamentoPesquisarHorarios(PanelAgendamentoPesquisarHorarios panelAgendamentoPesquisarHorarios) {
		this.panelAgendamentoPesquisarHorarios = panelAgendamentoPesquisarHorarios;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa()) {
			atualizarTipoPesquisa();
		}
	}

	private void atualizarTipoPesquisa() {
		if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedItem() != null) {
			
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().removeAllItems();
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().setVisible(true);
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().setEnabled(true);
			
			if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 0) {
				try {
	                File file = new File("./dados/consultas.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String data = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Data: ")) {
	                        data = linha.substring(6).trim();
	                        linha = br.readLine();
	                        panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(data);
	                    }
	                }

	                br.close();
	                fr.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
			} else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 1) {
				try {
	                File file = new File("./dados/consultas.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String medico = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Médico: ")) {
	                        medico = linha.substring(8).trim();
	                        linha = br.readLine();
	                        panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(medico);
	                    }
	                }

	                br.close();
	                fr.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
			} else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 2) {
				try {
	                File file = new File("./dados/consultas.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String tipoConsulta = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Tipo de Consulta: ")) {
	                    	tipoConsulta = linha.substring(18).trim();
	                        linha = br.readLine();
	                        panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(tipoConsulta);
	                    }
	                }

	                br.close();
	                fr.close();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
			}
			
		}
	}

}

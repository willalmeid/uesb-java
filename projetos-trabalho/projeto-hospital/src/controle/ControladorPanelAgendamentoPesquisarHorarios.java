package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import visual.PanelAgendamentoPesquisarHorarios;

public class ControladorPanelAgendamentoPesquisarHorarios implements ActionListener{

	PanelAgendamentoPesquisarHorarios panelAgendamentoPesquisarHorarios;
	
	public ControladorPanelAgendamentoPesquisarHorarios(PanelAgendamentoPesquisarHorarios panelAgendamentoPesquisarHorarios) {
		this.panelAgendamentoPesquisarHorarios = panelAgendamentoPesquisarHorarios;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().addActionListener(this);
		panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa()) {
			atualizarTipoPesquisa();
		} else if(e.getSource() == panelAgendamentoPesquisarHorarios.getComboBoxPesquisa()) {
			atualizarPesquisaHorarios();
		}
	}

	private void atualizarTipoPesquisa() {
		if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedItem() != null) {
			
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().removeAllItems();
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().setVisible(true);
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().setEnabled(true);
			panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().setSelectedIndex(-1);
			
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
	            } try {
	                File file = new File("./dados/exames.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String data = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Data: ")) {
	                        data = linha.substring(6).trim();
	                        linha = br.readLine();
	                        if(!Verificacao.verificaSeExisteNoComboBox(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa(), data)) {
	                        	panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(data);	                        	
	                        }
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
	            } try {
	                File file = new File("./dados/exames.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String medico = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Médico: ")) {
	                        medico = linha.substring(8).trim();
	                        linha = br.readLine();
	                        if(!Verificacao.verificaSeExisteNoComboBox(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa(), medico)) {
	                        	panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(medico);	                        	
	                        }
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
	            } try {
	                File file = new File("./dados/exames.txt");
	                FileReader fr = new FileReader(file);
	                BufferedReader br = new BufferedReader(fr);

	                String linha;
	                String tipoExame = null;

	                while ((linha = br.readLine()) != null) {
	                    if (linha.startsWith("Tipo Exame: ")) {
	                    	tipoExame = linha.substring(12).trim();
	                        linha = br.readLine();
	                        panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().addItem(tipoExame);
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

	private void atualizarPesquisaHorarios() {
		if(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem() != null) {
			panelAgendamentoPesquisarHorarios.getTextAreaHorarios().setText("");
			
			StringBuilder consultasFiltradas = new StringBuilder();
			
			try {
	            File file = new File("./dados/consultas.txt");
	            BufferedReader br = new BufferedReader(new FileReader(file));

	            String linha;
	            StringBuilder consultaAtual = new StringBuilder();
	            boolean adicionarConsulta = false;

	            while ((linha = br.readLine()) != null) {
	                if (linha.trim().isEmpty() || linha.startsWith("----")) {
	                    if (adicionarConsulta) {
	                        consultasFiltradas.append(consultaAtual.toString()).append("\n\n");
	                    }
	                    
	                    consultaAtual.setLength(0);
	                    adicionarConsulta = false;
	                } else {
	                    // Adiciona a linha atual à consulta temporária
	                    consultaAtual.append(linha).append("\n");

	                    if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 0) { //data
	                    	if (linha.startsWith("Data: ")) {
	                    		String data = linha.substring(6).trim();
	                    		if (data.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    } else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 1) { //medico
	                    	if (linha.startsWith("Médico: ")) {
	                    		String medico = linha.substring(8).trim();
	                    		if (medico.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    } else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 2) { //tipo de consulta
	                    	if (linha.startsWith("Tipo de Consulta: ")) {
	                    		String tipoConsulta = linha.substring(18).trim();
	                    		if (tipoConsulta.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    }
	                }
	            }

	            if (adicionarConsulta) {
	                consultasFiltradas.append(consultaAtual.toString());
	            }
	            
	            panelAgendamentoPesquisarHorarios.getTextAreaHorarios().setText(consultasFiltradas.toString());

	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } try {
	            File file = new File("./dados/exames.txt");
	            BufferedReader br = new BufferedReader(new FileReader(file));

	            String linha;
	            StringBuilder consultaAtual = new StringBuilder();
	            boolean adicionarConsulta = false;

	            while ((linha = br.readLine()) != null) {
	                if (linha.trim().isEmpty() || linha.startsWith("----")) {
	                    if (adicionarConsulta) {
	                        consultasFiltradas.append(consultaAtual.toString()).append("\n\n");
	                    }
	                    
	                    consultaAtual.setLength(0);
	                    adicionarConsulta = false;
	                } else {
	                    // Adiciona a linha atual à consulta temporária
	                    consultaAtual.append(linha).append("\n");

	                    if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 0) { //data
	                    	if (linha.startsWith("Data: ")) {
	                    		String data = linha.substring(6).trim();
	                    		if (data.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    } else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 1) { //medico
	                    	if (linha.startsWith("Médico: ")) {
	                    		String medico = linha.substring(8).trim();
	                    		if (medico.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    } else if(panelAgendamentoPesquisarHorarios.getComboBoxTipoPesquisa().getSelectedIndex() == 2) { //tipo de consulta
	                    	if (linha.startsWith("Tipo Exame: ")) {
	                    		String tipoConsulta = linha.substring(12).trim();
	                    		if (tipoConsulta.equals(panelAgendamentoPesquisarHorarios.getComboBoxPesquisa().getSelectedItem())) {
	                    			adicionarConsulta = true;
	                    		}
	                    	}	                    	
	                    }
	                }
	            }

	            if (adicionarConsulta) {
	                consultasFiltradas.append(consultaAtual.toString());
	            }
	            
	            panelAgendamentoPesquisarHorarios.getTextAreaHorarios().setText(consultasFiltradas.toString());

	            br.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        
		}
	}
}

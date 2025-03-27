package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import visual.Dialog;
import visual.Frame;
import visual.PanelAgendamentoCancelarEReagendar;
import visual.PanelCadastrarConsulta;
import visual.PanelCadastrarExame;

public class ControladorPanelAgendamentoCancelarEReagendar implements ActionListener{

	Frame frame;
	PanelAgendamentoCancelarEReagendar panelAgendamentoCancelarEReagendar;
	
	public ControladorPanelAgendamentoCancelarEReagendar(Frame frame, PanelAgendamentoCancelarEReagendar panelAgendamentoCancelarEReagendar) {
		this.frame = frame;
		this.panelAgendamentoCancelarEReagendar = panelAgendamentoCancelarEReagendar;
		addEventos();
	}
	
	public void addEventos() {
		panelAgendamentoCancelarEReagendar.getButtonEditarConsulta().addActionListener(this);
		panelAgendamentoCancelarEReagendar.getButtonEditarExames().addActionListener(this);
		panelAgendamentoCancelarEReagendar.getButtonExcluirConsulta().addActionListener(this);
		panelAgendamentoCancelarEReagendar.getButtonExcluirExames().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonEditarConsulta()) {
			if(panelAgendamentoCancelarEReagendar.getListConsultasCadastradas().getSelectedValue() == null) {
				JOptionPane.showMessageDialog(panelAgendamentoCancelarEReagendar, "Selecione um item", "Alerta", JOptionPane.WARNING_MESSAGE);
				
			} else {
				abrirDiaglogCadastroConsulta();
				
			}
			
		} else if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonEditarExames()) {
			if(panelAgendamentoCancelarEReagendar.getListExamesCadastrados().getSelectedValue() == null) {
				JOptionPane.showMessageDialog(panelAgendamentoCancelarEReagendar, "Selecione um item", "Alerta", JOptionPane.WARNING_MESSAGE);
				
			} else {
				abrirDiaglogCadastroExame();
				
			}
			
		} else if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonExcluirConsulta()) {
			if(panelAgendamentoCancelarEReagendar.getListConsultasCadastradas().getSelectedValue() != null) {
				JOptionPane.showMessageDialog(panelAgendamentoCancelarEReagendar, "Consulta excluída", "Alerta", JOptionPane.WARNING_MESSAGE);				
			}
			
		} else if(e.getSource() == panelAgendamentoCancelarEReagendar.getButtonExcluirExames()) {
			if(panelAgendamentoCancelarEReagendar.getListExamesCadastrados().getSelectedValue() != null) {
				JOptionPane.showMessageDialog(panelAgendamentoCancelarEReagendar, "Exame excluído", "Alerta", JOptionPane.WARNING_MESSAGE);				
			}
			
		}
	}
	
	public void abrirDiaglogCadastroConsulta() {
		PanelCadastrarConsulta panelCadastrarConsulta = new PanelCadastrarConsulta();
		new ControladorPanelCadastrarConsulta(panelCadastrarConsulta);
		
		String paciente = null, data = null, hora = null, medico = null, tipoConsulta = null, convenio = null, queixaPaciente = null, observaçoes = null;
		List<String> meteriaisUtilizados = new ArrayList<>();
		
		try {
			File f = new File("./dados/consultas.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			String valorSelecionado = panelAgendamentoCancelarEReagendar.getListConsultasCadastradas().getSelectedValue();
			
			while(linha != null) {
				 if (linha.startsWith("Paciente: " + valorSelecionado.split("\\s{2,}")[0].trim())) {
		            paciente = linha.substring(10).trim();
		            linha = br.readLine();
		            data = linha.substring(6).trim();
		            linha = br.readLine();
		            hora = linha.substring(6).trim();
		            linha = br.readLine();
		            medico = linha.substring(8).trim();
		            linha = br.readLine();
		            tipoConsulta = linha.substring(18).trim();
		            linha = br.readLine();
		            convenio = linha.substring(10).trim();
		            linha = br.readLine();
		            queixaPaciente = linha.substring(20).trim();
		            linha = br.readLine();
		            observaçoes = linha.substring(13).trim();
		            linha = br.readLine();
		            
		            Pattern pattern = Pattern.compile("\\[(.*?)\\]");
		            Matcher matcher = pattern.matcher(linha);
		            
		            while (matcher.find()) {
		            	meteriaisUtilizados.add(matcher.group(1));
		            }
		        }
		        linha = br.readLine();
			}
			
			br.close();
			fr.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
        for (String material : meteriaisUtilizados) {
            listModel.addElement(material);
        }
		
		panelCadastrarConsulta.getComboBoxPaciente().setSelectedItem(paciente);
		panelCadastrarConsulta.getTextFieldData().setText(data);
		panelCadastrarConsulta.getTextFieldHora().setText(hora);
		panelCadastrarConsulta.getComboBoxMedico().setSelectedItem(medico);
		panelCadastrarConsulta.getComboBoxTipoDeConsulta().setSelectedItem(tipoConsulta);
		panelCadastrarConsulta.getComboBoxConvenio().setSelectedItem(convenio);
		panelCadastrarConsulta.getTextAreaQueixaPaciente().setText(queixaPaciente);
		panelCadastrarConsulta.getTextAreaObservacoes().setText(observaçoes);
		panelCadastrarConsulta.getListMateriaisUtilizados().setModel(listModel);
		
		new Dialog(frame, panelCadastrarConsulta);
	}

	public void abrirDiaglogCadastroExame() {
		PanelCadastrarExame panelCadastrarExame = new PanelCadastrarExame();
		new ControladorPanelCadastrarExame(panelCadastrarExame);
		
		String paciente = null, data = null, hora = null, medico = null, tipoExame = null, descricao = null;
		List<String> meteriaisUtilizados = new ArrayList<>();
		
		try {
			File f = new File("./dados/exames.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			String valorSelecionado = panelAgendamentoCancelarEReagendar.getListExamesCadastrados().getSelectedValue();
			
			while(linha != null) {
				if (linha.startsWith("Paciente: " + valorSelecionado.split("\\s{2,}")[0].trim())) {
					paciente = linha.substring(10).trim();
					linha = br.readLine();
					data = linha.substring(6).trim();
					linha = br.readLine();
					hora = linha.substring(6).trim();
					linha = br.readLine();
					medico = linha.substring(8).trim();
					linha = br.readLine();
					tipoExame = linha.substring(12).trim();
					linha = br.readLine();
					descricao = linha.substring(11).trim();
					linha = br.readLine();
					
					Pattern pattern = Pattern.compile("\\[(.*?)\\]");
					Matcher matcher = pattern.matcher(linha);
					
					while (matcher.find()) {
						meteriaisUtilizados.add(matcher.group(1));
					}
				}
				linha = br.readLine();
			}
			
			br.close();
			fr.close();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		DefaultListModel<String> listModel = new DefaultListModel<>();
		for (String material : meteriaisUtilizados) {
			listModel.addElement(material);
		}
		
		panelCadastrarExame.getComboBoxPaciente().setSelectedItem(paciente);
		panelCadastrarExame.getTextFieldData().setText(data);
		panelCadastrarExame.getTextFieldHora().setText(hora);
		panelCadastrarExame.getComboBoxMedico().setSelectedItem(medico);
		panelCadastrarExame.getComboBoxTipoExame().setSelectedItem(tipoExame);
		panelCadastrarExame.getTextAreaDescricao().setText(descricao);
		panelCadastrarExame.getListMateriaisUtilizados().setModel(listModel);
		
		new Dialog(frame, panelCadastrarExame);
	}
}

package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;

import modelo.Consulta;
import modelo.Material;
import visual.Dialog;
import visual.PanelCadastrarConsulta;

public class ControladorPanelCadastrarConsulta implements ActionListener {

	PanelCadastrarConsulta panelCadastrarConsulta;
	ArrayList<Consulta> consultasAgendadas;
	
	public ControladorPanelCadastrarConsulta(PanelCadastrarConsulta panelCadastarConsulta) {
		this.panelCadastrarConsulta = panelCadastarConsulta;
		consultasAgendadas = new ArrayList<Consulta>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarConsulta.getButtonCadastrar().addActionListener(this);
		panelCadastrarConsulta.getButtonLimpar().addActionListener(this);
		panelCadastrarConsulta.getButtonAdicionar().addActionListener(this);
		panelCadastrarConsulta.getButtonRemover().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarConsulta.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarConsulta.getButtonLimpar()) {
			limparPanel();

		} else if(e.getSource() == panelCadastrarConsulta.getButtonAdicionar()) {
			if(panelCadastrarConsulta.getComboBoxAdicionarMaterial().getSelectedItem() != null) {
				adicionarMaterial();
			}
			
		} else if(e.getSource() == panelCadastrarConsulta.getButtonRemover()) {
		    if(panelCadastrarConsulta.getListMateriaisUtilizados().getSelectedIndex() >= 0) {
		        int selectedIndex = panelCadastrarConsulta.getListMateriaisUtilizados().getSelectedIndex();
		        DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarConsulta.getListMateriaisUtilizados().getModel();
		        model.remove(selectedIndex);
		    }
		    
		}
	}
	
	public void cadastrarConsulta() {
		String paciente = (String) panelCadastrarConsulta.getComboBoxPaciente().getSelectedItem();
		String data = panelCadastrarConsulta.getTextFieldData().getText();
		String hora = panelCadastrarConsulta.getTextFieldHora().getText();
		String medico = (String) panelCadastrarConsulta.getComboBoxMedico().getSelectedItem();
		String tipoDeConsulta = (String) panelCadastrarConsulta.getComboBoxTipoDeConsulta().getSelectedItem();
		String convenio = (String) panelCadastrarConsulta.getComboBoxConvenio().getSelectedItem();		
		String queixaPaciente = panelCadastrarConsulta.getTextAreaQueixaPaciente().getText();
		String observacoes = panelCadastrarConsulta.getTextAreaObservacoes().getText();

		JList<String> materiaisUtilizados = panelCadastrarConsulta.getListMateriaisUtilizados();
		
		if(Verificacao.verificaCamposVazios(paciente, data, hora, medico, tipoDeConsulta, convenio, queixaPaciente)) {
			JOptionPane.showMessageDialog(panelCadastrarConsulta, "Preencha todas as informações!", "Erro! - Informações em falta", JOptionPane.WARNING_MESSAGE);
		} else if(Verificacao.verificaDatas(data)) {
			JOptionPane.showMessageDialog(panelCadastrarConsulta, "Digite uma data válida no formato dd/mm/aaaa", "Erro - Data inválida", JOptionPane.WARNING_MESSAGE);
		} else if(Verificacao.verificaHorarios(hora)) {
			JOptionPane.showMessageDialog(panelCadastrarConsulta, "Erro! Digite um horário válido", "Erro! - Horário inválido", JOptionPane.WARNING_MESSAGE);
		} else {
			Consulta c = new Consulta(paciente, data, hora, medico, tipoDeConsulta, convenio, queixaPaciente, observacoes, materiaisUtilizados);
			c.salvarDados();
			
			consultasAgendadas.add(c);
			JOptionPane.showMessageDialog(panelCadastrarConsulta, "Consulta cadastrada com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);

			if (panelCadastrarConsulta.getTopLevelAncestor() instanceof Dialog) {
                Dialog dialog = (Dialog) panelCadastrarConsulta.getTopLevelAncestor();
                dialog.dispose();  // Fecha o JDialog
            }
		}
	}
	
	public void adicionarMaterial() {
		String materialName = (String) panelCadastrarConsulta.getComboBoxAdicionarMaterial().getSelectedItem();
        DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarConsulta.getListMateriaisUtilizados().getModel();
        model.addElement(materialName);
        panelCadastrarConsulta.getComboBoxAdicionarMaterial().setSelectedIndex(-1);
        try {
            File file = new File("./dados/materiais.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String linha;
            String nome = null, fornecedor = null;
            int qtdEstoque = 0, qtdMinima = 0;
            float preco = 0;

            while ((linha = br.readLine()) != null) {
                if (linha.startsWith("Nome do Material: ")) {
                    nome = linha.substring(18).trim();
                } else if (linha.startsWith("Qtd. Estoque: ")) {
                    qtdEstoque = Integer.parseInt(linha.substring(14).trim());
                } else if (linha.startsWith("Qtd. Mínima: ")) {
                    qtdMinima = Integer.parseInt(linha.substring(13).trim());
                } else if (linha.startsWith("Fornecedor: ")) {
                    fornecedor = linha.substring(12).trim();
                } else if (linha.startsWith("Preço: ")) {
                    preco = Float.parseFloat(linha.substring(7).trim());
                } else if (linha.trim().isEmpty() || linha.startsWith("----")) {
                    if (nome != null && nome.equalsIgnoreCase(materialName)) {
                        // Material encontrado, criar e verificar o objeto
                        Material material = new Material(nome, qtdEstoque, qtdMinima, fornecedor, preco);
                        material.verificaEstoque();
                        br.close();
                        fr.close();
                        return;
                    }
                    nome = null;
                    fornecedor = null;
                    qtdEstoque = 0;
                    qtdMinima = 0;
                    preco = 0;
                }
            }
            br.close();
            fr.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
	public void limparPanel() {
		panelCadastrarConsulta.getTextFieldData().setText("");
		panelCadastrarConsulta.getTextFieldHora().setText("");
		panelCadastrarConsulta.getTextAreaQueixaPaciente().setText("");
		panelCadastrarConsulta.getTextAreaObservacoes().setText("");
		
		// Definir seu padrão como nenhum dos itens acima
		panelCadastrarConsulta.getComboBoxPaciente().setSelectedIndex(-1);
		panelCadastrarConsulta.getComboBoxMedico().setSelectedIndex(-1);
    	panelCadastrarConsulta.getComboBoxTipoDeConsulta().setSelectedIndex(-1);
    	panelCadastrarConsulta.getComboBoxConvenio().setSelectedIndex(-1);
    	
    	DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarConsulta.getListMateriaisUtilizados().getModel();
		model.clear();
	}

}
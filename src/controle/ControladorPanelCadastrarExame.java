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

import modelo.Exame;
import modelo.Material;
import visual.PanelCadastrarExame;

public class ControladorPanelCadastrarExame implements ActionListener {

	PanelCadastrarExame panelCadastrarExame;
	ArrayList<Exame> examesCadastrados;
	
	public ControladorPanelCadastrarExame(PanelCadastrarExame panelCadastrarExame) {
		this.panelCadastrarExame = panelCadastrarExame;
		examesCadastrados = new ArrayList<Exame>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarExame.getButtonCadastrar().addActionListener(this);
		panelCadastrarExame.getButtonLimpar().addActionListener(this);
		panelCadastrarExame.getButtonAdicionar().addActionListener(this);
		panelCadastrarExame.getButtonRemover().addActionListener(this);
		panelCadastrarExame.getComboBoxAdicionarMaterial().addActionListener(this);
	
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarExame.getButtonCadastrar()) {
			cadastrarConsulta();

		} else if(e.getSource() == panelCadastrarExame.getButtonLimpar()) {
			limparPanel();

		} else if(e.getSource() == panelCadastrarExame.getButtonAdicionar()) {
			if(panelCadastrarExame.getComboBoxAdicionarMaterial().getSelectedItem() != null) {
				String materialName = (String) panelCadastrarExame.getComboBoxAdicionarMaterial().getSelectedItem();
                DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarExame.getListMateriaisUtilizados().getModel();
                model.addElement(materialName);
                panelCadastrarExame.getComboBoxAdicionarMaterial().setSelectedIndex(-1);
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
                                // Material encontrado, criar e retornar o objeto
                                Material material = new Material(nome, qtdEstoque, qtdMinima, fornecedor, preco);
                                material.verificaEstoque();
                                br.close();
                                fr.close();
                                break;
                            }
                            nome = null; // Resetar para o próximo bloco
                        }
                    }
                    br.close();
                    fr.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
			}
			
		} else if(e.getSource() == panelCadastrarExame.getButtonRemover()) {
		    if(panelCadastrarExame.getListMateriaisUtilizados().getSelectedIndex() >= 0) {
		        int selectedIndex = panelCadastrarExame.getListMateriaisUtilizados().getSelectedIndex();
		        DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarExame.getListMateriaisUtilizados().getModel();
		        model.remove(selectedIndex);
		    }
		    
		}
	}

	public void cadastrarConsulta() {
		try {
			String nomeExame = panelCadastrarExame.getTextFieldNomeExame().getText();
			String descricao = panelCadastrarExame.getTextAreaDescricao().getText();
			String data = panelCadastrarExame.getTextFieldData().getText();
			String hora = panelCadastrarExame.getTextFieldHora().getText();

			float valorParticular = Float.parseFloat(panelCadastrarExame.getTextFieldValorParticular().getText());
			
			JList<String> materiaisUtilizados = panelCadastrarExame.getListMateriaisUtilizados();

			String paciente = (String) panelCadastrarExame.getComboBoxPaciente().getSelectedItem();			
			String medico = (String) panelCadastrarExame.getComboBoxMedico().getSelectedItem();
			String tipoExame = (String) panelCadastrarExame.getComboBoxTipoExame().getSelectedItem();
			
			if(Verificacao.verificaCamposVazios(nomeExame, descricao, paciente, medico, tipoExame)) {
				JOptionPane.showMessageDialog(panelCadastrarExame, "Preencha todas as informações!", "Erro! - Informações em falta", JOptionPane.WARNING_MESSAGE);
			} else if(Verificacao.verificaHorarios(hora)) {
				JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite um horário válido", "Erro! - Horário inválido", JOptionPane.WARNING_MESSAGE);
			} else {
				Exame e = new Exame(nomeExame,  valorParticular, paciente, data, hora, medico, tipoExame, descricao, materiaisUtilizados);
				e.salvarDados();
				
				examesCadastrados.add(e);
				
				JOptionPane.showMessageDialog(panelCadastrarExame, "Exame "+nomeExame+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
				limparPanel();
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(panelCadastrarExame, "Erro! Digite números válidos", "Erro! - Valores inválidos", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarExame.getTextFieldNomeExame().setText("");
		panelCadastrarExame.getTextFieldValorParticular().setText("");
		panelCadastrarExame.getTextFieldData().setText("");
		panelCadastrarExame.getTextFieldHora().setText("");
		panelCadastrarExame.getTextAreaDescricao().setText("");
		
		panelCadastrarExame.getComboBoxMedico().setSelectedIndex(-1);
		panelCadastrarExame.getComboBoxTipoExame().setSelectedIndex(-1);
		panelCadastrarExame.getComboBoxAdicionarMaterial().setSelectedIndex(-1);
		
		DefaultListModel<String> model = (DefaultListModel<String>) panelCadastrarExame.getListMateriaisUtilizados().getModel();
		model.clear();
	}
}
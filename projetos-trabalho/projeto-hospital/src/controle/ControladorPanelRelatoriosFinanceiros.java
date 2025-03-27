package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

import visual.PanelRelatoriosFinanceiros;

public class ControladorPanelRelatoriosFinanceiros implements ActionListener{

	PanelRelatoriosFinanceiros panelRelatoriosFinanceiros;
	
	public ControladorPanelRelatoriosFinanceiros(PanelRelatoriosFinanceiros panelRelatoriosFinanceiros) {
		this.panelRelatoriosFinanceiros = panelRelatoriosFinanceiros;
		gerarRelatorio();
	}
	
	public void addEventos(){
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	private void gerarRelatorio(){
		float valorMateriais = 0;
		float valorExames = 0;
		
		try (BufferedReader reader = new BufferedReader(new FileReader("./dados/exames.txt"))) {
            String linha;
            
            while ((linha = reader.readLine()) != null) {
                if(linha.startsWith("Valor Particular: ")) {
                	valorExames += Float.parseFloat(linha.substring(18).trim());
                }
            }

        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosFinanceiros, "Erro ao carregar o Relatório financeiro.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
		try (BufferedReader reader = new BufferedReader(new FileReader("./dados/materiais.txt"))) {
            String linha;
            
            float precoIndividual = 0;
            int qtdMaterial = 0;
            
            while ((linha = reader.readLine()) != null) {
            	
            	if(linha.startsWith("Qtd. Estoque: ")) {
                	qtdMaterial = Integer.parseInt(linha.substring(14).trim());
                }
                if(linha.startsWith("Preço: ")) {
                	precoIndividual = Float.parseFloat(linha.substring(7).trim());
                	valorMateriais += precoIndividual * qtdMaterial;
                }
                
            }
            
            float diferenca = valorExames - valorMateriais;
            String resultado = diferenca<0 ? "Prejuízo" : "Lucro";
            
            String relatorio = "Faturamento dos exames: R$"+valorExames+"\n\n"
            				 + "Custo com materiais: R$"+valorMateriais+"\n\n"
            				 + resultado+" de: R$"+diferenca;

            panelRelatoriosFinanceiros.getTextAreaRelatorio().setText(relatorio);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelRelatoriosFinanceiros, "Erro ao carregar o Relatório financeiro.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
	}

}

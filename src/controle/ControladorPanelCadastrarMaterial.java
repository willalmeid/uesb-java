package controle;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Material;
import visual.PanelCadastrarMaterial;

public class ControladorPanelCadastrarMaterial implements ActionListener {

    PanelCadastrarMaterial panelCadastrarMaterial;
    ArrayList<Material> materiaisCadastrados;

    public ControladorPanelCadastrarMaterial(PanelCadastrarMaterial panelCadastrarMaterial) {
        this.panelCadastrarMaterial = panelCadastrarMaterial;
        materiaisCadastrados = new ArrayList<Material>();
        addEventos();
    }

    public void addEventos() {
        panelCadastrarMaterial.getButtonCadastrar().addActionListener(this);
        panelCadastrarMaterial.getButtonLimpar().addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCadastrarMaterial.getButtonCadastrar()) {
            cadastrarMaterial();
        } else if (e.getSource() == panelCadastrarMaterial.getButtonLimpar()) {
            limparPanel();
        }
    }

    public void cadastrarMaterial() {
        try {
            String nomeDoMaterial = panelCadastrarMaterial.getTextFieldNome().getText();
            String fornecedor = panelCadastrarMaterial.getTextFieldFornecedor().getText();
            int qtdEstoque = Integer.parseInt(panelCadastrarMaterial.getTextFieldQtdEmEstoque().getText());
            int qtdMinEstoque = Integer.parseInt(panelCadastrarMaterial.getTextFieldQtdMinimaEmEstoque().getText());
            float preco = Float.parseFloat(panelCadastrarMaterial.getTextFieldPreco().getText());

            Material material = new Material(nomeDoMaterial, qtdEstoque, qtdMinEstoque, fornecedor, preco);

            materiaisCadastrados.add(material);
            salvarMateriaisEmArquivo();
            JOptionPane.showMessageDialog(panelCadastrarMaterial, "Material " + nomeDoMaterial + " cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(panelCadastrarMaterial, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void limparPanel() {
        panelCadastrarMaterial.getTextFieldNome().setText("");
        panelCadastrarMaterial.getTextFieldFornecedor().setText("");
        panelCadastrarMaterial.getTextFieldQtdEmEstoque().setText("");
        panelCadastrarMaterial.getTextFieldQtdMinimaEmEstoque().setText("");
        panelCadastrarMaterial.getTextFieldPreco().setText("");
    }

    private void salvarMateriaisEmArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("materiais.txt", true))) {
            for (Material material : materiaisCadastrados) {
                writer.write("Nome do Material: " + material.getNomeDoMaterial() + "\n");
                writer.write("Fornecedor: " + material.getFornecedor() + "\n");
                writer.write("Quantidade em Estoque: " + material.getQtdEstoque() + "\n");
                writer.write("Quantidade Mínima em Estoque: " + material.getQtdMinEstoque() + "\n");
                writer.write("Preço: " + material.getPreco() + "\n");
                writer.write("====================================\n");
            }
            writer.flush();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(panelCadastrarMaterial, "Erro ao salvar os dados no arquivo.", "Erro!", JOptionPane.WARNING_MESSAGE);
        }
    }
}

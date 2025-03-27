package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Endereco;
import modelo.Paciente;
import visual.Dialog;
import visual.PanelCadastrarPaciente;

public class ControladorPanelCadastrarPaciente implements ActionListener {

	PanelCadastrarPaciente panelCadastrarPaciente;
	ArrayList<Paciente> pacientesCadastrados;
	
	public ControladorPanelCadastrarPaciente(PanelCadastrarPaciente panelCadastrarPaciente) {
		this.panelCadastrarPaciente = panelCadastrarPaciente;
		pacientesCadastrados = new ArrayList<Paciente>();
		addEventos();
	}
	
	public void addEventos() {
		panelCadastrarPaciente.getButtonCadastrar().addActionListener(this);
		panelCadastrarPaciente.getButtonLimpar().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == panelCadastrarPaciente.getButtonCadastrar()) {
			cadastrarPaciente();

		} else if(e.getSource() == panelCadastrarPaciente.getButtonLimpar()) {
			limparPanel();

		}
	}

	public void cadastrarPaciente() {
		try {
			String nome = panelCadastrarPaciente.getTextFieldNome().getText();
			String dataNasc = panelCadastrarPaciente.getTextFieldDataNascimento().getText();
			String telefone = panelCadastrarPaciente.getTextFieldTelefone().getText();
			String historicoMedico = panelCadastrarPaciente.getTextAreaHistoricoMedico().getText();
			float peso = Float.parseFloat(panelCadastrarPaciente.getTextFieldPeso().getText());
			float altura = Float.parseFloat(panelCadastrarPaciente.getTextFieldAltura().getText());
			String tipoSanguineo = (String) panelCadastrarPaciente.getComboBoxTipoSanguineo().getSelectedItem();
			String covenio = (String) panelCadastrarPaciente.getComboBoxConvenio().getSelectedItem();

			String cep = panelCadastrarPaciente.getTextFieldCEP().getText();
			String estado = panelCadastrarPaciente.getTextFieldEstado().getText();
			String cidade = panelCadastrarPaciente.getTextFieldCidade().getText();
			String bairro = panelCadastrarPaciente.getTextFieldBairro().getText();
			String numero = panelCadastrarPaciente.getTextFieldNumero().getText();
			String logradouro = panelCadastrarPaciente.getTextFieldLogradouro().getText();
			String complemento = panelCadastrarPaciente.getTextFieldComplemento().getText();
			
			if(Verificacao.verificaCamposVazios(nome, dataNasc, telefone, historicoMedico, tipoSanguineo, cep, estado, cidade, bairro, numero, logradouro, complemento)) {
				JOptionPane.showMessageDialog(panelCadastrarPaciente, "Preencha todas as informações!", "Erro - Informações em falta", JOptionPane.WARNING_MESSAGE);
			} else if(Verificacao.verificaDatas(dataNasc)) {
				JOptionPane.showMessageDialog(panelCadastrarPaciente, "Digite uma data válida no formato dd/mm/aaaa", "Erro - Data inválida", JOptionPane.WARNING_MESSAGE);
			} else {
				Endereco e = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, estado);
				Paciente p = new Paciente(nome, dataNasc, telefone, tipoSanguineo, historicoMedico, covenio, peso, altura, e);
				p.salvarDados();
				
				pacientesCadastrados.add(p);
				
				JOptionPane.showMessageDialog(panelCadastrarPaciente, "Paciente "+nome+" cadastrado com sucesso", "Sucesso!", JOptionPane.INFORMATION_MESSAGE);
//				limparPanel();
				if (panelCadastrarPaciente.getTopLevelAncestor() instanceof Dialog) {
	                Dialog dialog = (Dialog) panelCadastrarPaciente.getTopLevelAncestor();
	                dialog.dispose();  // Fecha o JDialog
	            }
			}
		} catch(Exception e) {
			JOptionPane.showMessageDialog(panelCadastrarPaciente, "Erro! Digite números válidos", "Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void limparPanel() {
		panelCadastrarPaciente.getTextFieldNome().setText("");
		panelCadastrarPaciente.getTextFieldDataNascimento().setText("");
		panelCadastrarPaciente.getTextFieldTelefone().setText("");
		panelCadastrarPaciente.getTextAreaHistoricoMedico().setText("");
		panelCadastrarPaciente.getTextFieldPeso().setText("");
		panelCadastrarPaciente.getTextFieldAltura().setText("");

		panelCadastrarPaciente.getTextFieldCEP().setText("");
		panelCadastrarPaciente.getTextFieldEstado().setText("");
		panelCadastrarPaciente.getTextFieldCidade().setText("");
		panelCadastrarPaciente.getTextFieldBairro().setText("");
		panelCadastrarPaciente.getTextFieldNumero().setText("");
		panelCadastrarPaciente.getTextFieldLogradouro().setText("");
		panelCadastrarPaciente.getTextFieldComplemento().setText("");
		
    	panelCadastrarPaciente.getComboBoxTipoSanguineo().setSelectedIndex(-1);
    	panelCadastrarPaciente.getComboBoxConvenio().setSelectedIndex(-1);
	}
}
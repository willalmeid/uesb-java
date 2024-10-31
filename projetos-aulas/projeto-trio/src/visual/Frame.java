package visual;

import javax.swing.JFrame;

public class Frame extends JFrame {

    private static final long serialVersionUID = 1L;

    public Frame() {
        super(); // Chama o construtor da superclasse JFrame
        this.setVisible(true); // Torna o frame visível
        this.setSize(800, 600); // Define o tamanho da janela (frame)
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // Define a ação ao fechar a janela (encerrar o programa)
    }

    public static void main(String[] args) {
        Frame f = new Frame(); // Cria um objeto da classe Frame
        PanelCadastrarAluno pcn = new PanelCadastrarAluno(); // Cria um painel do tipo PanelCadastrarAluno
        f.setContentPane(pcn); // Define o painel criado como conteúdo do frame
        
        
        f.repaint(); // Redesenha o frame para garantir que o novo conteúdo seja exibido corretamente
        f.validate(); // Verifica a consistência dos componentes, ajustando o layout se necessário
    }
}
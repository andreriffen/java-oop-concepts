package github.andreriffen.javafx;

import javax.swing.*;

public class Menu {

    public static int executar() {
        String[] opcoes = {"Say Hello World", "Calculadora 1.0", "Exercício 3"}; // Opções de exercício

        int escolha = JOptionPane.showOptionDialog(
            null, // Componente pai (no caso, null indica que não há componente pai)
            "Selecione o exercício que deseja testar:", // Mensagem exibida na janela de diálogo
            "Seleção de Exercício", // Título da janela de diálogo
            JOptionPane.DEFAULT_OPTION, // Tipo de opção a ser mostrada
            JOptionPane.PLAIN_MESSAGE, // Tipo de mensagem a ser mostrada
            null, // Ícone personalizado a ser exibido (neste caso, nenhum)
            opcoes, // Opções a serem exibidas
            opcoes[0] // Opção padrão selecionada
        );

        // Adicione mais casos conforme necessário
        switch (escolha) {
            case 0:
                SayHelloWorld.executar();
                break;
            case 1:
                CalculadoraV1.executar();
                break;
            case 2:
                // Chamar método para executar exercício 3
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                break;
        }

        return escolha + 1; // Retorna a escolha do usuário (somando 1 pois os índices começam em 0)
    }
}

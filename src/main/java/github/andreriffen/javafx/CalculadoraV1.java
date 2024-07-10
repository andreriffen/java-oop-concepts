package github.andreriffen.javafx;

import javax.swing.*;

public class CalculadoraV1 {

    public static void executar() {
        // Array de opções para as operações da calculadora
        String[] opcoes = {"Adição", "Subtração", "Multiplicação", "Divisão", "Fechar"};

        // Exibe a caixa de diálogo com as opções e recebe a escolha do usuário
        int escolha = JOptionPane.showOptionDialog(
            null,                                // Componente pai (nulo para centralizar na tela)
            "Selecione a operação desejada:",    // Texto da mensagem
            "Calculadora",                      // Título da caixa de diálogo
            JOptionPane.DEFAULT_OPTION,         // Tipo de opções (padrão)
            JOptionPane.PLAIN_MESSAGE,          // Tipo de ícone (nenhum)
            null,                                // Ícone customizado (nenhum)
            opcoes,                              // Opções a serem exibidas
            opcoes[0]                            // Opção padrão (primeira opção)
        );

        // Se o usuário selecionou "Voltar", retorna sem fazer nada
        if (escolha == 4) {
            return;
        }

        // Pede ao usuário que insira o primeiro número
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:"));

        // Pede ao usuário que insira o segundo número
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número:"));

        double resultado = 0; // Variável para armazenar o resultado da operação

        // Executa a operação escolhida com base na escolha do usuário
        switch (escolha) {
            case 0: // Adição
                resultado = num1 + num2;
                break;
            case 1: // Subtração
                resultado = num1 - num2;
                break;
            case 2: // Multiplicação
                resultado = num1 * num2;
                break;
            case 3: // Divisão
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    // Exibe mensagem de erro se tentar dividir por zero
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero!", "Erro", JOptionPane.ERROR_MESSAGE);
                    return; // Retorna para evitar exibir resultado inválido
                }
                break;
            default:
                // Exibe mensagem de erro se a escolha for inválida
                JOptionPane.showMessageDialog(null, "Opção inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                return; // Retorna para evitar exibir resultado inválido
        }

        // Exibe o resultado da operação em uma caixa de diálogo
        JOptionPane.showMessageDialog(null, "Resultado: " + resultado, "Calculadora", JOptionPane.INFORMATION_MESSAGE);
        
        // Chama recursivamente o método executar() para voltar ao menu principal
        executar();
    }
}

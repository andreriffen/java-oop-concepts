package github.andreriffen.basic.controller;

import github.andreriffen.basic.exercicios.*;

import java.util.Scanner;

import static github.andreriffen.basic.utils.ScreenUtils.limparTela;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public class SelecionarExercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            limparTela();
            System.out.println("SELETOR DE EXERCÍCIOS\nEscolha o exercício que deseja executar:");
            System.out.println("1. Calcular Área de um Círculo");
            System.out.println("2. Classificar Produtos - Exercício 5");
            System.out.println("3. Calcular Gasto de Energia - Exercício 11");
            System.out.println("4. Calcular Valor de Compra com Desconto ou Juros - Exercício 14");
            System.out.println("5. Reservar Assentos de um Avião - Exercício 15");
            System.out.println("0. SAIR\n");
            System.out.print("Opção: ");

            escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    CalcularArea.executar();
                    break;
                case 2:
                    ClassificarProdutos.executar();
                    break;
                case 3:
                    CalculoEnergia.executar();
                    break;
                case 4:
                    CalculoJurosDesconto.executar();
                    break;
                case 5:
                    ReservarAssentosAviao.executar();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (escolha != 0);

        scanner.close();
    }
}
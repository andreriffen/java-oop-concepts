package github.andreriffen.basic.exercicios;

import java.util.Scanner;

import static github.andreriffen.basic.utils.ScreenUtils.limparTela;

@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class CalculoEnergia {

    public static void executar() {
        limparTela();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n__________\nOpção #3 - CALCULAR GASTO DE ENERGIA\n__________\n");

        System.out.println("Este programa calcula o gasto de energia de consumidores residenciais, comerciais e industriais.");
        System.out.println("Você deve fornecer o preço do KWh e o consumo de cada consumidor.");
        System.out.println("O programa calculará o total a pagar por cada consumidor e exibirá estatísticas gerais no final.");
        System.out.println();

        int numeroConsumidor;
        int quantidadeConsumidores = 0;
        int codigoConsumidor;

        double consumo;
        double precoKWh;
        double totalPagar = 0;
        double maiorConsumo = 0;
        double menorConsumo = Double.MAX_VALUE;

        double totalResidencial = 0;
        double totalComercial = 0;
        double totalIndustrial = 0;

        System.out.print("Digite o preço do KWh consumido (por exemplo, entre 0.1 e 1.0): ");
        precoKWh = scanner.nextDouble();

        System.out.print("Digite o número do consumidor, o valor será a `id` (ou -1 para encerrar): ");
        numeroConsumidor = scanner.nextInt();

        while (numeroConsumidor != -1) {
            System.out.print("Digite a quantidade de KWh consumidos durante o mês (por exemplo, entre 100 e 2000): ");
            consumo = scanner.nextDouble();

            System.out.print("Digite o código do tipo de consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            codigoConsumidor = scanner.nextInt();

            double totalPagarConsumidor = precoKWh * consumo;
            totalPagar += totalPagarConsumidor;

            if (consumo > maiorConsumo) {
                maiorConsumo = consumo;
            }
            if (consumo < menorConsumo) {
                menorConsumo = consumo;
            }

            switch (codigoConsumidor) {
                case 1:
                    totalResidencial += consumo;
                    break;
                case 2:
                    totalComercial += consumo;
                    break;
                case 3:
                    totalIndustrial += consumo;
                    break;
                default:
                    System.out.println("Código de consumidor inválido! Use 1 para residencial, 2 para comercial ou 3 para industrial.");
                    break;
            }

            quantidadeConsumidores++;

            System.out.println();
            System.out.println("Resumo do consumidor:");
            System.out.printf("Número do consumidor: %d, Total a pagar: %.2f\n", numeroConsumidor, totalPagarConsumidor);
            System.out.print("Digite o número do próximo consumidor (ou -1 para encerrar): ");
            numeroConsumidor = scanner.nextInt();
        }

        if (quantidadeConsumidores > 0) {
            double mediaGeral = totalPagar / quantidadeConsumidores;

            System.out.println("\nEstatísticas gerais:");
            System.out.printf("Maior consumo verificado: %.2f KWh\n", maiorConsumo);
            System.out.printf("Menor consumo verificado: %.2f KWh\n", menorConsumo);
            System.out.printf("Total de consumo residencial: %.2f KWh\n", totalResidencial);
            System.out.printf("Total de consumo comercial: %.2f KWh\n", totalComercial);
            System.out.printf("Total de consumo industrial: %.2f KWh\n", totalIndustrial);
            System.out.printf("Média geral de consumo: %.2f KWh\n", mediaGeral);
        } else {
            System.out.println("Nenhum consumidor foi registrado.");
        }

        scanner.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}

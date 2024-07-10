package github.andreriffen.basic.exercicios;

import java.util.Scanner;

import static github.andreriffen.basic.utils.ScreenUtils.limparTela;

@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class ClassificarProdutos {

    public static void executar() {
        limparTela();
        Scanner input = new Scanner(System.in);

        System.out.println("\n__________\nOpção #2 - CLASSIFICAR PRODUTOS\n__________\n");

        System.out.println("Digite o código do produto para obter sua classificação.");
        System.out.println("Códigos de produtos:");
        System.out.println("1 - Alimento não-perecível");
        System.out.println("2-4 - Alimento perecível");
        System.out.println("5-6 - Vestuário");
        System.out.println("7 - Higiene Pessoal");
        System.out.println("8-15 - Limpeza e Utensílios domésticos\n");

        boolean codigoValido = false;
        while (!codigoValido) {
            System.out.print("Digite o código do produto: ");
            int codigo = input.nextInt();

            // Classificação do produto com base no código
            String classificacao;
            switch (codigo) {
                case 1:
                    classificacao = "Alimento não-perecível";
                    codigoValido = true;
                    break;
                case 2:
                case 3:
                case 4:
                    classificacao = "Alimento perecível";
                    codigoValido = true;
                    break;
                case 5:
                case 6:
                    classificacao = "Vestuário";
                    codigoValido = true;
                    break;
                case 7:
                    classificacao = "Higiene Pessoal";
                    codigoValido = true;
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    classificacao = "Limpeza e Utensílios domésticos";
                    codigoValido = true;
                    break;
                default:
                    classificacao = "Código de produto inválido! Tente novamente.";
            }

            // Impressão da classificação
            System.out.println("Classificação: " + classificacao);
        }

        input.close();
        encerrarPrograma();
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}

package github.andreriffen.basic.exercicios;

import java.util.Scanner;

@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class CalculoJurosDesconto {

    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.println("Escolha uma opção de pagamento: ");
        int opcao = menuOpcao();

        double valorFinal = 0;
        switch (opcao) {
            case 1:
                valorFinal = calcularDesconto(valorCompra);
                break;
            case 2:
                valorFinal = calcularParcela(valorCompra);
                break;
            case 3:
                valorFinal = calcularJuros(valorCompra);
                break;
            default:
                System.out.println("Opção inválida.");
        }

        System.out.println("O valor total a ser pago é: " + valorFinal);

        scanner.close();
        encerrarPrograma();
    }

    public static int menuOpcao() {
        System.out.println("1. À vista com 10% de desconto");
        System.out.println("2. Em duas vezes (preço da etiqueta)");
        System.out.println("3. De 3 até 10 vezes com 3% de juros ao mês (somente para compras acima de R$100,00)");

        return new Scanner(System.in).nextInt();
    }

    public static double calcularDesconto(double valorCompra) {
        return valorCompra * 0.9; // 10% de desconto
    }

    public static double calcularParcela(double valorCompra) {
        return valorCompra / 2; // Dividido em duas parcelas
    }

    public static double calcularJuros(double valorCompra) {
        if (valorCompra <= 100) {
            System.out.println("Desculpe, esta opção é válida apenas para compras acima de R$100,00.");
            return valorCompra;
        } else {
            return valorCompra * 1.03; // 3% de juros
        }
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}

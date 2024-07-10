package github.andreriffen.basic.exercicios;

import java.util.Scanner;

import static github.andreriffen.basic.utils.ScreenUtils.limparTela;

@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class CalcularArea {

    public static void executar() {
        limparTela();

        Scanner input = new Scanner(System.in);

        System.out.println("\n__________\nOpção #1 - CALCULAR ÁREA DE UMA CIRCUNFERÊNCIA\n__________\n");

        System.out.print("Digite o raio: ");
        double raio = input.nextDouble();

        // Cálculo do diâmetro, circunferência e área
        double diametro = 2 * raio;
        double circunferencia = 2 * Math.PI * raio;
        double area = calcularArea(raio);

        // Impressão dos resultados
        System.out.printf("FÓRMULA: Área = π * raio^2%n");
        System.out.printf("Diâmetro: %.2f cm%n", diametro);
        System.out.printf("Circunferência: %.2f cm%n", circunferencia);
        System.out.printf("Área: %.2f cm²%n", area);

        input.close();
        encerrarPrograma();
    }

    public static double calcularArea(double raio) {
        return Math.PI * Math.pow(raio, 2);
    }

    private static void encerrarPrograma() {
        System.out.println("Programa encerrado.");
        System.exit(0);
    }
}

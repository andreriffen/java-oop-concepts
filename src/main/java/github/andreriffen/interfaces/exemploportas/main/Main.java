package github.andreriffen.interfaces.exemploportas.main;

import github.andreriffen.interfaces.exemploportas.domain.*;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public class Main {
    public static void main(String[] args) {

        // Criando instâncias de janelas
        Quarto quarto = getQuarto();

        // Interagindo com janelas
        System.out.println("Interagindo com as janelas:");
        quarto.abrirTodasAsJanelas();
        quarto.fecharTodasAsJanelas();
        quarto.travarTodasAsJanelas();
        quarto.destravarTodasAsJanelas();

        // Interagindo com portas
        System.out.println("\nInteragindo com as portas:");
        quarto.abrirTodasAsPortas();
        quarto.fecharTodasAsPortas();
        quarto.travarTodasAsPortas();
        quarto.destravarTodasAsPortas();

        System.out.println("\nFim.\nTeste JUnit disponível em: src/test/java/QuartoTest");
    }

    private static Quarto getQuarto() {
        JanelaBasculante janelaBasculante1 = new JanelaBasculante();
        JanelaCorrer janelaCorrer1 = new JanelaCorrer();

        // Criando instâncias de portas
        PortaComum portaComum1 = new PortaComum();
        PortaGiratoria portaGiratoria1 = new PortaGiratoria();

        // Criando um quarto
        Quarto quarto = new Quarto();

        // Adicionando janelas e portas ao quarto
        quarto.adicionarJanela(janelaBasculante1);
        quarto.adicionarJanela(janelaCorrer1);
        quarto.adicionarPorta(portaComum1);
        quarto.adicionarPorta(portaGiratoria1);
        return quarto;
    }
}

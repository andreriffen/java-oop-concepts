package github.andreriffen.interfaces.exemploportas.domain;

/**
 * As interfaces declaram métodos que devem ser implementados pelas classes que as implementarem.
 * Elas não contêm a lógica dos métodos, apenas as assinaturas.
 * Escrever um pouco de JavaDoc não é difícil e facilita muito pra quem vai ler depois
 * @ℹ Vantagem JavaDoc: Ajuda a lembrar a lógica e a funcionalidade após um tempo.
 */
@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public interface ITravamento {
    /**
     * Trava `ITravamento`
     */
    void travar();

    /**
     * Destrava `ITravamento`
     */
    void destravar();
}

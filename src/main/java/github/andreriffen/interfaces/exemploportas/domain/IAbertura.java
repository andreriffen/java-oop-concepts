package github.andreriffen.interfaces.exemploportas.domain;

/**
 * As interfaces declaram métodos que devem ser implementados pelas classes que as implementarem.
 * Elas não contêm a lógica dos métodos, apenas as assinaturas.
 * Escrever um pouco de JavaDoc não é difícil e facilita muito pra quem vai ler depois
 * @ℹ Vantagem JavaDoc: Facilita a compreensão do código para novos desenvolvedores.
 */
@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public interface IAbertura {
    /**
     * Abre `IAbertura`
     */
    void abrir();

    /**
     * Fecha `IAbertura`
     */
    void fechar();
}

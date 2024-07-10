package github.andreriffen.interfaces.exemploportas.domain;

/**
 * Os enumeradores fazem parte da declaração.
 *
 * @ℹ Vantagem JavaDoc: Facilita a integração com ferramentas de documentação automatizada.
 */
@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public enum EAbertura {
    ABERTA("aberta"),
    FECHADA("fechada");

    private final String estadoAbertura;

    EAbertura(String estadoAbertura) {
        this.estadoAbertura = estadoAbertura;
    }

    public String getEstado(){
        return estadoAbertura;
    }
}

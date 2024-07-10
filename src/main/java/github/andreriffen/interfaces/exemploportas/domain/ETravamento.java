package github.andreriffen.interfaces.exemploportas.domain;

/**
 * Os enumeradores fazem parte da declaração.
 *
 * @ℹ Vantagem JavaDoc: Facilita a integração com ferramentas de documentação automatizada.
 */
@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public enum ETravamento {
    TRAVADA("travada"),
    DESTRAVADA("destravada");

    private final String estadoTrava;

    ETravamento(String estadoTrava) {
        this.estadoTrava = estadoTrava;
    }

    public String getEstado(){
        return estadoTrava;
    }
}

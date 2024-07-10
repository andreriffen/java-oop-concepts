package github.andreriffen.interfaces.exemploportas.domain;

/**
 * DECLARAÇÃO: refere-se à definição da estrutura de uma interface ou classe, sem fornecer detalhes sobre como os métodos são implementados.
 * É como se você estivesse dizendo o que uma classe ou interface deve fazer, mas não como ela deve fazer.
 *
 * @ℹ Vantagem JavaDoc: Serve como guia para a utilização correta das classes e métodos.
 */
@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
public abstract class Janela implements IAbertura, ITravamento {

    private EAbertura estadoAbertura;
    private ETravamento estadoTravamento;


    //CONSTRUCTOR (EMPTY)
    public Janela() {
    }

//CONSTRUCTOR (WITH PARAMS)
//    public Janela(EAbertura estadoAbertura, ETravamento estadoTravamento) {
//        this.estadoAbertura = estadoAbertura.FECHADA;
//        this.estadoTravamento = estadoTravamento.DESTRAVADA;
//    }

    //GETTERS & SETTERS

    //ABERTURA
    public EAbertura getEstadoAbertura() {
        return estadoAbertura;
    }

    public void setEstadoAbertura(EAbertura estadoAbertura) {
        this.estadoAbertura = estadoAbertura;
    }

    //TRAVAMENTO
    public ETravamento getEstadoTravamento() {
        return estadoTravamento;
    }

    public void setEstadoTravamento(ETravamento estadoTravamento) {
        this.estadoTravamento = estadoTravamento;
    }

    //DECLARATION OF ABSTRACT METHODS (CONTRACTS)
    public abstract void abrir();

    public abstract void fechar();

    public abstract void travar();

    public abstract void destravar();
}

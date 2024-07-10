package github.andreriffen.interfaces.exemploportas.domain;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
/*
  IMPLEMENTAÇÃO: refere-se à definição do comportamento dos métodos declarados em interfaces ou classes abstratas.
  Nas implementações se fornece o código que executa as ações descritas nas declarações.

  @ℹ Vantagem JavaDoc: Promove boas práticas de programação e organização.
 */

public class PortaGiratoria extends Porta {

    public PortaGiratoria() {
        super();
    }

//    public PortaGiratoria(EAbertura estadoAbertura, ETravamento estadoTravamento) {
//        super(estadoAbertura, estadoTravamento);
//    }

    @Override
    public void abrir() {
        if (getEstadoTravamento() != ETravamento.TRAVADA) {
            setEstadoAbertura(EAbertura.ABERTA);
            System.out.println("Porta giratória aberta.");
            //TEMPLATE: System.out.println(STR."Porta giratória aberta.\{getEstadoAbertura()}");
        } else {
            System.out.println("Porta giratória está travada e não pode ser aberta.");
        }
    }

    @Override
    public void fechar() {
        setEstadoAbertura(EAbertura.FECHADA);
        System.out.println("Porta giratória fechada.");
    }

    @Override
    public void travar() {
        if (getEstadoAbertura() == EAbertura.FECHADA) {
            setEstadoTravamento(ETravamento.TRAVADA);
            System.out.println("Porta giratória travada.");
        } else {
            System.out.println("Porta giratória está aberta e não pode ser travada.");
        }
    }

    @Override
    public void destravar() {
        setEstadoTravamento(ETravamento.DESTRAVADA);
        System.out.println("Porta giratória destravada.");
    }
}

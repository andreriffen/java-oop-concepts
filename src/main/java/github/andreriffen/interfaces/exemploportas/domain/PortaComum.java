package github.andreriffen.interfaces.exemploportas.domain;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English
/*
  IMPLEMENTAÇÃO: refere-se à definição do comportamento dos métodos declarados em interfaces ou classes abstratas.
  Nas implementações se fornece o código que executa as ações descritas nas declarações.

  @ℹ Vantagem JavaDoc: Facilita a integração com ferramentas de documentação automatizada.
 */

public class PortaComum extends Porta {

    public PortaComum() {
        super();
    }

//    public PortaComum(EAbertura estadoAbertura, ETravamento estadoTravamento) {
//        super(estadoAbertura, estadoTravamento);
//    }

    @Override
    public void abrir() {
        if (getEstadoTravamento() != ETravamento.TRAVADA) {
            setEstadoAbertura(EAbertura.ABERTA);
            System.out.println("Porta comum aberta.");
            //TEMPLATE: System.out.println(STR."Porta comum aberta.\{getEstadoAbertura()}");
        } else {
            System.out.println("Porta comum está travada e não pode ser aberta.");
        }
    }

    @Override
    public void fechar() {
        setEstadoAbertura(EAbertura.FECHADA);
        System.out.println("Porta comum fechada.");
    }

    @Override
    public void travar() {
        if (getEstadoAbertura() == EAbertura.FECHADA) {
            setEstadoTravamento(ETravamento.TRAVADA);
            System.out.println("Porta comum travada.");
        } else {
            System.out.println("Porta comum está aberta e não pode ser travada.");
        }
    }

    @Override
    public void destravar() {
        setEstadoTravamento(ETravamento.DESTRAVADA);
        System.out.println("Porta comum destravada.");
    }
}

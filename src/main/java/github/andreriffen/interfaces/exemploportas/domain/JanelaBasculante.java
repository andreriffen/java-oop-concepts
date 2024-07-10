package github.andreriffen.interfaces.exemploportas.domain;

@SuppressWarnings("SpellCheckingInspection") //Avoid 'typo error' IDE English

/*
  IMPLEMENTAÇÃO: refere-se à definição do comportamento dos métodos declarados em interfaces ou classes abstratas.
  Nas implementações se fornece o código que executa as ações descritas nas declarações.

  @ℹ Vantagem JavaDoc: Serve como guia para a utilização correta das classes e métodos.
 */ public class JanelaBasculante extends Janela {

    public JanelaBasculante() {
    }

//    public JanelaBasculante(EAbertura estadoAbertura, ETravamento estadoTravamento) {
//        super(estadoAbertura, estadoTravamento);
//    }

    @Override
    public void abrir() {
        // Implementação específica
        if (getEstadoTravamento() != ETravamento.TRAVADA) {
            setEstadoAbertura(EAbertura.ABERTA);
            System.out.println("Janela basculante aberta.");
        } else {
            System.out.println("Janela basculante está travada e não pode ser aberta.");
        }
    }

    @Override
    public void fechar() {
        setEstadoAbertura(EAbertura.FECHADA);
        System.out.println("Janela basculante fechada.");
    }

    @Override
    public void travar() {
        if (getEstadoAbertura() == EAbertura.FECHADA) {
            setEstadoTravamento(ETravamento.TRAVADA);
            System.out.println("Janela basculante travada.");
        } else {
            System.out.println("Janela basculante está aberta e não pode ser travada.");
        }
    }

    @Override
    public void destravar() {
        setEstadoTravamento(ETravamento.DESTRAVADA);
        System.out.println("Janela basculante destravada.");
    }
}

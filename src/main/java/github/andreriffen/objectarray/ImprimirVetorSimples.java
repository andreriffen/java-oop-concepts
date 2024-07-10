package github.andreriffen.objectarray;

/**
 * Classe com dois métodos:
 *
 * @- ---
 * @imprimirVetor: Declaração - Recebe vetor como parametro e imprime seus elementos
 * @- ---
 * @main: Principal - Cria um vetor
 */
@SuppressWarnings("ALL")
public class ImprimirVetorSimples {

    /**
     * DECLARAÇÃO: Método que recebe um vetor de `strings` como parâmetro e imprime seus elementos
     *
     * @param vetor Pode ser int, String, Objetos, etc
     */
    public static void imprimirVetor(String[] vetor) {
        for (String s : vetor) {
            System.out.print(STR."\{s} ");
        }
        System.out.println();
    }

            /*

            // Se o vetor fosse com INT - ao invés de Strings

            public static void imprimirVetor(int[] vetor) {
                for (int i : vetor) {
                  System.out.print(i + " ");
                 }
               System.out.println();
            }
            */

    /**IMPLEMENTAÇÃO: Método principal que cria um vetor e os passa como parâmetros para o método imprimirVetor()*/
    public static void main(String[] args) {
        String[] meuVetor = {"Lorem", "Ipsum", "Dolor", "Siamet"};
        imprimirVetor(meuVetor);
    }
}
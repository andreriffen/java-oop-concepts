package github.andreriffen.objectarray;

/**
 * Método que imprime seus detalhes
 *
 * @Pessoas[] Vetor de objetos com detalhes
 */
@SuppressWarnings("ALL")
public class VetorPessoas {
    public static void imprimirPessoas(Pessoa[] pessoas) {
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }

    public static void main(String[] args) {
        // Criação de um vetor de objetos Pessoa
        Pessoa[] meuVetor = {
                new Pessoa("Andre", 30),
                new Pessoa("Bruno", 25),
                new Pessoa("Carol", 20)
        };

        // Passando o vetor como parâmetro para o método imprimirPessoas
        imprimirPessoas(meuVetor);

        //  SAÍDA
        //
        //Nome: Andre, Idade: 30
        //Nome: Bruno, Idade: 25
        //Nome: Carol, Idade: 20
    }
}

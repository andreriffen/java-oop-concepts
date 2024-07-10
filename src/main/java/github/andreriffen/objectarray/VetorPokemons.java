package github.andreriffen.objectarray;

@SuppressWarnings("ALL")
public class VetorPokemons {
    // Método que gera um vetor de objetos Pokemon
    public static Pokemon[] criarPokemons(int quantidade) {
        Pokemon[] pokemons = new Pokemon[quantidade];

        pokemons[0] = new Pokemon("Pikachu", "Elétrico");
        pokemons[1] = new Pokemon("Charmander", "Fogo");
        pokemons[2] = new Pokemon("Squirtle", "Água");
        pokemons[3] = new Pokemon("Bulbasaur", "Planta/Veneno");
        pokemons[4] = new Pokemon("Eevee", "Normal");

        return pokemons;
    }

    // Método para imprimir o vetor de Pokémons
    public static void imprimirPokemons(Pokemon[] pokemons) {
        for (Pokemon pokemon : pokemons) {
            System.out.println(pokemon);
        }
    }

    // Método principal
    public static void main(String[] args) {
        // Chamando o método para gerar um vetor de 5 Pokémons
        Pokemon[] meusPokemons = criarPokemons(5);

        // Imprimindo o vetor de Pokémons gerado
        imprimirPokemons(meusPokemons);

        // SAÍDA
        //
        //Nome: Pikachu,    Tipo: Elétrico
        //Nome: Charmander, Tipo: Fogo
        //Nome: Squirtle,   Tipo: Água
        //Nome: Bulbasaur,  Tipo: Planta/Veneno
        //Nome: Eevee,      Tipo: Normal
    }
}

package github.andreriffen.objectarray;

@SuppressWarnings("ALL")
public class Pokemon {
    //ATRIBUTOS
    private String nome;
    private String tipo;

    //CONSTRUCTOR
    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    //GETTERS & SETTERS
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    //FORMATING OUTPUT
    @Override
    public String toString() {
        return "Nome: " + nome + ", Tipo: " + tipo;
    }
}

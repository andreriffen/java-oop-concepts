package github.andreriffen.objectarray;

@SuppressWarnings("ALL")
public class Pessoa {
    //ATRIBUTOS
    private String nome;
    private int idade;

    //CONSTRUCTOR
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    //GETTERS & SETTERS
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    //FORMATING OUTPUT
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade;
    }
}

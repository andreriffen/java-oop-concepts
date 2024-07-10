package github.andreriffen.interfaces.exemploenum.domain;

import java.math.BigDecimal;

@SuppressWarnings("SpellCheckingInspection") //NO GRINGOS HERE, AQUI É BRASIL 🇵🇹🇧🇷
public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private Categoria categoria;

    private Estoque estoque;

    private void createEstoque() {
        estoque = new Estoque();
    }

    public Produto() {

        createEstoque();        //cria um objeto estoque pela associação por composição. Ao criar um produto também será criado um estoque, assim como, quando um produto for destruido o seu estoque também será.

    }

    public Produto(Categoria categoria) {
        this();
        this.categoria = categoria;
    }

    public Produto(int id, String nome, String descricao, BigDecimal preco) {
        this();
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto(int id, String nome, String descricao, BigDecimal preco, Categoria categoria) {
        this(id, nome, descricao, preco);
        this.categoria = categoria;
    }


    public Estoque getEstoque() {
        return estoque;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", preco=" + preco + ", Categoria=" + categoria.getDescricao() + '}';
    }

    /*
    Na composição devemos evitar o método set
    */
//    public void setEstoque(Estoque e) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }


}

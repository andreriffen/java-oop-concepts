package github.andreriffen.interfaces.exemplodatas.domain;

import java.time.LocalDate;
import java.util.Date;

@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class Produto {
    //ATRIBUTOS
    private String nome;
    private Date dataCadastro;
    private LocalDate dataVencimento;

    //CONSTRUTORES
    public Produto() {
    }

    public Produto(String nome, Date dataCadastro) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
    }

    public Produto(String nome, Date dataCadastro, LocalDate dataVencimento) {
        this.nome = nome;
        this.dataCadastro = dataCadastro;
        this.dataVencimento = dataVencimento;
    }
    
    
    //GETTERS & SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
    
    // NESSE EXEMPLO NÃO VAMOS FORMATAR SAÍDA COM `@OVERRIDE`
}

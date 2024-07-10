package github.andreriffen.interfaces.exemploenum.app;

import github.andreriffen.interfaces.exemploenum.domain.Categoria;
import github.andreriffen.interfaces.exemploenum.domain.ESituacao;
import github.andreriffen.interfaces.exemploenum.domain.Produto;

import java.math.BigDecimal;

@SuppressWarnings("SpellCheckingInspection") //NO GRINGOS HERE, AQUI É BRASIL 🇵🇹🇧🇷
public class MainApp {
    public static void main(String[] args) {
        Categoria c1 = new Categoria();
        c1.setId(1);
        c1.setDescricao("Vestuário");
        System.out.println(STR."Categoria criada: \{c1}");

        Produto p1 = new Produto();
        p1.setId(1);
        p1.setNome("Bermuda");
        p1.setDescricao("Bermuda de banho");
        p1.setPreco(new BigDecimal("120.0"));
        p1.setCategoria(c1);

        p1.getEstoque().setSituacao(ESituacao.ATIVO);
        try {
            p1.getEstoque().repor(50);
        } catch (Exception ex) {
            System.out.println(STR."Falha na operação ao repor estoque de p1: \n\{ex.getMessage()}");
        }
        p1.getEstoque().setQtdMaxima(100);
        p1.getEstoque().setQtdMinima(10);
        p1.getEstoque().retirar(20);
        printProduto(p1);

        Produto p2 = new Produto(2, "Camisa", "Camisa do Grêmio", new BigDecimal("400.0"), c1);
        p2.getEstoque().setSituacao(ESituacao.ATIVO);
        p2.getEstoque().setQtdMaxima(100);
        printProduto(p2);

        try {
            p2.getEstoque().repor(30);
        } catch (Exception ex) {
            System.out.println(STR."Falha na operação ao repor estoque de p2: \n\{ex.getMessage()}");
        }
        System.out.println(STR."Estoque de p2 após reposição: \{p2.getEstoque().getQuantidade()}");
        p2.getEstoque().retirar(10);
        System.out.println(STR."Estoque de p2 após retirada: \{p2.getEstoque().getQuantidade()}");
    }

    private static void printProduto(Produto produto) {
        System.out.println("Detalhes do Produto:");
        System.out.println(STR."Produto ID......: \{produto.getId()}");
        System.out.println(STR."Nome............: \{produto.getNome()}");
        System.out.println(STR."Descrição.......: \{produto.getDescricao()}");
        System.out.println(STR."Preço...........: R$ \{produto.getPreco()}");
        System.out.println(STR."Categoria.......: \{produto.getCategoria().getDescricao()}");
        System.out.println("Estoque:");
        System.out.println(STR."  Situação......: \{produto.getEstoque().getSituacao().getDescricao()}");
        System.out.println(STR."  Quantidade....: \{produto.getEstoque().getQuantidade()}");
        System.out.println(STR."  Máxima........: \{produto.getEstoque().getQtdMaxima()}");
        System.out.println(STR."  Mínima........: \{produto.getEstoque().getQtdMinima()}");
        System.out.println();

        /*

            Saída esperada:

            Categoria criada: Categoria{id=1, descricao=Vestuário}
            Falha na operação ao repor estoque de p1:
            A quantidade de reposição é maior que a quantidade máxima permitida.
            Detalhes do Produto:
            Produto ID......: 1
            Nome............: Bermuda
            Descrição.......: Bermuda de banho
            Preço...........: R$ 120.0
            Categoria.......: Vestuário
            Estoque:
              Situação......: Ativo
              Quantidade....: 0
              Máxima........: 100
              Mínima........: 10

            Detalhes do Produto:
            Produto ID......: 2
            Nome............: Camisa
            Descrição.......: Camisa do Grêmio
            Preço...........: R$ 400.0
            Categoria.......: Vestuário
            Estoque:
              Situação......: Ativo
              Quantidade....: 0
              Máxima........: 100
              Mínima........: 0

            Falha na operação ao repor estoque de p2:
            A quantidade de reposição é maior que a quantidade máxima permitida.
            Estoque de p2 após reposição: 30
            Estoque de p2 após retirada: 20

         */
    }
}

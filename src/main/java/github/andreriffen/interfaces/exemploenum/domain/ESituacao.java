package github.andreriffen.interfaces.exemploenum.domain;

@SuppressWarnings("SpellCheckingInspection") //NO GRINGOS HERE, AQUI É BRASIL 🇵🇹🇧🇷
public enum ESituacao {
    ATIVO(1, "Ativo"), INATIVO(2, "Inativo"), BLOQUEADO(3, "Bloqueado");

    private int id;
    private String descricao;

    private ESituacao(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }


}

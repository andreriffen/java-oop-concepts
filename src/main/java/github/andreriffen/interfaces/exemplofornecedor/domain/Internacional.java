package github.andreriffen.interfaces.exemplofornecedor.domain;

@SuppressWarnings("ALL")
public class Internacional extends Fornecedor {
    private String nif;
    private String pais;

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Internacional() {
    }

    public Internacional(String nif, String pais) {
        this.nif = nif;
        this.pais = pais;
    }

    public Internacional(String nif, String pais, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.nif = nif;
        this.pais = pais;
    }

    @Override
    public String toString() {
//        String nomeEContato = nome + " " + fone;
        //return "Internacional{" + "nif=" + nif + ", pais=" + pais + ", nome=" + nome + ", fone=" + fone +'}';
        return super.toString() + " Internacional{" + "nif=" + nif + ", pais=" + pais + '}';
    }

    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        sb.append("NIF........: ").append(nif).append("\n");
        sb.append("Pais.......: ").append(pais).append("\n");
        return sb.toString();
    }

    @Override
    public String getDados(String msg) {
        StringBuilder sb = new StringBuilder();
        sb.append(getDados()).append("\n").append(msg);
        return sb.toString();
    }


//    public String getDados(boolean comProdutos) {
//        StringBuilder sb = new StringBuilder();
//        sb.append(this.getDados());
//        if (comProdutos) {
//            sb.append(getDetalhesProdutos()).append("\n");
//        }
//        return sb.toString();
//    }
}


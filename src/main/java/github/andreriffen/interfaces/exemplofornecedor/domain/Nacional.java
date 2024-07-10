package github.andreriffen.interfaces.exemplofornecedor.domain;

@SuppressWarnings("ALL")
public class Nacional extends Fornecedor {
    private String cnpj;

    public Nacional() {
    }

    public Nacional(String cnpj) {
        this.cnpj = cnpj;
    }

    public Nacional(String cnpj, int id, String nome, String email, String fone) {
        super(id, nome, email, fone);
        this.cnpj = cnpj;
    }


    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        //return "Nacional{" + "cnpj=" + cnpj + ", nome=" + nome + ", fone=" + fone + '}';
        return super.toString() + " Nacional{" + "cnpj=" + cnpj + '}';
    }

    @Override
    public String getDados() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.getDados());
        sb.append("CNPJ.......: ").append(cnpj).append("\n");
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


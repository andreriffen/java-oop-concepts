package github.andreriffen.interfaces.exemplodatas.main;

import github.andreriffen.interfaces.exemplodatas.domain.Produto;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@SuppressWarnings("SpellCheckingInspection") // Avoid 'typo error' IDE English
public class MainAppImplement {

    public static void main(String[] args) throws ParseException {
        // Criando um obj dtf e passando formato parametro
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            //    Converte Objetos
            //    System.out.println("Data convertida: "+sdf.parse("02/08/1970"));

        // instancia de Produto 'Computador'
        Produto p1 = new Produto();
        p1.setNome("Computador");
        p1.setDataCadastro(new Date());
            LocalDate ld = LocalDate.parse("09/04/2024", dtf);
        p1.setDataVencimento(ld);

        // instancia de Produto 'Celular'
        Produto p2 = new Produto("Celular", new Date("04/09/2024"),
                LocalDate.parse("30/01/2024", dtf)); //ISO 8601 calendar

                /*
                    Date data = Calendar.getInstance().getTime();

                    DateFormat f = DateFormat.getDateInstance();
                    Date data2 = null;
                    try {
                    data2 = f.parse("01/04/2024");
                    } catch (ParseException ex) {
                    System.out.println("Data invalida");
                    }
                */

        Produto p3 = new Produto("Tablet", new Date(), LocalDate.parse("05/01/2022", dtf));

        print(p1);
        print(p2);
        print(p3);
    }

    public static void print(Produto produto) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(STR."Nome: \{produto.getNome()}");
        System.out.println(STR."Data de cadastro: \{sdf.format(produto.getDataCadastro())}");
        System.out.println(STR."Data de vencimento: \{produto.getDataVencimento().format(dtf)}");
    }
}

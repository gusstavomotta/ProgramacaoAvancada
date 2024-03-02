import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainBiblioteca {

    public static void main(String[] args) throws ParseException {

        Biblioteca biblio = new Biblioteca();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Livro livro = new Livro(1, "teste", "gordao", EnumLivro.DIDATICO, df.parse("29/08/2023"));

        biblio.addLivro(livro);
        System.out.println(biblio.retornaTotalLivros());
        biblio.removerLivro(1);
        System.out.println(biblio.retornaTotalLivros());
        biblio.removerLivro(2);


    }
}

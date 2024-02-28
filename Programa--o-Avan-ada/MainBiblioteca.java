import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();
        DateFormat df = new SimpleDateFormat("dd/mm/yyyy");

        Livro livro = new Livro(1, "teste", EnumLivro.DIDATICO, "gordao", df.parse("29/08/2023"));

        biblio.addLivro(livro);
        biblio.retornaTotalLivros();
        biblio.removerLivro(1);
        biblio.retornaTotalLivros();

    }
}

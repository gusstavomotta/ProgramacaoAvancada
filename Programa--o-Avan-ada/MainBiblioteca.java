import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Livro livro = new Livro(1, "teste", "gordao", EnumLivro.DIDATICO, df.parse("29/08/2023"));

        biblio.addLivro(livro);
        biblio.retornaTotalLivros();
        biblio.removerLivro(1);
        biblio.retornaTotalLivros();

    }
}

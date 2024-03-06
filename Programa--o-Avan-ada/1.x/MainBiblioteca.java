import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MainBiblioteca {

    public static void main(String[] args) throws ParseException {

        Biblioteca biblio = new Biblioteca();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Autor autor1 = new Autor("gustavo", 20);
        Autor autor2 = new Autor("gordao", 20);
        // Autor autor3 = new Autor("caio", 20);

        Livro livro = new Livro(1, "teste", autor1, EnumLivro.DIDATICO, df.parse("29/08/2023"));
        Livro livro2 = new Livro(2, "livro teste", autor2, EnumLivro.DIDATICO, df.parse("29/11/2024"));
        Livro livro3 = new Livro(3, "desgraça", autor2, EnumLivro.DIDATICO, df.parse("31/01/2008"));

        biblio.addLivro(livro);
        biblio.addLivro(livro2);
        biblio.addLivro(livro3);
        biblio.addLivro(livro3);

        biblio.ordenarListaAutores();

        List<Autor> lst_autores = new ArrayList<>();
        List<Livro> lst_livros = new ArrayList<>();
        lst_autores = biblio.retornaListaAutores();
        lst_livros = biblio.retornaListaLivros();

        for (Livro l : lst_livros) {

            System.out.println(l);
        }
        for (Autor a : lst_autores) {
            System.out.println(a);
        }
        // Collections.sort(lst_autores);
    }
}
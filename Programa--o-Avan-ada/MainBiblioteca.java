
public class MainBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblio = new Biblioteca();
        Livro livro = new Livro(1, "teste", EnumLivro.DIDATICO, "gordao", "2023-08-29");

        biblio.addLivro(livro);
        biblio.retornaTotalLivros();
        biblio.removerLivro(1);
        biblio.retornaTotalLivros();

    }
}

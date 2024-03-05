import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaLivros = new ArrayList<>();
    private List<Autor> listaAutores = new ArrayList<>();

    public void addLivro(Livro livro) {

        livro.getAutor().incrementaCount();

        if (!listaAutores.contains(livro.getAutor()))
            listaAutores.add(livro.getAutor());

        listaLivros.add(livro);
        System.out.println("Livro adicionado com sucesso!");

    }

    public void removerLivro(int id_param) {

        for (Livro l : listaLivros) {
            if (l.getId() == id_param) {
                listaLivros.remove(l);
                System.out.println("Livro removido com sucesso!");
                return;
            }
        }
        System.out.println("Livro não existe!");
    }

    public int retornaTotalLivros() {
        return listaLivros.size();
    }

    public int retornaTotalAutores() {
        return listaAutores.size();
    }

    public List<Autor> retornaListaAutores() {
        return this.listaAutores;
    }

    public List<Livro> retornaListaLivros() {
        return this.listaLivros;
    }

    public void ordenarListaAutores() {
        Collections.sort(this.listaAutores, new Comparator<Autor>() {
            @Override
            public int compare(Autor a1, Autor a2) {
                return Integer.compare(a2.getNum_publicações(), a1.getNum_publicações());
            }
        });
    }

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaLivros = new ArrayList<>();
    private List<Autor> listaAutores = new ArrayList<>();

    public void addLivro(Livro livro) {
        livro.getAutor().incrementaCount();
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

    public void printaAutor() {
        if (listaAutores.size() == 0) {
            System.out.println("Lista de autores vazia!");
            return;
        }
        for (Autor a : listaAutores) {
            System.out.println(a.toString());
        }
        System.out.println("Todos os autores printados!");
    }

    public void printaLivro() {
        if (listaLivros.size() == 0) {
            System.out.println("Lista de livros vazia!");
            return;
        }
        for (Livro l : listaLivros) {
            System.out.println(l.toString());
        }
        System.out.println("Todos os livros printados!");
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

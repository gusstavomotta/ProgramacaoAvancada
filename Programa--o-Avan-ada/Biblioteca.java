import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaLivros = new ArrayList<>();

    public void addLivro(Livro livro) {
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

}

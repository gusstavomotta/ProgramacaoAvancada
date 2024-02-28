import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    private List<Livro> listaLivros = new ArrayList<>();

    public void addLivro(Livro livro) {
        listaLivros.add(livro);
    }

    public void removerLivro(int id_param) {

        for (Livro l : listaLivros) {
            if (l.getId() == id_param) {
                listaLivros.remove(l);
                return;
            }
        }
    }

    public int retornaTotalLivros() {
        return listaLivros.size();
    }

}

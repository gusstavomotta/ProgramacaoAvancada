import java.util.Date;

public class Livro {

    private int id;
    private String titulo;
    private Autor autor;
    private EnumLivro categoria;
    private Date data;

    public Livro(int id, String titulo, Autor autor, EnumLivro categoria, Date data) {

        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public EnumLivro getCategoria() {
        return categoria;
    }

    public void setCategoria(EnumLivro categoria) {
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        String ret = "Id do livro: " + this.id + "\n";
        ret += "Titulo do livro: " + this.titulo + "\n";
        ret += "Nome do autor: " + this.getAutor().getNome() + "\n";
        ret += "Gênero: " + categoria + "\n";
        ret += "Data de lançamento: " + this.data + "\n";
        return ret;
    }

}

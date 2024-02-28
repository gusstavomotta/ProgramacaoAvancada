import java.sql.Date;

public class Livro {

    private int id;
    private String titulo;
    private String autor;
    private EnumLivro categoria;
    private Date data;

    public Livro(int id, String titulo, String autor, EnumLivro categoria, Date data) {

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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

}

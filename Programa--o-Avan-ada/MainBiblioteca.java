import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class MainBiblioteca {

    public static void main(String[] args) throws ParseException {

        Biblioteca biblio = new Biblioteca();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Autor autor1 = new Autor("gustavo" , 20);
        Livro livro = new Livro(1, "teste", autor1, EnumLivro.DIDATICO, df.parse("29/08/2023"));

        biblio.addLivro(livro);
        biblio.printaAutor();
        biblio.printaLivro();

        //posso criar um array de livros para cada autor e quando a biblio add um livro o livro deve ser add ao array de livros do autor
        //criar a classe autor com nome do autor
        //posso criar uma function para percorrer o array de livros da biblio e contar o numero de livros q cada autor tem
        // posso fazer um array de autores e verificar se o nome dele está dentro de algum livro dentro do array de bibliotecas e dai fazer o count
        //acho é melhor criar o autor, passar ele no livro, add o livro na biblio, depois percorre a biblio comparando o autor e faz o count
        //quando eu add um livro eu posso retornar o autor e colocar ele em um array de autores, depois percorro, e comparo, e conto
    }
}

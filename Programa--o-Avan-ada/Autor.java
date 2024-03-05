//se implementar o comparable tem que criar o metodo compareTO, a logica esta no fim do codigo
//

public class Autor // implements Comparable
{

    private String nome;
    private int idade;
    private Integer num_publicações;

    public Autor(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getNum_publicações() {
        return num_publicações;
    }

    public void incrementaCount() {
        this.num_publicações += 1;
    }

    @Override
    public String toString() {
        String ret = "Nome do autor: " + this.nome + "\n";
        ret += "Idade: " + this.idade + "\n";
        ret += "Número de publicações: " + this.num_publicações + "\n";
        return ret;
    }

    // @Override
    // public int compareTo(Object o) {
    // Autor y = (Autor) o;
    // if (y.getNum_publicações() > this.getNum_publicações()) {
    // return -1;
    // } else if (y.getNum_publicações() < this.getNum_publicações()) {
    // return 1;
    // } else {
    // return 0;
    // }
    // return y.getNum_publicações().compareTo(this.num_publicações);
    // }
}
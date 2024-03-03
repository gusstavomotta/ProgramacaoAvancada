public class Autor {

    private String nome;
    private int idade;
    private int num_publicações;

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
    public  int getNum_publicações() {
        return num_publicações;
    }

    public void incrementaCount(){
        this.num_publicações += 1;
    }
    @Override
    public String toString(){
        String ret = "Nome do autor: " + this.nome + "\n";
        ret += "Idade: " + this.idade + "\n";
        return ret;
    }
}
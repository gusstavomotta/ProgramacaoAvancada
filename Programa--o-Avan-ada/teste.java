
public class teste {

    public float valor;
    public int idade;
    public String nome;

    public teste(float valor, int idade, String nome) {
        this.valor = valor;
        this.idade = idade;
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {

        System.out.println("teste");
        String string = "teste1";
        System.out.println(retornaString(string));
        somaValores(0, 7);
    }

    public static String retornaString(String string) {

        return string;
    }

    public static float somaValores(float a, float b) {

        try {
            if (a == 0 || b == 0) {

                throw new Exception("Deu misterio");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return a + b;
    }

}


public class teste {

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

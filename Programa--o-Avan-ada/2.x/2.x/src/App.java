import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        List<Object> lista = new ArrayList<>();
        lista.add(5);
        lista.add(5.5);
        lista.add(4.4F);
        lista.add(14L);
        lista.add(false);

        Integer soma = 0;
        Double somaFloat = 0.0;
        Integer count = 0;
        Double somaGeral = 0.0;

        for (Object o : lista) {

            if (o instanceof Integer){
                soma += (Integer) o;
                somaGeral += (Integer) o;
            }
            else if (o instanceof Float) {
                somaFloat += (Float) o;
                somaGeral += (Float) o;

                count++;
            } else if (o instanceof Double) {
                somaFloat += (Double) o;
                somaGeral += (Double) o;
                count++;
            }else if (o instanceof Long){
                somaGeral += (Long) o;
            }   
        }

        System.out.println("Soma dos inteiros: " + soma);
        System.out.println("Soma float: " + somaFloat);
        System.out.println("Media float: " + somaFloat/count);
        //string.format dar uma olhada
        System.out.println("Soma geral: " + somaGeral);
            
        // double resultado = functionMatematica(5);
        // System.out.println(resultado);

    }

    public static double functionMatematica (double x) {

        double funcao = Math.pow(x,2) + 2 *(Math.sin((Math.PI + x)/Math.pow(x,3))) + 1;
        return funcao;
    }
}


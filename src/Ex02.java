import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Ex02 {
    public static void main(String[] args) {
        double[][] notas = { {10, 8.5, 5.5, 9.5},
                             {8.5, 7, 7.5, 6},
                             {8, 9, 10, 7.5},
                             {9, 9.5, 10, 8} };
//        a) Imprima o valor da nota do primeiro elemento do terceiro array de notas.
        System.out.println(notas[2][0]);
//        b) Imprima o valor da nota do segundo elemento do quarto array de notas.
        System.out.println(notas[3][1]);
//       c) Imprima o valor da soma das quatro primeiras notas de cada array.
        double sum = DoubleStream.of(notas[0]).sum();
        double sum2 = DoubleStream.of(notas[1]).sum();
        double sum3 = DoubleStream.of(notas[2]).sum();
        double sum4 = DoubleStream.of(notas[3]).sum();

        System.out.println(sum + sum2 + sum3 + sum4);
    }
}

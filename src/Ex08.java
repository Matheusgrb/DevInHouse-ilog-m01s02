import java.util.Arrays;
import java.util.List;

//        Localize na lista abaixo e imprima no console a primeira ocorrência de número maior que 50.
public class Ex08 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(0, 2, 88, 56, 33, 42, 67, 3, 9, 0, 2);
        for (Integer lista : numeros){
                if (lista > 30) {
                    System.out.println("A primeira ocorrência é: " + lista);
                    break;
                }
        }
    }
}

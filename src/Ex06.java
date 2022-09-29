import java.util.Arrays;
import java.util.List;

public class Ex06 {
    public static void main(String[] args) {

        List<Integer> lista = Arrays.asList(1,2,3,4);

        for(int i = 0; i < lista.size(); i++){
            System.out.println("Elementos da nova lista: " + lista.get(i) * 3);
        }
    }

}

//Percorra a lista e gere uma nova com o triplo do valor de cada elemento:
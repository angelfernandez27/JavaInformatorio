package complementariostres;
import java.util.ArrayList;
import java.util.List;
public class EjercicioDos {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer>potencia= new ArrayList<>();
        palabras.forEach((numero)->potencia.add(numero*numero));
        System.out.println(potencia);
    }
}

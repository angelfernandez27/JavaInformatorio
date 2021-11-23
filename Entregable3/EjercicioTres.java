package complementariostres;
import java.util.List;
public class EjercicioTres {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        int contador = (int) palabras.stream()
                .filter(palabra -> palabra.toLowerCase().startsWith("b"))
                .count();
        System.out.println(contador);
    }
}

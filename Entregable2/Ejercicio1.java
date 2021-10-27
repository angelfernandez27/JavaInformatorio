package Entregable2;
import java.util.ArrayList;
public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList();
        ciudades.add("Bariloche");
        ciudades.add("Córdoba");
        ciudades.add("Resistencia");
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#"+(i+1)+ciudades.get(i));
        }
    }
}

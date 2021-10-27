package Entregable2;
import java.util.ArrayList;
import java.util.List;
public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        int length = numeros.size();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("El elemento n°"+(i+1)+" de la lista es el número: "+numeros.get(i));
        }
        System.out.println("La longitud de la lista es de: "+length);
        System.out.println();
        System.out.println();
        numeros.add(0, 0);
        numeros.add(6, 6);
        length = numeros.size();
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("El elemento n°"+(i+1)+" de la lista es el número: "+numeros.get(i));
        }
        System.out.println();
        System.out.println("La longitud de la lista es de: "+length);
    }
}

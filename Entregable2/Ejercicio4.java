package Entregable2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre;
        List<String> estudiantes=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        for (int i=0; i<12; i++){
            System.out.println("Nombre del estudiante"+(i+1)+":");
            nombre=scanner.nextLine();
            estudiantes.add(nombre);
        }
        List curso1=estudiantes.subList(0,4);
        List curso2=estudiantes.subList(4,8);
        List curso3=estudiantes.subList(8,12);
        System.out.println("***********CURSO 1***************");
        for (int i = 0; i <curso1.size() ; i++) {
            System.out.println(curso1.get(i));
        }
        System.out.println("***********CURSO 2***************");
        for (int i = 0; i <curso1.size() ; i++) {
            System.out.println(curso2.get(i));
        }
        System.out.println("***********CURSO 3***************");
        for (int i = 0; i <curso1.size() ; i++) {
            System.out.println(curso3.get(i));
        }
    }
}

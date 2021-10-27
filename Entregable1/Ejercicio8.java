package Entregable1;
import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre= scanner.nextLine();
        System.out.print("Ingrese su edad: ");
        byte edad= scanner.nextByte();
        scanner.nextLine();
        System.out.print("Cual es su direccion?: ");
        String direccion=scanner.nextLine();
        System.out.print("Cual es su ciudad?: ");
        String ciudad=scanner.nextLine();
        System.out.print(ciudad+" - "+direccion+" - "+edad+ " - "+nombre);
    }
}

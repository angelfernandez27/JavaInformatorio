package Entregable1;
import java.util.Scanner;
public class Home {
    public static void main(String[] args) {
         String nombre;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre= scanner.nextLine();
        System.out.print("HOLA "+nombre+"!!!");
    }
}

package Entregable1;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        int n1;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n1=scanner.nextInt();
        int i=1;
        while (i<=n1){
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }
}

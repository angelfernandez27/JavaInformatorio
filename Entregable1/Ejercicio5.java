package Entregable1;
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n1=scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        n2=scanner.nextInt();
        int res=0;
        for (int i = 0; i < n2; i++) {
            res+=n1;
        }
        System.out.println(n1+" x "+n2+" = "+res);
    }
}

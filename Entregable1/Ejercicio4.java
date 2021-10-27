package Entregable1;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        double num, res;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese el número que deseae factorizar: ");
        num=scanner.nextInt();
        res=factorial(num);
        System.out.print("El factorial de "+num+" es: "+res);
    }
    private static double factorial(double num) {
        double fact=1;
        if (num==0){
            return 1;
        }else {
            return num*(factorial(num-1));
        }
    }
}

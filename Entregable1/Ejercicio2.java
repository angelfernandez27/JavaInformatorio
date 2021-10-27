package Entregable1;
import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Simulador de operaciones básicas");
        System.out.print("Ingrese un número entero: ");
        n1=scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        n2=scanner.nextInt();
        int suma,resta,multiplicacion,division,modulo;
        suma=n1+n2;
        resta=n1-n2;
        multiplicacion=n1*n2;
        division=n1/n2;
        modulo=n1%n2;
        System.out.print(n1+"+"+n2+"="+suma+"\n"+n1+"-"+n2+"="+resta+"\n"+n1+"*"+n2+"="+multiplicacion+"\n"+n1+"/"+n2+"="+division+"\n"+n1+"%"+n2+"="+modulo+"\n");
    }
}

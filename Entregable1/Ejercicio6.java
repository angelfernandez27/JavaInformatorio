package Entregable1;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String args[]){
        int n1;
        int pot;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        n1=scanner.nextInt();
        System.out.print("Ingrese otro número entero: ");
        pot=scanner.nextInt();
        int res = calculoPotencia(n1,pot);
        System.out.print(n1+" elevado a "+pot+" = "+res);
    }
    static int calculoPotencia(int n1, int pot){
        int resp = 1;
        if(n1 > 0 && pot==0){
            return resp;
        }
        else if(n1 == 0 && pot>=1){
            return 0;
        }
        else{
            for(int i = 1; i<= pot; i++){
                resp *= n1;
            }
            return resp;
        }
    }
}

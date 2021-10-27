package Entregable2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//EJERCICIO INSTANCIADO EN LA CLASE MAIN
public class Ejercicio7 {
    Scanner scanner=new Scanner(System.in);
    List<String> palabras=new ArrayList<>();
    int n1;
    int n2;
    public void esMultiplo(){
        System.out.println("Debe ingresar 2 numeros enteros, primero el menor y luego el mayor");
        System.out.print("Ingrese el menor: ");
        n1=scanner.nextInt();
        System.out.println("el numero menor ingresado es: "+n1);
        System.out.print("Ingrese el mayor: ");
        n2=scanner.nextInt();
        System.out.println("El numero mayor ingresado es: "+n2);
        for (int i = n1; i <n2 ; i++) {
            if(i%2==0 && i%3==0){
                palabras.add("FizzBuzz");
            }else if(i%2==0){
                palabras.add("Fizz");
            }else if(i%3==0){
                palabras.add("Buzz");
            }else{
                palabras.add(String.valueOf(i));
            }
        }
        System.out.println(palabras);
    }
}

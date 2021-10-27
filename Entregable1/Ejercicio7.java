package Entregable1;
import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        String palabra;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ingrese una palabra");
        palabra=scanner.nextLine();
        for(char letra: palabra.toCharArray()) {
            if(letra >= 'a' && letra <= 'z')
                letra += 'A' - 'a';
            System.out.print(letra);
        }
    }
}

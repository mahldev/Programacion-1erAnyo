import java.util.Arrays;
import java.util.Scanner;

public class Ap_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;
        String[] palabras;

        System.out.print("Introduzca la frase: ");
        frase = sc.nextLine();

        frase.toLowerCase();
        frase.strip();
        palabras = frase.split(" ");

        Arrays.sort(palabras);

        for (String palabra : palabras) {

            System.out.print(palabra + " ");
        }
        System.out.println();
    }
}

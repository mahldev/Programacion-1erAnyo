import java.util.Scanner;

public class Ap_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int longitudSecuencia;
        String palabra;

        System.out.print("Introduzca la longitud de la secuencia: ");
        longitudSecuencia = sc.nextInt();
        System.out.print("Introduzca la palabra: ");
        palabra = sc.next();

        for (int contador = 0; contador < palabra.length(); i += longitudSecuencia) {

            int fin = Math.min(contador + longitudSecuencia, palabra.length());
            System.out.println(palabra.substring(contador, fin));
        }
    }
}

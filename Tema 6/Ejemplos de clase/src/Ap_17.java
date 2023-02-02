import java.util.Scanner;

public class Ap_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int longitudSecuencia;
        String[] secuencia;
        String palabra;

        System.out.print("Introduzca la longitud de la secuencia: ");
        longitudSecuencia = sc.nextInt();
        System.out.print("Introduzca la palabra: ");
        palabra = sc.next();

        secuencia = dividePalabra(palabra, longitudSecuencia);
        muestraSecuencia(secuencia);
    }

    private static void muestraSecuencia(String[] secuencia) {

        for (int indice = 0; indice < secuencia.length; indice++) {

            System.out.println(secuencia[indice]);
        }
    }

    private static String[] dividePalabra(String palabra, int longitud) {

        double numeroDeSecuencia = (double) palabra.length() / (double) longitud;
        double decimales = numeroDeSecuencia - ((int) numeroDeSecuencia);

        numeroDeSecuencia += decimales;

        String[] secuencias = new String[(int) numeroDeSecuencia];
        int inicio = 0;
        for (int indice = 0; indice < secuencias.length; indice++) {

            if (indice == secuencias.length - 1) {

                secuencias[indice] = palabra.substring(inicio);
            } else {

                secuencias[indice] = palabra.substring(inicio, inicio + longitud);
                inicio += longitud;
            }
        }
        return secuencias;
    }
}

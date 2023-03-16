package deberesTema5;

import java.util.Scanner;

public class Biblioteca {

    public static void rellenar(int[] tabla, int valor) {

        for (int indice = 0; indice < tabla.length; indice++) {

            tabla[indice] = valor;
        }
    }

    public static void rellenar(double[] tabla, double valor) {

        for (int indice = 0; indice < tabla.length; indice++) {

            tabla[indice] = valor;
        }
    }

    public static int longitudTabla(int[] tabla) {

        int longitud = 0;

        for (int indice = 0; indice < tabla.length; indice++) {

            longitud++;
        }
        return longitud;
    }

    public static void muestraTabla(int[] tabla) {

        for (int valor : tabla) {

            System.out.println(valor);
        }
    }

    public static void muestraTabla(double[] tabla) {

        for (double valor : tabla) {

            System.out.println(valor);
        }
    }

    public static void pideValores(int[] tabla) {

        Scanner sc = new Scanner(System.in);

        for (int indice = 0; indice < tabla.length; indice++) {

            System.out.print("Introduzca un numero: ");
            int valor = sc.nextInt();
            tabla[indice] = valor;
        }
        sc.close();
    }

    public static int sumaTabla(int[] tabla) {

        int suma = 0;

        for (int valor : tabla) {

            suma += valor;
        }
        return suma;
    }

    public static int mediaDeTabla(int[] tabla) {

        return sumaTabla(tabla) / longitudTabla(tabla);

    }

    public static int buscaValoresMayor(int[] tabla, int limite) {

        int longitud = 0;

        for (int valor : tabla) {

            if (valor > limite) {

                longitud++;
            }
        }
        return longitud;
    }

    public static int buscaValoresMenores(int[] tabla, int limite) {

        int longitud = 0;

        for (int valor : tabla) {

            if (valor < limite) {

                longitud++;
            }
        }
        return longitud;
    }
}
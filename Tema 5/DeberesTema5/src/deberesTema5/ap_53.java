package deberesTema5;

import java.util.Scanner;

import static deberesTema5.Biblioteca.pideValores;
import static deberesTema5.Biblioteca.buscaValoresMayor;
import static deberesTema5.Biblioteca.buscaValoresMenores;
import static deberesTema5.Biblioteca.mediaDeTabla;

public class ap_53 {

    static void asignaValores(int[] lista, int[] nuevaLista, int limite, int opcion) {

        // a la funcion asignaValores() le pasamos dos tablas, un limite y la opcion
        // (0-1)
        // 0 para asignar a la tabla los valores mayores que el limite
        // 1 para asignar a la tabla los valores menores que el limite

        int nuevoIndice = 0;

        for (int indice = 0; indice < lista.length; indice++) {

            if (opcion == 0) {

                if (lista[indice] > limite) {

                    nuevaLista[nuevoIndice++] = lista[indice];
                }
            } else {

                if (lista[indice] < limite) {

                    nuevaLista[nuevoIndice++] = lista[indice];
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int longitud, cantidadPositivos, cantidadNegativos;

        // le pedimos al usuario que introduzca la longitud.
        System.out.print("Introduzca la longitud: ");
        longitud = sc.nextInt();
        // creamos una nueva tabla con la longitud dada antes.
        int[] numeros = new int[longitud];

        // llamamos a la funcion pide y crea para que pida al usuario que introduzca
        // valores en la tabla
        pideValores(numeros);
        sc.close();

        cantidadPositivos = buscaValoresMayor(numeros, 0);

        System.out.println("-----------------------------------------");
        if (cantidadPositivos > 0) {

            // creamos una nueva tabla con la longitud de cuantos numeros positivos de la
            // tabla
            // anterior.
            int[] numerosPositivos = new int[cantidadPositivos];

            // llamamos a la funcion asginaValores() le pasamos las dos tablas, el limite
            // que sera 0 y la opcion 0 para los valores mayores que el limite
            asignaValores(numeros, numerosPositivos, 0, 0);

            // llamamos a la funcion muestraTabla() para pintar por pantalla las tablas.
            System.out.println("La media de los numeros positivos es: " + mediaDeTabla(numerosPositivos));
        }

        cantidadNegativos = buscaValoresMenores(numeros, 0);

        if (cantidadNegativos > 0) {

            // creamos otra nueva tabla con la longitud de los numeros negativos dentro de
            // la
            // tabla "numeros".
            int[] numerosNegativos = new int[buscaValoresMenores(numeros, 0)];

            // llamamos a la funcion asginaValores() le pasamos las dos tablas, el limite
            // que sera 0 y la opcion 1 para los valores menores que el limite.
            asignaValores(numeros, numerosNegativos, 0, 1);

            System.out.println("La media de los numeros negativos es: " + mediaDeTabla(numerosNegativos));
        }
        // asinamos numeros a null para que el recolector de basura se limpie los datos
        // de la primera tabla.
        numeros = null;
    }

}

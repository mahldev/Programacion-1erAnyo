package deberesTema5;

import static deberesTema5.Biblioteca.sumaTabla;

public class ar_51 {

    static void asignaValoresRandoms(int[] lista) {

        for (int indice = 0; indice < lista.length; indice++) {

            lista[indice] = (int) (Math.random() * 100 + 1);
        }

    }

    public static void main(String[] args) {

        int[] tabla = new int[10];

        asignaValoresRandoms(tabla);
        int suma = sumaTabla(tabla);

        System.out.println(suma);
    }
}

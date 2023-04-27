import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {

    private static void muestraLista(ArrayList<Integer> lista) {
        lista.forEach(n -> System.out.println(n));
    }

    private static boolean eliminaRango(ArrayList<Integer> lista) {

    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaPositivos = new ArrayList<>();
        ArrayList<Integer> listaNegativos = new ArrayList<>();
        int numero;

        do {
            System.out.print("Introduzca un numero numero real: ");
            numero = sc.nextInt();
            if (numero > 0)
                listaPositivos.add(numero);
            else
                listaNegativos.add(numero);
        } while (numero != 0);

        muestraLista(listaPositivos);
        muestraLista(listaNegativos);

        Integer[] as = listaNegativos.toArray(new Integer[0]);

    }
}

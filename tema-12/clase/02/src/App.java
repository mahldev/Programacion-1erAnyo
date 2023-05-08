import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class App {

    private static void muestraLista(ArrayList<Integer> lista) {
        lista.forEach(n -> System.out.print(n + ", "));
    }

    private static void mantenValoreEnElRango(ArrayList<Integer> lista, int min, int max) {
        Iterator<Integer> it = lista.iterator();
        Integer integer;

        while (it.hasNext()) {
            if ((integer = it.next()) < min || integer > max) {
                it.remove();
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> listaPositivos = new ArrayList<>();
        ArrayList<Integer> listaNegativos = new ArrayList<>();
        int numero;
        boolean error;

        do {
            try {
                do {
                    System.out.print("Introduzca un numero numero real: ");
                    numero = sc.nextInt();
                    if (numero > 0)
                        listaPositivos.add(numero);
                    else
                        listaNegativos.add(numero);
                    error = false;
                } while (numero != 0);
            } catch (InputMismatchException e) {
                error = true;
                sc.nextLine();
                System.out.println("Error en el tipo de dato");
            }
        } while (error);
        sc.close();


        System.out.println("\nLista positivos");
        muestraLista(listaPositivos);
        System.out.println("\nLista negativos");
        muestraLista(listaNegativos);

        mantenValoreEnElRango(listaPositivos, -10, 10);
        mantenValoreEnElRango(listaPositivos, -10, 10);
        System.out.println("\nLista Positiva con el rango");
        muestraLista(listaPositivos);
        System.out.println("\nListas Negativa con el rango");
        muestraLista(listaNegativos);

    }
}

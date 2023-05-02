public class App {

    public static <T> void muestra(T[] a) {
        for (T p : a) {
            System.out.print(p + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Cola<Integer> cola = new Cola<>();
        Pila<Integer> pila = new Pila<>();

        System.out.println("Cola");
        cola.agregar(1);
        cola.agregar(2);
        cola.agregar(3);
        muestra(cola.listar(new Integer[0]));

        cola.extraer();
        muestra(cola.listar(new Integer[0]));

        System.out.println("\n\nPila");
        pila.agregar(1);
        pila.agregar(2);
        pila.agregar(3);
        muestra(pila.listar(new Integer[0]));

        pila.extraer();
        muestra(pila.listar(new Integer[0]));
    }
}

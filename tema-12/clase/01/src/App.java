import java.util.ArrayList;
import java.util.Iterator;

public class App {

    private static int daNumeroRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    public static void main(String[] args) throws Exception {

        ArrayList<Integer> lista = new ArrayList<>();
        Iterator<Integer> it;
        int aux;


        lista.add(5);
        for (int i = 0; i < 100; i++) {
            aux = daNumeroRandom(1, 10);
            lista.add(aux);
        }

        System.out.println("Lista completas");
        lista.forEach(n -> System.out.print(n +  " "));

        it = lista.iterator();
        while (it.hasNext()) {
            if (it.next() == 5)
                it.remove();
        }

        System.out.println("\nLista sin 5");
        lista.forEach(n -> System.out.print(n +  " "));
    }
}

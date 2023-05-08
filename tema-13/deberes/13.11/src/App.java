import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static boolean esPrimo(Integer num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // private static void rellenarRandoms(List<Integer> numerosRandoms) {
    // Random random = new Random();
    // for (int i = 0; i < 100; i++) {
    // numerosRandoms.add(random.nextInt(1000));
    // }
    // }

    public static void main(String[] args) throws Exception {

        List<Integer> numerosRandoms;
        long cantidadDePrimos;
        int maximo, minimo, suma;
        double promedio;

        // rellenarRandoms(numerosRandoms);
        try (var in = new ObjectInputStream(new FileInputStream("numeros.dat"))) {
            numerosRandoms = (ArrayList<Integer>) in.readObject();
        } catch (Exception e) {
            numerosRandoms = new ArrayList<>();
            System.out.println(e.getMessage());
        }

        numerosRandoms.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        cantidadDePrimos = numerosRandoms.stream()
                .filter(n -> esPrimo(n))
                .count();
        maximo = numerosRandoms.stream()
                .max((o1, o2) -> o1 - o2)
                .get();
        minimo = numerosRandoms.stream()
                .min((o1, o2) -> o1 - o2)
                .get();

        suma = numerosRandoms.stream()
                .mapToInt(Integer::intValue)
                .sum();

        promedio = numerosRandoms.stream()
                .mapToInt(Integer::intValue)
                .average().getAsDouble();

        System.out.println("\nCantidad de primos: " + cantidadDePrimos);
        System.out.println("Valor maximo: " + maximo);
        System.out.println("Valor minimo: " + minimo);
        System.out.println("La suma es " + suma);
        System.out.println("El valor promedio " + promedio);

    }

}

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class App2 {

    public static List<Integer> createRandomList(int qty) {
        var random = new Random();
        List<Integer> numbers = new LinkedList<>();

        for (int i = 0; i < qty; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    public static List<Integer> sortList(List<Integer> unsortedList) {
        Collections.sort(unsortedList, (o1, o2) -> o1.compareTo(o2));
        return unsortedList;
    }

    public static boolean isPrimeNumber(int n) {
        var contador = 0;

        if (n <= 1)
            return false;

        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                contador++;
            }
        }
        return contador <= 0;
    }

    public static void main(String[] args) {
        var listadoDePrimos = createRandomList(500_000_000).stream()
                .filter(n -> isPrimeNumber(n))
                .sorted()
                .collect(Collectors.toList());

        System.out.println(listadoDePrimos);
    }
}

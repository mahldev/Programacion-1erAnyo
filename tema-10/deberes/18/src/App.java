import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static Integer[] leerEnteros(String texto) {

        Scanner sc = new Scanner(texto);
        String currentWord;
        int index = 0;
        Integer[] numbers = new Integer[texto.length()];

        while (sc.hasNext()) {
            currentWord = sc.next();
            try (Scanner sc1 = new Scanner(currentWord)) {
                numbers[index++] = sc1.nextInt();
            } catch (Exception e) {
            }
        }
        sc.close();
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }

    private static void showIntegerList(Integer[] integerList) {
        for (Integer integer : integerList) {
            if (integer != null) {
                System.out.print(integer);
            }
        }
    }

    public static void main(String[] args) throws Exception {

        String text = "21 Esto es un string1 y 23 esto 1 4 es un entero 12";
        Integer[] numbers;
        numbers = leerEnteros(text);
        showIntegerList(numbers);
    }
}

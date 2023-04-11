import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    private static Integer[] leerEnteros(String texto) {

        Scanner sc = new Scanner(texto);
        String currentToken = "sis";
        int index = 0;
        Integer[] numbers = new Integer[texto.length()];

        try {

            while ((currentToken = sc.next()) != null) {
                if (sc.hasNextInt()) {
                    numbers[index] = Integer.parseInt(currentChar);
                }
            }
        } catch (NoSuchElementException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
        return numbers;
    }

    private static void showIntegerList(Integer[] integerList) {
        for (Integer integer : integerList) {
            if (integer != null) {
               System.out.println(integer); 
            }
        }
    }
    public static void main(String[] args) throws Exception {

        String text = "23 sdasdasd asda5sd";
        Integer[] numbers;
        numbers = leerEnteros(text);
        showIntegerList(numbers);
    }
}

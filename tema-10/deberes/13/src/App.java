import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class App {

    private static String readFile(BufferedReader bReader) throws IOException {
        String currentLine, res = "";

        while ((currentLine = bReader.readLine()) != null) {
            res += currentLine + " ";
        }
        return res;
    }

    private static String sortNumberString(String numbers) {
        String[] aux;
        int[] intArray;
        String res = "";

        aux = numbers.split(" ");
        intArray = new int[aux.length];
        for (int i = 0; i < aux.length; i++) {
            intArray[i] = Integer.parseInt(aux[i]);
        }
        Arrays.sort(intArray);
        for (int i : intArray) {
            res += i + " ";
        }
        return res;
    }

    public static void main(String[] args) throws Exception {
        String text = "";
        String[] numbersString;

        try (
                BufferedReader file1 = new BufferedReader(new FileReader("lista1.txt"));
                BufferedReader file2 = new BufferedReader(new FileReader("lista2.txt"));) {
            text = readFile(file1);
            text = readFile(file2);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        text = sortNumberString(text);
        numbersString = text.split(" ");
        try (
                BufferedWriter out = new BufferedWriter(new FileWriter("salida.txt"))) {
            for (String string : numbersString) {
                out.write(string);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

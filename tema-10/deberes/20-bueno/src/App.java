import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {

        int currentChar1 = 0, currentChar2 = 0;
        int numberLine = 1;
        boolean equal = true;

        try (
                BufferedReader file1 = new BufferedReader(new FileReader("texto1.txt"));
                BufferedReader file2 = new BufferedReader(new FileReader("texto2.txt"));) {
            while (equal
                    && (currentChar1 = file1.read()) != -1
                    && (currentChar2 = file2.read()) != -1) {
                if (currentChar2 == 10)
                    numberLine++;
                if (currentChar1 != currentChar2
                        && currentChar1 != 32
                        && currentChar2 != 32)
                    equal = false;
            }
            while (equal
                    && (currentChar2 = file2.read()) != -1) {
                if (currentChar2 != 32)
                    equal = false;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println(equal
                ? "Las lineas son iguales"
                : numberLine + ": +" + ((char) currentChar2) + "\n   -" + ((char) currentChar1));
    }
}
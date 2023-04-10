import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String text;
        boolean end = false;
        final String END_PATTERN = "fin";

        try (BufferedWriter out = new BufferedWriter(
                new FileWriter("file.txt"))) {
            while (!end) {
                System.out.print("Introduzca la línea de texto: ");
                text = sc.nextLine();
                end = text.equalsIgnoreCase(END_PATTERN);
                if (!end) {
                    out.write(text);
                    out.newLine();
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}

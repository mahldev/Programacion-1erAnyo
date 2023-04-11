import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String currentLine = "";
        boolean exit;
        int lineNumber = 0;

        try (
                BufferedReader in = new BufferedReader(new FileReader("fichero.txt"));
                Scanner sc = new Scanner(System.in);) {
            do {
                while ((currentLine = in.readLine()) != null && lineNumber < 23) {
                    System.out.println(currentLine);
                    lineNumber++;
                }
                System.out.println(currentLine);
                System.out.print(":");
                exit = !sc.nextLine().equals("salir");
                lineNumber = 0;
            } while (exit && currentLine != null);
        } catch (IOException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}

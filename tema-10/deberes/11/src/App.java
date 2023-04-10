import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.interfaces.ECKey;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String fileName, consoleText = "", nextLine;
        boolean error = false;

        System.out
                .print(
                        "Introduzca el nombre de un fichero (si no escribe nada se utilizara por defecto prueba.txt): ");
        fileName = sc.nextLine();
        do {
            try (
                    BufferedReader in = new BufferedReader(new FileReader(fileName + ".txt"))) {
                do {
                    error = false;
                    nextLine = in.readLine();
                    if (nextLine != null) {
                        consoleText += nextLine + "\n";
                    }
                } while (nextLine != null);
            } catch (FileNotFoundException e) {
                error = true;
                fileName = "prueba";
            } 

        } while (error);
        System.out.println(consoleText);
        sc.close();
    }
}

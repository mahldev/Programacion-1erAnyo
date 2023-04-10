import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String fileName;
        String nextLine;
        boolean error = false;

        do {
            System.out.print("Introduzca el nombre del fichero: ");
            fileName = sc.nextLine();
            try (
                    BufferedReader in = new BufferedReader(new FileReader(fileName));
                    BufferedWriter out = new BufferedWriter(new FileWriter("copia_de_" + fileName))) {
                do {
                    nextLine = in.readLine();
                    if (nextLine != null) {
                        out.write(nextLine);
                        out.newLine();
                    }
                } while (nextLine != null);
            } catch (FileNotFoundException e) {
                error = true;
            } catch (IOException e) {
                System.out.println(e);
            }
        } while (error);
        sc.close();
    }
}

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {


    private static void showSignatureBook(String fileContent) {
        String aux = "" , header = "| Libro de firmas |\n-------------------\n" + fileContent;
        aux = header + (fileContent.isEmpty()
                ? "\n    --Vacio--"
                : "")
                +" \n-------------------" ;
        System.out.println(aux);
    }

    private static boolean isRepeated(String signature, String fileContent) {
        return fileContent.contains(signature);
    }
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        final String FILE_NAME = "firmas.txt"; 
        String fileContent = "", currentLine, signature;
        boolean error = false; 
        String aux = "";

        try (
            BufferedReader in = new BufferedReader(new FileReader(FILE_NAME));
        ) {
            while ((currentLine = in.readLine()) != null) {
                fileContent += currentLine  + "\n";
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        showSignatureBook(fileContent);
        do {
            aux = error
                ? "La firma deber ser unica\nIntroduzca otra: "
                : "Intrduzca una firma: ";
            error = true;
            System.out.print(aux);
            signature = sc.nextLine();
        } while (isRepeated(signature, fileContent));
        sc.close();
        try (
            BufferedWriter out = new BufferedWriter(new FileWriter(FILE_NAME, true));
        ) {
            out.newLine();
            out.write(signature);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

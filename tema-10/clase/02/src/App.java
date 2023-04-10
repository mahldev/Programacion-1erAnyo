import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String texto = "", nombre;

        System.out.print("Introduzca el nombre del fichero a buscar: ");
        nombre = sc.nextLine();

        BufferedReader in = new BufferedReader(new FileReader("files/ejemplo.txt"));
        try {
            String line = in.readLine();
            while (line != null) {
                texto += line + "\n";
                line = in.readLine();
            }
        } catch (Exception e) {
            System.out.println("Se ha producido un error");
        } finally {
            try {
                in.close();
            } catch (Exception e) {
                System.out.println("Se ha producido un error");
            }
        }
        if (texto.length() > 0) {
            System.out.println(texto);
        }
    }
}

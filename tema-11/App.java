import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String palabraAEliminar, newPalabra, linea, aux = "";
        String[] palabras;

        System.out.print("Introduzca el palabraAEliminar a cambiar: ");
        palabraAEliminar = sc.nextLine();
        System.out.print("Introduca la nueva palabraAEliminar: ");
        newPalabra = sc.nextLine();
        try (BufferedReader in = new BufferedReader(new FileReader("entrada.txt"));
                BufferedWriter out = new BufferedWriter(new FileWriter("salida.txt"))) {
            while ((linea = in.readLine()) != null) {
                palabras = linea.split(" ");
                for (int i = 0; i < palabras.length; i++) {
                    if (palabras[i].equalsIgnoreCase(palabraAEliminar))
                        palabras[i] = newPalabra;
                }
                aux = "";
                for (String string : palabras) {
                    aux += string + " ";
                }
                out.write(aux);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    private static void markFile(BufferedWriter out, String[] data) throws IOException {
        out.write("  {");
        out.newLine();
        out.write("     \"nombre\" : " + "\"" + data[0] + "\"" + ",");
        out.newLine();
        out.write("     \"edad\" : " + data[1]);
        out.newLine();
        out.write("  }");
    }

    private static void romeveLine(BufferedReader in, BufferedWriter out, String[] linesToRemove) throws IOException {
        String currentLine;
        while ((currentLine = in.readLine()) != null) {
            if ((currentLine.trim()).equals(linesToRemove[0])
                    || (currentLine.trim()).equals(linesToRemove[1]))
                currentLine = "";
            out.write(currentLine);
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] data = new String[2];
        File file = new File("data.txt");
        String[] linesToRemove = {
                "]",
                "],{",
        };

        System.out.println("Introduzca su nombre y a continuacion su edad");
        for (int i = 0; i < data.length; i++) {
            System.out.print("-> ");
            data[i] = sc.nextLine();
        }
        try (
                BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
                BufferedReader in = new BufferedReader(new FileReader(file));) {
            if (in.readLine() == null) {
                out.write("[");
                out.newLine();
                markFile(out, data);
                out.newLine();
                out.write("]");
            } else {
                romeveLine(in, out, linesToRemove);
                out.write(",");
                markFile(out, data);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        sc.close();
    }
}

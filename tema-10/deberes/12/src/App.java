import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        String[] data = new String[2];
        File file = new File("data.txt");

        System.out.println("Introduzca su nombre y a continuacion su edad");
        for (int i = 0; i < data.length; i++) {
            System.out.print("-> ");
            data[i] = sc.nextLine();
        }
        try (
                BufferedWriter out = new BufferedWriter(new FileWriter(file, true))) {
            out.write("{");
            out.newLine();
            out.write("   \"nombre\" : " + "\"" + data[0] + "\"" + ",");
            out.newLine();
            out.write("   \"edad\" : " + data[1]);
            out.newLine();
            out.write("}");
            out.newLine();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
        sc.close();
    }
}

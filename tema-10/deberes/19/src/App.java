import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final String[] PATH = {
                "texto.txt",
                "codec.txt",
        };
        String currentLine, text = "", outputText = "";
        String[] words, lines;
        char aux;
        final int CODE = 1;
        Scanner sc;

        try (
                BufferedReader br = new BufferedReader(new FileReader(PATH[0]));
                BufferedWriter bw = new BufferedWriter(new FileWriter(PATH[1], true));) {
            while ((currentLine = br.readLine()) != null) {
                text += currentLine + "\n";
            }
            lines = text.split("\n");
            for (String line : lines) {
                words = line.split(" ");
                for (String word : words) {
                    sc = new Scanner(word);
                    sc.useDelimiter("");
                    while (sc.hasNext()) {
                        aux = sc.next().charAt(0);
                        aux += CODE;
                        outputText += aux;
                    }
                    bw.write(outputText + " ");
                    outputText = "";
                }
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

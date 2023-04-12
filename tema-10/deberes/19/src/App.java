import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        final String PATH = "codec.txt";
        String currentLine, text = "", outputText = "";
        String[] words;
        char aux;
        final int CODE = 5;
        Scanner sc;

        try (BufferedReader br = new BufferedReader(new FileReader(PATH));
        BufferedWriter bw = new BufferedWriter(new FileWriter(PATH, true));
                ) {
            while ((currentLine = br.readLine()) != null) {
                text += currentLine + "\n";
            }
            words = text.split(" ");
            for (String word : words) {
                sc = new Scanner(word);
                sc.useDelimiter("");
                while (sc.hasNext()) {
                    aux = sc.next().charAt(0);
                    aux += CODE;
                    outputText += aux;
                }
                outputText += " ";
            }
            System.out.println(outputText);
            words = outputText.split(" ");
            System.out.println(Arrays.toString(words));
            for (String string : words) {
                System.out.println(string);
                bw.write(string);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

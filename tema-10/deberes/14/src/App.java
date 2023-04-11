import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

import javax.sound.sampled.Line;

public class App {

    public static void main(String[] args) throws Exception {

        File file = new File("carta.txt");
        int numberOfChars = 0,
                numberOfLines = 0,
                numberOfWords = 0;
        String text = "", currentLine;
        String[] textSplit;

        try (
                BufferedReader bf = new BufferedReader(new FileReader(file));) {
            while ((currentLine = bf.readLine()) != null) {
                text += currentLine;
                numberOfLines++;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        numberOfChars = text.toCharArray().length;
        textSplit = text.split(" ");
        numberOfWords = textSplit.length;
        for (String string : textSplit) {
            if (string.equals(" "))
                numberOfWords--;
        }

        System.out.println(
                "Numero de caracteres: " + numberOfChars + "\nNumero de lineas: " + numberOfLines +
                        "\nNumero de palabras: " + numberOfWords);
    }

}

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test {

    public static void main(String[] args) {

        String currentLine, lines = "";

        try (
                BufferedReader bufferedReader = new BufferedReader(new FileReader("test.txt"));) {
            while ((currentLine = bufferedReader.readLine()) != null) {
                lines += currentLine;
            }
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println(lines);
    }
}

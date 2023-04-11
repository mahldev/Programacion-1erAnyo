import java.io.BufferedWriter;
import java.io.FileWriter;

public class FillNumbers {

    final static String  PATH= "fichero.txt";

    public static void main(String[] args) throws Exception {

        int number = 1;

        try (
                BufferedWriter out = new BufferedWriter(new FileWriter(PATH));) {
            while (number < 1001) {
                out.write(String.valueOf(number));
                out.newLine();
                number++;
            }            
        }
    }
}

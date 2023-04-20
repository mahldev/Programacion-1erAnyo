import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    private static void fillWithNumbers() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("numeros.dat"))) {
           for (int i = 0; i < 50; i++) {
                out.writeInt(i);
           } 
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) throws Exception {
        
        int number;

        fillWithNumbers();
        try (
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("numeros.dat")); 
            ObjectOutputStream pair = new ObjectOutputStream(new FileOutputStream("pares.dat"));
            ObjectOutputStream odd = new ObjectOutputStream(new FileOutputStream("impar.dat")))
            {
            while (true) {
                if ((number = in.readInt()) % 2 == 0) 
                    pair.write(number);
                else 
                    odd.write(number);
            }
        } catch (Exception e) {
        }
    }
}

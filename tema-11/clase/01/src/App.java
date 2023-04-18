import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class App {
    private static void saveArray(int[] table) {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("datos.dat"))) {
            oos.writeObject(table);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws Exception {

        int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] newTable;

        // saveArray(table);
        loadArray(table);
    }

    private static Object loadArray(int[] table) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("datos"))) {
            return ois.readObject();
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

}

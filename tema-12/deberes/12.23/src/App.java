import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Set<String> c = new TreeSet<>();
        String nombre;
        boolean continua = false;

        do {
            continua = false;
            nombre = sc.nextLine().toLowerCase();
            if (!nombre.equals("fin")) {
                c.add(nombre);
                continua = true;
            }
        } while (continua);
        sc.close();
        System.out.println(Arrays.toString(c.toArray(new String[0])));
    }
}

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Set<String> coleccion = new LinkedHashSet<>();
        String nombre;
        boolean continua;

        do {
            continua = false;
            nombre = sc.nextLine();
            if (!nombre.equalsIgnoreCase("fin")) {
                coleccion.add(nombre);
                continua = true;
            }
        } while (continua);
        sc.close();
        System.out.println(Arrays.toString(coleccion.toArray(new String[0])));
    }
}

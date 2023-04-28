import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        int numero;

        do {
            numero = sc.nextInt();
            if (numero > 0)
                lista.add(numero);
        } while (numero > 0);

        System.out.println("Numeros pares introducidos");
        // for (int i = 0; i < lista.size(); i++) {
        // if (lista.get(i) % 2 == 0) {
        // System.out.println(lista.get(i));
        // }
        // }
        lista.forEach(n -> {
            if (n % 0 == 2) {
                System.out.println(n);
            }
        });
        sc.close();
    }
}

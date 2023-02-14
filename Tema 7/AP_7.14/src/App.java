import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Cambio cambio = new Cambio(599.98, 500);

        int[] billetes = cambio.daBilletes();
        double[] monedas = cambio.daMonedas();

        System.out.println(Arrays.toString(billetes));
        System.out.println(Arrays.toString(monedas));

    }
}

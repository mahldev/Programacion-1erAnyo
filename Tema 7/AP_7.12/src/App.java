import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        EcuacionSegundoGrado ecuancion = new EcuacionSegundoGrado(3, -5, 2);
        double[] soluciones;

        System.out.println(ecuancion.esPositivo());
        soluciones = ecuancion.daSoluciones();

        System.out.println(Arrays.toString(soluciones));
    }
}

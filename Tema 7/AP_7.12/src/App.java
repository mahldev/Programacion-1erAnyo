import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        EcuacionSegundoGrado ecuancion = new EcuacionSegundoGrado(1, -4, 4);
        double[] soluciones;

        System.out.println(ecuancion.esPositivo());
        soluciones = ecuancion.daSoluciones();

        System.out.println(Arrays.toString(soluciones));
    }
}

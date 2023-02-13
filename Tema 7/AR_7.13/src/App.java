import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        Colores colores = new Colores();

        System.out.println(colores);

        colores.agregaColor("naranja");
        colores.agregaColor("verde");
        System.out.println(colores);

        String[] coloresAleatorios = colores.devuelveColores(6);

        System.out.println(Arrays.toString(coloresAleatorios));
    }
}

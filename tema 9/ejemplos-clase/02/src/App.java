import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Socio[] socios = new Socio[] {
            new Socio(5, "Jorge"),
            new Socio(1, "Juan"),
            new Socio(6, "Jorge"),
            new Socio(2, "Ana"),
        };

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios);

        System.out.println(Arrays.deepToString(socios));
    }
}

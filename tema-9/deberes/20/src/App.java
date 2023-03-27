import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Socio[] socios = new Socio[] {
                new Socio(1, "Juan", 34),
                new Socio(5, "Jorge", 34),
                new Socio(6, "Jorge", 34),
                new Socio(2, "Ana", 34),
        };

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios);

        System.out.println(Arrays.deepToString(socios));
    }
}

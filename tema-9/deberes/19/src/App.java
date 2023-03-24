import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Socio[] socios = new Socio[] {
                new Socio(1, "Juan", 23),
                new Socio(5, "Jorge", 21),
                new Socio(2, "Ana", 34),
                new Socio(6, "Jorge", 30),
        };

        System.out.println(Arrays.toString(socios));

        Arrays.sort(socios);

        System.out.println(Arrays.deepToString(socios));
    }
}

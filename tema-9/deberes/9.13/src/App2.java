import java.util.Arrays;
import java.util.Comparator;

public class App2 {

    public static void main(String[] args) {

        Futbolista[] tabla = {
                new Futbolista("38271923H", "Z", 24, 5),
                new Futbolista("12876021K", "V", 30, 3),
                new Futbolista("91283631U", "L", 22, 9),
                new Futbolista("34902343S", "O", 29, 4),
                new Futbolista("63495394N", "Y", 20, 6),
        };
        System.out.println(Arrays.deepToString(tabla));

        Arrays.sort(tabla);
        System.out.println("\nOrdeando por dni\n--------------------" + Arrays.deepToString(tabla));

        Arrays.sort(tabla, ((o1, o2) -> o1.getNombre().compareTo(o2.getNombre())));
        System.out.println("\nOrdeando por nombre\n--------------------" + Arrays.deepToString(tabla));

        Arrays.sort(tabla, ((o1, o2) -> o1.getEdad() - o2.getEdad()));
        System.out.println("\nOrdeando por edad\n--------------------" + Arrays.deepToString(tabla));

        Arrays.sort(tabla, new Comparator<Futbolista>() {

            @Override
            public int compare(Futbolista o1, Futbolista o2) {

                if (o1.getNombre().compareTo(o2.getNombre()) == 0)
                    return o1.getEdad() - o2.getEdad();
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println("\nOrdeando por edad y nombre\n--------------------" + Arrays.deepToString(tabla));
    }
}

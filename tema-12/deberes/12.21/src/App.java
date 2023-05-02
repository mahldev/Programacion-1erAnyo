import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class App {

    public static void main(String[] args) throws Exception {

        Set<Integer> coleccion = new TreeSet<>((o1, o2) -> -(o1 - o2));
        int i = 0;

        while (i < 20) {
            if (coleccion.add((int) (Math.random() * 100)))
                i++;
        }
        System.out.println(Arrays.toString(coleccion.toArray(new Integer[0])));
    }
}

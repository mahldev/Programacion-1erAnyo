import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class App {

    /*
     * Implementar un método estático que lleve a cabo la unión de dos conjuntos de
     * elementos genéricos. La unión es un nuevo conjunto con todos los elementos
     * que pertenezcan, al menos, a uno de los dos conjuntos.
     */

    public static <T> Set<T> union(Set<T> s1, Set<T> s2) {
        Set<T> res = new HashSet<>(s1);
        res.addAll(s2);
        return res;
    }

    public static <T> Set<T> interseccion(Set<T> s1, Set<T> s2) {
        Set<T> res = new HashSet<>(s1);
        res.retainAll(s2);
        return res;
    }

    public static void main(String[] args) {

        System.out.println(union(Set.of(1, 2, 3, 4), Set.of(1, 5)));
        System.out.println(interseccion(Set.of(1, 2, 3, 4), Set.of(1, 5)));
    }
}

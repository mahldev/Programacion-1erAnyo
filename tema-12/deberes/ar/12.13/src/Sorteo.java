import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorteo<T> {

    Set<T> datos;

    public Sorteo() {
        this.datos = new HashSet<>();
    }

    public boolean add(T e) {
        return datos.add(e);
    }

    public Set<T> premiados(int numPremiados) {
        if (!datos.isEmpty()) {
            List<T> aux = new ArrayList<>(datos);
            Set<T> res = new HashSet<>();

            Collections.shuffle(aux);
            if (numPremiados <= datos.size()) {
                res.addAll(aux.subList(0, numPremiados));
                return res;
            }
        }
        return null;
    }
}

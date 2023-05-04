import java.util.*;

public class Cola<T> implements Contenedor<T> {

    private List<T> cola;

    public Cola() {
        this.cola = new ArrayList<>();
    }

    @Override
    public boolean agregar(T p) {
        return cola.add(p);
    }

    @Override
    public T extraer() {
        T res = null;
        if (!cola.isEmpty()) {
            cola.get(0);
            cola.remove(0);
        }
        return res;
    }

    @Override
    public T[] listar(T[] t) {
        return cola.toArray(t);
    }
}

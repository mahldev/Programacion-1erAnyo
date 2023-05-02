import java.util.ArrayList;
import java.util.List;

public class Pila<T> implements Contenedor<T> {

    List<T> pila;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    @Override
    public boolean agregar(T p) {
        return pila.add(p);
    }

    @Override
    public T extraer() {
        T res = pila.get(pila.size() - 1);
        pila.remove(pila.size() - 1);
        return res;
    }

    @Override
    public T[] listar(T[] t) {
        return pila.toArray(t);
    }
}

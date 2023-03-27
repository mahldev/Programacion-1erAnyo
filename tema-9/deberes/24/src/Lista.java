import java.util.Arrays;
import java.util.Comparator;

public class Lista {

    private Object[] lista;

    public Lista(Object[] lista) {
        this.lista = lista;
    }

    public void ordenar() {
        Arrays.sort(lista);
    }

    public void ordenar(Comparator c) {

        boolean mismoTipo = true;

        for (int index = 0; index < lista.length - 1 && mismoTipo; index++) {
            if (this.lista[index].getClass() != this.lista[index + 1].getClass()) {
                mismoTipo = false;
            }
        }
        if (mismoTipo) {
            Arrays.sort(this.lista, c);
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(lista);
    }
}

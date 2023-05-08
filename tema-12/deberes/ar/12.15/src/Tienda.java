import java.util.HashMap;
import java.util.Map;

public class Tienda {

    private Map<String, Producto> almacen;

    public Tienda() {
        this.almacen = new HashMap<>();
    }

    public boolean alta(String k, Producto v) {
        return almacen.put(k, v) != null;
    }

    public boolean baja(String k) {
        return almacen.remove(k) != null;
    }

    public boolean actualizarStock(String k, Integer i) {
        almacen.get(k).setStock(i);
        return true;
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Club {

    private Map<String, Socio> club;

    public Club() {
        club = new HashMap<>();
    }

    public boolean agregar(String apodo, Socio s) {
        if (!club.containsKey(apodo)) {
            club.put(apodo, s);
            return true;
        }
        return false;
    }

    public boolean eliminar(String apodo) {
        return club.remove(apodo) != null;
    }

    public boolean modificar(String apodo, Socio s) {
        if (club.containsKey(apodo)) {
            club.put(apodo, s);
            return true;
        }
        return false;
    }

    public Stream<Socio> listado() {
        return club.values().stream();
    }
}
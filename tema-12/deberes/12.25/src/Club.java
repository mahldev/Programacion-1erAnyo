import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        return club.remove(apodo) != club.get(apodo);
    }

    public List<Socio> listado() {
        return List.of(club.values().toArray(new Socio[0]));
    }
}
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
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
        return club.remove(apodo) != null;
    }

    public boolean modificar(String apodo, Socio s) {
        if (club.containsKey(apodo)) {
            club.put(apodo, s);
            return true;
        }
        return false;
    }

    public ArrayList<Socio> listado() {
        ArrayList<Socio> res = new ArrayList<>();
        res.addAll(club.values());
        return res;
    }
}
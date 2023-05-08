import java.util.HashMap;
import java.util.List;
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
        return club.remove(apodo) != club.get(apodo);
    }

<<<<<<< HEAD
    public boolean modificar(String apodo, Socio s) {
        if (club.containsKey(apodo)) {
            club.put(apodo, s);
            return true;
        }
        return false;
    }

    public Stream<Socio> listado() {
        return club.values().stream();
=======
    public List<Socio> listado() {
        return List.of(club.values().toArray(new Socio[0]));
>>>>>>> a8c57300431d59b499543afecc892fcac86a6943
    }
}
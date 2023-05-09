import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Academia {

    private Map<Character, Academico> contendor;

    public Academia() {
        this.contendor = new TreeMap<>();
    }

    public boolean nuevoAcademico(Character k, Academico a) {
        if (Character.isLetter(k))
            return contendor.put(k, a) != null;
        return false;
    }

    public Set<Map.Entry<Character, Academico>> listar() {
        return contendor.entrySet();
    }
}

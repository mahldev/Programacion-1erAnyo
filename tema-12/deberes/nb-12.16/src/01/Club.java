import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Club {

    private Set<Socio> socios;

    public Club() {
        socios = new TreeSet<>();
    }

    public boolean alta(Socio s) {
        return socios.add(s);
    }

    public boolean baja(Socio s) {
        return socios.remove(s);
    }

    public Socio modificacion(Socio s) {
        Iterator<Socio> it = socios.iterator();
        Socio aux;
        while (it.hasNext()) {
            if ((aux = it.next()).equals(s)) {
                return aux;
            }
        }
        return null;
    }

    public Socio[] listado(Comparator<Socio> c) {
        Socio[] res = socios.toArray(new Socio[0]);
        Arrays.sort(res, c);
        return res;
    }
}

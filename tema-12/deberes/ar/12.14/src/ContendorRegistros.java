import java.io.Serializable;
import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ContendorRegistros implements Serializable {

    private Set<Registro> registros;

    public ContendorRegistros() {
        this.registros = new TreeSet<>();
    }

    public boolean add(Registro r) {
        return registros.add(r);
    }

    public List<Registro> listar() {
        return new ArrayList<>(registros);
    }

    public Double tempMaxima() {
        // if (!registros.isEmpty()) {
        // return Collections.max(registros, (r1, r2) -> (int) (r1.getTemperatura() -
        // r2.getTemperatura()))
        // .getTemperatura();
        // }
        // return null;
        return registros.stream()
                .mapToDouble(r -> r.getTemperatura())
                .max().orElse(0);
    }

    public Double tempMinima() {
        // if (!registros.isEmpty()) {
        // return Collections.min(registros, (r1, r2) -> (int) (r1.getTemperatura() -
        // r2.getTemperatura()))
        // .getTemperatura();
        // }
        // return null;
        return registros.stream()
                .mapToDouble(r -> r.getTemperatura())
                .min().orElse(0);
    }

    public Double promedio() {
        // Double suma = 0.00;
        // for (Registro registro : registros) {
        // suma += registro.getTemperatura();
        // }
        // return suma / registros.size();
        return registros.stream()
                .mapToDouble(r -> r.getTemperatura())
                .average().orElse(0);
    }

}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class Jornada {

    private static final DateTimeFormatter f;
    static {
        f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    }

    private Tarea[] tareas;
    private LocalDate fechaDeEntrada;
    private LocalDate fechaDeSalida;

    public Jornada(String fechaDeEntrada, String fechaDeSalida) {
        this.tareas = new Tarea[0];
        this.fechaDeEntrada = LocalDate.parse(fechaDeEntrada, f);
        this.fechaDeSalida = LocalDate.parse(fechaDeSalida, f);
    }

    public String getFechaDeEntrada() {
        return String.valueOf(fechaDeEntrada);
    }

    public void setFechaDeEntrada(String fechaDeEntrada) {
        this.fechaDeEntrada = LocalDate.parse(fechaDeEntrada, f);
    }

    public String getFechaDeSalida() {
        return String.valueOf(fechaDeSalida);
    }

    public void setFechaDeSalida(String fechaDeSalida) {
        this.fechaDeSalida = LocalDate.parse(fechaDeSalida, f);
    }

    public boolean nuevaTarea(Tarea tarea) {
        if (estaEnLaJoranada(tarea) == 1)
            return false;
        Tarea[] res = new Tarea[tareas.length + 1];
        for (int i = 0; i < res.length - 1; i++) {
            res[i] = tareas[i];
        }
        res[res.length - 1] = tarea;
        this.tareas = res;
        return true;
    }

    public boolean ordenarTareas() {
        Arrays.sort(this.tareas);
        return true;
    }

    @Override
    public String toString() {
        String res = "";
        for (Tarea tarea : tareas) {
            res += "\nDNI:" + tarea.getDni() + " - Fecha: " + fechaDeEntrada.format(f) + " - Duracion: "
                    + tarea.numeroDeMinutos()
                    + " minutos";
        }
        return res;
    }

    private int estaEnLaJoranada(Tarea tarea) {
        for (int i = 0; i < tareas.length; i++)
            if (tareas[i].equals(tarea))
                return i;

        return -1;
    }
}

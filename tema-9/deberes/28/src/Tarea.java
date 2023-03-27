import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Tarea implements Comparable<Tarea> {

    private static final DateTimeFormatter f;
    static {
        f = DateTimeFormatter.ofPattern("HH:mm:ss");
    }
    private Jornada jornada;
    private String dni;
    private LocalTime horaDeComienzo;
    private LocalTime horaDeFin;

    public Tarea(Jornada jornada, String dni, String horaDeComienzo, String horaDeFin) {
        this.dni = dni;
        this.jornada = jornada;
        this.horaDeComienzo = LocalTime.parse(horaDeComienzo, f);
        this.horaDeFin = LocalTime.parse(horaDeFin, f);
    }

    public Tarea(String dni, String horaDeComienzo, String horaDeFin) {
        this.dni = dni;
        this.horaDeComienzo = LocalTime.parse(horaDeComienzo, f);
        this.horaDeFin = LocalTime.parse(horaDeFin, f);
    }

    public String getDni() {
        return dni;
    }

    public Jornada getJornada() {
        return jornada;
    }

    public void setJornada(Jornada jornada) {
        this.jornada = jornada;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalTime getHoraDeEntrada() {
        return horaDeComienzo;
    }

    public void setHoraDeEntrada(LocalTime horaDeComienzo) {
        this.horaDeComienzo = horaDeComienzo;
    }

    public LocalTime getHoraDeSalida() {
        return horaDeFin;
    }

    public void setHoraDeSalida(LocalTime horaDeFin) {
        this.horaDeFin = horaDeFin;
    }

    public int numeroDeMinutos() {
        return (int) horaDeComienzo.until(horaDeFin, ChronoUnit.MINUTES);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Tarea other = (Tarea) obj;
        if (jornada == null) {
            if (other.jornada != null)
                return false;
        } else if (!jornada.equals(other.jornada))
            return false;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        if (horaDeComienzo == null) {
            if (other.horaDeComienzo != null)
                return false;
        } else if (!horaDeComienzo.equals(other.horaDeComienzo))
            return false;
        if (horaDeFin == null) {
            if (other.horaDeFin != null)
                return false;
        } else if (!horaDeFin.equals(other.horaDeFin))
            return false;
        return true;
    }

    @Override
    public int compareTo(Tarea o) {
        int res = this.dni.compareTo(o.dni);
        if (res == 0) {
            if (this.jornada != null) {
                res = this.jornada.getFechaDeEntrada().compareTo(o.jornada.getFechaDeEntrada());
                if (res == 0) {
                    res = this.horaDeComienzo.compareTo(o.horaDeComienzo);
                    if (res == 0) {
                        res = this.horaDeFin.compareTo(o.horaDeFin);
                    }
                }
            }
        }
        return res;
    }

    @Override
    public String toString() {
        String res = "DNI: " + dni + " - Hora de comienzo " + this.horaDeComienzo + " - Hora de salida: "
                + this.horaDeFin;
        if (jornada != null)
            res += " - Dia de la jornada: " + jornada.getFechaDeEntrada().substring(0, 11);
        return res;
    }

}

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Socio implements Comparable<Socio> {

    private String dni;
    private String nombre;
    private LocalDate diaDeInscripcion;

    public Socio(String dni, String nombre, String diaDeInscripcion) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.dni = dni;
        this.nombre = nombre;
        if (diaDeInscripcion != null)
            this.diaDeInscripcion = LocalDate.parse(diaDeInscripcion, formatter);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getDiaDeInscripcion() {
        return diaDeInscripcion;
    }

    public void setDiaDeInscripcion(LocalDate diaDeInscripcion) {
        this.diaDeInscripcion = diaDeInscripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((dni == null) ? 0 : dni.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Socio other = (Socio) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Socio o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "DNI: " + dni + " - Nombre: " + nombre + " - Dia de inscripcion: " + diaDeInscripcion;
    }
}

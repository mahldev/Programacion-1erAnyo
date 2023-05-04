import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Socio {

    private String apodo;
    private String nombre;
    private LocalDate fechaIngreso;

    public Socio(String apodo, String nombre, String fechaIngreso) throws DateTimeParseException {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.nombre = nombre;
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apodo == null) ? 0 : apodo.hashCode());
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
        if (apodo == null) {
            if (other.apodo != null)
                return false;
        } else if (!apodo.equals(other.apodo))
            return false;
        return true;
    }

    @Override
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Apodo: " + apodo + " - Nombre: " + nombre + " - Fecha de ingreso: " + fechaIngreso.format(f);
    }
}
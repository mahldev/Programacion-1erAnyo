import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Socio {

    private String nombre;
    private LocalDate fechaIngreso;

    public Socio(String nombre, String fechaIngreso) throws DateTimeParseException {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        this.nombre = nombre;
        this.fechaIngreso = LocalDate.parse(fechaIngreso, f);
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
    public String toString() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return "Nombre: " + nombre + " - Fecha de ingreso: " + fechaIngreso.format(f);
    }
}
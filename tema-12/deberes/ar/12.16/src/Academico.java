import java.time.LocalDate;

public class Academico implements Comparable<Academico> {

    private static Integer contador;
    static {
        contador = 1;
    }
    private Integer id;

    private String nombre;
    private LocalDate fechaIngreso;

    public Academico(String nombre, LocalDate fechaIngreso) {
        this.id = contador++;
        this.nombre = nombre;
        this.fechaIngreso = fechaIngreso;
    }

    public Integer getId() {
        return id;
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
        result = prime * result + ((id == null) ? 0 : id.hashCode());
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
        Academico other = (Academico) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public int compareTo(Academico o) {
        return this.nombre.compareTo(o.nombre);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Fecha de Ingreso: " + fechaIngreso;
    }

}

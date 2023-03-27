import java.time.LocalDate;

public class Socio implements Comparable<Socio> {

    private static int contadorIds;
    static {
        contadorIds = 1;
    }
    private int id;
    private String nombre;
    private int edad;
    private LocalDate fechaNacimiento;

    public Socio() {

        this.id = contadorIds++;
    }

    public Socio(int id, String nombre, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = LocalDate.now();
    }

    @Override
    public String toString() {
        return "\n id: " + id + " | nombre: " + nombre + " | edad: " + edad;
    }

    @Override
    public int compareTo(Socio other) {
        if (this.edad - other.edad == 0)
            return this.id - other.id;
        return this.edad - other.edad;
    }
}

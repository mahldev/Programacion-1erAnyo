public class Socio implements Comparable<Socio> {

    private static int contadorIds;
    static {
        contadorIds = 1;
    }
    private int id;
    private String nombre;

    public Socio() {

        this.id = contadorIds++;
    }

    public Socio(int id, String nombre) {

        this.id = id;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "\n id: " + id + " nombre: " + nombre;
    }

    @Override
    public int compareTo(Socio other) {
        if (this.nombre.compareTo(other.nombre) == 0) {
            return this.id - other.id;
        }
        return -this.nombre.compareTo(other.nombre);
    }
}

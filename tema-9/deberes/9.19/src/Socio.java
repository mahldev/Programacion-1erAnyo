public class Socio implements Comparable<Socio> {

    private static int contadorIds;
    static {
        contadorIds = 1;
    }
    private int id;
    private String nombre;
    private int edad;

    public Socio() {

        this.id = contadorIds++;
    }

    public Socio(int id, String nombre, int edad) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\n id: " + id + " nombre: " + nombre;
    }

    @Override
    public int compareTo(Socio other) {
        return -this.edad - other.edad;
    }
}

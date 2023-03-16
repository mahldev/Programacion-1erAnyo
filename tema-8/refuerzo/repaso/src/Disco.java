public class Disco {

    private static int contador;
    static {
        contador = 1;
    }
    private int codigoDisco;
    private String nombre;
    private int duracion;

    public Disco(String nombre, int duracion) {
        this.codigoDisco = contador++;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Disco(int codigoDisco, String nombre, int duracion) {
        this.codigoDisco = codigoDisco;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public Disco(int codigo) {
        this.codigoDisco = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public Disco clone() {
        return new Disco(this.codigoDisco, this.nombre, this.duracion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Disco other = (Disco) obj;
        if (codigoDisco != other.codigoDisco)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "\n---------------------------"
                + "\n codigo:  " + codigoDisco
                + "\n nombre: " + nombre
                + "\n duracion: " + duracion
                + "\n---------------------------";
    }
}

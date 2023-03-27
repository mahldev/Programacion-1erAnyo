public class Futbolista implements Comparable<Futbolista> {

    private String dni;
    private String nombre;
    private int edad;
    private int numeroGoles;

    public Futbolista(String dni, String nombre, int edad, int numeroGoles) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Futbolista other = (Futbolista) obj;
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public int compareTo(Futbolista o) {
        return this.dni.compareTo(o.dni);
    }

    @Override
    public String toString() {
        return "\n\ndni: " + dni
                + "\nnombre: " + nombre
                + "\nedad: " + edad
                + "\nnumeroGoles: " + numeroGoles;
    }

}
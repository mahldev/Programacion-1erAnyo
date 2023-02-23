public class Persona {

    private String nombre;
    private int edad;
    private double estatura;

    public Persona(String nombre, int edad, double estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    void mostrarDatos() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Estatura: " + this.estatura);
    }

    public boolean instanceOf(Class<Empleado> class1) {
        return false;
    }
}

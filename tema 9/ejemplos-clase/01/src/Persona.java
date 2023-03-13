public class Persona implements Sonido {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        if (edad < 0)
            edad = 0;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String habla(String string) {
        return "Prueba de voz: " + string;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + nombre + " y mi edad es " + edad;
    }
}

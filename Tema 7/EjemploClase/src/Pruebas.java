public class Pruebas {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();

        persona1.nombre = "Pepe";
        persona1.edad = 23;

        persona2.nombre = "Juan";
        persona2.edad = 24;

        System.out.println(persona1.edad);
        persona1.cumplirAnyos();
        System.out.println(persona1.edad);

    }
}

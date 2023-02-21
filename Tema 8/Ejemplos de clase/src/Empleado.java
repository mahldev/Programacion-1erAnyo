public class Empleado extends Persona {

    private double salario;

    Empleado(String nombre, int edad, double estatura, double salario) {

        super(nombre, edad, estatura);
        this.salario = salario;
    }

    @Override
    void mostrarDatos() {

        super.mostrarDatos();
        System.out.println("Salario: " + salario);
    }
}

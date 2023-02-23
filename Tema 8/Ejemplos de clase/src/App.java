public class App {
    public static void main(String[] args) {

        Persona[] misEmpleados = new Persona[10];

        misEmpleados[0] = new Empleado(null, 0, 0, 0);

        for (int i = 0; i < misEmpleados.length; i++) {

            if (misEmpleados[i] instanceof Empleado) {

                ((Empleado) misEmpleados[i]).diSalario();
            }
        }

    }
}

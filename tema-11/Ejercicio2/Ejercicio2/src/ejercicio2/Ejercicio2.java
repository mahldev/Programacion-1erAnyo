package ejercicio2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner sc = new Scanner(System.in);

    public static Empleado crearEmpleado() {

        String nombre;
        int edad, numH, opcion;
        double salario;

        System.out.print("\nIntroduzca el tipo de empleado (1-completo/2-parcial): ");
        opcion = sc.nextInt();
        sc.nextLine();
        System.out.println("\nIntroduzca datos empleado ");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Edad: ");
        edad = sc.nextInt();
        if (opcion == 1) {
            System.out.print("Salario: ");
            salario = sc.nextDouble();
            return new EmpleadoTCompleto(nombre, edad, salario);
        }
        System.out.print("Numero Horas trabajadas: ");
        numH = sc.nextInt();
        return new EmpleadoTParcial(nombre, edad, numH);
    }

    public static void guardarEmpleados(Empleado[] empleados) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("empleados.dat"))) {
            out.writeObject(empleados);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Empleado[] cargarEmpleados() {
        Empleado[] res = null;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("empleados.dat"))) {
            res = (Empleado[]) in.readObject();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return res;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        Empleado emp1 = crearEmpleado();
        Empleado emp2 = crearEmpleado();

        Empleado[] empleados = { emp1, emp2 };

        guardarEmpleados(empleados);

        Empleado[] empleadosCargados = cargarEmpleados();

        if (empleadosCargados != null) {
            System.out.println(" - Empleados cargados del archivo - ");
            for (Empleado empleado : empleadosCargados) {
                System.out.println(empleado.toString());
                System.out.println("---------------");
            }
        }
    }
}

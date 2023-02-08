import java.util.Scanner;

public class app {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;
        boolean salir = false;

        CuentaCorriente cuenta1 = creaCuenta(sc);

        while (!salir) {
            opcion = muestraMenu();

            salir = ejecutaApp(opcion, salir, cuenta1);
        }

    }

    private static CuentaCorriente creaCuenta(Scanner sc) {

        double saldo;
        String dni;
        String nombreTitular;
        System.out.print("Introduzca su dni: ");
        dni = sc.nextLine();
        System.out.print("Introduzca su nombre: ");
        nombreTitular = sc.nextLine();
        System.out.print("Introduzca su saldo: ");
        saldo = sc.nextInt();

        CuentaCorriente cuenta1 = new CuentaCorriente(dni, nombreTitular, saldo);
        return cuenta1;
    }

    private static boolean ejecutaApp(int opcion, boolean salir, CuentaCorriente cuenta1) {

        Scanner sc = new Scanner(System.in);
        double cantidad;
        if (opcion == 1) {

            System.out.println(cuenta1.saldo);
        } else if (opcion == 2) {

            System.out.print("Introduzca la cantidad a ingresar: ");
            cantidad = sc.nextDouble();
            cuenta1.ingresarDinero(cantidad);
        } else if (opcion == 3) {

            System.out.print("Introduzca la cantidad a sacar: ");
            cantidad = sc.nextInt();

            if (cuenta1.sacarDinero(cantidad)) {

                System.out.println("\nLa operacion ha sido realizada correctamente");
            } else {

                System.out.println("\nNo se ha podido completar la operacion");
            }
        } else {

            salir = true;
        }
        return salir;
    }

    private static int muestraMenu() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Que opcion desea hacer" +
                "\n(1) Consultar saldo" +
                "\n(2) Ingresar dinero" +
                "\n(3) Sacar dinero" +
                "\n(4) Salir" +
                "\n: ");
        return sc.nextInt();
    }
}

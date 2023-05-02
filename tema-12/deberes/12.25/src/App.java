import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static int menu() {
        String[] menu = {
                "Alta socio",
                "Baja socio",
                "Modificación socio",
                "Listar socios por apodo",
                "Listar socios por antigüedad",
                "Listar los socios con alta anterior a un año determinado",
                "Salir"
        };

        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i]);
        }
        return sc.nextInt();
    }

    public static String pideApodo() {
        System.out.println("\nIntroduzca los datos del nuevo socio");
        System.out.print("Apodo: ");
        return sc.nextLine();
    }

    public static Socio crearSocio() {
        String nombre, fecha;

        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Fecha de Ingreso: ");
        fecha = sc.nextLine();
        return new Socio(nombre, fecha);
    }

    public static void main(String[] args) throws Exception {

        Club club = new Club();
        int opcion;
        boolean error;

        do {
            switch ((opcion = menu())) {
                case 1 -> {
                    sc.nextLine();
                    do {
                        error = false;
                        try {
                            System.out.println(club.agregar(pideApodo(), crearSocio())
                                    ? "\nSe ha insertado correctamente"
                                    : "\nNo se ha completado la operacion");
                        } catch (DateTimeParseException e) {
                            error = true;
                            System.out.println("\nHa ocurrido un error en la fecha");
                        }
                    } while (error);
                }
                case 2 -> {
                    sc.nextLine();
                    System.out.println(club.eliminar(pideApodo())
                            ? "\nSe ha eliminado correctamente"
                            : "\nNo se ha completado la operacion");
                }
                case 4 -> {
                    for (Socio s : club.listado()) {
                        System.out.println(s);
                    }
                }
            }
        } while (opcion < 7);
    }
}

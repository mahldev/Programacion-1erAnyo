import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] menu = {
                "Alta",
                "Baja",
                "Modificar",
                "Listar",
                "Salir"
        };

        System.out.println("\nMenu");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i]);
        }
        System.out.print("-> ");
        return sc.nextInt();
    }

    public static Socio crearNuevoSocio() {
        String dni = null, nombre = null, fecha = null;

        sc.nextLine();
        System.out.print("DNI: ");
        dni = sc.nextLine();
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Fecha de inscripcion: ");
        fecha = sc.nextLine();
        return new Socio(dni, nombre, fecha);
    }

    public static void main(String[] args) {

        Club club = new Club();
        Socio s;
        Socio[] listado;
        int opcion, aux;

        do {
            switch ((opcion = menu())) {
                case 1 -> {
                    System.out.println("\nIntroduzca los datos del nuevo cliente");
                    System.out.println(club.alta(crearNuevoSocio())
                            ? "\nSe ha creado correctamente"
                            : "\nNo se ha completado la operacion");
                }
                case 2 -> {
                    System.out.println("\nIntroduzca los datos del cliente a remover");
                    System.out.println(club.baja(crearNuevoSocio())
                            ? "\nSe ha eliminado con exito"
                            : "\nNo se ha completado la operacion");
                }
                case 3 -> {
                    System.out.println("\nIntroduzca el DNI del socio a modificar");
                    sc.nextLine();
                    s = club.modificacion(new Socio(sc.nextLine(), null, null));
                    if (s != null) {
                        System.out.println("Modificando al socio\n" + s);
                        System.out.print("\nIntroduzca los nuevos datos\nNombre: ");
                        s.setNombre(sc.nextLine());
                    } else {
                        System.out.println("\nNo se encuentra al socio en la base de datos");
                    }
                }
                case 4 -> {
                    do {
                        System.out.println("\nIntroduzca el criterio a listar Nombre(1), Antiguedad(2): ");
                        aux = sc.nextInt();
                    } while (aux < 0 || aux > 2);
                    if (aux == 1)
                        listado = club.listado((Socio s1, Socio s2) -> s1.getNombre().compareTo(s2.getNombre()));
                    else
                        listado = club.listado(
                                (Socio s1, Socio s2) -> s1.getDiaDeInscripcion().compareTo(s2.getDiaDeInscripcion()));
                    for (Socio socio : listado) {
                        System.out.println(socio);
                    }
                }
            }
        } while (opcion < 5);
    }
}

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    public static Socio crearSocio(String apodo) {
        String nombre, fecha;

        System.out.println("\nIntroduzca los datos del nuevo socio");
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Fecha de Ingreso: ");
        fecha = sc.nextLine();
        return new Socio(apodo, nombre, fecha);
    }

    public static Club cargarClub() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("socios.dat"))) {
            return (Club) in.readObject();
        } catch (Exception e) {
            return new Club();
        }
    }

    public static boolean guardarClub(Club c) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("socios.dat"))) {
            out.writeObject(c);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) throws Exception {

        Club club;
        int opcion;
        String apodo;
        boolean error;

        club = cargarClub();

        do {
            switch ((opcion = menu())) {
                case 1 -> {
                    sc.nextLine();
                    do {
                        error = false;
                        try {
                            apodo = pideApodo();
                            System.out.println(club.agregar(apodo, crearSocio(apodo))
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
                case 3 -> {
                    sc.nextLine();
                    apodo = pideApodo();
                    System.out.println(club.agregar(apodo, crearSocio(apodo))
                            ? "\nSe ha modicado correctamente"
                            : "\nNo hay ningun socio con ese apodo");
                }
                case 4 -> {
                    club.listado()
                            .sorted((o1, o2) -> o1.getApodo().compareTo(o2.getApodo()))
                            .forEach(System.out::println);

                }
                case 5 -> {
                    club.listado()
                            .sorted((o1, o2) -> o1.getFechaIngreso().compareTo(o2.getFechaIngreso()))
                            .forEach(System.out::println);
                }
                case 6 -> {
                    var aux = sc.nextInt();
                    System.out.println("Introduzca la fecha de ingreso");
                    club.listado()
                            .filter(s -> s.getFechaIngreso().getYear() == aux)
                            .forEach(System.out::println);
                }
                default -> {
                    System.out.println(guardarClub(club)
                            ? "\nSe ha guardado correctamente"
                            : "\nNo se ha completado la operacion");
                }
            }
        } while (opcion < 7);
    }

}

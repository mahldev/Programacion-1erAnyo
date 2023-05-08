import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalTime;
import java.util.Arrays;

public class App {

    private static ContendorRegistros cargarRegistros(String dia) {
        try (var in = new ObjectInputStream(new FileInputStream("registros" + dia + ".dat"))) {
            return (ContendorRegistros) in.readObject();
        } catch (Exception e) {
            return new ContendorRegistros();
        }
    }

    private static int menu() {

        Arrays.asList("\nMenu",
                "1. Agregar registro",
                "2. Listar Registros",
                "3. Mostrar estadisticas",
                "4. Salir")
                .forEach(System.out::println);
        return EntradaTeclado.pedirEntero("-> ");
    }

    private static Registro crearRegistro() {
        System.out.println("\nCreando nuevo registro...");
        return new Registro(LocalTime.now(),
                EntradaTeclado.pedirDouble("Introduzca la temperatura: "));
    }

    private static void guardarRegistros(ContendorRegistros registros, String dia) {
        try (var out = new ObjectOutputStream(new FileOutputStream("registros" + dia + ".dat"))) {
            out.writeObject(registros);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) throws Exception {

        final var dia = EntradaTeclado.pedirCadena("Introduzca la fecha: ");
        var registros = cargarRegistros(dia);
        int opcion;

        do {
            switch ((opcion = menu())) {
                case 1 -> {
                    System.out.println(registros.add(crearRegistro())
                            ? "\nSe ha crear correctamente"
                            : "\nHa ocurrido un error");
                }
                case 2 -> {
                    registros.listar()
                            .forEach(System.out::println);
                }
                case 3 -> {
                    Arrays.asList("\nTemperatura maxima: " + registros.tempMaxima(),
                            "Temperatura minima: " + registros.tempMinima(),
                            "Promedio de Temperaturas: " + registros.promedio())
                            .forEach(System.out::println);
                }
                case 4 -> {
                    guardarRegistros(registros, dia);
                }
            }
        } while (opcion < 4);
    }
}
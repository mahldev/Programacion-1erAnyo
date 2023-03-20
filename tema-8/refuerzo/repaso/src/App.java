import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static boolean menuEliminar(Coleccion coleccion) {
        System.out.println("Introduzca el codigo del disco a eliminar ");
        System.out.print("-> ");
        int index = coleccion.busca(new Disco(sc.nextInt()));
        if (index == -1)
            return false;
        sc.nextLine();
        if (coleccion.eliminarDisco(index))
            return true;
        return false;
    }

    private static boolean menuEditar(Coleccion coleccion) {
        String[] nuevosDatos = new String[2];
        int index;

        System.out.println("Introduzca el codigo del disco a editar ");
        System.out.print("-> ");
        index = coleccion.busca(new Disco(sc.nextInt()));

        if (index == -1)
            return false;

        sc.nextLine();
        System.out.print("Introduzca el nuevo nombre\n-> ");
        nuevosDatos[0] = sc.nextLine();
        System.out.print("Introduzca la nueva duracion\n-> ");
        nuevosDatos[1] = sc.nextLine();
        Disco disco = coleccion.daDisco(index);
        disco.setNombre(nuevosDatos[0]);
        disco.setDuracion(Integer.parseInt(nuevosDatos[1]));
        return true;
    }

    private static boolean menuInsertar(Coleccion coleccion) {
        String[] discoStrings;
        discoStrings = pideDatos();
        if (coleccion.insertar(new Disco(
                discoStrings[0],
                Integer.parseInt(discoStrings[1]))))
            return true;
        return false;
    }

    private static void muestraDiscos(Disco[] nuevaColeccion) {

        for (int index = 0; index < nuevaColeccion.length; index++) {
            System.out.println(nuevaColeccion[index]);
        }
    }

    private static String[] pideDatos() {
        String[] datos = {

                "nombre",
                "duracion"
        };
        String[] discoStrings = new String[datos.length];

        sc.nextLine();
        for (int index = 0; index < datos.length; index++) {
            System.out.print("Introduzca " + datos[index] + ": ");
            discoStrings[index] = sc.nextLine();
        }
        return discoStrings;
    }

    private static int menu() {

        String[] options = {

                "Insertar",
                "Listar",
                "Editar",
                "Borrar",
                "Sair"
        };

        for (int index = 0; index < options.length; index++) {
            System.out.println((index + 1) + ". " + options[index]);
        }
        System.out.print("-> ");
        return sc.nextInt();
    }

    public static void main(String[] args) throws Exception {

        Coleccion coleccion = new Coleccion(10);
        boolean salir = false;

        while (!salir) {
            switch (menu()) {
                case 1 -> {
                    System.out.println("\nMenu Insertar\n---------------");
                    String salida = "\nNo se ha podido insertar el disco\n";
                    if (menuInsertar(coleccion))
                        salida = "\nSe ha insertado el disco\n";
                    System.out.println(salida);
                }
                case 2 -> {
                    System.out.println("\nColeccion\n---------------");
                    Disco[] nuevaColeccion = coleccion.copiaColeccion();
                    muestraDiscos(nuevaColeccion);
                }
                case 3 -> {
                    System.out.println("\nMenu Editar\n---------------");
                    String salida = "\nNo se ha podido editar el disco\n";
                    if (menuEditar(coleccion))
                        salida = "\nSe ha editado el disco\n";
                    System.out.println(salida);
                }
                case 4 -> {
                    System.out.println("\nMenu Eliminar\n---------------");
                    String salida = "\nNo se ha podido eliminar el disco\n";
                    if (menuEliminar(coleccion))
                        salida = "\nSe ha eliminado el disco\n";
                    System.out.println(salida);
                }
                default -> salir = true;
            }
        }
    }

}

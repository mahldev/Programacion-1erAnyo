import java.util.Scanner;

public class App {

    static Scanner sc;

    public static void main(String[] args) throws Exception {

        sc = new Scanner(System.in);
        Articulo[] inventario = new Articulo[0];
        String[] opciones = {
                "Listado",
                "Alta",
                "Baja",
                "Modificacion",
                "Entrada de mercancia",
                "Salida de mercancia",
                "Salir"
        };
        int aux = 0;
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenu Principal\n----------------------------");
            for (int index = 0; index < opciones.length; index++) {
                System.out.println((index + 1) + ". " + opciones[index]);
            }
            System.out.print("-> ");
            aux = sc.nextInt();
            switch (aux) {
                case 1 -> listado(inventario);
                case 2 -> inventario = alta(inventario);
                case 3 -> inventario = baja(inventario);
                case 4 -> modificacion(inventario);
                case 5 -> entradaMercancia(inventario);
                case 6 -> salidaMercancia(inventario);
                default -> salir = true;
            }
        }
    }

    private static void salidaMercancia(Articulo[] inventario) {

        int cantidad;
        int indexArticulo;

        System.out.println("\nSalida de Mercancia\n------------------------------");
        indexArticulo = buscaArticulo(inventario);
        if (indexArticulo != -1) {
            System.out.print(
                    "Cual es el decremento del stock del articulo " +
                            inventario[indexArticulo].getCodigoArticulo() + "\n-> ");
            cantidad = sc.nextInt();
            if (cantidad < 0) {
                cantidad = 0;
            }
            inventario[indexArticulo].decrementaStock(cantidad);
        }
    }

    private static void entradaMercancia(Articulo[] inventario) {

        int cantidad;
        int indexArticulo;

        System.out.println("\nEntrada de Mercancia\n------------------------------");
        indexArticulo = buscaArticulo(inventario);
        if (indexArticulo != -1) {
            System.out.print(
                    "Cual es el incremento del stock del articulo " +
                            inventario[indexArticulo].getCodigoArticulo() + "\n-> ");
            cantidad = sc.nextInt();
            if (cantidad < 0) {
                cantidad = 0;
            }
            inventario[indexArticulo].incrementaStock(cantidad);
        }

    }

    private static Articulo[] baja(Articulo[] inventario) {

        Articulo[] nuevoInventario = new Articulo[inventario.length - 1];

        int indexArticulo = -1;

        System.out.println("\nEliminando articulo\n------------------------------");
        indexArticulo = buscaArticulo(inventario);
        if (indexArticulo == -1) {
            System.out.println("El articulo no se encuentra");
            return inventario;
        }
        System.arraycopy(inventario, 0, nuevoInventario, 0, indexArticulo);
        System.arraycopy(inventario, indexArticulo + 1, nuevoInventario, indexArticulo,
                inventario.length - (indexArticulo + 1));
        return nuevoInventario;
    }

    private static int buscaArticulo(Articulo[] inventario) {

        int codigo;

        System.out.println("Introduzca el codigo del articulo");
        System.out.print("-> ");
        codigo = sc.nextInt();
        for (int index = 0; index < inventario.length; index++) {
            if (inventario[index].getCodigoArticulo() == codigo) {
                return index;
            }
        }
        return -1;
    }

    private static void modificacion(Articulo[] inventario) {

        int indexArticulo;
        int aux;
        boolean salir = false;
        String[] preguntas = {
                "Descripcion",
                "Precio de compra",
                "Salir"
        };

        indexArticulo = buscaArticulo(inventario);
        if (indexArticulo != -1) {
            salir = false;
            while (!salir) {
                System.out.println("\nModificando el articulo " + inventario[indexArticulo].getCodigoArticulo()
                        + "\n----------------------");
                System.out.println("Que desea cambiar");
                for (int index = 0; index < preguntas.length; index++) {
                    System.out.println((index + 1) + ". " + preguntas[index]);
                }
                System.out.print("-> ");
                aux = sc.nextInt();
                switch (aux) {
                    case 1 -> modificarDescripcion(inventario[indexArticulo]);
                    case 2 -> modificarPrecio(inventario[indexArticulo]);
                    default -> salir = true;
                }
            }
        } else {
            System.out.println("El articulo no se encuentra");
        }
    }

    private static void modificarPrecio(Articulo articulo) {

        System.out.print("Introduzca el nuevo precio de compra\n-> ");
        sc.nextLine();
        String tmp = sc.nextLine();
        articulo.setPrecioDeCompra(Double.parseDouble(tmp));
    }

    private static void modificarDescripcion(Articulo articulo) {

        System.out.print("Introduzca la nueva descripcion\n-> ");
        sc.nextLine();
        String tmp = sc.nextLine();
        articulo.setDescripcion(tmp);
    }

    private static Articulo[] alta(Articulo[] inventario) {

        Articulo[] nuevoInventario = new Articulo[inventario.length + 1];
        String[] alta = {
                "Descripcion",
                "Precio de compra",
                "Stock"
        };
        String[] datos = new String[3];
        System.out.println("\nAgregando nuevo articulo\n---------------------------");
        sc.nextLine();
        for (int index = 0; index < alta.length; index++) {
            System.out.print(alta[index] + ": ");
            datos[index] = sc.nextLine();
        }
        Articulo nuevoArticulo = new Articulo(
                datos[0],
                Double.parseDouble(datos[1]),
                Integer.parseInt(datos[2]));
        System.arraycopy(inventario, 0, nuevoInventario, 0, inventario.length);
        nuevoInventario[nuevoInventario.length - 1] = nuevoArticulo;
        return nuevoInventario;
    }

    private static void listado(Articulo[] inventario) {

        System.out.println("\nInventario");
        if (inventario.length == 0) {
            System.out.println("----------------------\nVACIO\n-------------------------");
        }
        for (Articulo articulo : inventario) {
            System.out.println(articulo.toString());
        }
    }

}

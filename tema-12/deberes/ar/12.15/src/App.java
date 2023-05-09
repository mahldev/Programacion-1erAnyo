import java.util.Arrays;

public class App {

    private static int menu() {
        Arrays.asList("\nMenu",
                "1. Agregar producto",
                "2. Dar baja producto",
                "3. Actualizar stock",
                "4. Salir")
                .forEach(System.out::println);
        return EntradaTeclado.pedirEntero("");
    }

    private static Producto crearProducto() {
        return new Producto(EntradaTeclado.pedirCadena("Introduzca el codigo: "),
                EntradaTeclado.pedirEntero("Introduzca el stock del producto: "));
    }

    public static void main(String[] args) throws Exception {

        Tienda tienda = new Tienda();
        Producto p;
        int opcion;

        do {
            switch ((opcion = menu())) {
                case 1 -> {
                    p = crearProducto();
                    System.out.println(tienda.alta(p.getCodigo(), p)
                            ? "Se ha agregado correctamente"
                            : "No se ha completado la operacion");
                }
                case 2 -> {
                    System.out.println(tienda.baja(EntradaTeclado.pedirCadena("Introduzca el codigo del articulo: "))
                            ? "Se ha eliminado correctamente"
                            : "No se ha completado la operacion");
                }
                case 3 -> {
                    System.out.println(
                            tienda.actualizarStock(EntradaTeclado.pedirCadena("Introduzca el codigo del producto: "),
                                    EntradaTeclado.pedirEntero("Introduzca el nuevo stock: "))
                                            ? "Se ha modificado correctamente"
                                            : "No se ha completado la operacion");
                }
            }
        } while (opcion < 3);
    }
}

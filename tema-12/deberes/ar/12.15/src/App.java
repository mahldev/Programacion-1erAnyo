import java.util.Arrays;

public class App {

    private static int menu() {
        Arrays.asList("\nMenu",
                "1. Agregar producto",
                "2. Dar baja producto",
                "3. Actualizar stock",
                "4. Salir")
                .forEach(System.out::println);
        return 0;
    }

    public static void main(String[] args) throws Exception {

        Tienda tienda = new Tienda();
        int opcion;

        switch ((opcion = menu())) {
            case 1 -> {

            }
        }
    }

}

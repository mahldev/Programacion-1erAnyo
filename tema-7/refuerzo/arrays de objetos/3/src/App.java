import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static Disco[] eliminaDisco(Disco[] coleccionDiscos, Scanner sc) {

        int[] resultadoBusqueda = new int[0];
        Disco[] res = new Disco[coleccionDiscos.length - 1];
        int eleccion = -1, tmp;

        if (res.length == 0) {
            return res;
        }
        resultadoBusqueda = busca(coleccionDiscos, sc, resultadoBusqueda);
        System.out.print("\nIntroduzca el numero del disco a eliminar \n-> ");
        tmp = sc.nextInt();
        System.out.println(Arrays.toString(resultadoBusqueda));
        if (tmp > 0 && tmp <= resultadoBusqueda.length && tmp != 0) {
            eleccion = tmp - 1;
        }
        if (eleccion != -1) {
            System.arraycopy(coleccionDiscos, 0, res, 0, eleccion);
            for (int index = eleccion; index < coleccionDiscos.length; index++) {
                res[res.length - 1] = coleccionDiscos[index];
            }
        }
        return res;
    }

    private static void modificaColeccion(Disco[] coleccionDiscos, Scanner sc) {

        int[] resultadoBusqueda = new int[0];
        int eleccion = -1, aux, tmp;
        boolean salir = false;

        sc.nextLine();
        resultadoBusqueda = busca(coleccionDiscos, sc, resultadoBusqueda);
        System.out.print("\nIntroduzca el numero del disco a modificar \n-> ");
        tmp = sc.nextInt();
        if (tmp > 0 && tmp <= resultadoBusqueda.length && tmp != 0) {
            eleccion = tmp - 1;
        }
        while (!salir) {
            if (eleccion < 0) {
                salir = true;
            } else {
                System.out.println("\nMenu de modificacion\n----------------------------");
                System.out.println("Que desaa modificar");
                System.out.println("1. Autor");
                System.out.println("2. Titulo");
                System.out.println("3. Genero");
                System.out.println("4. Duracion");
                System.out.print("5. Salir\n-> ");
                aux = sc.nextInt();
                sc.nextLine();
                switch (aux) {
                    case 1 -> modificarAutor(coleccionDiscos[resultadoBusqueda[eleccion]], sc);
                    case 2 -> modificarTitulo(coleccionDiscos[resultadoBusqueda[eleccion]], sc);
                    case 3 -> modificarGenero(coleccionDiscos[resultadoBusqueda[eleccion]], sc);
                    case 4 -> modificarDuracion(coleccionDiscos[resultadoBusqueda[eleccion]], sc);
                    case 5 -> salir = true;
                }
            }
        }
    }

    private static int[] busca(Disco[] coleccionDiscos, Scanner sc, int[] resultadoBusqueda) {
        sc.nextLine();
        String nombreABuscar;
        System.out.print("Introduzca el titulo del disco:");
        nombreABuscar = sc.nextLine();
        for (int index = 0; index < coleccionDiscos.length; index++) {
            if (coleccionDiscos[index].getTitulo().equals(nombreABuscar)) {
                resultadoBusqueda = agregaResultado(resultadoBusqueda, index);
            }
        }
        for (int index = 0; index < resultadoBusqueda.length; index++) {
            System.out.print((index + 1) + "." + coleccionDiscos[resultadoBusqueda[index]]);
        }
        return resultadoBusqueda;
    }

    private static void modificarDuracion(Disco disco, Scanner sc) {
        System.out.print("Introduzca la nueva duracion\n-> ");
        int tmp = sc.nextInt();
        disco.setDuracion(tmp);
    }

    private static void modificarGenero(Disco disco, Scanner sc) {
        System.out.print("Introduzca el nuevo genero\n-> ");
        String tmp = sc.nextLine();
        disco.setGenero(tmp);
    }

    private static void modificarTitulo(Disco disco, Scanner sc) {
        System.out.print("Introduzca el nuevo titulo\n-> ");
        String tmp = sc.nextLine();
        disco.setTitulo(tmp);
    }

    private static void modificarAutor(Disco disco, Scanner sc) {
        System.out.print("Introduzca el nuevo autor\n-> ");
        String tmp = sc.nextLine();
        disco.setAutor(tmp);
    }

    private static int[] agregaResultado(int[] resultadoBusqueda, int index) {
        int[] res = new int[resultadoBusqueda.length + 1];
        System.arraycopy(resultadoBusqueda, 0, res, 0, resultadoBusqueda.length);
        res[res.length - 1] = index;
        return res;
    }

    private static Disco[] insertaNuevoDisco(Disco[] coleccionDiscos, Scanner sc) {

        Disco[] nuevaColeccion = new Disco[coleccionDiscos.length + 1];
        String[] datos = new String[4];
        String[] preguntas = { "Intrduzca el autor: ",
                "Intrduzca el titulo: ",
                "Intrduzca el genero: ",
                "Intrduzca el duracion en minutos: "
        };
        int index = 0;
        sc.nextLine();
        while (index < datos.length) {
            System.out.print("" + preguntas[index]);
            datos[index++] = sc.nextLine();
        }
        Disco nuevoDisco = new Disco(datos[0],
                datos[1],
                datos[2],
                Integer.parseInt(datos[3]));
        System.arraycopy(coleccionDiscos, 0, nuevaColeccion, 0, coleccionDiscos.length);
        nuevaColeccion[nuevaColeccion.length - 1] = nuevoDisco;
        return nuevaColeccion;
    }

    private static void muestraColeccion(Disco[] coleccionDiscos) {

        for (Disco disco : coleccionDiscos) {
            System.out.println(disco.toString());
        }
    }

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Disco[] coleccionDiscos = new Disco[0];
        int aux;
        boolean salir = false;

        while (!salir) {

            System.out.println("\nMenu Principal\n-----------------------------------");
            System.out.println("Seleccione una opcion");
            System.out.println("1. Consultar");
            System.out.println("2. Insertar");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.print("5. Salir \n-> ");
            aux = sc.nextInt();
            switch (aux) {
                case 1 -> muestraColeccion(coleccionDiscos);
                case 2 -> coleccionDiscos = insertaNuevoDisco(coleccionDiscos, sc);
                case 3 -> modificaColeccion(coleccionDiscos, sc);
                case 4 -> coleccionDiscos = eliminaDisco(coleccionDiscos, sc);
                case 5 -> salir = true;
            }
        }
        sc.close();
    }
}

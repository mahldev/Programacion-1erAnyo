import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        boolean salir = false, salir2 = false, vacio;
        Almacen almacen = new Almacen(5);
        Articulo[] aux;
        Articulo auxArticulo;
        String[] datos;
        String auxString;
        int auxInt, tmp;

        String[] menu = {
                "Listado",
                "Alta",
                "Baja",
                "Modificacion",
                "Entrada de mercancia",
                "Salida de mercancia",
                "Salir"
        };

        while (!salir) {
            System.out.println("\nGestimal\n\nMenu Principal\n------------------------------");
            for (int index = 0; index < menu.length; index++) {
                System.out.println((index + 1) + ". " + menu[index]);
            }
            System.out.print("-> ");
            switch (sc.nextInt()) {
                case 1 -> {
                    aux = almacen.listado();
                    vacio = true;
                    System.out.print("\nInventario\n----------------------");
                    for (int index = 0; index < aux.length; index++) {
                        if (aux[index] != null) {
                            System.out.println(aux[index]);
                            vacio = false;
                        }
                    }
                    if (vacio) {
                        System.out.println("\nVACIO\n");
                    }
                }
                case 2 -> {
                    datos = new String[3];
                    String[] parametros = {
                            "la descripcion",
                            "el precio de compra",
                            "el stock",
                    };
                    sc.nextLine();
                    System.out.println("\nMenu Alta\n---------------------------");
                    for (int index = 0; index < datos.length; index++) {
                        System.out.println("Introduzca " + parametros[index] + " del articulo");
                        System.out.print("-> ");
                        datos[index] = sc.nextLine();
                    }
                    if (almacen.darAltaArticulo(
                            new Articulo(
                                    datos[0],
                                    Double.parseDouble(datos[1]),
                                    Integer.parseInt(datos[2])))) {
                        System.out.println("Alta realizada");
                    } else {
                        System.out.println("No se ha podido realizar el alta");
                    }
                }
                case 3 -> {
                    System.out.println("\nMenu Baja\n---------------------------------");
                    System.out.print("Introduzca el codigo del Articulo\n -> ");
                    tmp = sc.nextInt();
                    if (almacen.darBajaArticulo(new Articulo(tmp))) {
                        System.out.println("Se ha borrado correctamente\n");
                    } else {
                        System.out.println("No se se ha borrado correctamente\n");
                    }
                }
                case 4 -> {
                    System.out.println("\nMenu Modificacion\n---------------------------");
                    System.out.print("Introduzca el codigo del Articulo\n -> ");
                    tmp = sc.nextInt();
                    auxArticulo = new Articulo(tmp);
                    auxArticulo = almacen.modificarArticulo(auxArticulo);
                    if (auxArticulo.getCodigoArticulo() != 0) {
                        salir2 = false;
                        while (!salir2) {
                            System.out.println(auxArticulo);
                            System.out.println("Que desea modificar");
                            System.out.println("1. La descripcion");
                            System.out.println("2. El precio de venta");
                            System.out.println("3. Salir");
                            System.out.print("-> ");
                            switch (sc.nextInt()) {
                                case 1 -> {
                                    System.out.print("Introduzca la nueva descripcion\n-> ");
                                    sc.nextLine();
                                    auxString = sc.nextLine();
                                    auxArticulo.setDescripcion(auxString);
                                }
                                case 2 -> {
                                    System.out.print("Introduzca el nuevo precio de venta\n-> ");
                                    sc.nextLine();
                                    auxString = sc.nextLine();
                                    auxArticulo.setPrecioDeCompra(Double.parseDouble(auxString));
                                }
                                default -> salir2 = true;
                            }
                        }
                    } else {
                        System.out.println("El codigo introducido es incorrecto o no se encuentra");
                    }
                }
                case 5 -> {
                    System.out.println("\nMenu Entrada de Mercancia\n---------------------------");
                    System.out.print("Introduzca el codigo del Articulo\n -> ");
                    tmp = sc.nextInt();
                    auxArticulo = new Articulo(tmp);
                    auxArticulo = almacen.modificarArticulo(auxArticulo);
                    if (auxArticulo.getCodigoArticulo() != 0) {
                        System.out.print("Introduzca el incremento de la mercancia\n -> ");
                        auxInt = sc.nextInt();
                        auxArticulo.incrementaStock(auxInt);
                        System.out.println("\nSe ha realizado en el incremento de la mercancia");
                    } else {
                        System.out.println("\nEl codigo introducido es incorrecto o no se encuentra");
                    }
                }
                case 6 -> {
                    System.out.println("\nMenu Entrada de Mercancia\n---------------------------");
                    System.out.print("Introduzca el codigo del Articulo\n -> ");
                    tmp = sc.nextInt();
                    auxArticulo = new Articulo(tmp);
                    auxArticulo = almacen.modificarArticulo(auxArticulo);
                    if (auxArticulo.getCodigoArticulo() != 0) {
                        System.out.print("Introduzca el decremento de la mercancia\n -> ");
                        auxInt = sc.nextInt();
                        if (auxArticulo.decrementaStock(auxInt)) {
                            System.out.println("\nSe ha realizado el decremento de la mercancia");
                        } else {
                            System.out.println("\nNo se ha realizado el decremento de la mercancia");
                        }
                    } else {
                        System.out.println("\nEl codigo introducido es incorrecto o no se encuentra");
                    }
                }
                default -> salir = true;
            }
        }
    }
}

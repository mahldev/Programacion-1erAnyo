import java.util.Scanner;

public class App {

    static Scanner s;

    public static void main(String[] args) throws Exception {

        s = new Scanner(System.in);
        // N determina el tamaño del array
        final int N = 5;

        // Crea el array de discos
        Disco[] discos = new Disco[N];
        Disco.cantidadDeDiscos(N);
        // Crea todos los discos que van en cada una de las celdas del array
        for (int i = 0; i < N; i++) {
            discos[i] = new Disco();
        }

        // Carga varios discos
        discos[0] = new Disco(
                "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50);
        discos[1] = new Disco(
                "FGHQ64", "Metallica", "Black album", "hard rock", 46);
        discos[2] = new Disco(
                "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42);

        int opcion;
        String codigoIntroducido;
        String autorIntroducido;
        String tituloIntroducido;
        String generoIntroducido;
        int duracionIntroducida;

        do {

            System.out.println("\nCOLECCIÓN DE DISCOS");
            System.out.println("===================");
            System.out.println("1. Listado");
            System.out.println("2. Nuevo disco");
            System.out.println("3. Modificar");
            System.out.println("4. Borrar");
            System.out.println("5. Salir");
            System.out.print("Introduzca una opción: ");
            opcion = Integer.parseInt(s.nextLine());

            switch (opcion) {
                case 1:
                    String[] menu = {
                            "Listado Completo",
                            "Listado por autor",
                            "Listado por género",
                            "Listado por duración",
                            "Salir"
                    };
                    int aux;

                    System.out.println("\nLISTADO");
                    System.out.println("=======");
                    for (int index = 0; index < menu.length; index++) {
                        System.out.println((index + 1) + ". " + menu[index]);
                    }
                    System.out.print("-> ");
                    aux = s.nextInt();
                    switch (aux) {
                        case 1 -> {
                            for (Disco d : discos) {
                                if (!d.getCodigo().equals("LIBRE")) {
                                    System.out.println(d);
                                }
                            }
                        }
                        case 2 -> {
                            String nombre;
                            System.out.print("Introduzca el nombre del autor\n-> ");
                            s.nextLine();
                            nombre = s.nextLine();
                            for (Disco disco : discos) {
                                if (!disco.getCodigo().equals("LIBRE") &&
                                        disco.getAutor().equals(nombre)) {
                                    System.out.println(disco);
                                }
                            }
                        }
                        case 3 -> {
                            String genero;
                            System.out.print("Introduzca el nombre del género \n-> ");
                            s.nextLine();
                            genero = s.nextLine();
                            for (Disco disco : discos) {
                                if (!disco.getCodigo().equals("LIBRE") &&
                                        disco.getGenero().equals(genero)) {
                                    System.out.println(disco);
                                }
                            }
                        }
                        case 4 -> {
                            String duracion;
                            int numero;
                            boolean repetir, encontrado = false;

                            do {
                                repetir = false;
                                System.out.print("Introduzca el rango de duración (help)\n-> ");
                                s.nextLine();
                                duracion = s.nextLine();
                                if (duracion.equals("help")) {
                                    repetir = true;
                                    System.out.println("Tipos de consultas");
                                    System.out.println("simbolo + cantidad");
                                    System.out.println("Ejemplos \n> 10, < 10, = 10");
                                }
                                numero = Integer.parseInt(duracion.substring(2, duracion.length()));
                                System.out.println("\nResutlado\n---------------------");
                                if (duracion.substring(0, 1).equals(">")) {
                                    for (Disco disco : discos) {
                                        if (!disco.getCodigo().equals("LIBRE") &&
                                                disco.getDuracion() > numero) {
                                            System.out.println(disco);
                                            encontrado = true;
                                        }
                                    }
                                } else if (duracion.substring(0, 1).equals("<")) {
                                    for (Disco disco : discos) {
                                        if (!disco.getCodigo().equals("LIBRE") &&
                                                disco.getDuracion() < numero) {
                                            System.out.println(disco);
                                            encontrado = true;
                                        }
                                    }
                                } else if (duracion.substring(0, 1).equals("=")) {
                                    for (Disco disco : discos) {
                                        if (!disco.getCodigo().equals("LIBRE") &&
                                                disco.getDuracion() == numero) {
                                            System.out.println(disco);
                                            encontrado = true;
                                        }
                                    }
                                }
                            } while (repetir);
                            if (!encontrado) {
                                System.out.println("No se han encontado ocurrencias");
                            }
                        }
                        default -> s.nextLine();
                    }
                    break;
                case 2:
                    boolean lleno = false;

                    System.out.println("\nNUEVO DISCO");
                    System.out.println("===========");

                    // Busca la primera posición libre del array
                    int primeraLibre = -1;
                    do {
                        primeraLibre++;
                        if (primeraLibre == discos.length) {
                            System.out.println("Limite de espacio alcanzado, borre un disco.");
                            lleno = true;
                        }
                    } while (!lleno && !((discos[primeraLibre].getCodigo()).equals("LIBRE")));

                    if (!lleno) {
                        System.out.println("Por favor, introduzca los datos del disco.");
                        System.out.print("Código: ");
                        codigoIntroducido = s.nextLine();
                        System.out.print("Autor: ");
                        autorIntroducido = s.nextLine();
                        System.out.print("Título: ");
                        tituloIntroducido = s.nextLine();
                        System.out.print("Género: ");
                        generoIntroducido = s.nextLine();
                        System.out.print("Duración: ");
                        duracionIntroducida = Integer.parseInt(s.nextLine());
                        if (Disco.estaDisponible(codigoIntroducido)) {
                            discos[primeraLibre] = new Disco(
                                    codigoIntroducido, autorIntroducido, tituloIntroducido, generoIntroducido,
                                    duracionIntroducida);
                        } else {
                            System.out.println("Ese codigo ya ha sido introducido");
                        }
                    }
                    break;

                case 3:
                    System.out.println("\nMODIFICAR");
                    System.out.println("===========");

                    System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
                    codigoIntroducido = s.nextLine();

                    int i = -1;
                    do {
                        i++;
                    } while (!((discos[i].getCodigo()).equals(codigoIntroducido)));

                    System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

                    System.out.println("Código: " + discos[i].getCodigo());
                    System.out.print("Nuevo código: ");
                    codigoIntroducido = s.nextLine();
                    if (!codigoIntroducido.equals("")) {
                        discos[i].setCodigo(codigoIntroducido);
                    }

                    System.out.println("Autor: " + discos[i].getAutor());
                    System.out.print("Nuevo autor: ");
                    autorIntroducido = s.nextLine();
                    if (!autorIntroducido.equals("")) {
                        discos[i].setAutor(autorIntroducido);
                    }

                    System.out.println("Título: " + discos[i].getTitulo());
                    System.out.print("Nuevo título: ");
                    tituloIntroducido = s.nextLine();
                    if (!tituloIntroducido.equals("")) {
                        discos[i].setTitulo(tituloIntroducido);
                    }

                    System.out.println("Género: " + discos[i].getGenero());
                    System.out.print("Nuevo género: ");
                    generoIntroducido = s.nextLine();
                    if (!generoIntroducido.equals("")) {
                        discos[i].setGenero(generoIntroducido);
                    }

                    System.out.println("Duración: " + discos[i].getDuracion());
                    System.out.print("Duración: ");
                    final String duracionIntroducidaString = s.nextLine();
                    if (!duracionIntroducidaString.equals("")) {
                        discos[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
                    }

                    break;

                case 4:
                    System.out.println("\nBORRAR");
                    System.out.println("======");

                    System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
                    codigoIntroducido = s.nextLine();

                    i = -1;
                    do {
                        i++;
                    } while (!(discos[i].getCodigo()).equals("LIBRE")
                            && !((discos[i].getCodigo()).equals(codigoIntroducido)));
                    if (!discos[i].getCodigo().equals("LIBRE")) {
                        discos[i].setCodigo("LIBRE");
                        System.out.println("Album borrado.");
                    } else {
                        System.out.println("El codigo introducido no existe.");
                    }
                    break;

                default:

            } // switch
        } while (opcion != 5);
    }
}

import java.util.Scanner;

public class Ap_14 {

    public static void main(String[] args) {

        int opcion = 0;
        boolean salir = true;
        String[] agenda = new String[0];

        while (salir) {

            opcion = muestraMenu();
            if (opcion == 1) {
                agenda = pideYAgregaContacto(agenda);
            } else if (opcion == 2) {
                buscaContacto();
            } else if (opcion == 3) {
                mostrarAgenda(agenda);
            } else {
                salir = false;
            }
        }
    }

    private static void mostrarAgenda(String[] agenda) {

        String[] contacto = new String[3];

        System.out.println();

        for (int indice = 0; indice < agenda.length; indice++) {

            contacto = decodifica(agenda[indice]);
            System.out.print((indice + 1) + " Nombre: " + contacto[1]);
            System.out.print(" | telefono: " + contacto[2]);
            System.out.println();
        }
    }

    private static String[] decodifica(String string) {

        String[] res = new String[3];
        res = string.split(":");
        return res;
    }

    private static void buscaContacto() {
    }

    private static String[] pideYAgregaContacto(String[] agenda) {

        Scanner sc = new Scanner(System.in);

        boolean haTerminado = false;
        String contacto, nombre, numero;
        char aux;

        while (!haTerminado) {

            System.out.print("Introduzca el nombre del contacto: ");
            nombre = sc.next();

            System.out.print("Introduzca el numero del contacto: ");
            numero = sc.next();
            contacto = nombre.charAt(0) + ":" + nombre + ":" + numero;
            agenda = agregaContacto(agenda, contacto);

            System.out.print("Quiere introducir otro contacto? (s/n): ");
            aux = sc.next().charAt(0);
            if (aux == 'n') {
                haTerminado = true;
            }
        }
        return agenda;
    }

    private static String[] agregaContacto(String[] agenda, String contacto) {

        String[] nuevaAgenda = new String[agenda.length + 1];

        System.arraycopy(agenda, 0, nuevaAgenda, 0, agenda.length);
        nuevaAgenda[nuevaAgenda.length - 1] = contacto;
        return nuevaAgenda;
    }

    private static int muestraMenu() {

        Scanner sc = new Scanner(System.in);
        int res;

        System.out.println("Que opcion quiere realizar");
        System.out.println("(0) Salir");
        System.out.println("(1) Añadir nuevo contacto ");
        System.out.println("(2) Buscar el telefono en la agenda");
        System.out.println("(3) Mostrar agenda");
        System.out.print("(0-3): ");
        res = sc.nextInt();
        return res;
    }
}

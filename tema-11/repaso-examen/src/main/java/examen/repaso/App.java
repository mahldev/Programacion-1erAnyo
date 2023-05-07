package examen.repaso;

import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] menu = {
                "Alta cliente",
                "Baja cliente",
                "Listar clientes",
                "Salir"
        };

        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }
        return sc.nextInt();
    }

    public static void main(String[] args) {

        int opcion;
        do {
            switch (opcion = menu()) {
                case 1 -> {

                }
            }
        } while (opcion < 4);
    }
}

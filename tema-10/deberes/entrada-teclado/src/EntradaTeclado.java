import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTeclado {

    private static Scanner sc;

    public static int pideEntero(String msj) {

        sc = new Scanner(System.in);
        int num = 0;
        boolean error;

        do {
            try {
                error = false;
                System.out.print(msj);
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                error = true;
            } finally {
                sc.nextLine();
            }
        } while (error);

        return num;
    }

    public static long pideLong(String msj) {

        sc = new Scanner(System.in);
        long num = 0;
        boolean error;

        do {
            try {
                error = false;
                System.out.print(msj);
                num = sc.nextLong();
            } catch (InputMismatchException e) {
                error = true;
            } finally {
                sc.nextLine();
            }
        } while (error);

        return num;
    }

    public static double pideDouble(String msj) {

        sc = new Scanner(System.in);
        double num = 0;
        boolean error;

        do {
            try {
                error = false;
                System.out.print(msj);
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                error = true;
            } finally {
                sc.nextLine();
            }
        } while (error);

        return num;
    }

    public static char pideChar(String msj) {

        sc = new Scanner(System.in);
        char character = 0;

        System.out.print(msj);
        character = sc.nextLine().charAt(0);

        return character;
    }

    public static String pideString(String msj) {

        sc = new Scanner(System.in);
        String cadena = "";

        System.out.print(msj);
        cadena = sc.nextLine();

        return cadena;
    }
}

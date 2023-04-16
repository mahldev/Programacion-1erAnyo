package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad211 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int numeroIntroducido = sc.nextInt();
        if (numeroIntroducido < 0 || numeroIntroducido > 10000) {
            System.out.println("Formato invalido");
        } else if (numeroIntroducido > 1000 && numeroIntroducido < 9999) {
            int divi = numeroIntroducido / 10;
            int resto = numeroIntroducido % 10;
            int digito1 = resto * 1000;
            resto = divi % 10;
            int digito2 = resto * 100;
            divi /= 10;
            resto = divi % 10;
            int digito3 = resto * 10;
            divi /= 10;
            resto = divi % 10;
            int digito4 = resto;
            if (numeroIntroducido == digito1 + digito2 + digito3 + digito4) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        } else if (numeroIntroducido > 100 && numeroIntroducido < 999) {
            int divi = numeroIntroducido / 10;
            int resto = numeroIntroducido % 10;
            int digito1 = resto * 100;
            resto = divi % 10;
            int digito2  = resto * 10;
            divi /= 10;
            resto = divi % 10;
            int digito3 = resto;
            if (numeroIntroducido == digito1 + digito2 + digito3) {
                System.out.println("El numero es capicua");
            } else {
                System.out.println("El numero no es capicua");
            }
        } else {
            switch (numeroIntroducido) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88,
                        99 ->
                    System.out.println("Es capicua");
                default ->
                    System.out.println("El numero no es capicua");
            }
        }
    }
}

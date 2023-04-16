package DeberesTema2;

import java.util.Scanner;

public class Ejercicio212b {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dia: ");
        int dias = sc.nextInt();
        System.out.print("Introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduzca el año: ");
        int año = sc.nextInt();
        if (dias <= 0 || dias > 31 || mes <= 0 || mes > 12 || año == 0) {
            System.out.println("El formato no es valido");
        } else if (mes == 2 && dias > 28 
                || mes == 4 && dias > 30
                || mes == 6 && dias > 30
                || mes == 9 && dias > 30
                || mes == 11 && dias > 30) {
            System.out.println("La fecha es correcta: "
                    + dias + " / " + mes + " / " + año);
        }

    }
}

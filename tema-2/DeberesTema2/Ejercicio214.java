package DeberesTema2;

import java.util.Scanner;

public class Ejercicio214 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el dia: ");
        int dias = sc.nextInt();
        System.out.print("Introduzca el mes: ");
        int mes = sc.nextInt();
        System.out.print("Introduzca el año: ");
        int año = sc.nextInt();
        if (dias <= 0 || dias > 31 || mes <= 0 || mes > 12 || año == 0)
        {
            System.out.println("El formato no es valido");
        }
        int diasM = switch (mes)
        {
            case 2 ->
                28;
            case 4, 6, 9, 11 ->
                30;
            default ->
                31;
        };
        dias++;
        if (dias > diasM)
        {
            mes++;
            dias = 1;
            if (mes > 12)
            {
                año++;
                mes = 1;
            }
        }
        System.out.println(dias+" / "+mes+" / "+año);
    }
}



package DeberesTema2;

import java.util.Scanner;

public class Ejercicio212 {

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
        } else if ((mes == 2 && dias > 28))
        {
            System.out.println("Dia no valido, febrero solo tiene 28 dias");
        } else if (mes == 4 && dias > 30)
        {
            System.out.println("Dia no valido, abril solo tiene 30 dias");
        } else if (mes == 6 && dias > 30)
        {
            System.out.println("Dia no valido, junio solo tiene 30 dias");
        } else if (mes == 9 && dias > 30)
        {
            System.out.println("Dia no valido, septiembre solo tiene 30 dias");
        } else if (mes == 11 && dias > 30)
        {
            System.out.println("Dia no valido, noviembre solo tiene 30 dias");
        } else
        {
            System.out.println("La fecha es correcta: "
                    + dias + " / " + mes + " / " + año);

        }

    }
}

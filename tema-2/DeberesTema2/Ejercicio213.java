package DeberesTema2;

import java.util.Scanner;

public class Ejercicio213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduzca la min: ");
        int min = sc.nextInt();
        System.out.print("Introduzca la seg: ");
        int seg = sc.nextInt();
        System.out.print("Introduzca los segegundos ha añadir: ");

        int segAnadidos = sc.nextInt();

        if (seg + segAnadidos > 59) {

            min += segAnadidos / 60;
            seg += segAnadidos % 60;

            if (min > 59) {

                hora += min % 60;
                min = 0;
                
            }

        }

        hora = hora % 24;
        System.out.println("[" + hora + ":" + min + ":" + seg + "]");
    }

}

package refuerzo_T2_22;

/*Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
a las 15:00h. */

import java.util.Scanner;

public class refuerzo_T2_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un dia de la semana: ");
        String diaDeSemana = sc.next();
        System.out.print("Introduzca la hora: ");
        int hora = sc.nextInt();
        System.out.print("Introduzca los minutos: ");
        int minutos = sc.nextInt();
        int diaDeSemanaNum = 0;
        if (minutos > 60) {
            System.out.println("Los minutos no pueden ser mayor que 60");
        } else {
            switch (diaDeSemana) {
                case "lunes" -> diaDeSemanaNum = 1;
                case "martes" -> diaDeSemanaNum = 2;
                case "miercoles" -> diaDeSemanaNum = 3;
                case "jueves" -> diaDeSemanaNum = 4;
                case "viernes" -> diaDeSemanaNum = 5;
                default -> System.out.println("Formato incorrecto");
            }
        }
        if (diaDeSemanaNum != 0) {
            int cuantosDiasFaltan = (diaDeSemanaNum - 5) * -1;
            cuantosDiasFaltan *= 1440;
            cuantosDiasFaltan += 900;
            hora *= 60;
            int cuantosMinQuedan = cuantosDiasFaltan - hora - minutos;
            System.out.println("Para las 15:00 del viernes quedan: " + 
                    cuantosMinQuedan + " minutos");
        }
    }

}

package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad219 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca los grados a transformar: ");
        double gradosIntroducidos = sc.nextDouble();
        double radianesObtenidos;
        if (gradosIntroducidos > 360) {
            radianesObtenidos = ((gradosIntroducidos % 360) * Math.PI) / 180;
        } else {
            radianesObtenidos = (gradosIntroducidos * Math.PI) / 180;
        }
        System.out.println("El angulo en radianes es: " + radianesObtenidos);
    }
}
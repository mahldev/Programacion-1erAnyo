package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Intoduzca la base del triangulo (cm) ");
        double base = sc.nextDouble();
        System.out.print("Introduzca la altura del triangulo (cm): ");
        double altura = sc.nextDouble();
        if (base < 0 || altura < 0) {
            System.out.println("La base o la altura del triangulo introducidas son negativas");
        } else {
            double area = (base * altura) / 2;
            System.out.println("El area del triangulo es " + area + " cm^3");
        }
    }
}

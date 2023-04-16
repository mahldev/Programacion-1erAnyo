package DeberesTema2;

import java.util.Scanner;

public class Ejecicios208 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca a: ");
        double a = sc.nextDouble();
        System.out.print("Introduzca b: ");
        double b = sc.nextDouble();
        System.out.print("Introduzca c: ");
        double c = sc.nextDouble();
        double raiz = (b * b) - 4 * a * c;
        if (raiz > 0) {
            double x1 = (-b - (Math.sqrt(raiz))) / 2 * a;
            double x2 = (-b + (Math.sqrt(raiz))) / 2 * a;
            System.out.println("x1 = " + x1 + " x2 = " + x2);
        } else if (raiz == 0) {
            double x = (-b) / (2 * a);
            System.out.println("La solucion es: " + x);
        } else if (raiz < 0) {
            System.out.println("Esta ecuacion no tiene solucion real. ");
        }

    }
}

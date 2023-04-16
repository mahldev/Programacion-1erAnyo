package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad217 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = (int) (Math.random() * 99);
        int num2 = (int) (Math.random() * 99);
        System.out.println("El pimer numero es " + num1);
        System.out.println("El segundo numero es " + num2);
        System.out.print("Introduzca a continuacion el resultado"
                + " de la suma de numero 1 y numero 2: ");
        int sumaIntroducida = sc.nextInt();
        if (sumaIntroducida == (num1+num2)) {
            System.out.println("El resultado es correcto");
        } else {
            System.out.println("El resultado es incorrecto");
        }
    }
}

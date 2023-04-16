package DeberesTema2;

import java.util.Scanner;

public class Ejercicio205 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el aforo maximo del local: ");
        int aforoMax = sc.nextInt();
        System.out.print("Introduzca el numero de entrdas vendidas: ");
        int numEntradasVendidas = sc.nextInt();
        System.out.print("Introduzca el precio de las entradas: ");
        double precioEntrada = sc.nextDouble();
        if (numEntradasVendidas < aforoMax * 0.2) {
            System.out.println("Se cancela el concierto por no superar"
                    + " el 20% de aforo maximo.");
        } else if (numEntradasVendidas < aforoMax * 0.5) {
            precioEntrada *= 0.75;
            numEntradasVendidas *= precioEntrada;
            System.out.println("El dinero recaudado con un 25% de descuento "
                    + " es: " + numEntradasVendidas);
        } else {
            numEntradasVendidas *= precioEntrada;
            System.out.println("El dinero recaudado es: " + numEntradasVendidas +" € ");
        }
    }
}

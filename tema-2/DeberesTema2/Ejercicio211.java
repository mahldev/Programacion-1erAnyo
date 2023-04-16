package DeberesTema2;

import java.util.Scanner;

public class Ejercicio211 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero del 1-7: ");
        int diaSemana = sc.nextInt();
        switch (diaSemana) {
            case 1 ->
                System.out.println("Lunes");
            case 2 ->
                System.out.println("Martes");
            case 3 ->
                System.out.println("Miercoles");
            case 4 ->
                System.out.println("Jueves");
            case 5 ->
                System.out.println("Viernes");
            case 6 ->
                System.out.println("Sabado");
            case 7 ->
                System.out.println("Domingo");
            default ->
                System.out.println("Numero no valido");
        }
    }
}

package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad212 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numeo del DNI: ");
        int numDNI = sc.nextInt();
        char letraDNI = 0;
        if (numDNI > 99999999 || numDNI < 9999999) {
            System.out.println("Formato invalido");
        } else {
            switch (numDNI % 23) {
                case 0 -> letraDNI = 'T';
                case 1 -> letraDNI = 'R';
                case 2 -> letraDNI = 'W';
                case 3 -> letraDNI = 'A';
                case 4 -> letraDNI = 'G';
                case 5 -> letraDNI = 'M';
                case 6 -> letraDNI = 'Y';
                case 7 -> letraDNI = 'F';
                case 8 -> letraDNI = 'P';
                case 9 -> letraDNI = 'D';
                case 10 -> letraDNI = 'X';
                case 11 -> letraDNI = 'B';
                case 12 -> letraDNI = 'N';
                case 13 -> letraDNI = 'J';
                case 14 -> letraDNI = 'Z';
                case 15 -> letraDNI = 'S';
                case 16 -> letraDNI = 'Q';
                case 17 -> letraDNI = 'V';
                case 18 -> letraDNI = 'H';
                case 19 -> letraDNI = 'L';
                case 20 -> letraDNI = 'C';
                case 21 -> letraDNI = 'K';
                case 22 -> letraDNI = 'E';
            } 
            System.out.println("La letra del DNI es: "+letraDNI);
        }


    }
}

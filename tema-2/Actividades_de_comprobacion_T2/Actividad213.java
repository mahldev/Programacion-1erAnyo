package Actividades_de_comprobacion_T2;

import java.util.Scanner;

public class Actividad213 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la comida diaria: ");
        double comidaDiaria = sc.nextDouble();
        System.out.print("Introduzca el numero de animales: ");
        double numAnimales = sc.nextDouble();
        System.out.print("Introduzca los kilos que come cada animal: ");
        double kilosPorAnimal = sc.nextDouble();
        if (comidaDiaria >= (numAnimales * kilosPorAnimal) && numAnimales != 0) {
            System.out.println("Disponemos de comida suficiente para alimentar"
                    + "a los animales");
        } else if (numAnimales > 0){
            double comidaPorAnimalNecesaria = comidaDiaria / numAnimales;
            System.out.println("Para disponer de comida suficiente para"
                    + " los animales cada animal comera " + comidaPorAnimalNecesaria);
        } else {
            System.out.println("No hay animales en la granaja");
        } 
    }

}

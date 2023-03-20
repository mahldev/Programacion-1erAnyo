
package examen;

import java.io.IOException;

public class Principal {

    public static int menu() {

        int opcion = 0;

        do {
            System.out.println("\n1- Mostrar los Ejercitos"
                    + "\n2 - Atacar al Ejercito 1"
                    + "\n3 - Atacar al Ejercito 2"
                    + "\n0 - Salir");
            opcion = Entrada.pedirEntero("Escriba su opcion");
        } while ((opcion < 0) || (opcion > 3));

        return opcion;
    }

    public static void main(String[] args) throws IOException {

        Ejercito ejercito1 = new Ejercito();
        Ejercito ejercito2 = new Ejercito();
        boolean salir = false;

        while (!salir) {
            switch (menu()) {
                case 1 -> {
                    Personaje[] tmp1 = ejercito1.daCopia();
                    Personaje[] tmp2 = ejercito2.daCopia();
                    System.out.println("\nEjercito 1");
                    muestraEjercito(tmp1);
                    System.out.println("\n\nEjercito 2");
                    muestraEjercito(tmp2);
                }
                case 2 -> {
                    salir = AtacaEjercito(ejercito1);
                }
                case 3 -> {
                    salir = AtacaEjercito(ejercito2);
                }
                default -> salir = true;
            }
        }
    }

    private static boolean AtacaEjercito(Ejercito ejercito) {
        int tmp = numeroRandom(0, 11);

        System.out.println("\nLa potencia del ataque es de " + tmp);
        if (!ejercito.recibeAtaque(tmp))
            System.out.println("\nEl ataque ha fallado");
        if (ejercito.haSidoDerrotado()) {
            System.out.println("El ejercito ha sido derrotado");
            System.out.println(ejercito);
            return true;
        }
        System.out.println(ejercito);
        return false;
    }

    private static void muestraEjercito(Personaje[] tmp1) {

        for (Personaje personaje : tmp1) {
            System.out.println(personaje);
        }
    }

    private static int numeroRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}

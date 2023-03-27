
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
        }while ((opcion < 0) || (opcion > 3));

        return opcion;
    }

    public static void main(String[] args) throws IOException {

        
        
    }

}

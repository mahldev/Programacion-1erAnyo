
/*
Queremos gestionar la venta de entradas (no numeradas) de Expocoches

Campanillas que tiene 3 zonas, la sala principal con 1000 entradas dispo-
nibles, la zona de compra-venta con 200 entradas disponibles y la zona vip

con 25 entradas disponibles. Hay que controlar que existen entradas antes de
venderlas.
El menú del programa debe ser el que se muestra a continuación. Cuando
elegimos la opción 2, se nos debe preguntar para qué zona queremos las
entradas y cuántas queremos. Lógicamente, el programa debe controlar que
no se puedan vender más entradas de la cuenta.

1. Mostrar número de entradas libres
2. Vender entradas
3. Salir
*/
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Zona zonaSalaPrincipal = new Zona(1000);
        Zona zonaCompraVenta = new Zona(200);
        Zona zonaVip = new Zona(25);
        Zona[] zonas = { zonaSalaPrincipal, zonaCompraVenta, zonaVip };
        boolean salir = false;
        int aux = 0;

        while (!salir && entradasDisponibles(zonas) > 0) {
            System.out.println("1. Mostrar número de entradas libres");
            System.out.println("2. Comprar entradas");
            System.out.print("3. Salir \n-> ");
            aux = sc.nextInt();
            switch (aux) {
                case 1 -> muestraEntradasLibres(zonas);
                case 2 -> vendeEntradas(zonas);
                case 3 -> salir = true;
            }
        }
        if (!salir) {
            System.out.println("Se han acabdo las entradas");
        }
    }

    private static int entradasDisponibles(Zona[] zonas) {

        int res = 0;
        for (int index = 0; index < zonas.length; index++) {
            res += zonas[index].getEntradasPorVender();
        }
        return res;
    }

    private static void vendeEntradas(Zona[] zonas) {

        Scanner sc = new Scanner(System.in);
        String[] nombres = { "sala principal", "compra-venta", "VIP" };
        int aux, cantidad;

        System.out.println("Seleccione la zona");
        for (int index = 0; index < nombres.length; index++) {
            System.out.println((index + 1) + ". " + "Zona " + nombres[index]);
        }
        System.out.print("-> ");
        aux = sc.nextInt() - 1;
        System.out.print("\nIntroduzca la cantidad que desea comprar \n-> ");
        cantidad = sc.nextInt();
        zonas[aux].vender(cantidad);
    }

    private static void muestraEntradasLibres(Zona[] zonas) {

        String[] nombres = { "sala principal", "compra-venta", "VIP" };

        System.out.println("La cantidad de entradas disponibles es ");
        for (int index = 0; index < zonas.length; index++) {
            System.out.println("Zona " + nombres[index] + " -> " + zonas[index].getEntradasPorVender());
        }
    }

}

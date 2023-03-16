package grupID;

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
        Zona ZonaSalaPrincipal = new Zona(1000);
        Zona ZonaCompraVenta = new Zona(200);
        Zona ZonaVip = new Zona(25);
        int eleccion = 0;

        System.out.println("1. Mostrar número de entradas libres");
        System.out.println("2. Compra entradas");
        System.out.println("3. Salir");
        eleccion = sc.nextInt();

        switch (eleccion) {
            case 1 -> muestraEntradasLibres(ZonaSalaPrincipal, ZonaCompraVenta, ZonaVip);
        }
    }

    private static void muestraEntradasLibres(Zona zonaSalaPrincipal, Zona zonaCompraVenta, Zona zonaVip) {
        
        System.out.println();
    }

}

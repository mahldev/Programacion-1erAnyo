
public class App {
    public static void main(String[] args) throws Exception {

        int entero = EntradaTeclado.pideEntero("entero: ");
        long longo = EntradaTeclado.pideLong("longo: ");
        double decimal = EntradaTeclado.pideDouble("decimal: ");
        char character = EntradaTeclado.pideChar("character: ");
        String cadena = EntradaTeclado.pideString("cadena: ");

        System.out.println(entero);
        System.out.println(longo);
        System.out.println(decimal);
        System.out.println(character);
        System.out.println(cadena);
    }
}

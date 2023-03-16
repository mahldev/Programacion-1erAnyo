public class App {

    public static void main(String[] args) {

        String cadena = "HOLA esto Es UsA  + CODIFICACION";
        cadena = Codigo.codificaCesar(cadena, 1);
        System.out.println(cadena);

        System.out.println(Codigo.descodificaCesar(cadena, 1));
    }
}

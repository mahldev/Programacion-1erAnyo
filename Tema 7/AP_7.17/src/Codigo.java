public class Codigo {

    public static String codificaCesar(String cadena, int codificacion) {

        char[] caracteres = cadena.toCharArray();

        for (int index = 0; index < caracteres.length; index++) {

            int aux = codificacion;

            while (aux > 0) {
                if (caracteres[index] >= 'A' && caracteres[index] <= 'Z') {

                    aux = aplicaLogica(aux, caracteres, index, 'Z', 'A', 1);
                } else if (caracteres[index] >= 'a' && caracteres[index] <= 'z') {
                    aux = aplicaLogica(aux, caracteres, index, 'z', 'a', 1);
                } else {
                    aux = 0;
                }
            }
        }
        cadena = String.valueOf(caracteres);
        return cadena;
    }

    private static int aplicaLogica(int aux, char[] caracteres, int index, char fin, char principio, int opcion) {

        if (caracteres[index] == fin) {
            caracteres[index] = principio;
            ;
        } else {

            if (opcion == 1) {

                caracteres[index]++;
            } else {

                caracteres[index]--;
            }
        }

        
        aux--;
        return aux;
    }

    public static String descodificaCesar(String cadena, int codificacion) {

        char[] caracteres = cadena.toCharArray();

        for (int index = 0; index < caracteres.length; index++) {

            int aux = codificacion;

            while (aux > 0) {
                if (caracteres[index] >= 'A' && caracteres[index] <= 'Z') {

                    aux = aplicaLogica(aux, caracteres, index, 'A', 'Z', 2);
                } else if (caracteres[index] >= 'a' && caracteres[index] <= 'z') {
                    aux = aplicaLogica(aux, caracteres, index, 'a', 'z', 2);
                } else if (caracteres[index] == ' ') {
                    aux = 0;
                }
            }
        }
        cadena = String.valueOf(caracteres);
        return cadena;
    }
}

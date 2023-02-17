public class Codigo {

    public static String codifica(String cadena, int codificacion) {

        char[] caracteres = cadena.toCharArray();

        for (int index = 0; index < caracteres.length; index++) {

            while (codificacion > 0) {

                if (caracteres[index] >= 'A' && caracteres[index] <= 'Z') {

                    if (caracteres[index] == 'Z') {
                        caracteres[index] = 'A';
                    } else {
                        caracteres[index]++;
                    }
                    codificacion--;
                } else if (caracteres[index] >= 'a' && caracteres[index] <= 'z') {

                    if (caracteres[index] == 'z') {
                        caracteres[index] = 'a';
                    } else {
                        caracteres[index]++;
                    }
                    codificacion--;
                }

            }
        }
        cadena = String.valueOf(caracteres);
        return cadena;
    }

    public static String descodifica(String cadena, int codificacion) {

        char[] caracteres = cadena.toCharArray();

        for (int index = 0; index < caracteres.length; index++) {

            caracteres[index] -= codificacion;
        }
        cadena = String.valueOf(caracteres);
        return cadena;
    }
}

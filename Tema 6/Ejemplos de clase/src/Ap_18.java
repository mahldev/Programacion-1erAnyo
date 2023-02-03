import java.util.Scanner;

public class Ap_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Introduzca la frase: ");
        frase = sc.nextLine();
        frase = frase.strip();

        frase = frase.toLowerCase();
        frase = convierteEnMayusculas(frase);
        frase = frase.replaceAll(" ", "");
        System.out.println(frase);
    }

    private static String convierteEnMayusculas(String frase) {

        char[] caracteres = frase.toCharArray();

        for (int indice = 1; indice < caracteres.length; indice++) {

            if (caracteres[indice] == ' ') {

                caracteres[indice + 1] = Character.toUpperCase(caracteres[indice + 1]);
            }
        }

        return String.valueOf(caracteres);
    } 
}

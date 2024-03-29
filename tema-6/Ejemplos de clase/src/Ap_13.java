import java.util.Scanner;

public class Ap_13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentenciaUsuario;

        System.out.println("Introduzca a continuacion la senticia: ");
        sentenciaUsuario = sc.nextLine();

        while (tieneComentarios(sentenciaUsuario)) {

            sentenciaUsuario = eliminaComentarios(sentenciaUsuario);

        }
        muestraSentencia(sentenciaUsuario);
    }

    private static void muestraSentencia(String sentenciaUsuario) {

        System.out.println(sentenciaUsuario);
    }

    private static String eliminaComentarios(String sentenciaUsuario) {

        int posicionInicialComentario = sentenciaUsuario.indexOf("/*");
        int posicionFinComentario = sentenciaUsuario.indexOf("*/");
        String sentenciaSinComentarios;

        sentenciaSinComentarios = sentenciaUsuario.substring(0, posicionInicialComentario);
        return sentenciaSinComentarios += sentenciaUsuario.substring(posicionFinComentario + 2,
                sentenciaUsuario.length());
    }

    private static boolean tieneComentarios(String sentenciaUsuario) {

        return sentenciaUsuario.contains("/*");
    }
}

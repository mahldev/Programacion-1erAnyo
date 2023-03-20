import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Futbolista> futbolistas;

        futbolistas = generaFutbolitasAletorios(10);
        System.out.println(futbolistas);

        System.out.println("\nArrays orenado" + futbolistas);
    }

    private static ArrayList<Futbolista> generaFutbolitasAletorios(int i) {

        ArrayList<Futbolista> res = new ArrayList<Futbolista>();
        int contador = 0;

        while (contador < i) {
            String dni = String.valueOf((int) (Math.random() * 10000001));
            dni += generaLetra(dni);
            res.add(new Futbolista(
                    dni,
                    diLetra(contador % ((int) (Math.random() * 100))),
                    ((int) (Math.random() * 41)),
                    ((int) (Math.random() * 20))));
            contador++;
        }
        return res;
    }

    private static String generaLetra(String dni) {
        int dniNumero = Integer.parseInt(dni);
        int suma = 0;
        String res = " ";
        while (dniNumero > 0) {
            suma += dniNumero %= 10;
            dniNumero /= 10;
        }
        res = diLetra(suma);
        return res;
    }

    public static String diLetra(int suma) {
        String res = " ";
        switch (suma) {
            case 1 -> res = "A";
            case 2 -> res = "B";
            case 3 -> res = "C";
            case 4 -> res = "D";
            case 5 -> res = "E";
            case 6 -> res = "F";
            case 7 -> res = "G";
            case 8 -> res = "H";
            case 9 -> res = "I";
            case 10 -> res = "J";
            case 11 -> res = "K";
            case 12 -> res = "L";
            case 13 -> res = "M";
            case 14 -> res = "N";
            case 15 -> res = "O";
            case 16 -> res = "P";
            case 17 -> res = "Q";
            case 18 -> res = "R";
            case 19 -> res = "S";
            case 20 -> res = "T";
            case 21 -> res = "U";
            case 23 -> res = "V";
            case 24 -> res = "W";
            case 25 -> res = "X";
            case 26 -> res = "Z";
        }
        return res;
    }
}

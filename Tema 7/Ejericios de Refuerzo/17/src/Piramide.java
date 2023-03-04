public class Piramide {

    static public int piramidesCreadas;
    private int altura;

    public Piramide(int altura) {
        if (altura > 0) {
            this.altura = altura;
        }
        piramidesCreadas++;
    }

    public static int getPiramidesCreadas() {
        return piramidesCreadas;
    }

    @Override
    public String toString() {
        String res = "";
        for (int filas = 0; filas <= this.altura; filas++) {
            for (int espacios = filas; espacios < this.altura; espacios++) {
                res += " ";
            }
            for (int caracter = 0; (caracter < ((filas * 2) - 1)); caracter++) {
                res += "*";
            }
            res += "\n";
        }
        return res;
    }
}
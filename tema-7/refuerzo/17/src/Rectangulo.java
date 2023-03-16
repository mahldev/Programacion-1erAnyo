public class Rectangulo {

    static public int rectangulosCreados;
    private int altura;
    private int base;

    public Rectangulo(int base, int altura) {
        if (base > 0 && altura > 0) {
            this.base = base;
            this.altura = altura;
        }
        rectangulosCreados++;
    }

    public static int getRectangulosCreados() {
        return rectangulosCreados;
    }

    @Override
    public String toString() {
        String res = "";
        for (int filas = 0; filas < this.altura; filas++) {
            for (int caracteres = 0; caracteres < this.base; caracteres++) {
                res += "*";
            }
            res += "\n";
        }
        return res;
    }
}
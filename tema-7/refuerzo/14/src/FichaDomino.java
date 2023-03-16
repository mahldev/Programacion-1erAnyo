public class FichaDomino {

    private int[] numeros;

    public FichaDomino(int lado1, int lado2) {
        numeros = new int[2];
        if (lado1 >= 0 && lado1 <= 6) { numeros[0] = lado1; }
        if (lado2 >= 0 && lado2 <= 6) { numeros[1] = lado2; }
    }

    public boolean encaja(FichaDomino other) {
        if (this.numeros[0] == other.numeros[0]) { return true; }
        if (this.numeros[0] == other.numeros[1]) { return true; }
        if (this.numeros[1] == other.numeros[0]) { return true; }
        if (this.numeros[1] == other.numeros[1]) { return true; }
        return false;
    }

    public String voltea() {
        int tmp = this.numeros[0];
        numeros[0] = this.numeros[1];
        numeros[1] = tmp;
        return toString();
    }

    @Override
    public String toString() {
        if (numeros[0] == 0) { return "[ |"+ numeros[1] + "]"; }
        if (numeros[1] == 0) { return "[ " + numeros[0] + "| ]"; }
        else { return "[" + numeros[0] +"|"+ numeros[1] + "]"; }
    }    
}

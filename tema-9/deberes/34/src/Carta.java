
public class Carta implements Comparable<Carta> {

    public static Carta daCartaAleatoria() {
        return new Carta((int) (Math.random() * 12 + 1), (int) (Math.random() * 4 + 1));
    }

    private int numero;

    private int palo;

    public Carta(int numero, int palo) {
        if (numero < 0 || numero > 12)
            numero = 1;
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        String res = "";
        switch (this.palo) {
            case 1 -> res = "Espadas";
            case 2 -> res = "Oros";
            case 3 -> res = "Bastos";
            case 4 -> res = "Copas";
        }
        return res;
    }

    public void setPalo(int palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + "-" + getPalo();
    }

    @Override
    public int compareTo(Carta o) {
        int res = this.numero - o.numero;
        if (res == 0)
            res = this.getPalo().compareTo(o.getPalo());
        return res;
    }
}

package embarcaciones;

public class Acorazado extends Barco {

    private static int contador;
    static {
        contador = 1;
    }
    private int numCanyones;

    public Acorazado(double longitud, int numCanyones) {
        super("Ac-" + contador++, longitud);
        this.numCanyones = numCanyones;
    }

    private Acorazado(String codigo, double longitud, int numCanyones) {
        super(codigo, longitud);
        this.numCanyones = numCanyones;
    }

    public int getNumCanyones() {
        return numCanyones;
    }

    public void setNumCanyones(int numCanyones) {
        this.numCanyones = numCanyones;
    }

    @Override
    public Acorazado clone() {
        return new Acorazado(this.getCodigo(), this.getLongitud(), this.numCanyones);
    }

    @Override
    public String toString() {
        return super.toString() + " - numero cañones: " + numCanyones;
    }
}
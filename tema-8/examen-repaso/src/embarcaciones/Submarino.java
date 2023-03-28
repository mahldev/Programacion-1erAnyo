package embarcaciones;

public class Submarino extends Barco {

    private static int contador;
    static {
        contador = 1;
    }

    public Submarino(double longitud) {
        super("Sub-" + contador++, longitud);
    }

    private Submarino(String codigo, double longitud) {
        super(codigo, longitud);
    }

    public double longitudPeriscopio() {
        return (this.getLongitud()) / 10;
    }

    @Override
    public Submarino clone() {
        return new Submarino(this.getCodigo(), this.getLongitud());
    }

    @Override
    public String toString() {
        return super.toString() + " - longitud del periscopio: " + this.longitudPeriscopio();
    }
}

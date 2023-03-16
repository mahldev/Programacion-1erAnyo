
public class Punto {

    private double[] posicion;

    public Punto(double x, double y) {
        posicion = new double[2];
        this.posicion[0] = x;
        this.posicion[1] = y;
    }

    @Override
    public String toString() {
        return "(" + posicion[0] + ", " + posicion[1] + ")";
    }
}

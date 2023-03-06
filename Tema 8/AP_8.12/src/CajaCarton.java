public class CajaCarton extends Caja {

    static Unidad cmUnidad = new Unidad("cm");

    public CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, cmUnidad);
    }

    public double getVolumenReal() {
        return getVolumen() * 0.8;
    }

    public double getSuperficieTotal() {
        final double ALTO = getALTO();
        final double ANCHO = getANCHO();
        final double FONDO = getFONDO();
        return 2 * (ANCHO * FONDO + ANCHO * ALTO + FONDO * ALTO);
    }
}

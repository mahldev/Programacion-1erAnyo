public class Caja {

    private final double ANCHO;
    private final double ALTO;
    private final double FONDO;
    private final Unidad UNIDAD;
    private String etiqueta;

    public Caja(double ancho, double alto, double fondo, Unidad unidad) {
        if (ancho < 0) {
            ancho = 0;
        }
        if (alto < 0) {
            alto = 0;
        }
        if (fondo < 0) {
            fondo = 0;
        }
        this.ANCHO = ancho;
        this.ALTO = alto;
        this.FONDO = fondo;
        this.UNIDAD = unidad;
    }

    public double getVolumen() {
        if (UNIDAD.getUnidad().equals("cm")) {
            return (ANCHO / 100) * (ALTO / 100) * (FONDO / 100);
        }
        return ANCHO * ALTO * FONDO;
    }

    public boolean setEtiqueta(String etiqueta) {
        if (etiqueta.length() <= 30) {

            this.etiqueta = etiqueta;
            return true;
        }
        return false;
    }

    public double getANCHO() {
        return ANCHO;
    }

    public double getALTO() {
        return ALTO;
    }
    public double getFONDO() {
        return FONDO;
    }

    @Override
    public String toString() {
        return "Caja [ANCHO=" + ANCHO + ", ALTO=" + ALTO + ", FONDO=" + FONDO + ", UNIDAD=" + UNIDAD.getUnidad()
                + ", etiqueta=" + etiqueta + "]";
    }
}

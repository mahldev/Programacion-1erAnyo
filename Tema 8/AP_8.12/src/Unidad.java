public class Unidad {

    private String unidad;

    public Unidad(String unidad) {

        if (unidad.equals("cm")) {
            this.unidad = unidad;
        } else if (unidad.equals("m")) {
            this.unidad = unidad;
        } else {
            throw new IllegalArgumentException("Unidad no valida");
        }
    }

    public String getUnidad() {
        return unidad;
    }
}

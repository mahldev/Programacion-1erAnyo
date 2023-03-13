public class Libro extends Publicacion implements Prestable {

    private boolean prestado;

    public Libro(String isbn, String titulo, int anyoPublicacion) {
        super(isbn, titulo, anyoPublicacion);
        this.prestado = false;
    }

    @Override
    public String toString() {

        String aux = super.toString();
        String prestadoString = " (prestado)";
        if (!prestado) {
            prestadoString = " (no prestado)";
        }
        return aux + prestadoString;
    }

    @Override
    public boolean presta() {

        if (estaPrestado())
            return false;
        this.prestado = true;
        return true;
    }

    @Override
    public boolean devuelve() {

        if (!estaPrestado())
            return false;
        this.prestado = false;
        return true;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
}

public class Libro extends Publicacion {

    private boolean prestado;

    public Libro(String isbn, String titulo, int anyoPublicacion) {
        super(isbn, titulo, anyoPublicacion);
        this.prestado = false;
    }

    public void presta() {
        if (!this.prestado) {
            this.prestado = true;
        } else {
            System.out.println("Lo siento, ese libro ya está prestado.");
        }
    }

    public boolean estaPrestado() {
        return this.prestado;
    }

    public void devuelve() {
        if (this.prestado) {
            this.prestado = false;
        } else {
            System.out.println("El libro, no está prestado.");
        }
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
}

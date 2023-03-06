public class Revista extends Publicacion {

    private int numero;

    public Revista(String isbn, String titulo, int anyoPublicacion, int numero) {
        super(isbn, titulo, anyoPublicacion);
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }
}

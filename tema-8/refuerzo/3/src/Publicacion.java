import java.time.LocalDate;

public abstract class Publicacion {

    private String isbn;
    private String titulo;
    private int anyoPublicacion;

    public Publicacion(String isbn, String titulo, int anyoPublicacion) {
        int fechaActual = fechaActual();
        this.isbn = isbn;
        if (titulo.length() < 60) {
            this.titulo = titulo;
        }
        if (anyoPublicacion > 0 && anyoPublicacion < fechaActual + 1) {
            this.anyoPublicacion = anyoPublicacion;
        }
    }

    private int fechaActual() {
        String aux = String.valueOf(LocalDate.now());
        aux = aux.substring(0, 4);
        int fechaActual = Integer.parseInt(aux);
        return fechaActual;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnyoPublicacion() {
        return anyoPublicacion;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn + ", titulo: " + titulo + ", año de publicación: " + anyoPublicacion;
    }
}

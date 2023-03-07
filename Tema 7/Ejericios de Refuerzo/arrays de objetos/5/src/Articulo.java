public class Articulo {

    private static int codigo;
    private int codigoArticulo;
    private String descripcion;
    private double precioDeCompra;
    private int stock;

    static {
        codigo = 1;
    }

    public Articulo(String descripcion, double precioDeCompra, int stock) {

        this.codigoArticulo = codigo++;
        if (descripcion.length() <= 100) {
            this.descripcion = descripcion;
        }
        if (precioDeCompra > 0) {
            this.precioDeCompra = precioDeCompra;
        }
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public int getCodigoArticulo() {
        return codigoArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        if (descripcion.length() <= 100) {
            this.descripcion = descripcion;
        }
    }

    public double getPrecioDeCompra() {
        return precioDeCompra;
    }

    public void setPrecioDeCompra(double precioDeCompra) {
        if (precioDeCompra > 0) {
            this.precioDeCompra = precioDeCompra;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    @Override
    public String toString() {

        return "\n------------------------------" +
                "\nCodigo: " + this.codigoArticulo +
                "\nPrecio: " + this.precioDeCompra +
                "\nStock: " + this.stock +
                "\nDescripcion: " + this.descripcion +
                "\n-----------------------------";
    }

    public void incrementaStock(int cantidad) {
        this.stock += cantidad;
    }

    public void decrementaStock(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
        }
    }
}
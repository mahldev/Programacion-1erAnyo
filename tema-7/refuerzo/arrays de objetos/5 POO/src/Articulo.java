public class Articulo {

    private static int codigo;
    static {
        codigo = 1;
    }
    private int codigoArticulo;
    private String descripcion;
    private double precioDeCompra;
    private int stock;

    public Articulo(int codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public Articulo(String descripcion, double precioDeCompra, int stock) {

        if (precioDeCompra < 0) {
            precioDeCompra = 1;
        }
        if (stock <= 0) {
            stock = 1;
        }
        this.codigoArticulo = codigo++;
        this.descripcion = descripcion;
        this.precioDeCompra = precioDeCompra;
        this.stock = stock;
    }

    public Articulo(int codigoArticulo, String descripcion, double precioDeCompra, int stock) {

        if (precioDeCompra < 0) {
            precioDeCompra = 1;
        }
        this.codigoArticulo = codigoArticulo;
        this.descripcion = descripcion;
        this.precioDeCompra = precioDeCompra;
        this.stock = stock;

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
        if (precioDeCompra < 0) {
            precioDeCompra = 0;
        }
        this.precioDeCompra = precioDeCompra;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        }
    }

    public void incrementaStock(int cantidad) {
        this.stock += cantidad;
    }

    public boolean decrementaStock(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Articulo other = (Articulo) obj;
        if (codigoArticulo != other.codigoArticulo)
            return false;
        return true;
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

    @Override
    public Articulo clone() {
        return new Articulo(this.codigoArticulo, this.descripcion, this.precioDeCompra, this.stock);
    }
}
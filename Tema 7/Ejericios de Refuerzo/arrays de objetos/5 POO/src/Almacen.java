public class Almacen {

    private Articulo[] almacen;
    private int numArticulos;

    public Almacen(int tamanho) {
        if (tamanho < 0) {
            tamanho = 10;
        }
        this.almacen = new Articulo[tamanho];
        numArticulos = 0;
    }

    public boolean darAltaArticulo(Articulo articulo) {

        if (numArticulos < almacen.length) {
            almacen[numArticulos++] = articulo;
        }

    }
}

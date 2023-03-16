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

        if (numArticulos < almacen.length && pertenece(articulo) == -1) {
            almacen[numArticulos++] = articulo;
            return true;
        }
        return false;
    }

    public boolean darBajaArticulo(Articulo articulo) {

        int indexToDelete = pertenece(articulo);

        if (indexToDelete != -1) {
            for (int index = indexToDelete; index < numArticulos - 1; index++) {
                almacen[index] = almacen[index + 1];
            }
            numArticulos--;
            return true;
        }
        return false;
    }

    public Articulo[] listado() {

        Articulo[] res = new Articulo[almacen.length];

        for (int index = 0; index < almacen.length; index++) {
            if (almacen[index] != null) {
                res[index] = almacen[index].clone();
            }
        }
        return res;
    }

    public Articulo modificarArticulo(Articulo articulo) {

        int index = pertenece(articulo);

        if (index != -1) {
            return almacen[index];
        }
        return new Articulo(0);
    }

    private int pertenece(Articulo articulo) {

        for (int index = 0; index < numArticulos; index++) {
            if (almacen[index].equals(articulo)) {
                return index;
            }
        }
        return -1;
    }
}

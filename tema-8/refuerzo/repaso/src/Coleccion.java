public class Coleccion {

    private Disco[] discos;
    private int numeroDiscos;

    public Coleccion(int tamanho) {
        this.discos = new Disco[tamanho];
        this.numeroDiscos = 0;
    }

    public boolean insertar(Disco disco) {
        if (discos.length == numeroDiscos)
            return false;
        if (busca(disco) != -1)
            return false;
        discos[numeroDiscos++] = disco;
        return true;
    }

    public int busca(Disco disco) {
        for (int index = 0; index < discos.length; index++) {
            if (discos[index] != null && discos[index].equals(disco))
                return index;
        }
        return -1;
    }

    public Disco[] copiaColeccion() {
        Disco[] res = new Disco[numeroDiscos];
        for (int index = 0; index < discos.length; index++) {
            if (discos[index] != null)
                res[index] = discos[index].clone();
        }
        return res;
    }

    public Disco daDisco(int index) {
        return discos[index];
    }

    public boolean eliminarDisco(int indexToDelete) {

        if (discos[indexToDelete] != null) {
            for (int index = indexToDelete; index < numeroDiscos; index++) {
                discos[index] = discos[index + 1];
            }
            numeroDiscos--;
            return true;
        }
        return false;
    }
}

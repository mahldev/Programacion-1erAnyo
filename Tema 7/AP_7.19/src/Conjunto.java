import java.util.Arrays;

public class Conjunto {

    private Integer[] datos;
    private int numeroElementos;

    public Conjunto() {

        datos = new Integer[10];
        this.numeroElementos = 0;
    }

    public Conjunto(int numeroElementos) {

        datos = new Integer[numeroElementos];
        this.numeroElementos = 0;
    }

    public int numeroElementos() {
        return numeroElementos;
    }

    public boolean pertenece(Integer elemento) {

        for (int index = 0; index < numeroElementos; index++) {

            if (this.datos[index] == elemento) {

                return true;
            }
        }
        return false;
    }

    public boolean insertar(Integer nuevo) {

        boolean res = false;

        if (!pertenece(nuevo)) {

            if (this.numeroElementos < datos.length) {
                datos[this.numeroElementos] = nuevo;
                res = true;
                this.numeroElementos++;
            }
        }
        return res;
    }

    public boolean insertar(Conjunto otroConjunto) {

        Conjunto nuevoOtroConjunto = otroConjunto;
        comparaYElimina(nuevoOtroConjunto);
        muestraArray(nuevoOtroConjunto);
        System.out.println();

        if (nuevoOtroConjunto.numeroElementos < this.numeroElementos - this.datos.length
                && nuevoOtroConjunto.numeroElementos > 0) {
            System.out.println("hol");
            int index = 0;
            while (index < nuevoOtroConjunto.numeroElementos) {

                this.datos[this.numeroElementos + 1] = nuevoOtroConjunto.datos[index++];
                this.numeroElementos++;
            }
            return true;
        }
        return false;
    }

    private void comparaYElimina(Conjunto OtroConjunto) {

        for (int indexThisConjunto = 0; indexThisConjunto < numeroElementos; indexThisConjunto++) {

            for (int indexOtroConjunto = 0; indexOtroConjunto < OtroConjunto.numeroElementos; indexOtroConjunto++) {

                if (datos[indexThisConjunto] == OtroConjunto.datos[indexOtroConjunto]) {

                    eliminarElemento(OtroConjunto, indexOtroConjunto);
                }
            }
        }
    }

    private void eliminarElemento(Conjunto conjunto, int indiceAEliminar) {

        System.arraycopy(conjunto.datos, indiceAEliminar + 1, conjunto.datos, indiceAEliminar,
                (indiceAEliminar + 1) - conjunto.datos.length);
    }

    public boolean eliminarElemento(Integer elemento) {

        if (pertenece(elemento)) {

            for (int index = 0; index < numeroElementos; index++) {

                if (datos[index] == elemento) {

                    datos[index] = datos[numeroElementos - 1];
                    numeroElementos--;
                    return true;
                }
            }
        }
        return false;
    }

    public boolean elimanarConjunto(Conjunto otroConjunto) {

        for (int index = 0; index < otroConjunto.numeroElementos; index++) {

            for (int indexThisConjunto = 0; indexThisConjunto < numeroElementos; indexThisConjunto++) {

                if (otroConjunto.datos[index] == this.datos[indexThisConjunto]) {

                    eliminarElemento(this.datos[indexThisConjunto]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void muestraArray(Conjunto conjunto) {
        System.out.println(Arrays.toString(conjunto.datos));
    }
}

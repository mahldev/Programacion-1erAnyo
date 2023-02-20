public class Conjunto {

    public Integer[] datos;
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

        if (this.numeroElementos < datos.length) {
            datos[this.numeroElementos] = nuevo;
            res = true;
            this.numeroElementos++;
        }
        return res;
    }

    public boolean insertar(Conjunto otroConjunto) {

        Conjunto nuevOtroConjunto = otroConjunto;
        comparaYElimina(nuevOtroConjunto);

        if (otroConjunto.numeroElementos < numeroElementos) {

            for (int index = 0; index < otroConjunto.numeroElementos; index++) {
                this.datos[this.numeroElementos + 1] = otroConjunto.datos[index];
            }
            return true;
        }
        return false;
    }

    private void comparaYElimina(Conjunto otroConjunto) {

        for (int indexThisConjunto = 0; indexThisConjunto < numeroElementos; indexThisConjunto++) {

            for (int indexOtroConjunto = 0; indexOtroConjunto < otroConjunto.numeroElementos; indexOtroConjunto++) {

                if (datos[indexThisConjunto] == otroConjunto.datos[indexOtroConjunto]) {

                    eliminarElemento(otroConjunto, otroConjunto.datos[indexOtroConjunto]);
                }
            }
        }
    }

    private boolean eliminarElemento(Conjunto conjunto, Integer elemento) {

        if (pertenece(elemento)) {

            for (int index = 0; index < conjunto.numeroElementos; index++) {

                if (conjunto.datos[index] == elemento) {

                    conjunto.datos[index] = datos[conjunto.numeroElementos - 1];
                    conjunto.numeroElementos--;
                    return true;
                }
            }
        }
        return false;
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

    public static boolean incluido(Conjunto conjunto1, Conjunto conjunto2) {

        boolean res = false;

        for (int indexC1 = 0; indexC1 < conjunto1.numeroElementos; indexC1++) {

            res = false;

            for (int indexC2 = 0; indexC2 < conjunto2.numeroElementos; indexC2++) {

                if (conjunto1.datos[indexC1] == conjunto2.datos[indexC2]) {

                    res = true;
                }
            }
            if (!res) {

                return false;
            }
        }
        return res;
    }

    public static Conjunto union(Conjunto conjunto1, Conjunto conjunto2) {

        Conjunto nuevConjunto = new Conjunto(
                conjunto1.numeroElementos + conjunto2.numeroElementos);

        for (int index = 0; index < nuevConjunto.datos.length - 1; index++) {

            nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto1.datos[index];
            nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto2.datos[index];
        }
        return nuevConjunto;
    }

    private static int repetidos(Conjunto conjunto1, Conjunto conjunto2) {

        int repetidos = 0;

        for (int indexC1 = 0; indexC1 < conjunto1.numeroElementos; indexC1++) {

            for (int indexC2 = 0; indexC2 < conjunto2.numeroElementos; indexC2++) {

                if (conjunto1.datos[indexC1] == conjunto2.datos[indexC2]) {

                    repetidos++;
                }
            }
        }
        return repetidos;
    }

}

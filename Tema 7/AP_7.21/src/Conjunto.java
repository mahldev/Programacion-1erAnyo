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

        boolean res = false;

        if (otroConjunto.numeroElementos - repetidos(otroConjunto) < this.datos.length - this.numeroElementos) {

            for (int index = 0; index < otroConjunto.numeroElementos; index++) {

                if (!pertenece(otroConjunto.datos[index])) {
                    insertar(otroConjunto.datos[index]);
                    res = true;
                }
            }
        }
        return res;
    }

    public boolean eliminarElemento(Integer elemento) {

        for (int index = 0; index < this.numeroElementos; index++) {

            if (this.datos[index] == elemento) {

                System.arraycopy(this.datos, index + 1, this.datos, index, this.numeroElementos - (index + 1));
                numeroElementos--;
                return true;
            }
        }
        return false;
    }

    public boolean eliminarConjunto(Conjunto otroConjunto) {

        boolean res = false;

        for (int indexC1 = 0; indexC1 < this.numeroElementos; indexC1++) {

            for (int indexC2 = 0; indexC2 < otroConjunto.numeroElementos; indexC2++) {

                if (this.datos[indexC1] == otroConjunto.datos[indexC2]) {

                    eliminarElemento(this.datos[indexC1]);
                    res = true;
                }
            }
        }
        return res;
    }

    public void muestra() {

        for (int index = 0; index < this.numeroElementos; index++) {

            System.out.println(this.datos[index]);
        }
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

        for (int index = 0; index < conjunto1.numeroElementos; index++) {

            nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto1.datos[index];
        }
        for (int index = 0; index < conjunto2.numeroElementos; index++) {

            nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto2.datos[index];
        }
        return nuevConjunto;
    }

    private int repetidos(Conjunto otroConjunto) {

        int repetidos = 0;

        for (int indexC1 = 0; indexC1 < this.numeroElementos; indexC1++) {

            for (int indexC2 = 0; indexC2 < otroConjunto.numeroElementos; indexC2++) {

                if (this.datos[indexC1] == otroConjunto.datos[indexC2]) {

                    repetidos++;
                }
            }
        }
        return repetidos;
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

    public static Conjunto interseccion(Conjunto conjunto1, Conjunto conjunto2) {

        Conjunto nuevConjunto = new Conjunto(repetidos(conjunto1, conjunto2));

        for (int indexC1 = 0; indexC1 < conjunto1.numeroElementos; indexC1++) {

            for (int indexC2 = 0; indexC2 < conjunto2.numeroElementos; indexC2++) {

                if (conjunto1.datos[indexC1] == conjunto2.datos[indexC2]) {

                    if (conjunto1.datos[indexC1] == conjunto2.datos[indexC2]) {

                        nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto1.datos[indexC1];
                    }
                }
            }
        }
        return nuevConjunto;
    }

    public static Conjunto diferencia(Conjunto conjunto1, Conjunto conjunto2) {

        Conjunto nuevConjunto = new Conjunto(conjunto1.numeroElementos - (repetidos(conjunto1, conjunto2)));
        Conjunto conjuntoRepeditos = Conjunto.interseccion(conjunto1, conjunto2);

        if (!incluido(conjunto1, conjunto2)) {

            for (int index = 0; index < conjunto1.numeroElementos; index++) {

                if (!pertenece(conjunto1.datos[index], conjuntoRepeditos)) {

                    nuevConjunto.datos[nuevConjunto.numeroElementos++] = conjunto1.datos[index];
                }
            }

        }
        return nuevConjunto;
    }

    private static boolean pertenece(Integer elemento, Conjunto conjunto) {

        for (int index = 0; index < conjunto.numeroElementos; index++) {

            if (conjunto.datos[index] == elemento) {

                return true;
            }
        }
        return false;
    }
}

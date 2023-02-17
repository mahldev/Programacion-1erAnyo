public class Conjunto {

    private Integer[] datos;
    private int numeroElementos;

    public Conjunto() {

        datos = new Integer[10];
        this.numeroElementos = 0;
    }

    public Conjunto(int numeroElementos) {

        datos = new Integer[numeroElementos];
        this.numeroElementos = numeroElementos;
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

                    eliminarElemento(otroConjunto,otroConjunto.datos[indexOtroConjunto]);
                }
            }
        }
    }

    private boolean eliminarElemento(Conjunto conjunto ,Integer elemento) {

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
}

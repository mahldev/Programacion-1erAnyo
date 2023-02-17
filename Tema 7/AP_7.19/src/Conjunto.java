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

        if (longitudOtroConjunto < numeroElementos) {

            for (int i = 0; i < datos.length; i++) {
                
                for (int j = 0; j < otroConjunto.datos.length; j++) {
                    
                    if () {
                        
                    }
                }
            }
        }
    }

    private void comparaYElimina(Conjunto otroConjunto) {


        for (int i = 0; i < numeroElementos; i++) {

            for (int j = 0; j < otroConjunto.numeroElementos; j++) {

                if (datos[i] == otroConjunto.datos[j]) {

                    eliminarElemento();
                }
            }
        }
    }
}

import java.util.Arrays;

public class Colores {

    String[] colores = {
            "azul",
            "rojo",
            "verde",
            "amarillo"
    };

    public Colores() {
    }

    private boolean noSeEncuentra(String[] array, String color) {

        for (int index = 0; index < array.length; index++) {

            if (array[index].equals(color)) {

                return false;
            }
        }
        return true;
    }

    public void agregaColor(String color) {

        if (noSeEncuentra(this.colores, color)) {

            String[] nuevosColores = new String[this.colores.length + 1];

            System.arraycopy(this.colores, 0, nuevosColores, 0, this.colores.length);
            nuevosColores[this.colores.length] = color;

            colores = nuevosColores;
            nuevosColores = null;
        }
    }

    public String[] devuelveColores(int cantidad) {

        String[] res = new String[cantidad];

        eliminaNulls(cantidad, res);

        if (cantidad > colores.length) {

            return null;
        } else if (cantidad == colores.length) {

            return this.colores;
        } else {
            for (int index = 0; index < res.length; index++) {

                String colorAletorio;
                do {
                    colorAletorio = colores[indexAleatorio(0, colores.length)];

                } while (!noSeEncuentra(res, colorAletorio));
                res[index] = colorAletorio;
            }
            return res;
        }
    }

    private void eliminaNulls(int cantidad, String[] res) {
        int aux = 0;
        while (aux < cantidad) {

            res[aux] = "";
            aux++;
        }
    }

    private int indexAleatorio(int minimo, int maximo) {

        return (int) (Math.random() * (maximo - minimo) + minimo);
    }

    @Override
    public String toString() {
        return "Colores [colores=" + Arrays.toString(colores) + "]";
    }

}

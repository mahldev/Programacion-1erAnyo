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

            if (array[index] != null && array[index].equals(color)) {

                return false;
            }
        }
        return true;
    }

    public boolean agregaColor(String color) {

        if (noSeEncuentra(this.colores, color)) {

            Arrays.copyOf(this.colores, this.colores.length + 1);
            colores[this.colores.length - 1] = color;

            return true;
        }
        return false;
    }

    public String[] devuelveColores(int cantidad) {

        String[] res = new String[cantidad];


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

    private int indexAleatorio(int minimo, int maximo) {

        return (int) (Math.random() * (maximo - minimo) + minimo);
    }

    @Override
    public String toString() {
        return "Colores [colores=" + Arrays.toString(colores) + "]";
    }
}

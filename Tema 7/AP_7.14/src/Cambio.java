public class Cambio {

    private double importe;
    private double cantidadDada;
    private double cambio;

    public Cambio(double importe, double cantidadDada) {

        this.importe = importe;
        this.cantidadDada = cantidadDada;
        setCambio();
    }

    private void setCambio() {

        this.cambio = 0;

        if (this.cantidadDada > this.importe) {

            this.cambio = this.cantidadDada - this.importe;
        }
    }

    public int[] daBilletes() {

        int[] billetes = { 500, 200, 100, 50, 20, 10, 5 };
        int[] billetesHaDevolver = new int[0];

        for (int index = 0; index < billetes.length; index++) {

            if (this.cambio >= billetes[index]) {

                this.cambio -= billetes[index];
                billetesHaDevolver = agregarBilletes(billetesHaDevolver, billetes[index]);
            }
        }
        return billetesHaDevolver;
    }

    public double[] daMonedas() {

        double[] monedas = { 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
        double[] monedasHaDevolver = new double[0];

        for (int index = 0; index < monedas.length; index++) {

            if (this.cambio >= monedas[index]) {

                
                this.cambio -= monedas[index];
                monedasHaDevolver = agregarMonedas(monedasHaDevolver, monedas[index]);
            }
        }
        return monedasHaDevolver;
    }

    private double[] agregarMonedas(double[] array, double valor) {

        double[] newArray = new double[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = valor;

        return newArray;
    }

    private int[] agregarBilletes(int[] array, int valor) {

        int[] newArray = new int[array.length + 1];

        System.arraycopy(array, 0, newArray, 0, array.length);
        newArray[array.length] = valor;

        return newArray;
    }

}
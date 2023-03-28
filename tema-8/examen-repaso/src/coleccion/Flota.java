package coleccion;

import embarcaciones.*;

public class Flota {

    private Barco[] flotaBarcos;
    private int numElementos;

    public Flota() {
        this.flotaBarcos = new Barco[(int) (Math.random() * 11 + 10)];
    }

    public int numeroElementos() {
        return this.numElementos;
    }

    public boolean insertarBarco(Barco b) {
        if (numElementos == flotaBarcos.length)
            return false;
        if (estaEnLaFlota(b) != -1)
            return false;
        this.flotaBarcos[numElementos++] = b;
        return true;
    }

    public boolean eliminarBarco(Barco b) {
        int index = estaEnLaFlota(b);
        if (index != -1) {
            for (int i = index; i < flotaBarcos.length - 1; i++)
                flotaBarcos[i] = flotaBarcos[i + 1];

            numElementos--;
            return true;
        }
        return false;
    }

    public Barco[] arrayBarcos() {
        Barco[] res = new Barco[numElementos];
        for (int i = 0; i < this.numElementos; i++) {
            if (flotaBarcos[i] instanceof Acorazado)
                res[i] = ((Acorazado) flotaBarcos[i]).clone();
            if (flotaBarcos[i] instanceof Submarino)
                res[i] = ((Submarino) flotaBarcos[i]).clone();
        }
        return res;
    }

    private int estaEnLaFlota(Barco b) {
        for (int i = 0; i < this.numElementos; i++)
            if (flotaBarcos[i].equals(b))
                return i;

        return -1;
    }
}

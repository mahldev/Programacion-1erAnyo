package examen.repaso;

public class Banco {

    private Cliente[] clientes;
    private int numElementos;

    public Banco(int tamanyo) {
        this.clientes = new Cliente[tamanyo];
        this.numElementos = 0;
    }

    public int getNumElementos() {
        return numElementos;
    }

    public void setNumElementos(int numElementos) {
        this.numElementos = numElementos;
    }

    public int esCliente(Cliente c) {
        if (numElementos > 0) {
            for (int i = 0; i < numElementos; i++) {
                if (clientes[i].equals(c))
                    return i;
            }
        }
        return -1;
    }

    public boolean altaCliente(Cliente c) {
        if (numElementos < clientes.length) {
            if (esCliente(c) == -1) {
                clientes[numElementos++] = c;
                return true;
            }
        }
        return false;
    }

    public boolean bajaCliente(Cliente c) {
        int posicion = esCliente(c);
        if (posicion != -1) {
            for (int i = posicion; i < numElementos - 1; i++) {
                clientes[i] = clientes[i + 1];
            }
            numElementos--;
            return true;
        }
        return false;
    }
}

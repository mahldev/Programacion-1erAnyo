package com.example;

import java.io.Serializable;

public class ListaClientes implements Serializable {

    private Cliente[] clientes;
    private int numElementos;

    public ListaClientes(int tamanyo) {
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
        if (clientes.length != 0) {
            for (int i = 0; i < numElementos; i++) {
                if (clientes[i].equals(c))
                    return i;
            }
        }
        return -1;
    }

    public boolean agregarCliente(Cliente c) {
        if (esCliente(c) == -1) {
            clientes[numElementos++] = c;
            return true;
        }
        return false;
    }

    public boolean eliminarCliente(Cliente c) {
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

    public Cliente[] listaClientes() {
        if (numElementos != 0) {
            Cliente[] newClientes = new Cliente[numElementos];
            for (int i = 0; i < numElementos; i++) {
                newClientes[i] = clientes[i].clone();
            }
            return newClientes;
        }
        return null;
    }

    public Cliente modificarCliente(Cliente c) {
        int index = esCliente(c);
        if (index != -1) {
            return clientes[index];
        }
        return null;
    }
}

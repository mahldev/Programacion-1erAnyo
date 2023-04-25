package com.example;

import java.io.Serializable;

public class Cliente extends Persona implements Serializable {

    public Cliente(String nombre, String telefono) {
        super(nombre, telefono);
    }

    @Override
    protected Cliente clone() {
        Cliente c = new Cliente(this.getNombre(), this.getTelefono());
        c.setId(this.getId());
        setContadorId(getContadorId() - 1);
        return c;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

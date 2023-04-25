package com.example;

public class Persona {

    private static int contadorId;
    static {
        contadorId = 1;
    }
    private int id;
    private String nombre;
    private String telefono;

    public Persona(String nombre, String telefono) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int contadorId) {
        Persona.contadorId = contadorId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cliente other = (Cliente) obj;
        if (telefono == null) {
            if (other.getTelefono() != null)
                return false;
        } else if (!telefono.equals(other.getTelefono()))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "id: " + id + " - nombre: " + nombre + " - telefono: " + telefono;
    }
}
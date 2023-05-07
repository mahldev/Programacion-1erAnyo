package examen.repaso;

import java.time.LocalDate;

public class Cliente {

    private String dni;
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double saldo;

    public Cliente(String dni, String nombreCompleto, LocalDate fechaNacimiento, double saldo) {
        this.dni = dni;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.saldo = saldo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public Object clone() {
        return new Cliente(this.dni, this.nombreCompleto, this.fechaNacimiento, this.saldo);
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
        if (dni == null) {
            if (other.dni != null)
                return false;
        } else if (!dni.equals(other.dni))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Dni: " + dni + " - Nombre: " + nombreCompleto + " - Fecha Nacimiento: " + fechaNacimiento
                + " - Saldo: " + saldo;
    }
}

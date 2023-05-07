package com.tempertare;

import java.io.Serializable;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Registro implements Comparable<Registro>, Serializable {

    private LocalTime hora;
    private double temperatura;

    public Registro(LocalTime hora, double temperatura) {
        this.hora = hora;
        this.temperatura = temperatura;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hora == null) ? 0 : hora.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Registro other = (Registro) obj;
        if (hora == null) {
            if (other.hora != null)
                return false;
        } else if (!hora.equals(other.hora))
            return false;
        return true;
    }

    @Override
    public int compareTo(Registro o) {
        return this.hora.compareTo(o.hora);
    }

    @Override
    public String toString() {
        return "Hora: " + hora.format(DateTimeFormatter.ofPattern("HH:mm:ss")) + " - Temperatura: " + temperatura;
    }

}

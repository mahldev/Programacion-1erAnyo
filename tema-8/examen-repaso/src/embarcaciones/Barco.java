package embarcaciones;

public abstract class Barco {

    private String codigo;
    private double longitud;

    public Barco(String codigo, double longitud) {
        this.codigo = codigo;
        this.longitud = longitud;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Barco other = (Barco) obj;
        if (Double.doubleToLongBits(longitud) != Double.doubleToLongBits(other.longitud))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "- codigo: " + this.codigo + " - longitud: " + this.longitud;

    }
}

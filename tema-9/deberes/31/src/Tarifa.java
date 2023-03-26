public class Tarifa {

    private String nombre;
    private double coste;

    public Tarifa(String nombre) {
        this.nombre = nombre;
        asignaCoste(nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }

    private void asignaCoste(String nombre) {
        switch (nombre) {
            case "estandar" -> this.coste = 0.5;
        }
    }
}

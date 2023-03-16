public class Gestor {

    private String nombre;
    private int telefono;
    private double importeMaximo;

    Gestor(String nombre, int telefono, double importeMaximo) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }

    Gestor(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }
}

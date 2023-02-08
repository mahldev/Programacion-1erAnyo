public class Gestor {
    
    public String nombre;
    private int telefono;
    public double importeMaximo;

    Gestor(String nombre, int telefono, double importeMaximo) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = importeMaximo;
    }
    
    Gestor(String nombre, int telefono){
        this.nombre = nombre;
        this.telefono = telefono;
        this.importeMaximo = 10000;
    }

    
}

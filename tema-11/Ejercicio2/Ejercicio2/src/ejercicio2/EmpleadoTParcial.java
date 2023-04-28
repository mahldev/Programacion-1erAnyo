package ejercicio2;

public class EmpleadoTParcial extends Empleado {

    private static final int PRECIO_POR_HORAS = 15;
    private int numHoras;

    public EmpleadoTParcial(String nombre, int edad, int numH) {
        super(nombre, edad);
        this.numHoras = numH;
    }

    public double setSalario(int numH) {
        return numH * PRECIO_POR_HORAS;
    }

    @Override
    public double getSalario() {
        return this.numHoras * PRECIO_POR_HORAS;
    }
}

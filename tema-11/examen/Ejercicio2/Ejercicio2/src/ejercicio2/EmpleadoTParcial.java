package ejercicio2;

public class EmpleadoTParcial extends Empleado {

    public EmpleadoTParcial(String nombre, int edad, int numHorasTrabajadas) {
        super(nombre, edad, 0);
        this.setSalario(calcularSalario(numHorasTrabajadas));
    }

    private double calcularSalario(int numH) {
        return numH * 15;
    }
}

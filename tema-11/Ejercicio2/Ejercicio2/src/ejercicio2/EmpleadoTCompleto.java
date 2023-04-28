package ejercicio2;

public class EmpleadoTCompleto extends Empleado {

    private double salario;

    public EmpleadoTCompleto(String nombre, int edad, double salario) {
        super(nombre, edad);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return super.toString() + " Salario" + salario;
    }
}

public class Empleado extends Persona {

    private double salario;

    Empleado(String nombre, int edad, double estatura, double salario) {
        super(nombre, edad, estatura);
        this.salario = salario;
    }

    @Override
    void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Salario: " + salario);
    }

    void diSalario() {

        System.out.println("COBRO : " + this.salario);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        long temp;
        temp = Double.doubleToLongBits(salario);
        result = prime * result + (int) (temp ^ (temp >>> 32));
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
        return true;
    }

}

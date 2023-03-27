public class Persona implements Empleado, Cliente {

    private String dni;
    private String nombre;
    private boolean esCliente;
    private boolean esEmpleado;

    public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
        this.dni = dni;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEsCliente() {
        return esCliente;
    }

    public void setEsCliente(boolean esCliente) {
        this.esCliente = esCliente;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    @Override
    public String toString() {
        String res = "\ndni: " + dni + " - nombre: " + nombre;
        if (esCliente)
            res += " - Es Cliente";
        if (esEmpleado)
            res += " - Es Empleado";
        return res;
    }

    @Override
    public int getSalgoCuenta() {
        return saldoCuenta;
    }

    @Override
    public void setSaldoCuenta(int saldo) {
        this.saldoCuenta = saldo;
    }

    @Override
    public int getHorasTrabajadasMes() {
        return this.horasTrabajadasMes;
    }

    @Override
    public void setHorasTrabajadasMes(int horasTrabajadasMes) {
        this.horasTrabajadasMes = horasTrabajadasMes;
    }
}

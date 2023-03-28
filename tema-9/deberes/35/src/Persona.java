public class Persona implements Empleado, Cliente {

    private final String DNI;
    private String nombre;
    private boolean esCliente;
    private boolean esEmpleado;
    private double saldo;
    private int horasTrabajadasAlMes;

    public Persona(String dni, String nombre, boolean esCliente, boolean esEmpleado) {
        this.DNI = dni;
        this.nombre = nombre;
        this.esCliente = esCliente;
        this.esEmpleado = esEmpleado;
        this.saldo = Persona.SALDO_CUENTA;
        this.horasTrabajadasAlMes = Persona.HORAS_TRABAJADAS_MES;
    }

    public String getDni() {
        return DNI;
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getHorasTrabajadasAlMes() {
        return horasTrabajadasAlMes;
    }

    public void setHorasTrabajadasAlMes(int horasTrabajadasAlMes) {
        this.horasTrabajadasAlMes = horasTrabajadasAlMes;
    }

    @Override
    public void incrementarSaldo(double saldo) {
        this.saldo += saldo;
    }

    @Override
    public void incrementarHoras(int horasTrabajadasAlMes) {
        this.horasTrabajadasAlMes += horasTrabajadasAlMes;
    }

    @Override
    public String toString() {
        String res = "\ndni: " + dni + " - nombre: " + nombre;
        if (esCliente)
            res += " - Es Cliente - Saldo: " + this.saldo;
        if (esEmpleado)
            res += " - Es Empleado - Horas trabajadas al mes: " + this.horasTrabajadasAlMes;
        return res;
    }

}

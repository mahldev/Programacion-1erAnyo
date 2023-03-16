class CuentaCorriente {

    private String dni;
    private String nombreTitular;
    private double saldo;
    private static String nombreBanco;

    static {

        nombreBanco = "Santader";
    }

    public CuentaCorriente(String dni, String nombreTitular) {

        this.dni = dni;
        this.nombreTitular = nombreTitular;
    }

    public CuentaCorriente(String dni, double saldo) {

        this.dni = dni;
        this.saldo = saldo;
    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {

        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }
    
    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaCorriente.nombreBanco = nombreBanco;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean sacarDinero(double cantidad) {

        boolean correcto = false;

        if (cantidad <= this.saldo) {

            this.saldo -= cantidad;
            correcto = true;
        }
        return correcto;
    }

    public void ingresarDinero(double cantidad) {

        if (cantidad > 0) {

            this.saldo += cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente [dni=" + dni + ", nombreTitular=" + nombreTitular + ", saldo=" + saldo + "]";
    }
}

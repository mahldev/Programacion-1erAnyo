class CuentaCorriente {

    String dni;
    String nombreTitular;
    double saldo;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String dni, String nombreTitular, double saldo) {

        dni = dni.strip();
        nombreTitular = nombreTitular.strip();
        this.dni = dni;
        this.nombreTitular = nombreTitular;
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

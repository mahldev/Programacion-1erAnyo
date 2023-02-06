class CuentaCorriente {

    String dni;
    String nombreTitular;
    double saldo;

    CuentaCorriente() {
    }

    CuentaCorriente(String dni, String nombreTitular, double saldo) {

        dni = dni.strip();
        nombreTitular = nombreTitular.strip();
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    void sacarDinero(double cantidad) {

        String confirmacion = "No se ha podido realizar la operacion por falta de saldo.";

        if (cantidad <= this.saldo) {

            this.saldo -= cantidad;
            confirmacion = "Se ha realizado con exito a operacion.";
        }
        System.out.println("\n" + confirmacion);
    }

    void ingresarDinero(double cantidad) {

        if (cantidad > 0) {

            this.saldo += cantidad;
        }
    }

    void mostrarInformacion() {

        System.out.println("\ndni: " + this.dni +
                "\nnombre del titular: " + this.nombreTitular +
                "\nsaldo: " + this.saldo);
    }
}

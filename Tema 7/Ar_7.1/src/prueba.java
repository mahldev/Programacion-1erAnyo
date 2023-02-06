public class prueba {

    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente("46199353N", "Roberto", 1000);

        cuenta1.mostrarInformacion();
        cuenta1.sacarDinero(1000);
        cuenta1.mostrarInformacion();

    }
}

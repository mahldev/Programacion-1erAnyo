public class TarjetaRegalo {

    private double saldo;
    private String identidicador;

    public TarjetaRegalo(double saldo) {
        this.saldo = saldo;
        this.identidicador = idenficadorAleatorio();
    }

    private String idenficadorAleatorio() {
        return String.valueOf((int) (Math.random() * (99999 - 10000) + 10000));
    }

    public void gasta(double cantidad) {
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
        } else {
            System.out.println("No tienes suficiente saldo para gastar " + cantidad);
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo other) {
        TarjetaRegalo res = new TarjetaRegalo(this.saldo + other.saldo);
        this.saldo = 0;
        other.saldo = 0;
        return res;
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + identidicador + " - Saldo " + saldo;
    }
}

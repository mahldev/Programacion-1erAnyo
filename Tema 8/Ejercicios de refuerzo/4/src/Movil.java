import java.text.DecimalFormat;

public class Movil extends Terminal {

    private static final DecimalFormat df = new DecimalFormat("0.00");
    private Tarifa tarifa;
    private double coste;

    public Movil(String numero, String nombre) {

        super(numero);
        Tarifa tarifa = new Tarifa(nombre);
        this.tarifa = tarifa;
    }

    @Override
    public void llama(Terminal movil, int tiempoConversacion) {

        final double DE_SEGUNDOS_A_MINUTOS = 60.00;
        super.llama(movil, tiempoConversacion);
        this.coste += (tiempoConversacion / DE_SEGUNDOS_A_MINUTOS) * tarifa.getCostePorMinuto();
    }

    @Override
    public String toString() {
        return super.toString() + "- tarificados " + df.format(this.coste) + " euros";
    }
}

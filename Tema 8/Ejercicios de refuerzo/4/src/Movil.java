import java.text.DecimalFormat;

/*Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada. A continuación se proporciona el contenido del main y el resultado
que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
decimales, puedes utilizar DecimalFormat. */

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
        String superString = super.toString();
        return superString + "- tarificados " + df.format(this.coste) + " euros";
    }
}

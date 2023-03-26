import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Llamada implements Comparable<Llamada> {

    private static final DateTimeFormatter formatoDeFecha;
    static {
        formatoDeFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    }
    private String numero;
    private String numeroInterlocutor;
    private boolean saliente;
    private LocalDateTime fechaYHoraInicio;
    private LocalDateTime fechaYHoraFin;
    private Tarifa tarifa;

    public Llamada(
            String numero,
            String numeroInterlocutor,
            boolean saliente,
            String tarifa) {
        this.numero = numero;
        this.numeroInterlocutor = numeroInterlocutor;
        this.saliente = saliente;
        this.fechaYHoraInicio = LocalDateTime.now();
        this.tarifa = new Tarifa(tarifa);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumeroInterlocutor() {
        return numeroInterlocutor;
    }

    public void setNumeroInterlocutor(String numeroInterlocutor) {
        this.numeroInterlocutor = numeroInterlocutor;
    }

    public boolean esSaliente() {
        return saliente;
    }

    public void setSaliente(boolean saliente) {
        this.saliente = saliente;
    }

    public LocalDateTime getFechaYHoraInicio() {
        return fechaYHoraInicio;
    }

    public void setFechaYHoraInicio(LocalDateTime fechaYHoraInicio) {
        this.fechaYHoraInicio = fechaYHoraInicio;
    }

    public LocalDateTime getFechaYHoraFin() {
        return fechaYHoraFin;
    }

    public void setFechaYHoraFin(LocalDateTime fechaYHoraFin) {
        this.fechaYHoraFin = fechaYHoraFin;
    }

    public Tarifa getTarifa() {
        return tarifa;
    }

    public void setTarifa(Tarifa tarifa) {
        this.tarifa = tarifa;
    }

    public boolean terminaLLamada() {
        this.fechaYHoraFin = LocalDateTime.now();
        return true;
    }

    public double calcularCoste() {
        return (duracionLLamadaEnSegundos() / (60)) * tarifa.getCoste();
    }

    public int duracionLLamadaEnSegundos() {
        if (fechaYHoraFin != null) {
            return (int) fechaYHoraInicio.until(fechaYHoraFin, ChronoUnit.SECONDS);
        }
        return (int) fechaYHoraInicio.until(LocalDateTime.now(), ChronoUnit.SECONDS);
    }

    @Override
    public String toString() {
        String res = "numero1: " + numero + " - numero2: " + numeroInterlocutor + " - Fecha y hora de inicio: "
                + fechaYHoraInicio.format(formatoDeFecha);
        if (fechaYHoraFin != null) {
            res += " - Duracion: " + this.duracionLLamadaEnSegundos()
                    + " Segundos - Coste: " + this.calcularCoste();
        }
        return res;
    }
}

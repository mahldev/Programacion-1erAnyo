public class Hora {

    private int hora;
    private int minuto;

    public Hora(int hora, int minuto) {
        if (hora < 0 || hora > 23) {
            hora = 0;
        }
        if (minuto < 0 || minuto > 59) {
            minuto = 0;
        }
        this.hora = hora;
        this.minuto = minuto;
    }

    public void inc() {
        if (minuto == 59) {
            hora++;
            minuto = 0;
        } else {
            minuto++;
        }
    }
    
    public boolean setMinuto(int minuto) {

        if (minuto < 0 || minuto > 59) {
            return false;
        }
        this.minuto = minuto;
        return true;
    }
    
    public static void diHola() {
      
      System.out.println("Hola");
    }

    public boolean setHora(int hora) {
        if (hora < 0 || hora > 23) {
            return false;
        }
        this.hora = hora;
        return true;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getHora() {
        return hora;
    }

    @Override
    public String toString() {
        return "Hora [hora=" + hora + ", minuto=" + minuto + "]";
    }
}

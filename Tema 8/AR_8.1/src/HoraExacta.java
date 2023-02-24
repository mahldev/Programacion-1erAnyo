public class HoraExacta extends Hora {

    private int segundos;

    public HoraExacta(int hora, int minuto, int segundos) {
        super(hora, minuto);
        this.segundos = segundos;
    }

    public void setSegundos(int segundos) {
        if (segundos > 0 || segundos < 59) {
            this.segundos = segundos;
        }
    }

    @Override
    public void inc() {

        if (segundos == 59) {
            this.setMinuto(this.getMinuto() + 1);
            segundos = 0;
            super.inc();
        } else {
            segundos++;
        }
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        HoraExacta other = (HoraExacta) obj;
        if ((this.segundos != other.segundos) &&
                (this.getMinuto() != other.getMinuto()) &&
                (this.getHora() != other.getHora())) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String aux = super.toString();

        return aux + " HoraExacta [segundos=" + segundos + "]";
    }
}

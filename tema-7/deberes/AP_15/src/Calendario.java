public class Calendario {

    private int anyo;
    private int mes;
    private int dia;

    public Calendario() {
        this.anyo = 2001;
        this.mes = 12;
        this.dia = 3;
    }

    public Calendario(int anyo, int mes, int dia) {
        if (anyo > 0) {
            this.anyo = anyo;
        }
        if (mes > 0 && mes < 13) {
            this.mes = mes;
        }
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }

    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        if (anyo > 0) {
            this.anyo = anyo;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes > 0 && mes < 13) {

            this.mes = mes;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia > 0 && dia < 32) {
            this.dia = dia;
        }
    }

    public void incrementarDia() {

        int mesActual = damaDiasMaximos(this.mes);

        if (dia == mesActual) {
            dia = 1;
            mes++;
        }
    }

    private int damaDiasMaximos(int mes) {

        int res;

        switch (mes) {
            case 1 => res = 31;
            case 2 => res = 28;
            case 3 => res = 31;
            case 4 => res = 30;
            case 5 => res = 31;
            case 6 => res = 30;
            case 7 => res = 31;
            case 8 => res = 31;
            case 9 => res = 30;
            case 10 => res = 31;
            case 11 => res = 30;
            case 12 => res = 31;
        }
        return res;
    }

    public void incrementarMes() {
        this.mes++;

        if (mes == 13) {
            mes = 1;
            anyo++;
        }
    }

    public void incrementarAnyo() {
    }
}

public class Linea {

    Punto[] puntos;

    public Linea(Punto punto1, Punto punto2) {
        puntos = new Punto[2];
        this.puntos[0] = punto1;
        this.puntos[1] = punto2;
    }

    @Override
    public String toString() {
        return "Linea formada por los puntos " + this.puntos[0].toString() + " y " + this.puntos[1].toString();
    }
}

package examen;

public class Guerrero extends Personaje {

    private static int contador;

    public Guerrero() {
        super("2" + contador++, 15);
    }

    public Guerrero(String codigo, int vida) {
        super(codigo, vida);
    }

    @Override
    protected Guerrero clone() {
        return new Guerrero(super.getCodigo(), super.getVida());
    }
}

package examen;

public class Jefe extends Personaje {

    private static int contador;
    private int vidaExtra;

    public Jefe() {
        super("1" + contador++, 20);
        this.vidaExtra = (Integer.parseInt(super.getCodigo())) / 2;
    }

    public Jefe(String codigo, int vida, int vidaExtra) {
        super(codigo, vida);
        this.vidaExtra = vidaExtra;
    }

    public int getVidaExtra() {
        return vidaExtra;
    }

    @Override
    public boolean esAtacado(int valor) {
        if (!this.estaVivo())
            return false;
        if (!super.estaVivo()) {
            restarVidaExtra(valor);
            return true;
        }
        super.restarVida(valor);
        return true;
    }

    @Override
    public boolean estaVivo() {
        if (this.vidaExtra > 0)
            return true;
        return false;
    }

    @Override
    protected Jefe clone() {
        return new Jefe(super.getCodigo(), super.getVida(), this.vidaExtra);
    }

    @Override
    public String toString() {
        return super.toString() + "\nvidaExtra: " + vidaExtra;
    }

    private void restarVidaExtra(int valor) {
        this.vidaExtra -= valor;
    }
}

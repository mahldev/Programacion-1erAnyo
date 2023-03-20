package examen;

public abstract class Personaje {

    private String codigo;
    private int vida;

    public Personaje(String codigo, int vida) {
        this.codigo = codigo;
        this.vida = vida;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getVida() {
        return vida;
    }

    public boolean esAtacado(int valor) {
        if (this.estaVivo()) {
            restarVida(valor);
            return true;
        }
        return false;
    }

    public void restarVida(int valor) {
        this.vida -= valor;
    }

    public boolean estaVivo() {
        if (this.vida > 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "\n" + this.getClass().getSimpleName()
                + "\n-------"
                + "\ncodigo: " + codigo
                + "\nvida: " + vida;
    }
}

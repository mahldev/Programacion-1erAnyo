package examen;

public class Ejercito {

    private Personaje[] integrantes;

    public Ejercito() {
        this.integrantes = new Personaje[numeroRandom(3, 7)];
        for (int index = 0; index < integrantes.length - 1; index++) {
            this.integrantes[index] = new Guerrero();
        }
        this.integrantes[integrantes.length - 1] = new Jefe();
    }

    public boolean quedanGuerrerosVivos() {
        for (int index = 0; index < integrantes.length - 1; index++) {
            if (this.integrantes[index].getVida() > 0)
                return true;
        }
        return false;
    }

    public boolean haSidoDerrotado() {
        if (((Jefe) (this.integrantes[integrantes.length - 1])).getVidaExtra() <= 0) {
            return true;
        }
        return false;
    }

    public boolean recibeAtaque(int valor) {
        int objectivoAtaque;

        objectivoAtaque = numeroRandom(0, this.integrantes.length - 1);
        if (!quedanGuerrerosVivos()) {
            ((Jefe) (integrantes[integrantes.length - 1])).esAtacado(valor);
            return true;
        }
        if ((integrantes[objectivoAtaque]).estaVivo()) {
            integrantes[objectivoAtaque].esAtacado(valor);
            return true;
        }
        return false;
    }

    public Personaje[] daCopia() {
        Personaje[] res = new Personaje[integrantes.length];

        for (int index = 0; index < res.length - 1; index++) {
            res[index] = ((Guerrero) (integrantes[index])).clone();
        }
        res[res.length - 1] = ((Jefe) (integrantes[integrantes.length - 1])).clone();
        return res;
    }

    @Override
    public String toString() {
        String res = "";

        for (Personaje personaje : integrantes) {
            res += "\n" + personaje.toString();
        }
        return res;
    }

    private int numeroRandom(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}

class Incidencia {

    private static int codigos = 1;
    private static int pendientes;
    private int codigo;
    private String estado;
    private int numeroDePuesto;
    private String[] comentarios;

    public Incidencia(int numeroDePuesto, String comentario) {
        this.comentarios = new String[2];
        this.estado = "Pendiente";
        this.numeroDePuesto = numeroDePuesto;
        this.comentarios[0] = comentario;
        this.codigo = codigos++;
        pendientes++;
    }

    public static int getPendientes() {
        return pendientes;
    }

    public void resuelve(String comentario) {
        this.estado = "Resuelta";
        this.comentarios[1] = comentario;
        pendientes--;
    }

    @Override
    public String toString() {
        String res = "Incidencia " + this.codigo + " - "
                + "Puesto: " + this.numeroDePuesto + " - "
                + this.comentarios[0] + " - "
                + this.estado;
        if (this.estado.equals("Resuelta")) {
            res += " - " + this.comentarios[1];
        }
        return res;
    }
}

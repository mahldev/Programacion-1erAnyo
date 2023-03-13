public class Terminal {

    private String numero;
    private int tiempoConversacion;

    public Terminal(String numero) {

        String numeroString = String.valueOf(numero);
        numeroString = numeroString.replaceAll(" ", "");
        if (numeroString.length() == 9) {
            this.numero = numeroString;
        }
    }

    public void llama(Terminal terminal, int tiempo) {

        this.tiempoConversacion += tiempo;
        terminal.tiempoConversacion += tiempo;
    }

    private String formatea(String numero1) {

        String res = "";
        char[] caracteres = numero1.toCharArray();
        for (int index = 0; index < caracteres.length; index++) {
            if (index == 2) {
                res += String.valueOf(caracteres[index]) + " ";
            } else if (index == 5) {
                res += String.valueOf(caracteres[index]) + " ";
            } else if (index == 9) {
                res += String.valueOf(caracteres[index]) + " ";
            } else {
                res += String.valueOf(caracteres[index]);
            }
        }
        return res;
    }

    @Override
    public String toString() {

        String tmp = formatea(this.numero);
        return "Nº " + tmp + " - " + this.tiempoConversacion + "s de conversacion";
    }
}

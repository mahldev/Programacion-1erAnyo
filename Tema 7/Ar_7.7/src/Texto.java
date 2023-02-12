import java.time.LocalDate;
import java.time.LocalDateTime;

public class Texto {

    private String cadena;
    private int maxLongitud;
    private LocalDate creacion;
    private LocalDateTime ultimaModificacion;

    public Texto(String cadena, int maxLongitud) {

        this.cadena = cadena;
        this.maxLongitud = maxLongitud;
        this.creacion = LocalDate.now();
        this.ultimaModificacion = LocalDateTime.now();
    }

    public LocalDate getCreacion() {
        return creacion;
    }

    public void setCreacion(LocalDate creacion) {
        this.creacion = creacion;
    }

    public LocalDateTime getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(LocalDateTime ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }

    public void agregaPrincipio(char caracter) {

        if (maxLongitud > cadena.length()) {

            cadena = caracter + cadena;
            this.ultimaModificacion = LocalDateTime.now();
        }
    }

    public void agregaFinal(char caracter) {

        if (maxLongitud > cadena.length()) {

            cadena += caracter;
            this.ultimaModificacion = LocalDateTime.now();
        }
    }

    public void agregaPrincipio(String nuevaCadena) {

        if (maxLongitud >= cadena.length() + nuevaCadena.length()) {

            cadena = nuevaCadena + cadena;
            this.ultimaModificacion = LocalDateTime.now();
        }
    }

    public void agregaFinal(String nuevaCadena) {

        if (maxLongitud > cadena.length() + nuevaCadena.length()) {

            cadena += nuevaCadena;
            this.ultimaModificacion = LocalDateTime.now();
        }
    }

    public int cuantasVocales() {

        String aux = cadena.toLowerCase();
        char[] caracteres = aux.toCharArray();
        int vocales = 0;

        for (int indice = 0; indice < caracteres.length; indice++) {

            if (esVocal(caracteres[indice])) {

                vocales++;
            }
        }
        return vocales;
    }

    private boolean esVocal(char caracter) {

        if (caracter == 'a') {

            return true;
        }
        if (caracter == 'e') {

            return true;
        }
        if (caracter == 'i') {

            return true;
        }
        if (caracter == 'o') {

            return true;
        }
        if (caracter == 'u') {

            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Texto [cadena=" + cadena + ", creacion=" + creacion +
                ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}

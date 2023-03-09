public class Disco {

  static String[] codigos;
  private static int cantidadDeDiscos;
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public Disco() {
  }

  public Disco(String codigo, String autor, String titulo, String genero, int duracion) {

    if (estaDisponible(codigo)) {
      this.autor = autor;
      this.titulo = titulo;
      this.genero = genero;
      if (duracion <= 0) {
        duracion = 1;
      }
      this.duracion = duracion;
      this.codigo = codigo;
      codigos[cantidadDeDiscos++] = codigo;
    }
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setDuracion(int duracion) {
    this.duracion = duracion;
  }

  public int getDuracion() {
    return this.duracion;
  }

  public static void cantidadDeDiscos(int cantidadMaxima) {
    codigos = new String[cantidadMaxima];
  }

  public static boolean estaDisponible(String codigoIntroducido) {
    for (int i = 0; i < codigos.length; i++) {
      if (codigos[i] != null && codigos[i].equals(codigoIntroducido)) {
        return false;
      }
    }
    return true;
  }

  public String toString() {
    String cadena = "\n------------------------------------------";
    cadena += "\nCódigo: " + this.codigo;
    cadena += "\nAutor: " + this.autor;
    cadena += "\nTítulo: " + this.titulo;
    cadena += "\nGénero: " + this.genero;
    cadena += "\nDuración: " + this.duracion;
    cadena += "\n------------------------------------------";
    return cadena;
  }
}
public class Disco {
  
  private String codigo = "LIBRE";
  private String autor;
  private String titulo;
  private String genero;
  private int duracion;

  public Disco() {
  } 

  public Disco(String autor, String titulo, String genero, int duracion) {
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    if (duracion > 0) {
      this.duracion = duracion;
    }
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

  public String getDuracion() {
    return this.duracion;
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

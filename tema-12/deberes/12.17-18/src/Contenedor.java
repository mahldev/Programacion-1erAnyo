public interface Contenedor<T> {

    public boolean agregar(T p);

    public T extraer();

    public T[] listar(T[] t);
}

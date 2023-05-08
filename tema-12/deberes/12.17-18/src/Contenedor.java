public interface Contenedor<T> {

    boolean agregar(T p);

    T extraer();

    T[] listar(T[] t);
}

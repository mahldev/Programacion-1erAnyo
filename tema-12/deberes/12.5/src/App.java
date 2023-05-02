import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {

        Set<Cliente> conjuntoClientes = new TreeSet<>();
        Set<Cliente> conjuntoNombre = new TreeSet<>(
                (c1, c2) -> c1.getNombre().compareTo(c2.getNombre()));
        Set<Cliente> conjuntoEdad = new TreeSet<>(
                (c1, c2) -> c1.getEdad() - c2.getEdad());

        conjuntoClientes.add(new Cliente("111", "Marta", 23));
        conjuntoClientes.add(new Cliente("115", "Jorge", 24));
        conjuntoClientes.add(new Cliente("112", "Carlos", 21));

        System.out.println("Conjunto Clientes");
        conjuntoClientes.forEach(n -> System.out.println(n));

        System.out.println("Conjunto Clientes ordenado por nombre");
        conjuntoNombre.addAll(conjuntoClientes);
        conjuntoNombre.forEach(n -> System.out.println(n));

        System.out.println("Conjunto Clientes ordenado por edad");
        conjuntoEdad.addAll(conjuntoClientes);
        conjuntoEdad.forEach(n -> System.out.println(n));
    }
}
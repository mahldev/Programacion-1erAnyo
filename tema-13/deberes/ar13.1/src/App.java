public class App {

    public interface Saludo<T> {

        public String saludar(T e);
    }

    public static void main(String[] args) throws Exception {

        // Saludo<String> saludarNombre = s -> "Hola " + s;
        Cliente c1 = new Cliente("Pepe");
        Saludo<Cliente> saludarClientes = e -> "Hola " + e.getNombre();

        System.out.println(saludarClientes.saludar(c1));
    }
}

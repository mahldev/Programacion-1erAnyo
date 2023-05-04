/*
Utilizando la interfaz Saluda de la actividad anterior, implementar un metodo estatico que aplique un saludo a un grupo de personas que se le pasa com parametro en una tabla. Devolvera los saludas en una lista de cadenas

Aplicarlo a una tabla clientes
 */

import java.util.ArrayList;
import java.util.List;

public class App132 {

    public interface Saludo<T> {

        public String saludar(T e);
    }

    public static <T> List<String> saludarGrupo(T[] lista, Saludo<T> saludo) {
        List<String> res = new ArrayList<>();
        for (T t : lista) {
            res.add(saludo.saludar(t));
        }
        return res;
    }

    public static void main(String[] args) {
        Cliente[] clientes = {
                new Cliente("Pepe"),
                new Cliente("Paco"),
                new Cliente("SiSI")
        };

        System.out.println(saludarGrupo(clientes, c -> "Buenos dias " + c.getNombre()));
    }
}

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {

    private static void generAcademico(Academia academia, int qty) {
        Random random = new Random();
        char charRandom;

        for (int i = 0; i < qty; i++) {
            charRandom = Character.toUpperCase((char) random.nextInt(100));
            academia.nuevoAcademico(charRandom, new Academico(charRandom + "nombre", LocalDate.now()));
        }
    }

    public static void main(String[] args) throws Exception {

        Academia academia = new Academia();
        generAcademico(academia, 5);
        List<Academico> aux;
        List<Character> aux2;

        System.out.println("Ordenado por nombre");
        aux = academia.listar().stream()
                .map(a -> a.getValue())
                .collect(Collectors.toList());
        System.out.println(aux);

        System.out.println("Ordenado por año de ingreso");
        aux = academia.listar().stream()
                .map(a -> a.getValue())
                .sorted((a1, a2) -> a1.getFechaIngreso().compareTo(a2.getFechaIngreso()))
                .collect(Collectors.toList());
        System.out.println(aux);

        System.out.println("Por orden de letra");
        aux2 = academia.listar().stream()
                .map(a -> a.getKey())
                .sorted(Character::compareTo)
                .collect(Collectors.toList());
        System.out.println(aux2);

        System.out.println("Por nombre");
        aux2 = academia.listar().stream()
                
    }
}

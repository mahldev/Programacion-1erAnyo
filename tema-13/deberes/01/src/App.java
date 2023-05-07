import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> jedis = List.of("Anakin", "Leia", "Luke", "Rey");

        var theJedis = jedis.stream()
                .filter(s -> !s.equals("Rey"))
                .map(j -> j.toString().toUpperCase())
                .collect(Collectors.toList());

        System.out.println(theJedis);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

    private static List<Integer> fusion(List<Integer> l1, List<Integer> l2) {
        List<Integer> res = new ArrayList<>();
        res.addAll(l1);
        res.addAll(l2);
        res.sort((o1, o2) -> o1 - o2);
        return res;
    }

    public static void main(String[] args) throws Exception {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        Stream<Integer> s = Stream.of(l1);

        l1.add(2);
        l1.add(6);
        l1.add(12);
        l1.add(20);

        l2.add(2);
        l2.add(6);
        l2.add(12);
        l2.add(20);

        System.out.println(Arrays.toString(fusion(l1, l2).toArray(new Integer[0])));
    }
}

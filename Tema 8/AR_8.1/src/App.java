public class App {
    public static void main(String[] args) throws Exception {

        HoraExacta h1 = new HoraExacta(12, 59, 59);
        HoraExacta h2 = new HoraExacta(12, 59, 59);
        h1.inc();
        System.out.println(h1.equals(h2));
    }
}

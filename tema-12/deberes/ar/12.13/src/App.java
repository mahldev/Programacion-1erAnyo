public class App {
    public static void main(String[] args) throws Exception {

        var sorteo = new Sorteo<Integer>();

        sorteo.add(10);
        sorteo.add(12);
        sorteo.add(13);

        System.out.println(sorteo.premiados(5));
    }
}

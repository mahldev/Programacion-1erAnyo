public class App {
    public static void main(String[] args) throws Exception {

        Persona p1 = new Persona("12312312", "Mi nombre", true, true);

        System.out.println(p1.getHorasTrabajadasAlMes());
        p1.incrementarHoras(100);
        System.out.println(p1.getHorasTrabajadasAlMes());
    }
}

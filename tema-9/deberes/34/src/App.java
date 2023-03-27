import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        Carta[] cartas = new Carta[10];

        for (int i = 0; i < 10; i++) {
            cartas[i] = Carta.daCartaAleatoria();
        }

        for (Carta carta : cartas) {
            System.out.println(carta);
        }

        Arrays.sort(cartas);
        System.out.println("\n");
        for (Carta carta : cartas) {
            System.out.println(carta);
        }
    }
}

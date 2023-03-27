import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {

        Llamada[] llamadas = new Llamada[3];

        llamadas[0] = new Llamada(
                "666800599",
                "634214432",
                true,
                "estandar");
        llamadas[1] = new Llamada(
                "666800599",
                "634214432",
                false,
                "estandar");
        llamadas[2] = new Llamada(
                "663421443",
                "639430293",
                false,
                "estandar");
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                llamadas[0].terminaLLamada();
                llamadas[1].terminaLLamada();
                llamadas[2].terminaLLamada();
                Arrays.sort(llamadas);
            }
        }, 3000);

    }
}

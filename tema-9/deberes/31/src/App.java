import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) throws Exception {

        Llamada llamada1 = new Llamada(
                "666800599",
                "634214432",
                false,
                "estandar");

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                llamada1.terminaLLamada();
                System.out.println(llamada1.duracionLLamadaEnSegundos());
                System.out.println(llamada1);
            }
        }, 3000);

    }
}

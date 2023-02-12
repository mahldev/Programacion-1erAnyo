import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Texto texto = new Texto("Hola", 20);

        texto.agregaFinal(" Me llamo");
        System.out.println(texto);

        texto.agregaPrincipio("wiwi ");
        System.out.println(texto);
        sc.close();

    }

}

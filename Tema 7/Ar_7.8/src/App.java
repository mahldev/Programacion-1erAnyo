public class App {

    public static void main(String[] args) {
        
        SintonizadorFM radio = new SintonizadorFM();
        

        radio.upFrequency();
        radio.showDisplay();
        radio.downFrequency();
        radio.showDisplay();
    }
}

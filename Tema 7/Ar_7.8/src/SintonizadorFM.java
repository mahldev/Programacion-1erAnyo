public class SintonizadorFM {

    private int frequency;

    public SintonizadorFM() {

        this.frequency = 80;
    }

    public SintonizadorFM(int frequency) {

        if (frequency > 80 && frequency < 108) {

            this.frequency = frequency;
        }
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getFrequency() {
        return frequency;
    }

    public void upFrequency() {

        if (frequency < 108) {

            frequency++;
        } else {

            frequency = 80;
        }
    }

    public void downFrequency() {

        if (frequency > 80) {

            frequency--;
        } else {

            frequency = 108;
        }
    }

    public void showDisplay() {

        System.out.println("Frequency: " + frequency + " MHz");
    }
}

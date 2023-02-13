public class SintonizadorFM {

    private double frequency;

    public SintonizadorFM() {

        this.frequency = 80;
    }

    public SintonizadorFM(double frequency) {

        if (frequency > 80 && frequency < 108) {

            this.frequency = frequency;
        }
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public double getFrequency() {
        return frequency;
    }

    public void upFrequency() {

        if (frequency < 108) {

            frequency += 0.5;
        } else {

            frequency = 80;
        }
    }

    public void downFrequency() {

        if (frequency > 80) {

            frequency -= 0.5;
        } else {

            frequency = 108;
        }
    }

    public void showDisplay() {

        System.out.println("Frequency: " + frequency + " MHz");
    }
}

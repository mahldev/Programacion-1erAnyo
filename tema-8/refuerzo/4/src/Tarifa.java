
public class Tarifa {

    private double costePorMinuto;

    public Tarifa(String tipo) {

        switch (tipo) {
            case "rata" -> this.costePorMinuto = 0.06;
            case "mono" -> this.costePorMinuto = 0.12;
            case "bisonte" -> this.costePorMinuto = 0.30;
        }
    }

    public double getCostePorMinuto() {

        return costePorMinuto;
    }
}

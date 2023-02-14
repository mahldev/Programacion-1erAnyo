public class EcuacionSegundoGrado {

    private double a;
    private double b;
    private double c;

    public EcuacionSegundoGrado() {
    }

    public EcuacionSegundoGrado(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;

    }

    private double[] discimanteMayor() {

        double discriminante = daDiscriminante();

        double[] res = {
                (-b + Math.sqrt(discriminante)) / (2 * a),
                (-b - Math.sqrt(discriminante)) / (2 * a)
        };
        return res;
    }

    private double[] discriminateIgual() {
        double[] res = { -b / (2 * a) };
        return res;
    }

    public double[] daSoluciones() {

        double res[] = {};
        double discriminante = daDiscriminante();

        if (discriminante > 0.0) {

            res = discimanteMayor();
        } else if (discriminante == 0.0) {

            res = discriminateIgual();
        }
        return res;
    }

    public boolean esPositivo() {

        return (daDiscriminante() > 0);
    }

    private double daDiscriminante() {

        return b * b - 4 * a * c;
    }
}
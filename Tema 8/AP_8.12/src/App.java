public class App {
    public static void main(String[] args) throws Exception {

        Unidad unidad = new Unidad("m");
        Caja caja1 = new Caja(10, 10, 10, unidad);

        System.out.println(caja1.getVolumen());
        caja1.setEtiqueta("Esto es una etiqueta para la caja");
        System.out.println();
        System.out.println(caja1);

        CajaCarton cajaCarton = new CajaCarton(3, 1.5, 4);
        CajaCarton cajaCarton2 = new CajaCarton(10, 10, 10);

        System.out.println(cajaCarton2.getVolumenReal());
        System.out.println(cajaCarton.getSuperficieTotal());
    }
}

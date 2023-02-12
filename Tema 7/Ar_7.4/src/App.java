public class App {
    
    public static void main(String[] args) {
        
        CuentaCorriente cuenta1 = new CuentaCorriente("46199353N","Roberto");
        
        recuperaYCambiaBanco();

    }

    private static void recuperaYCambiaBanco() {

        System.out.println(CuentaCorriente.getNombreBanco());
        CuentaCorriente.setNombreBanco("Unicaja");
    }


}

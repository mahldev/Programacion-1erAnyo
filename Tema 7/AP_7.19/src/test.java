public class test {

    public static void main(String[] args) {

        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        conjunto1.insertar(3);
        conjunto1.insertar(5);
        conjunto1.insertar(8);

        conjunto2.insertar(3);
        conjunto2.insertar(5);
        conjunto2.insertar(8);
        conjunto2.insertar(4);
        
        
        Conjunto.muestraArray(conjunto2);
        conjunto1.insertar(conjunto2);
        
        
    }
}

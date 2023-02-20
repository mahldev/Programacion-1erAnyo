public class App {

    public static void main(String[] args) {

        Conjunto conjunto1 = new Conjunto();
        Conjunto conjunto2 = new Conjunto();

        conjunto1.insertar(1);
        conjunto1.insertar(2);
        conjunto1.insertar(3);
        conjunto1.insertar(4);
        conjunto1.insertar(5);

        conjunto2.insertar(1);
        conjunto2.insertar(2);
        conjunto2.insertar(3);
        conjunto2.insertar(4);
        conjunto2.insertar(5);
        conjunto2.insertar(6);
        conjunto2.insertar(7);

        conjunto1.insertar(conjunto2);
        Conjunto.muestraArray(conjunto1);
        Conjunto.muestraArray(conjunto2);
    }
}

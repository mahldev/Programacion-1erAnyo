class Persona {

    String nombre;
    int edad;
    double estatura;

    void saludar(Persona otra) {

        System.out.println(" Hola. Mi nombre es " + this.nombre);
        System.out.println(" Encantado de conecrte. Mi nombre es " + otra.nombre);
    }

    void cumplirAnyos() {

        this.edad++;
    }
}

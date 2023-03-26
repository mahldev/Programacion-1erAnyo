public class App {
    public static void main(String[] args) throws Exception {

        Jornada martes = new Jornada("25-03-2023", "25-03-2023");

        Jornada lunes = new Jornada("24-03-2023", "24-03-2023");

        martes.nuevaTarea(new Tarea(martes, "46199353N", "09:00:00", "10:00:00"));
        martes.nuevaTarea(new Tarea(martes, "83719327J", "09:15:00", "10:00:00"));
        martes.nuevaTarea(new Tarea(martes, "46199353N", "09:15:00", "10:00:00"));

        System.out.println(martes);

        martes.ordenarTareas();
        System.out.println(martes);

    }
}

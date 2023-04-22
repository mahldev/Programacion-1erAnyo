import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] menu = {
                "Añadir nuevo cliente",
                "Modificar datos",
                "Dar de baja cliente",
                "Listar los clientes",
                "Salir"
        };

        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + "." + menu[i]);
        }
        System.out.print(": ");
        return sc.nextInt();
    }

    private static String[] askCustomerInfo() {
        String[] data = new String[2];
        String[] tmp = {
                "nombre: ",
                "numero de telefono: "
        };
        System.out.print(tmp[0]);
        data[0] = sc.nextLine();
        System.out.print(tmp[1]);
        data[1] = sc.nextLine();
        return data;
    }

    private static Customer createNewCustomer(String name, String phNumber) {
        return new Customer(name, phNumber);
    }

    private static void changeCustomer(Customer c, String[] data) {
        c.setName(data[0]);
        c.setPhNumber(data[1]);
    }

    public static void main(String[] args) throws Exception {
        Company myCompany;
        Customer[] customers;
        String[] data;
        String aux;
        Customer c;
        int option;

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("storage.dat"))) {
            Customer.setContadorId(in.readInt());
            myCompany = (Company) in.readObject();
        } catch (Exception e) {
            myCompany = new Company();
        }

        do {
            switch ((option = menu())) {
                case 1 -> {
                    System.out.println("\nIntroduzca la informacion del nuevo cliente");
                    sc.nextLine();
                    data = askCustomerInfo();
                    System.out.println(myCompany.addCustomer(createNewCustomer(data[0], data[1]))
                            ? "\nEl cliente se ha creado correctamente"
                            : "\nNo se he podido completar la operacion");
                }
                case 2 -> {
                    System.out.println("\nIntroduzca el numero de telefono del cliente");
                    sc.nextLine();
                    aux = sc.nextLine();
                    if ((c = myCompany
                            .modifyCustomer(aux)) != null) {
                        System.out.println("\nIntroduzca la nueva informacion");
                        data = askCustomerInfo();
                        changeCustomer(c, data);
                        System.out.println("\nSe ha cambiado la informacion correctamente");
                    } else {
                        System.out.println("\nNo se encuentra al cliente en la base de datos");
                    }
                }
                case 3 -> {
                    System.out.println("\nIntroduzca el numero de telefono del cliente a eliminar");
                    sc.nextLine();
                    aux = sc.nextLine();
                    System.out.println(myCompany.removeCustomer(aux)
                            ? "\nSe he eliminado correctamente"
                            : "\nNo se ha podido realizar el borrado");
                }
                case 4 -> {
                    customers = myCompany.giveCustomers();
                    System.out.println();
                    if (customers.length > 0) {
                        for (Customer cus : customers) {
                            System.out.println(cus);
                        }
                    }
                }
                default -> {
                    try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("storage.dat"))) {
                        out.writeInt(Customer.getContadorId());
                        out.writeObject(myCompany);
                    }
                }
            }
        } while (option > 0 && option <= 4);
    }
}

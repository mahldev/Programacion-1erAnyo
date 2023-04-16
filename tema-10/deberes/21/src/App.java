import java.util.Arrays;
import java.util.Scanner;

public class App {

    private static Scanner sc = new Scanner(System.in);

    private static int menu() {
        String[] options = {
                "Nuevo contacto",
                "Buscalo por nombre",
                "Mostrar todos",
                "Salir"
        };

        System.out.println();
        for (int index = 0; index < options.length; index++) {
            System.out.println((index + 1) + ". " + options[index]);
        }
        System.out.print(":");
        return sc.nextInt();
    }

    private static Contact newContact() {
        String name, number;

        sc.nextLine();
        System.out.print("\nIntroduzca los datos del contacto\nNombre: ");
        name = sc.nextLine();
        System.out.print("Numero: ");
        number = sc.nextLine();
        return new Contact(number, name);
    }

    public static void main(String[] args) throws Exception {

        ContactList contactList = new ContactList(20);
        contactList.setPathToSave("agenda.xml");
        Contact[] contacts;
        String pattern;
        int option = 0;

        while (option < 4) {
            switch ((option = menu())) {
                case 1 -> {
                    System.out.println(contactList.createNewContact(newContact())
                            ? "\nSe ha creado correctamente"
                            : "\nNo se ha podido crear el contacto");
                }
                case 2 -> {
                    contacts = contactList.giveAllContacts();
                    if (contacts != null) {
                        System.out.print("\nIntroduzca el nombre o patron a buscar: ");
                        sc.nextLine();
                        pattern = sc.nextLine();
                        for (Contact contact2 : contacts) {
                            if (contact2.getName().contains(pattern)) {
                                System.out.println(contact2);
                            }
                        }
                    }
                }
                case 3 -> {
                    contacts = contactList.giveAllContacts();
                    if (contacts != null) {
                        Arrays.sort(contacts);
                        for (Contact contact2 : contacts) {
                            System.out.println(contact2);
                        }
                    }
                }
                case 4 -> {
                    System.out.println(contactList.saveAllContacts()
                            ? "\nSe han guardado correctamente los contactos"
                            : "");
                }
            }
        }
    }
}

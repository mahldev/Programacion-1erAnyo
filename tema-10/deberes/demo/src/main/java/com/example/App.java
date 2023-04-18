package com.example;

import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class App {

    private static Scanner sc = new Scanner(System.in);

    public static ContactList loadAllContacts(String path) {
        ContactList cl;
        try {
            JAXBContext context = JAXBContext.newInstance(ContactList.class);
            Unmarshaller um = context.createUnmarshaller();
            cl = (ContactList) um.unmarshal(new File(path));
            return cl;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    };

    public static boolean saveAllContacts(ContactList cl, String path) {
        try {
            JAXBContext context = JAXBContext.newInstance(ContactList.class);
            Marshaller m = context.createMarshaller();
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(cl, new FileWriter(path));
            return true;
        } catch (

        Exception e) {
            System.out.println(e);
            return false;
        }
    }

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
        Contact[] contacts;
        String pattern;
        int option = 0;

        contactList = loadAllContacts("agenda.xml");
        while (option < 4) {
            switch ((option = menu())) {
                case 1 -> {
                    System.out.println(contactList.addNewContact(newContact())
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
                        Arrays.sort(contacts, (c1, c2) -> c1.getName().compareTo(c2.getName()));
                        for (Contact contact2 : contacts) {
                            System.out.println(contact2);
                        }
                    }
                }
                case 4 -> {
                    System.out.println(saveAllContacts(contactList, "agenda.xml")
                            ? "\nSe han guardado correctamente los contactos"
                            : "");
                }
            }
        }
    }
}

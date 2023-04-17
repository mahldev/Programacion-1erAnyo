package com.example;

import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "agenda")
@XmlType(propOrder = { "contacts" })
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactList {

    @XmlElementWrapper(name = "agenga")
    @XmlElement(name = "contacto")
    private Contact[] contacts;
    @XmlTransient
    private int numberOfElements;

    public ContactList() {
    }

    public ContactList(int quantity) {
        contacts = new Contact[quantity];
        this.numberOfElements = 0;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public int isOnList(Contact contact) {
        if (numberOfElements == 0)
            return -1;
        for (int index = 0; index < numberOfElements; index++) {
            if (contacts[index].equals(contact))
                return index;
        }
        return -1;
    }

    public boolean createNewContact(Contact contact) {
        if (numberOfElements == contacts.length)
            return false;
        if (isOnList(contact) == -1) {
            contacts[numberOfElements++] = contact;
            return true;
        }
        return false;
    }

    public Contact[] giveAllContacts() {
        if (numberOfElements != 0) {
            Contact[] newContacts = new Contact[numberOfElements];
            for (int index = 0; index < numberOfElements; index++) {
                newContacts[index] = this.contacts[index].clone();
            }
            return newContacts;
        }
        return null;
    }

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

}

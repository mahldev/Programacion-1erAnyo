package com.example;

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

    public boolean addNewContact(Contact contact) {
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
}

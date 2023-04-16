import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ContactList {

    private Contact[] contacts;
    private int numberOfElements;
    private String pathToSave;

    public ContactList(int numberOfElements) {
        contacts = new Contact[numberOfElements];
        this.numberOfElements = 0;
    }

    public int getNumberOfElements() {
        return numberOfElements;
    }

    public void setPathToSave(String pathToSave) {
        this.pathToSave = pathToSave;
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

    public boolean saveAllContacts() {
        try (BufferedWriter out = new BufferedWriter(new FileWriter(pathToSave))) {
            out.write("<agenda>");
            out.newLine();
            for (int index = 0; index < numberOfElements; index++) {
                out.write("\t<contacto>");
                out.newLine();
                out.write("\t\t<nombre>" + contacts[index].getName() + "</nombre>");
                out.newLine();
                out.write("\t\t<numero>" + contacts[index].getNumber() + "</numero>");
                out.newLine();
                out.write("\t</contacto>");
                out.newLine();
            }
            out.write("</agenda>");
            return true;
        } catch (IOException e) {
            return false;
        }
    }
}

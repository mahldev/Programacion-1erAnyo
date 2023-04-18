package com.example;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "contact")
@XmlType(propOrder = { "number", "name"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class Contact {

    @XmlElement(name = "numero")
    private String number;
    @XmlElement(name = "nombre")
    private String name;

    public Contact() {
    }

    public Contact(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contact other = (Contact) obj;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }

    @Override
    protected Contact clone() {
        return new Contact(this.number, this.name);
    }

    @Override
    public String toString() {
        return "Nombre: " + name + ", Numero: " + number;
    }
}

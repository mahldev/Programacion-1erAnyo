import java.io.Serializable;

public class Customer implements Serializable {
    
    private static int contadorId;
    static {
        contadorId = 1;
    }
    private int id;
    private String name;
    private String phNumber;

    public Customer(String name, String phNumber) {
        this.id = contadorId++;
        this.name = name;
        this.phNumber = phNumber;
    }
    
    public static int getContadorId() {
        return contadorId;
    }

    public static void setContadorId(int id) {
        Customer.contadorId = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPhNumber() {
        return phNumber;
    }


    public void setPhNumber(String phNumber) {
        this.phNumber = phNumber;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (phNumber == null) {
            if (other.phNumber != null)
                return false;
        } else if (!phNumber.equals(other.phNumber))
            return false;
        return true;
    }
    
    @Override
    protected Customer clone() {
        Customer c = new Customer(this.name, this.phNumber);
        c.id = this.id;
        contadorId--;
        return c;
    }

    @Override
    public String toString() {
        return "id: " + id + " - nombre: " + name + " - numero: " + phNumber;
    }
}

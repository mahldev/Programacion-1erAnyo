import java.io.Serializable;

public class Customer implements Serializable {
    
    private static int ids;
    static {
        ids = 1;
    }
    private int id;
    private String name;
    private String phNumber;

    public Customer(int id, String name, String phNumber) {
        this.id = id;
        this.name = name;
        this.phNumber = phNumber;
    }

    public Customer(String name, String phNumber) {
        this.id = ids++;
        this.name = name;
        this.phNumber = phNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String name) {
        this.name = name;
    }

    public String getTelefono() {
        return phNumber;
    }

    public void setTelefono(String phNumber) {
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
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (phNumber == null) {
            if (other.phNumber != null)
                return false;
        } else if (!phNumber.equals(other.phNumber))
            return false;
        return true;
    }

    @Override
    protected Customer clone() {
        return new Customer(this.id, this.name, this.phNumber);
    }

    @Override
    public String toString() {
        return "id: " + id + " - nombre: " + name + " - numero: " + phNumber;
    }
}

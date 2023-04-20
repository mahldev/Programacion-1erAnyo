import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {
    
    private ArrayList<Customer> customers;

    public Company() {
        customers = new ArrayList<Customer>();
    }    

    private int onList(Customer c) {
        if (customers.size() != 0) {
            for (int i = 0; i < customers.size(); i++) {
               if (customers.get(i).equals(c)) 
                   return i;
            }
        }
        return -1;
    }

    public boolean addCustomer(Customer c) {
        if (onList(c) == -1) 
            return customers.add(c);
        return false;
    }

    public Customer modifyCustomer(Customer c) {
        int index;
        if ((index = onList(c)) != -1) 
            return customers.get(index);
        return null; 
    }

    public boolean removeCustomer(Customer c) {
        if (onList(c) != -1) {
            return customers.remove(c);
        }
        return false;
    }

    public Customer[] giveCustomers() {
        Customer[] customersArray;

        if (customers.size() != 0) {
            customersArray = new Customer[customers.size()];
            for (int i = 0; i < customersArray.length; i++) {
                customersArray[i] = customers.get(i).clone();    
            }
            return customersArray;
        }
        return null;
    }
}

import java.util.ArrayList;

public class Branch {
    private final String name;
    private final ArrayList<Customer> customers;
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    public String getName() {
        return name;
    }
    public ArrayList<Customer> getCustomers() {
        return customers;
    }
    public boolean newCustomer(String name, double initialTransaction) {
        Customer customer = findCustomer(name);
        if (customer==null) {
            customer = new Customer(name, initialTransaction);
            this.customers.add(customer);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name, double transaction) {
        Customer customer = findCustomer(name);
        if (customer!=null) {
            customer.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name) {
        for (Customer customer : this.customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        return null;
    }
}

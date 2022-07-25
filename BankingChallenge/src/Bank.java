import java.util.ArrayList;

public class Bank {
    private final String name;
    private final ArrayList<Branch> branches;
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
    public boolean addBranch(String name) {
        Branch branch = findBranch(name);
        if(branch==null) {
            branch = new Branch(name);
            this.branches.add(branch);
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch!=null) {
            return branch.addCustomerTransaction(customerName, initialTransaction);
        }
        return false;
    }
    private Branch findBranch(String name) {
        for(Branch branch: this.branches) {
            if(branch.getName().equals(name)) {
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean transactions) {
        Branch branch = findBranch(branchName);
        if(branch==null) return false;
        System.out.println("Customer details for branch " + branchName);
        for(Customer customer: branch.getCustomers()) {
            System.out.println("Customer: " + customer.getName() + "[" + (branch.getCustomers().indexOf(customer)+1) + "]");
            if(transactions) {
                System.out.println("Transactions");
                for(int i=0;i<customer.getTransactions().size();i++) { //for(Double transaction: customer.getTransactions())
                    System.out.println("[" + (i+1) + "]  Amount " + customer.getTransactions().get(i));
                }
            }
        }
        return true;
    }
}

import java.util.ArrayList;

public class Customer {
    private final String name;
    private final ArrayList<Double> transactions;
    public Customer(String name, double initialTransaction) {
        this.name = name;
        transactions = new ArrayList<>();
        addTransaction(initialTransaction);
    }
    public String getName() {
        return this.name;
    }
    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }
    public void addTransaction(double transaction) {
        this.transactions.add(transaction);
    }
}

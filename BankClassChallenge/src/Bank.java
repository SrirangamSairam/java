public class Bank {
    private int accountNumber;
    private int balance;
    private long phoneNumber;
    private String customerName;
    private String email;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public void depositFunds(int funds){
        this.balance += funds;
        System.out.println("Updated balance in the account is " + this.balance);
    }

    public void withdrawFunds(int funds) {
        if(funds<=this.balance) {
            this.balance -= funds;
            System.out.println("Updated balance in account is " + this.balance);
        } else {
            System.out.println("Insufficient funds in account");
        }
    }
}

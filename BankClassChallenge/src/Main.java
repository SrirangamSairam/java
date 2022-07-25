public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Bank bank = new Bank();
        bank.setBalance(1000);
        bank.setAccountNumber(111);
        bank.setCustomerName("Sai Ram");
        bank.setEmail("sai@bank.com");
        bank.setPhoneNumber(9876543210L);
        System.out.println("Customers Name is " + bank.getCustomerName());
        System.out.println("Customers Email ID is " + bank.getEmail());
        System.out.println("Customers Phone Number is " + bank.getPhoneNumber());
        System.out.println("Customers Account Number is " + bank.getAccountNumber());
        System.out.println("Customers latest balance in the account is " + bank.getBalance());
        bank.depositFunds(1500);
        bank.withdrawFunds(2500);
        System.out.println("Customers Name is " + bank.getCustomerName());
        System.out.println("Customers Email ID is " + bank.getEmail());
        System.out.println("Customers Phone Number is " + bank.getPhoneNumber());
        System.out.println("Customers Account Number is " + bank.getAccountNumber());
        System.out.println("Customers latest balance in the account is " + bank.getBalance());
    }
}
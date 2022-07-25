public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        VipCustomer cust1 = new VipCustomer();
        VipCustomer cust2 = new VipCustomer("Sairam", "sairam@bank.com");
        VipCustomer cust3 = new VipCustomer("Sai", 30000.00, "sai@bank.com");
        System.out.println("Customer 1's email id is " + cust1.getEmail());
        System.out.println("Customer 1's credit limit is " + cust1.getCreditLimit());
        System.out.println("Customer 1's Name is " + cust1.getName());
        System.out.println("Customer 2's email id is " + cust2.getEmail());
        System.out.println("Customer 2's credit limit is " + cust2.getCreditLimit());
        System.out.println("Customer 2's Name is " + cust2.getName());
        System.out.println("Customer 3's email id is " + cust3.getEmail());
        System.out.println("Customer 3's credit limit is " + cust3.getCreditLimit());
        System.out.println("Customer 3's Name is " + cust3.getName());
    }
}
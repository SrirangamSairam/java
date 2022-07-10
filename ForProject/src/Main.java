public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        for(int i = 2; i < 9; i++){
            calculateInterest(10000.0,i);
        }
        for(int i = 8; i > 1; i--){
            calculateInterest(10000.0,i);
        }
    }
    public static void calculateInterest(double amount, double interestRate) {
        System.out.println("Interest for " + amount +
                " at an interest rate of " + interestRate +" at the end of 1st year is " + (amount * (interestRate/100)));
    }
}
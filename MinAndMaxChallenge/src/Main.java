import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt;
        int maxNumber=Integer.MIN_VALUE;
        int currentNumber=0;
        int minNumber=Integer.MAX_VALUE;
        while(true) {
            System.out.println("Enter number");
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                currentNumber = scanner.nextInt();
                maxNumber = Math.max(maxNumber, currentNumber);
                minNumber = Math.min(minNumber, currentNumber);
            } else {
                break;
            }
        }
        System.out.println("Maximum number entered is " + maxNumber + " ,Minimum number entered is " + minNumber);
        scanner.close();
    }
}
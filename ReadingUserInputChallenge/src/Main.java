import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean hasNextInt = false;
        for(int i=1;i<=10;) {
            System.out.println("Please enter number #"+i);
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                i++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum of entered numbers is " + sum);
        scanner.close();
    }
}
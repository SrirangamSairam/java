import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int average = 0;
        boolean hasNextInt;
        double counter = 1;
        while(true) {
            hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += scanner.nextInt();
                average = (int) Math.round(sum / counter);
                counter++;
            } else {
                break;
            }
        }
        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
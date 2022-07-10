public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumFirstAndLastDigit(123456));
    }
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        }
//        int lastDigit;
//        int reverse = 0;
//        int remainingNumber = number;
//        while(remainingNumber != 0) {
//            reverse = reverse * 10;
//            lastDigit = remainingNumber % 10;
//            reverse = reverse + lastDigit;
//            remainingNumber = remainingNumber/10;
//        }
//        return number%10 + reverse%10;
        int lastDigit = number%10;
        while(number>9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}
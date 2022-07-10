public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-0));
    }
    public static boolean isPalindrome(int number) {
        boolean isPalindrome = false;
        int reverse = 0;
        int remainingNumber = number;
        while(remainingNumber!=0) {
            reverse  *= 10;
            reverse += remainingNumber%10;
            remainingNumber /= 10;
            isPalindrome = (reverse == number);
        }
        return isPalindrome;
    }
}
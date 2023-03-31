public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPowerOfThree(27));
    }

    public static boolean isPowerOfThree(int n) {
        while (n>0&&n!=1) {
            if(n%3!=0) return false;
            n /= 3;
        }
        return n==1;
    }
}
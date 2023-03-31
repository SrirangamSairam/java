public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(64));
        System.out.println(isPowerOfFour(32));
        System.out.println(isPowerOfFour(128));
    }

    public static boolean isPowerOfFour(int n) {
//        while (n>0 && n%4==0) {
//            n /= 4;
//        }
//        return n==1;

        return n>0 && (n & (n-1)) == 0 && (n-1)%3==0;
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(45));
    }

    public static boolean isPowerOfTwo(int n) {
//        if(n==0) return false;
//        int rem = 0;
//        while (n>0 && rem==0) {
//            rem = n%2;
//            n = n/2;
//            if(n==1) break;
//        }
//        return rem==0;

        return n>0&&((n&n-1)==0);
    }
}
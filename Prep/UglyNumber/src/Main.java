public class Main {
    public static void main(String[] args) {
        System.out.println(isUgly(34));
    }

    public static boolean isUgly(int n) {
//        if(n==0) return false;
//        while (n%2==0) {
//            n /= 2;
//        }
//        while (n%3==0) {
//            n /= 3;
//        }
//        while (n%5==0) {
//            n /= 5;
//        }
//        return n==1;

        for(int i=2;i<=5&&n>0;i++) {
            while (n%i==0) {
                n /= i;
            }
        }
        return n==1;
    }
}
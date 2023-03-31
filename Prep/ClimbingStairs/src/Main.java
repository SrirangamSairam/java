public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(climbStairs(43));
    }

    public static int climbStairs(int n) {
        if(n<=3) return n;
//        return climbStairs(n-1)+climbStairs(n-2);
        int n1 = 1;
        int n2 = 2;
        int n3 = 0;
        for(int i=2;i<n;i++) {
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
        }
        return n3;
    }
}
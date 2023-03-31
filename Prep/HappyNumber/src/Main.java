public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(3%10);
        System.out.println(3/10);
        System.out.println(isHappy(19));
    }

    private static int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public static boolean isHappy(int n) {
//        Set<Integer> seen = new HashSet<>();
//        while (n != 1 && !seen.contains(n)) {
//            seen.add(n);
//            n = getNext(n);
//        }
//        return n == 1;

        int slowRunner = n;
        int fastRunner = n;
        while (fastRunner != 1) {
            slowRunner = getNext(slowRunner);
            fastRunner = getNext(getNext(fastRunner));
            if(slowRunner == fastRunner && fastRunner!=1) return false;
        }
        return true;
    }
}
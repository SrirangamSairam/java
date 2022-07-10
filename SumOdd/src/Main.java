public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(sumOdd(100,200));
    }

    public static boolean isOdd(int number) {
        if(number>0) {
            return number%2==1;
        }
        return false;
    }
    public static int sumOdd(int start, int end) {
        if(start<=0 || end<=0 || end<start) {
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++) {
            if(isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
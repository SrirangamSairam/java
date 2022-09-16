public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(fibonacciNonRec(45));
        System.out.println(fibonacciRec(45));
//        int num = 50;
//        for(int i=0;i<=num;i++) {
//            System.out.print(fibonacciRec(i) + " ");
//        }
    }

    public static int fibonacciRec(int num) {
        if(num <= 1) {
            return num;
        }
        return fibonacciRec(num-1) + fibonacciRec(num-2);
    }

    public static int fibonacciNonRec(int num) {
        int[] arr = new int[num+1];
        arr[0] = 0;
        if(num>=1) {
            arr[1] = 1;
            for (int i=2;i<=num;i++) {
                arr[i] = arr[i-1] + arr[i-2];
            }
        }
        return arr[num];
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println(fact(10));
        System.out.println(factRecur(10));
        System.out.println("Hello world!");
    }

    public static int fact(int num) {
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact *= i;
        }
        return fact;
    }

    public static int factRecur(int num) {
        if(num == 1) {
            return 1;
        }
        return num * factRecur(num-1);
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sum = 0;
        int count = 0;
        for(int i = 1; i <= 1000 && count < 5; i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("number is " + i);
                sum += i;
                count++;
            }
        }
        System.out.println("sum of first five numbers that are divisible by both 3 and 5 is " + sum);
    }
}
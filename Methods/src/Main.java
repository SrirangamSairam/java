public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int a = 10;
        int b = 20;
        int c = 30;
        calculateSomething();
        System.out.println(a);
    }
    public static void calculateSomething() {
        int a = 10;
        int b = 20;
        int c = 30;
        a += b + c;
        System.out.println(a+b+c);
        System.out.println(a);
    }
}
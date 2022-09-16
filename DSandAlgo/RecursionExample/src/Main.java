public class Main {
    static int counter = 0;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(inception());
    }
    public static int inception() {
        if(counter > 2) {
            return counter;
        }
        counter++;
        return inception();
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(divide(10,0));
    }
    public static int divide(int a, int b) {

        try {
            int c = a/b;
            return 100;
        }
        catch (Exception e) {
            e.printStackTrace();
            return 200;
        }
        finally {
            return 300;
        }
    }
}
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printName("sai");
        System.out.println("How are you");
    }

    public static void printName(String name) throws RuntimeException {
        if(name.equals("sai")) {
            throw new RuntimeException();
        }
        System.out.println("Hello " + name +"!");
    }
}
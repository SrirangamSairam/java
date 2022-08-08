public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        dog.breathe();
        dog.eat();
        System.out.println(dog.getName());
    }
}
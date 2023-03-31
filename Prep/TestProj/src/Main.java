public class Main {
    public static void main(String[] args) {
        A a = new B();
        a.roar();
    }
}

class A {
    public void roar() {
        System.out.println("Hello");
    }
}

class B extends A {
    public void roar() {
        System.out.println("Hi");
    }
}
package org.example;

public class DIDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.run();
        Car car2 = new Car();
        car2.run();
        Engine engine1 = new Engine("more powerful", 2500);
        Car car3 = new Car("Elantra", engine1);
        car3.run();
    }
}

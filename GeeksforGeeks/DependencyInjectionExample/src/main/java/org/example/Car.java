package org.example;

public class Car {
    private String name;
    private Engine engine;

    public Car() {
        /* tight coupling */
        /* below is example of tight coupling because a new car will always be created with same engine */
        System.out.println("Creating new car: ");
        name = "City";
        engine = new Engine("powerful", 2000);
    }

    public Car(String name, Engine engine) {
        /* loose coupling */
        /* below is example of loose coupling because we can create new car with different engines */
        System.out.println("Creating new car: ");
        this.name = name;
        this.engine = engine;
    }

    public void run() {
        System.out.println(name + " car is running with " + engine.getName() + " engine");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

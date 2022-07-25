public class Ford extends Car{

    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford Cars engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford Car is accelerating";
    }

    @Override
    public String brake() {
        return "Ford Car is braking";
    }
}

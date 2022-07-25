public class Mitsubishi extends Car{
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi Cars engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi Car is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi Car is braking";
    }
}

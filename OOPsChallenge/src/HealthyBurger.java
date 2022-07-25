public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name, healthyExtra2Name;
    private double healthyExtra1Price, healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("healthy burger", meat, price, "brown rye bread roll");
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price) {
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
    }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price) {
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

    public double itemizeHamburger() {
        System.out.println("Healthy hamburger on a with " + this.healthyExtra1Name +
                ", " + this.healthyExtra2Name + (this.getPrice()+healthyExtra1Price+healthyExtra2Price));
        return this.getPrice()+healthyExtra1Price+healthyExtra2Price;
    }
}

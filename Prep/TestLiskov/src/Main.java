public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(4);
        Vehicle car = new Car(8);
        System.out.println(vehicle1.getSeats());
        System.out.println(car.getSeats());
    }
}

class Vehicle {
    int seats;

    public Vehicle(int seats) {
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}

class Car extends Vehicle {

    public Car(int seats) {
        super(seats);
    }
    @Override
    public int getSeats() {
        return seats+2;
    }
}
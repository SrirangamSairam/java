public class Computer {
    int ram;
    int storage;

    public Computer(int ram, int storage) {
        this.ram = ram;
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram=" + ram +
                ", storage=" + storage +
                '}';
    }

    public void work(){
        System.out.println("I'm working from parent class");
    }
}

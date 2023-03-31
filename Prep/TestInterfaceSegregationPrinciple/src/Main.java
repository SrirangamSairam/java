public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

class PrinterUtil implements IPrinter {

    @Override
    public void run() {
        System.out.println("Is running");
    }

    @Override
    public void print() {
        System.out.println("printing");
    }
}

interface IDevice {
    void run();
}

interface IPrinter extends IDevice {
    void print();
}

interface IScanner extends IDevice {
    void scan();
}
public class Mobile extends Computer{

    public Mobile(int ram, int storage) {
        super(ram, storage);
    }


    @Override
    public void work() {
        System.out.println("Working in child class");
    }
//    Object
}

public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {

    }

    //@Override
    public void breathe() {

    }
}
/*If we declare child class as abstract, then we don't need to implement all the abstract
methods of parent abstract class
Else we need to implement all parent abstract classes abstract methods

Also, child abstract should call parent abstract class's constructor.

*/
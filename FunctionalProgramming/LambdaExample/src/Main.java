import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        class MyPredicate implements Predicate<Integer> {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        }
//        Abc.printEven(List.of(10,5,20,3,45,6,1,7,5,9), new MyPredicate());



//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer%2==0;
//            }
//        };
//        Abc.printEven(List.of(10,5,20,3,45,6,1,7,5,9), predicate);



        Abc.printEven(List.of(10,5,20,3,45,6,1,7,5,9), number-> number%2==0);
        //we are making use of lambda expression which doesn't require any class implementation of interfaces
        //if the interface is a functional interface
        //second parameter of above function is the implementation of test method of Predicate interface
    }
}

    class Abc {
        public static void printEven(Collection<Integer> list, Predicate<Integer> p) {
            for (int number : list) {
                if (p.test(number)) {
                    System.out.println(number);
                }
            }
        }
    }
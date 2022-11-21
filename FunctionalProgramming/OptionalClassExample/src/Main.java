import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> fruits = Arrays.asList("Banana", "Guava", "Papaya");
        Optional<String> optionalFruit = fruits.stream().filter(fruit->fruit.indexOf("b")==0).findFirst();
        System.out.println(optionalFruit);
        System.out.println(optionalFruit.isEmpty());
        System.out.println(optionalFruit.isPresent());
        optionalFruit.ifPresent(System.out::println);
    }
}
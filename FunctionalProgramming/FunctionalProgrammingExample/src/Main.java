import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        printAllNumbersInListStructured(List.of(1,2,3,4,5,4,3,2,1));
        printAllNumbersInListFunctional(List.of(1,2,3,4,5,4,3,2,1));
    }

    public static void printAllNumbersInListStructured(List<Integer> numbers) {
        for(int number: numbers) {
            System.out.println(number);
        }
    }

    public static void printAllNumbersInListFunctional(List<Integer> numbers) {
//        numbers.stream().forEach(System.out::println);
//        numbers.stream().forEach(Main::printNum);
        numbers.forEach(Main::printNum);
    }

    public static void printNum(int number) {
        System.out.println(number);
    }
}
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        printEvenNumbers(List.of(10,5,20,10,40,3,5,44,99,200));
//        printOddNumbers(List.of(10,5,20,10,40,3,5,44,99,200));
//        printSquaresOfEvenNumbers(List.of(10,5,20,10,40,3,5,44,99,200));
//        printSquaresDivisibleBy100(List.of(10,5,20,10,40,3,5,44,99,200));
        printCubeOfOddNumbers(List.of(10,5,20,10,40,3,5,44,99,200));
    }

    public static void printEvenNumbers(List<Integer> numbers) {
//        numbers.stream().forEach(System.out::println);
//        numbers.stream().filter(Main::isEven).forEach(System.out::println);
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }

    private static boolean isEven(Integer integer) {
        return integer%2==0;
    }

    public static void printOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==1)
                .forEach(System.out::println);
    }

    public static void printSquaresOfEvenNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2==0)
                .map(number->number*number)
                .forEach(System.out::println);
    }

    public static void printSquaresDivisibleBy100(List<Integer> numbers) {
        numbers.stream()
//                .filter(number->number%20==0)
                .map(number->number*number)
                .filter(number->number%100==0)
                .forEach(System.out::println);
    }

    public static void printCubeOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number->number%2!=0)
                .map(number->number*number*number)
                .forEach(System.out::println);
    }
}
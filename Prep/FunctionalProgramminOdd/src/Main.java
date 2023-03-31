import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> numbers = List.of(1,2,3,4,5);
        List<String> courses = List.of("Java", "spring", "Spring Boot", "Angular", "GIT");
//        printOdd(numbers);
//        printAllCourses(courses);
//        printSpringCourses(courses);
//        print4Course(courses);
//        noOfChars(courses);
        courseStartsWithS(courses);
//        printSquares(numbers);
//        printOddCubes(numbers);
    }

    public static void printOdd(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2==1)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    public static void printAllCourses(List<String> courses) {
//        courses.stream()
//                .forEach(System.out::println);
        courses.forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    public static void printSpringCourses(List<String> courses) {
        courses.stream()
                .filter(course -> course.toLowerCase().contains("spring"))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");
    }

    public static void print4Course(List<String> courses) {
        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);
    }

    public static void printSquares(List<Integer> integers) {
        integers.stream()
                .map(x->x*x)
                .forEach(System.out::println);
    }

    public static void printOddCubes(List<Integer> integers) {
        integers.stream()
                .filter(x->x%2!=0)
                .map(x->x*x*x)
                .forEach(System.out::println);
    }

    public static void noOfChars(List<String> courses) {
//        courses.stream()
//                .map(course -> course.length())
//                .forEach(System.out::println);

        courses.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

    public static void courseStartsWithS(List<String> courses) {
        Predicate<? super String> predicate = course->course.toLowerCase().startsWith("s");
        Optional<String> first = courses.stream().filter(predicate).findFirst();
    }

}
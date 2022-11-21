import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> courses = List.of("HTML", "CSS", "JS", "Java", "Spring", "Spring Boot", "SQL", "GIT");
//        printCoursesIndividually(courses);
//        printCoursesContainingWord(courses, "A");
//        printCoursesWithMinLength(courses, 4);
        printNoOfCharactersInCourse(courses);
    }

    public static void printCoursesIndividually(List<String> courses) {
//        courses.stream()
//                .forEach(System.out::println);
        courses.forEach(System.out::println);
    }

    public static void printCoursesContainingWord(List<String> courses, String keyword) {
        courses.stream()
                .filter(course->course.toLowerCase().contains(keyword.toLowerCase()))
                .forEach(System.out::println);
    }

    public static void printCoursesWithMinLength(List<String> courses, int length) {
        courses.stream()
                .filter(course->course.length()>=length)
                .forEach(System.out::println);
    }

    public static void printNoOfCharactersInCourse(List<String> courses) {
        courses.stream()
//                .map(course->course.length())
                .map(String::length)
                .forEach(System.out::println);
    }

}